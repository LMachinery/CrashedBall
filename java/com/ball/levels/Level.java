package com.ball.levels;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.ETC1Util;
import android.opengl.GLES20;
import android.opengl.GLUtils;

import com.ball.activities.R;
import com.ball.shapes.Cube;
import com.ball.shapes.Cylinder3;
import com.ball.shapes.Plane;
import com.ball.shapes.Sphere;
import com.ball.shapes.ShapeOpengl;
import com.ball.views.MyGLRenderer;

public class Level {
	public Sphere sphere;
	public ShapeOpengl world;
	public List<ShapeOpengl> shapes;
    //public List<ShapeOpengl> shapesToDraw;
	public List<int[]> textures;
	public List<Integer> texturesResources;
	public int crashResource = -1;
	public int musicResource = -1;
	protected float radioEsfera = 0.15f;
	protected float lengthPlano = 0.4f;
	protected float lengthPared = 0.1f;
    protected float longitudInclinada;
    protected float anguloInclinacion;
	protected String level[][];
    public float ay = 0.003f;
	//Factor para que los objetos desaparezcan
	public float factorDifuminado = 5f;
    protected float cxNave = -1;
    protected float cyNave = -1;
    public final float initialVyJump = 0.065f;
    public float vyJump = initialVyJump;
    protected int resourceCintaCheckPoint = R.drawable.level1_check_point;
    protected int resourcePaloCheckPoint = R.drawable.level1_cono;
	
