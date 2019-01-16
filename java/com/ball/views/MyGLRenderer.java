package com.ball.views;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;

import com.ball.activities.MyGLActivity;
import com.ball.extras.RawResourceReader;
import com.ball.extras.ShaderHelper;
import com.ball.levels.Level;
import com.ball.shapes.Sphere;
import com.ball.shapes.Shape;
import com.ball.shapes.ShapeOpengl;

import java.util.ArrayList;
import java.util.List;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 *  OpenGL Custom renderer used with GLSurfaceView 
 */
public class MyGLRenderer implements GLSurfaceView.Renderer {
	
	private MyGLActivity activity;
	public Level level;
    public boolean pause = false;
    public boolean conlisionY = false;
    public int coins = 0;
	//Sphera Data
    private float angleYObjetivo = 0f;
	private final float incrAngleY = 7.5f;
    private long startTime = -1;
    private List<ShapeOpengl> nearestShapes;
	//Camera Data
    private final float anguloElevacionInicial = 20;
    private final float anguloIncidenciaInicial = 20;
    //R End should be greather than R Start
    private final float RStart = 4.5f;
    private final float REnd = 2.5f;
	private float R = RStart;
	private final float anadidoAnguloElevacion = 15;
	private float anguloElevacion = anguloElevacionInicial;
	private float anguloIncidencia = anguloIncidenciaInicial;
	private float angleEndElevation = 0;
	private float angleEndIncidence = 0;
	private float incrAngle = 0.5f;
    private float xCam;
    private float yCam;
    private float zCam;
    //Datos del ultimo checkpoint guardad
    private float noCheckPoint = -10000;
    public float xCheck = noCheckPoint;
    public float yCheck = noCheckPoint;
    public float zCheck = noCheckPoint;
    private float otherzCheck = noCheckPoint;

    private float[] mModelMatrix = new float[16];
    private float[] mViewMatrix = new float[16];
    private float[] mProjectionMatrix = new float[16];
    private float[] mMVPMatrix = new float[16];
    private float[] mLightModelMatrix = new float[16];
    private int mProgramHandle;
    private int mMVPMatrixHandle;
    private int mMVMatrixHandle;
    private int mLightPosHandle;
    private int mTextureUniformHandle;
    private int mPositionHandle;
    private int mColorHandle;
    private int mNormalHandle;
    private int mTextureCoordinateHandle;
    private final float[] mLightPosInModelSpace = new float[] {0.0f, 0.0f, 0.0f, 1.0f};
    private final float[] mLightPosInWorldSpace = new float[4];
    private final float[] mLightPosInEyeSpace = new float[4];
    //Constantes de moneda
    private final int unitScore = 10;
    public final int scoreMinBall = unitScore;
    public final int scoreMicroBall = unitScore*2;
    public final int scoreJumperBall = unitScore*3;
    public final int scoreRepulsiveBall = unitScore*4;
    public final int scoreIndestructibleBall = unitScore*5;
    public final int timePoderSegundos = 10;
    public long tiempoInicioConteo = -1;

    public MyGLRenderer(MyGLActivity activity,Level level){
		this.activity = activity;
        this.level = level;
	}

   // Call back when the surface is first created or re-created
   @Override
   public void onSurfaceCreated(GL10 gl, EGLConfig config) {
       // Set the background clear color to black.
       GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

       // Use culling to remove back faces.
       GLES20.glEnable(GLES20.GL_CULL_FACE);
       GLES20.glEnable(GLES20.GL_DEPTH_TEST);
       GLES20.glEnable(GLES20.GL_TEXTURE_2D);
       //GLES20.glEnable (GLES20.GL_BLEND);
       //GLES20.glBlendFunc (GLES20.GL_ONE, GLES20.GL_ONE_MINUS_SRC_ALPHA);

       //Shaders
       final String vertexShader = getVertexShader();
       final String fragmentShader = getFragmentShader();

       final int vertexShaderHandle = ShaderHelper.compileShader(GLES20.GL_VERTEX_SHADER, vertexShader);
       final int fragmentShaderHandle = ShaderHelper.compileShader(GLES20.GL_FRAGMENT_SHADER, fragmentShader);

       mProgramHandle = ShaderHelper.createAndLinkProgram(vertexShaderHandle, fragmentShaderHandle,
               new String[] {"a_Position",  "a_Color", "a_Normal", "a_TexCoordinate"});

       //Cargar texturas
       level.cargarTexturas(activity);
   }