	public Level(){
        longitudInclinada = (float)Math.sqrt(Math.pow(lengthPlano,2)+Math.pow(lengthPared,2));
        anguloInclinacion = -(float)Math.toDegrees(Math.atan2(lengthPared,lengthPlano));
		//Mundo
        world = new Plane(0f,0f,0f,20f,10f,0);
		//Crear mapa del nivel
		crearNivel();
		//Cargando objetos
		shapes = new ArrayList<ShapeOpengl>();
        //shapesToDraw = new ArrayList<ShapeOpengl>();
		for(int i=0;i<level.length;i++){
            final int objetosPorLado = level[i].length/2;
            final int caracteresObjeto = 4;
            List<ShapeOpengl> shapesInLine = new ArrayList<ShapeOpengl>();
			for(int j=0;j<level[i].length;j++){
				StringTokenizer tokenizer = new StringTokenizer(level[i][j]," ");
				while(tokenizer.hasMoreTokens()){
					String element = tokenizer.nextToken();
					int altura = Integer.parseInt(element.substring(caracteresObjeto, element.length()));
					String figura = element.substring(0, caracteresObjeto-2);
					String rotacion = element.substring(caracteresObjeto-2, caracteresObjeto);
					float y = altura*lengthPared*2;
					float x = ((-objetosPorLado*2+1)+j*2)*lengthPlano;
					float z = -lengthPlano*2*i;
                    List<ShapeOpengl> shapesNew = crearObjeto(figura,x,y,z);
					for(int k=0;k<shapesNew.size();k++){
						if (!shapesNew.get(k).isNoRotar()){
                            double velocidadRotacion = shapesNew.get(k).getVelocidadRotacion();
							if (rotacion.equals("+X")){
                                shapesNew.get(k).getAnimator().setIncrAngleX(velocidadRotacion);
                                shapesNew.get(k).getAnimator().setBidirectionalAngleX(false);
							}
							if (rotacion.equals("-X")){
                                shapesNew.get(k).getAnimator().setIncrAngleX(-velocidadRotacion);
                                shapesNew.get(k).getAnimator().setBidirectionalAngleX(false);
							}
							if (rotacion.equals("+Y")){
                                shapesNew.get(k).getAnimator().setIncrAngleY(velocidadRotacion);
                                shapesNew.get(k).getAnimator().setBidirectionalAngleY(false);
							}
							if (rotacion.equals("-Y")){
                                shapesNew.get(k).getAnimator().setIncrAngleY(-velocidadRotacion);
                                shapesNew.get(k).getAnimator().setBidirectionalAngleY(false);
							}
							if (rotacion.equals("+Z")){
                                shapesNew.get(k).getAnimator().setIncrAngleZ(velocidadRotacion);
                                shapesNew.get(k).getAnimator().setBidirectionalAngleZ(false);
							}
							if (rotacion.equals("-Z")){
                                shapesNew.get(k).getAnimator().setIncrAngleZ(-velocidadRotacion);
                                shapesNew.get(k).getAnimator().setBidirectionalAngleZ(false);
							}
						}
					}
                    for(ShapeOpengl shapeNew : shapesNew){

                        //ShapeOpengl shapeNew = copyShape(curShapeNew);

                        //Rotacion inicial
                        for(int k=0;k<shapeNew.getVertices().length;k+=3){
                            traslatePoint(shapeNew.getVertices(),k,(float)shapeNew.getcRX(),(float)shapeNew.getcRY(),(float)shapeNew.getcRZ());
                            rotarPunto(shapeNew.getVertices(),k,shapeNew.getAnimator().getAngleX(),shapeNew.getAnimator().getAngleY(),shapeNew.getAnimator().getAngleZ(),shapeNew.getOrderRotation(),0,0,0);
                            rotarPunto(shapeNew.getNormals(),k,shapeNew.getAnimator().getAngleX(),shapeNew.getAnimator().getAngleY(),shapeNew.getAnimator().getAngleZ(),shapeNew.getOrderRotation(),0,0,0);
                        }
                        rotarPunto(shapeNew.getxAxis(),0,shapeNew.getAnimator().getAngleX(),shapeNew.getAnimator().getAngleY(),shapeNew.getAnimator().getAngleZ(),shapeNew.getOrderRotation(),0,0,0);
                        rotarPunto(shapeNew.getyAxis(),0,shapeNew.getAnimator().getAngleX(),shapeNew.getAnimator().getAngleY(),shapeNew.getAnimator().getAngleZ(),shapeNew.getOrderRotation(),0,0,0);
                        rotarPunto(shapeNew.getzAxis(),0,shapeNew.getAnimator().getAngleX(),shapeNew.getAnimator().getAngleY(),shapeNew.getAnimator().getAngleZ(),shapeNew.getOrderRotation(),0,0,0);
                        //shapeNew.guardarAngulosIniciales();
                        shapeNew.getAnimator().setMaxAngleX(shapeNew.getAnimator().getMaxAngleX()-shapeNew.getAnimator().getAngleX());
                        shapeNew.getAnimator().setMaxAngleY(shapeNew.getAnimator().getMaxAngleY()-shapeNew.getAnimator().getAngleY());
                        shapeNew.getAnimator().setMaxAngleZ(shapeNew.getAnimator().getMaxAngleZ()-shapeNew.getAnimator().getAngleZ());
                        shapeNew.getAnimator().setMinAngleX(shapeNew.getAnimator().getMinAngleX()-shapeNew.getAnimator().getAngleX());
                        shapeNew.getAnimator().setMinAngleY(shapeNew.getAnimator().getMinAngleY()-shapeNew.getAnimator().getAngleY());
                        shapeNew.getAnimator().setMinAngleZ(shapeNew.getAnimator().getMinAngleZ()-shapeNew.getAnimator().getAngleZ());
                        shapeNew.setCx(shapeNew.getCx()+shapeNew.getcRX());
                        shapeNew.setCy(shapeNew.getCy()+shapeNew.getcRY());
                        shapeNew.setCz(shapeNew.getCz()+shapeNew.getcRZ());
                        shapeNew.setcRX(-shapeNew.getcRX());
                        shapeNew.setcRY(-shapeNew.getcRY());
                        shapeNew.setcRZ(-shapeNew.getcRZ());
                        rotarPunto(shapeNew.getcR(),0,shapeNew.getAnimator().getAngleX(),shapeNew.getAnimator().getAngleY(),shapeNew.getAnimator().getAngleZ(),shapeNew.getOrderRotation(),0,0,0);
                        shapeNew.getAnimator().setAngleX(0);
                        shapeNew.getAnimator().setAngleY(0);
                        shapeNew.getAnimator().setAngleZ(0);

                        shapeNew.setVertex(shapeNew.getVertices());
                        shapeNew.setNormals(shapeNew.getNormals());
                        shapeNew.setRGBA(shapeNew.getAnimator().getRed()/255f,shapeNew.getAnimator().getGreen()/255f,shapeNew.getAnimator().getBlue()/255f,shapeNew.getAnimator().getAlpha()/255f);
                        shapeNew.setVertexTextureCoordinates(shapeNew.getTextureCoordinates());

                        ////////////////////////////////////
                        boolean sameTypeFound = false;
                        for(ShapeOpengl shapeInLine : shapesInLine){
                            if (isSameTypeOfObject(shapeInLine,shapeNew)){
                                mixShapes(shapeInLine, shapeNew);
                                sameTypeFound = true;
                                //ShapeOpengl mixedShape = mixShapes(shapeInLine, shapeNew);
                                //mixedShape.setMixedShape(true);
                                //shapesInLine.set(shapeIndex,mixedShape);
                                break;
                            }
                        }
                        if (!sameTypeFound){
                            shapesInLine.add(shapeNew);
                        }
                    }
                    shapes.addAll((ArrayList)shapesNew);
				}
            }
            //shapesToDraw.addAll((ArrayList)shapesInLine);
		}
        sphere.getAnimator().setBidirectionalAngleZ(false);
        sphere.getAnimator().setMinAngleZ(-360);
        sphere.getAnimator().setMinAngleY(-360);
        sphere.getAnimator().setMinAngleZ(-360);
        world.getAnimator().setMinAngleX(-360);
        world.getAnimator().setMinAngleY(-360);
	}

    private boolean isSameTypeOfObject(ShapeOpengl shapeInLine,ShapeOpengl shapeNew){
        boolean sameTypeObject = true;
        if ((shapeInLine.getTextureResources().size() > 0)&&(shapeNew.getTextureResources().size() > 0)){
            if (!shapeInLine.getTextureResources().get(0).equals(shapeNew.getTextureResources().get(0))){
                sameTypeObject = false;
            }
        }
        if ((shapeInLine.getAnimator().getIncrAngleX() != shapeNew.getAnimator().getIncrAngleX())||((shapeInLine.getAnimator().getIncrAngleX() != 0)&&((shapeInLine.getZ() != shapeNew.getZ())||(shapeInLine.getY() != shapeNew.getY())||(shapeInLine.getAnimator().getMaxAngleX() != shapeNew.getAnimator().getMaxAngleX())))){
            sameTypeObject = false;
        }
        if ((shapeInLine.getAnimator().getIncrAngleY() != shapeNew.getAnimator().getIncrAngleY())||((shapeInLine.getAnimator().getIncrAngleY() != 0)&&((shapeInLine.getX() != shapeNew.getX())||(shapeInLine.getZ() != shapeNew.getZ())||(shapeInLine.getAnimator().getMaxAngleY() != shapeNew.getAnimator().getMaxAngleY())))){
            sameTypeObject = false;
        }
        if ((shapeInLine.getAnimator().getIncrAngleZ() != shapeNew.getAnimator().getIncrAngleZ())||((shapeInLine.getAnimator().getIncrAngleZ() != 0)&&((shapeInLine.getX() != shapeNew.getX())||(shapeInLine.getY() != shapeNew.getY())||(shapeInLine.getAnimator().getMaxAngleZ() != shapeNew.getAnimator().getMaxAngleZ())))){
            sameTypeObject = false;
        }
        if ((shapeInLine.getAnimator().getIncrX() != shapeNew.getAnimator().getIncrX())||((shapeInLine.getAnimator().getIncrX() != 0)&&((shapeInLine.getAnimator().getX() != shapeNew.getAnimator().getX())||(shapeInLine.getAnimator().getMaxX() != shapeNew.getAnimator().getMaxX())||(shapeInLine.getAnimator().getMinX() != shapeNew.getAnimator().getMinX())))){
            sameTypeObject = false;
        }
        if ((shapeInLine.getAnimator().getIncrY() != shapeNew.getAnimator().getIncrY())||((shapeInLine.getAnimator().getIncrY() != 0)&&((shapeInLine.getAnimator().getY() != shapeNew.getAnimator().getY())||(shapeInLine.getAnimator().getMaxY() != shapeNew.getAnimator().getMaxY())||(shapeInLine.getAnimator().getMinY() != shapeNew.getAnimator().getMinY())))){
            sameTypeObject = false;
        }
        if ((shapeInLine.getAnimator().getIncrZ() != shapeNew.getAnimator().getIncrZ())||((shapeInLine.getAnimator().getIncrZ() != 0)&&((shapeInLine.getAnimator().getZ() != shapeNew.getAnimator().getZ())||(shapeInLine.getAnimator().getMaxZ() != shapeNew.getAnimator().getMaxZ())||(shapeInLine.getAnimator().getMinZ() != shapeNew.getAnimator().getMinZ())))){
            sameTypeObject = false;
        }
        if (shapeInLine.getAnimator().getIncrScale() != shapeNew.getAnimator().getIncrScale()){
            sameTypeObject = false;
        }
        if (shapeInLine.getAnimator().getIncrAlpha() != shapeNew.getAnimator().getIncrAlpha()){
            sameTypeObject = false;
        }
        if (shapeInLine.getAnimator().getIncrRed() != shapeNew.getAnimator().getIncrRed()){
            sameTypeObject = false;
        }
        if (shapeInLine.getAnimator().getIncrGreen() != shapeNew.getAnimator().getIncrGreen()){
            sameTypeObject = false;
        }
        if (shapeInLine.getAnimator().getIncrBlue() != shapeNew.getAnimator().getIncrBlue()){
            sameTypeObject = false;
        }
        if ((shapeInLine.getAnimator().getIncrScale() != shapeNew.getAnimator().getIncrScale())||((shapeInLine.getAnimator().getIncrScale() != 0)&&((shapeInLine.getX() != shapeNew.getX())||(shapeInLine.getY() != shapeNew.getY())||(shapeInLine.getZ() != shapeNew.getZ())))){
            sameTypeObject = false;
        }
        if (shapeInLine.getDespYSinColision() != shapeNew.getDespYSinColision()){
            sameTypeObject = false;
        }
        if (shapeNew.isTrizable()){
            sameTypeObject = false;
        }
        if (!shapeNew.isAgrupable()){
            sameTypeObject = false;
        }
        return sameTypeObject;
    }