    // Call back after onSurfaceCreated() or whenever the window's size changes
   @Override
   public void onSurfaceChanged(GL10 gl, int width, int height) {
       // Adjust the viewport based on geometry changes,
       // such as screen rotation
       GLES20.glViewport(0, 0, width, height);

       float ratio = (float) width / height;

       // this projection matrix is applied to object coordinates
       // in the onDrawFrame() method
       Matrix.frustumM(mProjectionMatrix, 0, -ratio*0.3f, ratio*0.3f, -1*0.3f, 1*0.3f, 1,  30);

   }

    protected String getVertexShader()
    {
        return RawResourceReader.readTextFileFromRawResource(activity, com.ball.activities.R.raw.per_pixel_vertex_shader);
    }

    protected String getFragmentShader()
    {
        return RawResourceReader.readTextFileFromRawResource(activity, com.ball.activities.R.raw.per_pixel_fragment_shader);
    }

   @Override
   public void onDrawFrame(GL10 unused) {
       float minDistance = 10;
       //Obteniendo los objetos mas cercanos
       nearestShapes = new ArrayList<ShapeOpengl>();
       for(ShapeOpengl shape : level.shapes){
           double dist = level.sphere.getCz() - shape.getCz();
           //Calculando distancia al plano mas cercano
           minDistance = Math.min(minDistance, (float)shape.distanceTo(level.sphere));
           if ((dist >= -2.0)&&(dist < 6.0)){
               nearestShapes.add(shape);
           }
       }
       //Actualizar datos de graficacion
       if (!pause){
           updateDrawingData(minDistance);
       }

       GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);
       // Set our per-vertex lighting program.
       GLES20.glUseProgram(mProgramHandle);

       // Set program handles for cube drawing.
       mMVPMatrixHandle = GLES20.glGetUniformLocation(mProgramHandle, "u_MVPMatrix");
       mMVMatrixHandle = GLES20.glGetUniformLocation(mProgramHandle, "u_MVMatrix");
       mLightPosHandle = GLES20.glGetUniformLocation(mProgramHandle, "u_LightPos");
       mTextureUniformHandle = GLES20.glGetUniformLocation(mProgramHandle, "u_Texture");
       mPositionHandle = GLES20.glGetAttribLocation(mProgramHandle, "a_Position");
       mColorHandle = GLES20.glGetAttribLocation(mProgramHandle, "a_Color");
       mNormalHandle = GLES20.glGetAttribLocation(mProgramHandle, "a_Normal");
       mTextureCoordinateHandle = GLES20.glGetAttribLocation(mProgramHandle, "a_TexCoordinate");

       // Calculate position of the light. Rotate and then push into the distance.
       Matrix.setIdentityM(mLightModelMatrix, 0);
       Matrix.translateM(mLightModelMatrix, 0, level.sphere.getX(), level.sphere.getY() + 1f, level.sphere.getZ() + 1.5f);
       //Matrix.rotateM(mLightModelMatrix, 0, angleInDegrees, 0.0f, 1.0f, 0.0f);
       //Matrix.translateM(mLightModelMatrix, 0, 0.0f, 0.0f, 2.0f);
       Matrix.multiplyMV(mLightPosInWorldSpace, 0, mLightModelMatrix, 0, mLightPosInModelSpace, 0);
       Matrix.multiplyMV(mLightPosInEyeSpace, 0, mViewMatrix, 0, mLightPosInWorldSpace, 0);

       Matrix.setLookAtM(mViewMatrix, 0, level.sphere.getX() + xCam, level.sphere.getY() + yCam, level.sphere.getZ() + zCam, level.sphere.getX(), level.sphere.getY(), level.sphere.getZ(), 0, 1, 0);