    private void mixShapes(ShapeOpengl shape1,ShapeOpengl shape2){
        float despX = shape2.getX()-shape1.getX();
        float despY = shape2.getY()-shape1.getY();
        float despZ = shape2.getZ()-shape1.getZ();
        //Vertex
        float[] vertex = new float[shape1.getVertices().length+shape2.getVertices().length];
        for(int i=0;i<shape1.getVertices().length;i++){
            vertex[i] = shape1.getVertices()[i];
        }
        for(int i=0;i<shape2.getVertices().length;i+=3){
            int index = shape1.getVertices().length+i;
            vertex[index] = shape2.getVertices()[i]+despX;
            vertex[index+1] = shape2.getVertices()[i+1]+despY;
            vertex[index+2] = shape2.getVertices()[i+2]+despZ;
        }
        //Texture
        float[] textureCoordinates = new float[shape1.getTextureCoordinates().length+shape2.getTextureCoordinates().length];
        for(int i=0;i<shape1.getTextureCoordinates().length;i++){
            textureCoordinates[i] = shape1.getTextureCoordinates()[i];
        }
        for(int i=0;i<shape2.getTextureCoordinates().length;i++){
            textureCoordinates[shape1.getTextureCoordinates().length+i] = shape2.getTextureCoordinates()[i];
        }
        //Normals
        float[] normals = new float[shape1.getNormals().length+shape2.getNormals().length];
        for(int i=0;i<shape1.getNormals().length;i++){
            normals[i] = shape1.getNormals()[i];
        }
        for(int i=0;i<shape2.getNormals().length;i++){
            normals[shape1.getNormals().length+i] = shape2.getNormals()[i];
        }
        shape1.setVertex(vertex);
        shape1.setVertexTextureCoordinates(textureCoordinates);
        shape1.setNormals(normals);
        shape1.setRGBA(shape1.getAnimator().getRed()/255f,shape1.getAnimator().getGreen()/255f,shape1.getAnimator().getBlue()/255f,shape1.getAnimator().getAlpha()/255f);

        shape2.setVertex(new float[]{});
        shape2.setVertexTextureCoordinates(new float[]{});
        shape2.setNormals(new float[]{});
    }

    public Sphere crearEsfera(float cx, float cy, float cz){
        return new Sphere(cx,cy+radioEsfera*5,cz,12,24,radioEsfera);
    }

    private float[] copyArray(float[] array){
        float[] arrayNew = new float[array.length];
        for(int i=0;i<array.length;i++){
            arrayNew[i] = array[i];
        }
        return arrayNew;
    }

    private void traslatePoint(float point[],int index,float cx,float cy,float cz){
        point[index] -= cx;
        point[index+1] -= cy;
        point[index+2] -= cz;
    }

    private void rotarPunto(float point[],int inicio,double angleX,double angleY,double angleZ,List<String> orderRotation,float cRX0,float cRY0,float cRZ0){
        point[inicio] -= cRX0;
        point[inicio+1] -= cRY0;
        point[inicio+2] -= cRZ0;
        for(int i=0;i<orderRotation.size();i++){
            if (orderRotation.get(i).equals("Z")){
                //angulo Z
                if (angleZ != 0){
                    rotateVertex(point,inicio,inicio+1,(float)angleZ);
                }
            }
            else if (orderRotation.get(i).equals("Y")){
                //angulo Y
                if (angleY != 0){
                    rotateVertex(point,inicio,inicio+2,(float)angleY);
                }
            }
            else if (orderRotation.get(i).equals("X")){
                //angulo X
                if (angleX != 0){
                    rotateVertex(point,inicio+2,inicio+1,-(float)angleX);
                }
            }
        }
        point[inicio] += cRX0;
        point[inicio+1] += cRY0;
        point[inicio+2] += cRZ0;
    }

    private void rotateVertex(float[] vertex,int index1,int index2,float angle){
        float angleInicial = (float)Math.toDegrees(Math.atan2(-vertex[index2], -vertex[index1]));
        float angleNuevo = angleInicial+(float)angle;
        float R_TR = (float)Math.sqrt(Math.pow(vertex[index1],2)+Math.pow(vertex[index2],2));
        vertex[index1] = -(float)(R_TR*Math.cos(Math.toRadians(angleNuevo)));
        vertex[index2] = -(float)(R_TR*Math.sin(Math.toRadians(angleNuevo)));
    }

	protected void crearNivel(){
		//Sobreescribir este metodo en los niveles hijos
	}
	
	protected List<ShapeOpengl> crearObjeto(String figura,float x,float y,float z){
		//Sobreescribir este metodo en los niveles hijos
        return null;
	}

    protected void continueShapeCreation(List<ShapeOpengl> shapes,String figura,float x,float y,float z){
        if (figura.equals("K1")){
            shapes.add(crearCheckPoint(x,y+lengthPared,z));
            shapes.add(crearPoste(x-lengthPlano,y,z));
            shapes.add(crearPoste(x+lengthPlano,y,z));
        }
        if (figura.equals("K2")){
            shapes.add(crearCheckPoint(x,y+lengthPared,z));
            shapes.add(crearCheckPoint(x+lengthPlano*2,y+lengthPared,z));
            shapes.add(crearPoste(x-lengthPlano,y,z));
            shapes.add(crearPoste(x+lengthPlano*3,y,z));
        }
        if (figura.equals("K3")){
            shapes.add(crearCheckPoint(x,y+lengthPared,z));
            shapes.add(crearCheckPoint(x+lengthPlano*2,y+lengthPared,z));
            shapes.add(crearCheckPoint(x+lengthPlano*4,y+lengthPared,z));
            shapes.add(crearPoste(x-lengthPlano,y,z));
            shapes.add(crearPoste(x+lengthPlano*5,y,z));
        }
    }

    public void onUpdateDrawingData(){
        //Sobreescribir en el nivel
    }

	public void cargarTexturas(Context context){
		textures = new ArrayList<int[]>();
		cargarRecursos();
		//Cargando texturas
		for(int i=0;i<texturesResources.size();i++){
			loadGLTexture(context, textures.get(i), 0, texturesResources.get(i));
		}
		assignTextureToObjects();
	}
	
	public void cargarRecursos(){
		//Sobreescribir en niveles
		//Listando texturas
		texturesResources = new ArrayList<Integer>();
		for(ShapeOpengl shape : shapes){
            cargarRecurso(shape);
		}
        //for(ShapeOpengl shape : shapesToDraw){
            //cargarRecurso(shape);
        //}
		cargarRecurso(sphere);
		cargarRecurso(world);
	}
	
	protected void cargarRecurso(ShapeOpengl shape){
        if (shape.getTextureResources() != null){
            for(int texture : shape.getTextureResources()){
                if ((texture != -1)&&(!texturesResources.contains(texture))){
                    texturesResources.add(texture);
                    textures.add(new int[1]);
                }
            }
        }
	}
	
	public void assignTextureToObjects(){
		for(ShapeOpengl shape : shapes){
			loadTexture(shape);
		}
        //for(ShapeOpengl shape : shapesToDraw){
            //loadTexture(shape);
        //}
		loadTexture(sphere);
		loadTexture(world);
	}
	