       ///////////////////////Drawing all nearest shapes////////////////////////////////
       for(ShapeOpengl shape : nearestShapes){
           if (shape.getVertices().length > 0){
               shape.draw(mPositionHandle,mColorHandle,mNormalHandle,mTextureCoordinateHandle,mTextureUniformHandle,mMVMatrixHandle,mLightPosHandle,mMVPMatrixHandle,mMVPMatrix,mViewMatrix,mModelMatrix,mProjectionMatrix,mLightPosInEyeSpace);
           }
       }
       //Drawing Sphere
       level.sphere.draw(mPositionHandle,mColorHandle,mNormalHandle,mTextureCoordinateHandle,mTextureUniformHandle,mMVMatrixHandle,mLightPosHandle,mMVPMatrixHandle,mMVPMatrix,mViewMatrix,mModelMatrix,mProjectionMatrix,mLightPosInEyeSpace);
       //Drawing background mundo
       level.world.draw(mPositionHandle,mColorHandle,mNormalHandle,mTextureCoordinateHandle,mTextureUniformHandle,mMVMatrixHandle,mLightPosHandle,mMVPMatrixHandle,mMVPMatrix,mViewMatrix,mModelMatrix,mProjectionMatrix,mLightPosInEyeSpace);
       /////////////////////////////////////////////////////////////////////////////////////////////
   }

    private boolean collisionWithWater = false;
    public float sensorRotationValue = 0;
    private float angleZGravity = 0;
    private float angleXGravity = 0;
    private void updateDrawingData(float minDistance){
        //Calculate Camera Position
        if (R > REnd){
            R -= 0.04;
        }
        xCam = (float)(R*Math.cos(Math.toRadians(anguloElevacion+anadidoAnguloElevacion))*Math.sin(Math.toRadians(anguloIncidencia)));
        yCam = (float)(R*Math.sin(Math.toRadians(anguloElevacion+anadidoAnguloElevacion)));
        zCam = (float)(R*Math.cos(Math.toRadians(anguloElevacion+anadidoAnguloElevacion))*Math.cos(Math.toRadians(anguloIncidencia)));
        //Animation elevation angle and incidence
        if (Math.abs(anguloElevacion - angleEndElevation) > incrAngle){
            if (anguloElevacion < angleEndElevation){
                anguloElevacion += incrAngle;
            }
            else{
                anguloElevacion -= incrAngle;
            }
        }

        if (Math.abs(anguloIncidencia - angleEndIncidence) > incrAngle){
            if (anguloIncidencia < angleEndIncidence){
                anguloIncidencia += incrAngle;
            }
            else{
                anguloIncidencia -= incrAngle;
            }
        }
        //anguloIncidencia += incrementoAngulo;
        //Calculando datos de mundo
        float factor = 22f/R;
        level.world.setCx(level.sphere.getX()-xCam*factor);
        level.world.setCy(level.sphere.getY()-yCam*factor);
        level.world.setCz(level.sphere.getZ()-zCam*factor);
        level.world.getAnimator().setAngleX(-(anguloElevacion+anadidoAnguloElevacion));
        level.world.getAnimator().setAngleY(anguloIncidencia);
        //////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////Procesando colisiones////////////////////////////////////////
        //antigravity of collision
        collisionWithWater = false;
        angleZGravity = 0;
        angleXGravity = 0;
        while (!isCollisionFree(level.sphere,level.sphere.getX(),level.sphere.getY(),level.sphere.getZ(),2)){
            level.sphere.setCy(level.sphere.getCy()+level.ay);
        }
        //Colisiones para avanzar
        float cx = level.sphere.getX()+level.sphere.getVx();
        float cy = level.sphere.getY()+level.sphere.getVy();
        float cz = level.sphere.getZ()+level.sphere.getVz();
        if (isCollisionFree(level.sphere,level.sphere.getX(),cy,level.sphere.getZ(),2)){
            level.sphere.setCy(cy);
        }
        else{
            level.sphere.setVy(0);
            conlisionY = true;
        }
        if (!level.sphere.isTrizar()){
            //Colisiones para avanzar
            if (isCollisionFree(level.sphere,cx,level.sphere.getY(),level.sphere.getZ(),2)){
                level.sphere.setCx(cx);
            }
            else{
                level.sphere.setVx(0);
            }
            if (isCollisionFree(level.sphere,level.sphere.getX(),level.sphere.getY(),cz,2)){
                level.sphere.setCz(cz);
            }
            else{
                level.sphere.setVz(0);
            }
            //Calculando angulo sphere
            double incrZ = -Math.sqrt(Math.pow(level.sphere.getVz()*300,2)+Math.pow(level.sphere.getVx()*300,2));
            level.sphere.getAnimator().setIncrAngleZ(incrZ);
            angleYObjetivo = -(float)Math.toDegrees(Math.atan2(level.sphere.getVz(), level.sphere.getVx()));
            double anguloY = level.sphere.getAnimator().getAngleY();
            if (Math.abs(anguloY - angleYObjetivo) > incrAngleY){
                if (anguloY < angleYObjetivo){
                    level.sphere.getAnimator().setAngleY(anguloY+incrAngleY);
                }
                else{
                    level.sphere.getAnimator().setAngleY(anguloY-incrAngleY);
                }
            }
            //Coliziones para trizar bola
            if ((!isCollisionFree(level.sphere,level.sphere.getX(),level.sphere.getY(),level.sphere.getZ(),1))&&(level.sphere.power != scoreIndestructibleBall)){
                level.sphere.trizar();
                startTime = System.currentTimeMillis();
                activity.startCrashSound();
            }
            //Deteniendo movimiento hacia adelante automaticamente
            final float acceleracion = 0.00004f;
            if (collisionWithWater){
                float vz = -0.004f;
                if (level.sphere.getVz() > vz+acceleracion){
                    level.sphere.setVz(level.sphere.getVz()-9*acceleracion);
                }
                else if (level.sphere.getVz() < vz-acceleracion){
                    level.sphere.setVz(level.sphere.getVz()+9*acceleracion);
                }
                else{
                    level.sphere.setVz(vz);
                }
                level.sphere.setVx(sensorRotationValue/200);
            }
            else{
                if (Math.abs(level.sphere.getVz()) > acceleracion){
                    level.sphere.setVz(level.sphere.getVz()-acceleracion*Math.signum(level.sphere.getVz()));
                }
                level.sphere.setVx(sensorRotationValue/100);
            }
            //Gravedad
            float ay = level.ay;
            float ax = 0;
            float az = 0;

            float a = ay*(float)Math.cos(Math.toRadians(angleZGravity));
            ay = a*(float)Math.cos(Math.toRadians(angleZGravity));
            ax = -a*(float)Math.sin(Math.toRadians(angleZGravity));

            a = a*(float)Math.cos(Math.toRadians(angleXGravity));
            ay = a*(float)Math.cos(Math.toRadians(angleXGravity));
            az = a*(float)Math.sin(Math.toRadians(angleXGravity))*4f;

            level.sphere.setVy(level.sphere.getVy()-ay);
            level.sphere.setVx(level.sphere.getVx()+ax);
            level.sphere.setVz(level.sphere.getVz()+az);
        }
        //Reinicio de juego cuando la bola cae fuera del escenario o colisiona con objeto solido
        if (((startTime > 0)&&((System.currentTimeMillis() - startTime) > 2000))||(minDistance > 6)){
            this.level = activity.restartLevel();
            if (zCheck != noCheckPoint){
                this.level.sphere.setCx(xCheck);
                this.level.sphere.setCy(yCheck);
                this.level.sphere.setCz(zCheck);
            }
            startTime = -1;
            anguloElevacion = anguloElevacionInicial;
            anguloIncidencia = anguloIncidenciaInicial;
            R = RStart;
            //activity.restartMusic();
        }
        //Incrementar datos de objeto
        for(ShapeOpengl shape : nearestShapes){
            if (shape.isSolid()){
                if (level.sphere.power == scoreRepulsiveBall){
                    shape.setCy(shape.getCy()-0.005f);
                }
            }
            shape.increaseData();
        }
        level.sphere.increaseData();
        level.world.increaseData();
        for(ShapeOpengl shape : level.shapes){
            shape.increaseAlways();
        }
        level.onUpdateDrawingData();
        calculateSecons();
    }

    public int segundosAnt = -1;
    public void calculateSecons(){
        int segundos = (int)(System.currentTimeMillis()-tiempoInicioConteo)/1000;
        segundos = timePoderSegundos-segundos;
        if (segundos < 0){
            segundos = -1;
            tiempoInicioConteo = -1;
        }
        if (segundosAnt != segundos){
            if (tiempoInicioConteo < 0 ){
                activity.updateTxtSeconds("");
            }
            else{
                activity.updateTxtSeconds(segundos+"");
            }
            segundosAnt = segundos;
            if (segundosAnt == -1){
                level.sphere.getAnimator().setScale(1);
                level.sphere.getAnimator().setMinScale(1);
                level.sphere.getAnimator().setMaxScale(1);
                level.sphere.getAnimator().setRed(255);
                level.sphere.getAnimator().setMaxRed(255);
                level.sphere.getAnimator().setMinRed(255);
                level.sphere.getAnimator().setGreen(255);
                level.sphere.getAnimator().setMaxGreen(255);
                level.sphere.getAnimator().setMinGreen(255);
                level.sphere.getAnimator().setBlue(255);
                level.sphere.getAnimator().setMaxBlue(255);
                level.sphere.getAnimator().setMinBlue(255);
                level.sphere.power = -1;
                level.vyJump = level.initialVyJump;
            }
        }
    }

    //objType = 0 -> all, objType = 1 -> solid, objType = 2 -> not solid
    public boolean isCollisionFree(Sphere sphere, float cx, float cy, float cz, int objType){
        float lastCX = sphere.getCx();
        float lastCY = sphere.getCy();
        float lastCZ = sphere.getCz();
        sphere.setCx(cx);
        sphere.setCy(cy);
        sphere.setCz(cz);
        boolean isCollisionFree = true;
        for(int i=0;i<nearestShapes.size();i++){
            Shape shape = nearestShapes.get(i);
            double dist = Math.abs(shape.getZ() - sphere.getZ());
            if (dist < 2){
                //Colisiones
                if ((shape.colisiona(sphere))&&((objType == 0)||((objType == 1)&&(shape.isSolid()))||((objType == 2)&&(!shape.isSolid())))){
                    if (shape.isCheckPoint()){
                        if (otherzCheck != shape.getZ()){
                            activity.startCheckPointSound();
                            xCheck = sphere.getX();
                            yCheck = sphere.getY()+1;
                            zCheck = sphere.getZ();
                            otherzCheck = shape.getZ();
                        }
                    }
                    else{
                        if (shape.isWatter()){
                            collisionWithWater = true;
                        }
                        if (shape.isTrizable()){
                            if (shape.getTiempoDesdeTrizamiento() == -1){
                                shape.setTiempoDesdeTrizamiento(System.currentTimeMillis());
                                isCollisionFree = false;
                            }
                            else if (System.currentTimeMillis() - shape.getTiempoDesdeTrizamiento() > 300){
                                if (!shape.isTrizar()){
                                    shape.trizar();
                                    activity.startCrashSound();
                                }
                            }
                            else{
                                isCollisionFree = false;
                            }
                        }
                        else if (shape.isDesaparecible()){
                            level.shapes.remove(shape);
                            nearestShapes.remove(shape);
                            activity.startMonedaSound();
                            coins++;
                            activity.updateTxtCoins(coins);
                            activity.updateBallIcons();
                        }
                        else{
                            if (shape.getPuerta1() != null){
                                if (shape.getIndexTexture() == 0){
                                    shape.setIndexTexture(1);
                                    if (shape.getInterruptor2().getIndexTexture() == 1){
                                        shape.getPuerta1().getAnimator().setIncrX(-0.01f);
                                        shape.getPuerta2().getAnimator().setIncrX(0.01f);
                                        activity.startPuertaSound();
                                    }
                                    else{
                                        activity.startDrumSound();
                                    }
                                }
                            }
                            if (shape.isCapazVariarAnguloGravedad()){
                                angleZGravity = (float)shape.getAnimator().getAngleZ();
                                angleXGravity = (float)shape.getAnimator().getAngleX();
                            }
                            isCollisionFree = false;
                            break;
                        }
                    }
                }
            }
        }
        sphere.setCx(lastCX);
        sphere.setCy(lastCY);
        sphere.setCz(lastCZ);
        return isCollisionFree;
    }

}