	private void loadTexture(ShapeOpengl shape){
		if (shape.getTextureResources() != null){
            int texturesArr[] = new int[shape.getTextureResources().size()];
            for(int i=0;i<shape.getTextureResources().size();i++){
                int texture[] = textures.get(texturesResources.indexOf(shape.getTextureResources().get(i).intValue()));
                texturesArr[i] = texture[0];
            }
            shape.setTexturePointers(texturesArr);
		}
	}

    public void onTouchMoved(float y,float yMoveAnt){
        if (y-yMoveAnt < 0){
            sphere.setVz(sphere.getVz()-0.0015f);
        }
        if (y-yMoveAnt > 0){
            sphere.setVz(sphere.getVz()+0.0015f);
        }
    }

    public void onDoubleTouchPerformed(MyGLRenderer renderer){
        if ((renderer.conlisionY)&&(!sphere.isTrizar())){
            sphere.setVy(vyJump);
            renderer.conlisionY = false;
        }
    }

	public void loadGLTexture(Context context, int[] textures, int index, int resource) {

        if (ETC1Util.isETC1Supported()){
            // Generate Textures, if more needed, alter these numbers.
            GLES20.glGenTextures(1, textures, 0);
            // Temporary create a bitmap
            Bitmap bmp = BitmapFactory.decodeResource(context.getResources(), resource);

            // Bind texture to texturename
            GLES20.glActiveTexture(GLES20.GL_TEXTURE0);
            GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, textures[0]);

            // Set filtering
            GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MIN_FILTER,
                    GLES20.GL_LINEAR);
            GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MAG_FILTER,
                    GLES20.GL_LINEAR);

            // Set wrapping mode
            GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_S,
                    GLES20.GL_CLAMP_TO_EDGE);
            GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_T,
                    GLES20.GL_CLAMP_TO_EDGE);

            // Load the bitmap into the bound texture.
            GLUtils.texImage2D(GLES20.GL_TEXTURE_2D, 0, bmp, 0);

            // We are done using the bitmap so we should recycle it.
            bmp.recycle();
        }
	}

    ////////////////////////////////Objetos Comunes/////////////////////////////////////////////////

    ////////////////////////////////Moneda//////////////////////////////////////////////////////////

    protected Cylinder3 crearMoneda(float cx, float cy, float cz){
        Cylinder3 moneda = new Cylinder3(cx,cy,cz,0.12f,0.02f,12);
        moneda.getTextureResources().add(R.drawable.moneda_textura);
        moneda.getAnimator().setIncrAngleY(2f);
        moneda.getAnimator().setAngleX(90);
        moneda.getAnimator().setBidirectionalAngleY(false);

        moneda.getAnimator().setMaxRed(400);
        moneda.getAnimator().setMaxGreen(400);
        moneda.getAnimator().setMaxBlue(400);
        moneda.getAnimator().setMinRed(255);
        moneda.getAnimator().setMinGreen(255);
        moneda.getAnimator().setMinBlue(255);
        moneda.getAnimator().setIncrRed(5);
        moneda.getAnimator().setIncrGreen(5);
        moneda.getAnimator().setIncrBlue(5);

        moneda.setDesaparecible(true);

        return moneda;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    /////////////////////////////////Puerta Abrible/////////////////////////////////////////////////

    protected Plane crearPlanoPuerta(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy+0.5f,cz,0.2f,0.5f,0);
        plane.getTextureResources().add(R.drawable.puerta);
        plane.getAnimator().setMaxX(0.3f);
        plane.getAnimator().setMinX(-0.3f);
        plane.getAnimator().setRepetibleX(false);
        plane.setAgrupable(false);
        return plane;
    }

    protected Plane crearBotonPuerta(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy+0.8f,cz,0.1f,0.1f,0);
        plane.getTextureResources().add(R.drawable.boton_apagado);
        plane.getTextureResources().add(R.drawable.boton_encendido);
        plane.setSpeedIndexTexture(0);
        plane.setAgrupable(false);
        return plane;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////Objetos de checkpoint//////////////////////////////////////////

    private Plane crearCheckPoint(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy+lengthPared*2,cz,lengthPlano,lengthPlano/8,0);
        plane.getTextureResources().add(resourceCintaCheckPoint);
        plane.setRGBA(1f, 1.0f, 1.0f, 0.6f);
        plane.setCheckPoint(true);
        return plane;
    }

    private Cube crearPoste(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared*2,cz,lengthPlano/8,lengthPared*2,lengthPlano/8);
        cube.getTextureResources().add(resourcePaloCheckPoint);
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
}
