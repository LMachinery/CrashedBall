package com.ball.shapes;

import com.ball.extras.Animator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 15/04/2015.
 */
public class Shape {

    private List<Integer> textureResources = new ArrayList<Integer>();
    //Angulos para colision
    protected List<String> orderRotation;
    //Velocidad de rotacion que se indica para la rotacion automatica indicada en el arreglo del mapa
    private float velocidadRotacion = 1f;
    private float cx;
    private float cy;
    private float cz;
    protected Animator animator = new Animator();
    //Movimiento
    private float vx;
    private float vy;
    private float vz;
    //Coordenadas rotadas usadas para calcular colisiones
    protected float cxER;
    protected float cyER;
    protected float czER;
    //Traslacion de objetos por rotacion
    private float tRX = 0;
    private float tRY = 0;
    private float tRZ = 0;
    //Solido para detectar colisiones
    private boolean solid = false;
    private boolean trizable = false;
    private boolean isWatter = false;
    private boolean isMixedShape = false;
    private boolean noRotar = false;
    private boolean checkPoint = false;
    private boolean trizar = false;
    private boolean agrupable = true;
    private boolean desaparecible = false;
    private boolean capazVariarAnguloGravedad = false;
    private long tiempoDesdeTrizamiento = -1;
    //Desplazamiento en y sin colision
    protected float despYSinColision = 0;
    protected int indexTexture = 0;
    private int framesPerTexture = 8;
    private int curFrame = 0;
    private int speedIndexTexture = 1;
    ///////////////////////////////////Efecto de trizar////////////////////////////////////////
    private float decremento = 0.005f;
    private float aceleracion = 0.0004f;
    private Float minY = null;
    private Shape LaserShape = null;
    private Shape Interruptor2 = null;
    private Shape Puerta1 = null;
    private Shape Puerta2 = null;

    private float textureCoordinates[] = {
            // Mapping coordinates for the vertices
            1.0f, 1.0f,		// bottom right	(V4)
            1.0f, 0.0f,		// bottom left	(V1)
            0.0f, 1.0f,		// top right	(V3)

            1.0f, 0.0f,		// top right	(V3)
            0.0f, 0.0f,		// bottom left	(V1)
            0.0f, 1.0f,		// top left		(V2)
    };
    protected float[] vertices;
    protected float colors[] = null;
    protected float normals[] = null;

    protected float xAxis[] = {1f,0f,0f};
    protected float yAxis[] = {0f,1f,0f};
    protected float zAxis[] = {0f,0f,1f};

    private float cR[] = {0f,0f,0f};

    public Shape(float cx,float cy,float cz){
        this.cx = cx;
        this.cy = cy;
        this.cz = cz;
        //Orden de rotacion de rueda
        orderRotation = new ArrayList<String>();
        orderRotation.add("Y");
        orderRotation.add("X");
        orderRotation.add("Z");
    }

    public Shape(){

    }

    public void createMirroredTextureCoordinates(float lengthPlano){
        int residuo = ((int)((cx+lengthPlano)/(2*lengthPlano)))%2;
        if (residuo != 0){
            mirrorXTextureCoordinates();
        }
        residuo = ((int)((cz-lengthPlano)/(2*lengthPlano)))%2;
        if (residuo != 0){
            mirrorYTextureCoordinates();
        }
    }

    public void mirrorXTextureCoordinates(){
        for(int i=0;i<textureCoordinates.length;i+=2){
            if (textureCoordinates[i] == 0){
                textureCoordinates[i] = 1;
            }
            else{
                textureCoordinates[i] = 0;
            }
        }
        setVertexTextureCoordinates(textureCoordinates);
    }

    public void mirrorYTextureCoordinates(){
        for(int i=1;i<textureCoordinates.length;i+=2){
            if (textureCoordinates[i] == 0){
                textureCoordinates[i] = 1;
            }
            else{
                textureCoordinates[i] = 0;
            }
        }
        setVertexTextureCoordinates(textureCoordinates);
    }

    public void increaseData(){
        animator.increaseData();
        continuarTrizado();
        setRGBA(animator.getRed()/255f,animator.getGreen()/255f,animator.getBlue()/255f,animator.getAlpha()/255f);
    }

    public void increaseAlways(){
        curFrame++;
        if (curFrame > framesPerTexture){
            curFrame = 0;
            indexTexture += speedIndexTexture;
            if (indexTexture >= textureResources.size()){
                indexTexture = 0;
            }
        }
        cx += vx;
        cy += vy;
        cz += vz;
    }

    public double distanceTo(Shape shape){
        return Math.sqrt(Math.pow(shape.getX()-getX(), 2)+Math.pow(shape.getY()-getY(), 2)+Math.pow(shape.getZ()-getZ(), 2));
    }

    public boolean colisiona(Sphere sphere){
        //Trasladando eje
        float cRNew[] = {cR[0],cR[1],cR[2]};
        if (((cR[0] != 0)||(cR[1] != 0)||(cR[2] != 0))&&((animator.getAngleX() != 0)||(animator.getAngleY() != 0)||(animator.getAngleZ() != 0))){
            cRNew = getCenterRotation();
        }
        cxER = sphere.getX()-(getX()+cRNew[0]);
        cyER = sphere.getY()-(getY()+cRNew[1]);
        czER = sphere.getZ()-(getZ()+cRNew[2]);
        //Rotando coordenadas
        for(int i=0;i<orderRotation.size();i++){
            if (orderRotation.get(i).equals("Z")){
                //AnguloX - Plane XY
                float angle = (float)Math.toDegrees(Math.atan2(cyER, cxER));
                float R = (float)Math.sqrt(Math.pow(cyER,2)+Math.pow(cxER,2));
                cxER = (float)(R*Math.cos(Math.toRadians(angle-animator.getAngleZ())));
                cyER = (float)(R*Math.sin(Math.toRadians(angle-animator.getAngleZ())));
            }
            else if (orderRotation.get(i).equals("Y")){
                //AnguloY - Plane XZ
                float angle = (float)Math.toDegrees(Math.atan2(czER, cxER));
                float R = (float)Math.sqrt(Math.pow(czER,2)+Math.pow(cxER,2));
                cxER = (float)(R*Math.cos(Math.toRadians(angle+animator.getAngleY())));
                czER = (float)(R*Math.sin(Math.toRadians(angle+animator.getAngleY())));
            }
            else if (orderRotation.get(i).equals("X")){
                //AnguloZ - Plane YZ
                float angle = (float)Math.toDegrees(Math.atan2(cyER, czER));
                float R = (float)Math.sqrt(Math.pow(cyER,2)+Math.pow(czER,2));
                czER = (float)(R*Math.cos(Math.toRadians(angle+animator.getAngleX())));
                cyER = (float)(R*Math.sin(Math.toRadians(angle+animator.getAngleX())));
            }
        }
        float planoXY[] = obtenerEcuacionPlano(xAxis,yAxis);
        float planoXZ[] = obtenerEcuacionPlano(xAxis,zAxis);
        float planoYZ[] = obtenerEcuacionPlano(yAxis,zAxis);
        float punto[] = {cxER,cyER,czER};
        float zCoord = obtenerDistanciaPuntoPlano(planoXY,punto);
        float yCoord = obtenerDistanciaPuntoPlano(planoXZ,punto);
        float xCoord = obtenerDistanciaPuntoPlano(planoYZ,punto);
        cxER = -xCoord;
        cyER = -yCoord;
        czER = -zCoord;
        return false;
    }

    private float[] getCenterRotation(){
        float xAxis[] = {1,0,0};
        float yAxis[] = {0,1,0};
        float zAxis[] = {0,0,1};
        float origen[] = {0,0,0};
        float cRNew[] = {cR[0],cR[1],cR[2]};
        for(int i=0;i<orderRotation.size();i++){
            if (orderRotation.get(i).equals("Z")){
                cRNew = rotarPuntoRespectoEje(cRNew,zAxis,origen,-(float)animator.getAngleZ());
                xAxis = rotarPuntoRespectoEje(xAxis,zAxis,origen,-(float)animator.getAngleZ());
                yAxis = rotarPuntoRespectoEje(yAxis,zAxis,origen,-(float)animator.getAngleZ());
            }
            else if (orderRotation.get(i).equals("Y")){
                cRNew = rotarPuntoRespectoEje(cRNew,yAxis,origen,-(float)animator.getAngleY());
                xAxis = rotarPuntoRespectoEje(xAxis,yAxis,origen,-(float)animator.getAngleY());
                zAxis = rotarPuntoRespectoEje(zAxis,yAxis,origen,-(float)animator.getAngleY());
            }
            else if (orderRotation.get(i).equals("X")){
                cRNew = rotarPuntoRespectoEje(cRNew,xAxis,origen,-(float)animator.getAngleX());
                yAxis = rotarPuntoRespectoEje(yAxis,xAxis,origen,-(float)animator.getAngleX());
                zAxis = rotarPuntoRespectoEje(zAxis,xAxis,origen,-(float)animator.getAngleX());
            }
        }
        return cRNew;
    }

    ///////////////////////////////Rotar punto respecto a un eje////////////////////////////////////
    //P = Punto a rotar
    //A = Coordenada 1 del eje
    //B = Coordenada 2 del eje
    //angulo = angulo a girar
    private float[] rotarPuntoRespectoEje(float P[],float A[],float B[],float angulo){
        float PA[] = diffV(P,A);
        float BA[] = diffV(B,A);
        float modBA = modV(BA);
        float n[] = divC(BA,modBA);
        float dotNPA = dot(n,PA);
        float d[] = multC(n,dot(n,PA));
        float t1[] = multC(diffV(PA,d),(float)Math.cos(Math.toRadians(angulo)));
        float t2[] = multC(cross(n,PA),(float)Math.sin(Math.toRadians(angulo)));
        float P2[] = sumV(sumV(sumV(A,d),t1),t2);
        return P2;
    }

    private float[] diffV(float A[],float B[]){
        float C[] = {A[0]-B[0],A[1]-B[1],A[2]-B[2]};
        return C;
    }

    private float[] sumV(float A[],float B[]){
        float C[] = {A[0]+B[0],A[1]+B[1],A[2]+B[2]};
        return C;
    }

    protected float modV(float V[]){
        return (float)Math.sqrt(Math.pow(V[0],2)+Math.pow(V[1],2)+Math.pow(V[2],2));
    }

    private float dot(float A[],float B[]){
        return A[0]*B[0]+A[1]*B[1]+A[2]*B[2];
    }

    private float[] cross(float A[],float B[]){
        float C[] = {A[1]*B[2] - A[2]*B[1], - (A[0]*B[2] - A[2]*B[0]), A[0]*B[1] - A[1]*B[0]};
        return C;
    }

    private float[] multC(float A[],float C){
        float B[] = {A[0]*C,A[1]*C,A[2]*C};
        return B;
    }

    private float[] divC(float A[],float C){
        float B[] = {A[0]/C,A[1]/C,A[2]/C};
        return B;
    }

    /////////////////////////////Calcular coordenada en eje rotado//////////////////////////////////

    public float[] obtenerEcuacionPlano(float vector1[],float vector2[]){
        float a = vector1[1]*vector2[2]-vector1[2]*vector2[1];
        float b = vector1[2]*vector2[0]-vector1[0]*vector2[2];
        float c = vector1[0]*vector2[1]-vector1[1]*vector2[0];
        float plano[] = {a,b,c};
        return plano;
    }

    public float obtenerDistanciaPuntoPlano(float plano[],float punto[]){
        return (plano[0]*punto[0]+plano[1]*punto[1]+plano[2]*punto[2])/(float)(Math.sqrt(Math.pow(plano[0],2)+Math.pow(plano[1],2)+Math.pow(plano[2],2)));
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    public void setRGBA(float rojo,float verde,float azul,float transparencia){
        //Color
        animator.setRed((int)(rojo*255));
        animator.setGreen((int)(verde*255));
        animator.setBlue((int)(azul*255));
        animator.setAlpha((int)(transparencia*255));

        colors = new float[4*(vertices.length/3)];
        for(int i=0;i<colors.length;i+=4){
            colors[i] = rojo;
            colors[i+1] = verde;
            colors[i+2] = azul;
            colors[i+3] = transparencia;
        }
    }

    public void calculateNormals(){
        normals = new float[vertices.length];
        for(int i=0;i<normals.length;i+=9){
            float vector1[] = {vertices[i]-vertices[i+3],vertices[i+1]-vertices[i+4],vertices[i+2]-vertices[i+5]};
            float vector2[] = {vertices[i+6]-vertices[i+3],vertices[i+7]-vertices[i+4],vertices[i+8]-vertices[i+5]};

            float[] vectorUnitarioResultado = calcularVectorPerpendicularUnitario(vector1,vector2);

            normals[i] = vectorUnitarioResultado[0];
            normals[i+1] = vectorUnitarioResultado[1];
            normals[i+2] = vectorUnitarioResultado[2];

            normals[i+3] = vectorUnitarioResultado[0];
            normals[i+4] = vectorUnitarioResultado[1];
            normals[i+5] = vectorUnitarioResultado[2];

            normals[i+6] = vectorUnitarioResultado[0];
            normals[i+7] = vectorUnitarioResultado[1];
            normals[i+8] = vectorUnitarioResultado[2];
        }
    }

    public float[] calcularVectorPerpendicularUnitario(float vector1[],float vector2[]){
        float vectorResultado[] = {resolverDeterminante(vector1[1],vector1[2],vector2[1],vector2[2]),-resolverDeterminante(vector1[0],vector1[2],vector2[0],vector2[2]),resolverDeterminante(vector1[0],vector1[1],vector2[0],vector2[1])};
        float modulo = (float)Math.sqrt(Math.pow(vectorResultado[0],2)+Math.pow(vectorResultado[1],2)+Math.pow(vectorResultado[2],2));
        float vectorUnitarioResultado[] = {-vectorResultado[0]/modulo,-vectorResultado[1]/modulo,-vectorResultado[2]/modulo};
        return vectorUnitarioResultado;
    }

    private float resolverDeterminante(float x1,float x2,float y1,float y2){
        return x1*y2-x2*y1;
    }

    public void trizar(){
        if (!trizar){
            for(int i=1;i<vertices.length;i+=3){
                if (minY == null){
                    minY = vertices[i];
                }
                else{
                    minY = Math.min(vertices[i], minY);
                }
            }
            trizar = true;
            decremento = 0.0005f;
            //Retornando angulo a su rotacion inicial
            animator.setAngleX(0);
            animator.setAngleY(0);
            animator.setAngleZ(0);
            animator.setIncrAngleX(0);
            animator.setIncrAngleY(0);
            animator.setIncrAngleZ(0);
            vx = 0;
            vy = 0;
            vz = 0;
        }
    }

    protected void continuarTrizado(){
        if (trizar){
            boolean trizado = false;
            for(int i=0;i<vertices.length;i+=3){
                if (vertices[i+1] > minY){
                    //x
                    if (i+3 < vertices.length){
                        float dcr = (vertices[i+3]-vertices[i])/16;
                        vertices[i] += dcr;
                        vertices[i+3] -= dcr;
                        vertices[i] += decremento*Math.signum(vertices[i])/4;
                        vertices[i+3] += decremento*Math.signum(vertices[i])/4;
                    }
                    //z
                    if (i+5 < vertices.length){
                        float dcr = (vertices[i+5]-vertices[i+2])/16;
                        vertices[i+2] += dcr;
                        vertices[i+5] -= dcr;
                        vertices[i+2] += decremento*Math.signum(vertices[i+2])/4;
                        vertices[i+5] += decremento*Math.signum(vertices[i+5])/4;
                    }
                    vertices[i+1] -= decremento;
                    trizado = true;
                }
            }
            if (trizado){
                setVertex(vertices);
                decremento += aceleracion;
            }
        }
    }

    public void setVertex(float[] vertices){
        this.vertices = vertices;
    }

    public void setVertexTextureCoordinates(float[] textureCoordinates){
        this.textureCoordinates = textureCoordinates;
    }

    public float getX(){
        return cx+(float)animator.getX()+tRX;
    }

    public float getY(){
        return cy+(float)animator.getY()+tRY;
    }

    public float getZ(){
        return cz+(float)animator.getZ()+tRZ;
    }

    public boolean isNoRotar() {
        return noRotar;
    }

    public void setNoRotar(boolean noRotar) {
        this.noRotar = noRotar;
    }

    public List<Integer> getTextureResources() {
        return textureResources;
    }

    public void setTextureResources(List<Integer> textureResources) {
        this.textureResources = textureResources;
    }

    public List<String> getOrderRotation() {
        return orderRotation;
    }

    public void setOrderRotation(List<String> orderRotation) {
        this.orderRotation = orderRotation;
    }

    public float getVelocidadRotacion() {
        return velocidadRotacion;
    }

    public void setVelocidadRotacion(float velocidadRotacion) {
        this.velocidadRotacion = velocidadRotacion;
    }

    public float getCx() {
        return cx;
    }

    public void setCx(float cx) {
        this.cx = cx;
    }

    public float getCy() {
        return cy;
    }

    public void setCy(float cy) {
        this.cy = cy;
    }

    public float getCz() {
        return cz;
    }

    public void setCz(float cz) {
        this.cz = cz;
    }

    public Animator getAnimator() {
        return animator;
    }

    public void setAnimator(Animator animator) {
        this.animator = animator;
    }

    public float getVx() {
        return vx;
    }

    public void setVx(float vx) {
        this.vx = vx;
    }

    public float getVy() {
        return vy;
    }

    public void setVy(float vy) {
        this.vy = vy;
    }

    public float getVz() {
        return vz;
    }

    public void setVz(float vz) {
        this.vz = vz;
    }

    public boolean isSolid() {
        return solid;
    }

    public void setSolid(boolean solid) {
        this.solid = solid;
    }

    public boolean isTrizable() {
        return trizable;
    }

    public void setTrizable(boolean trizable) {
        this.trizable = trizable;
    }

    public boolean isWatter() {
        return isWatter;
    }

    public void setWatter(boolean isWatter) {
        this.isWatter = isWatter;
    }

    public long getTiempoDesdeTrizamiento() {
        return tiempoDesdeTrizamiento;
    }

    public void setTiempoDesdeTrizamiento(long tiempoDesdeTrizamiento) {
        this.tiempoDesdeTrizamiento = tiempoDesdeTrizamiento;
    }

    public boolean isCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(boolean checkPoint) {
        this.checkPoint = checkPoint;
    }

    public float getCxER() {
        return cxER;
    }

    public void setCxER(float cxER) {
        this.cxER = cxER;
    }

    public float getCyER() {
        return cyER;
    }

    public void setCyER(float cyER) {
        this.cyER = cyER;
    }

    public float getCzER() {
        return czER;
    }

    public void setCzER(float czER) {
        this.czER = czER;
    }

    public float gettRX() {
        return tRX;
    }

    public void settRX(float tRX) {
        this.tRX = tRX;
    }

    public float gettRY() {
        return tRY;
    }

    public void settRY(float tRY) {
        this.tRY = tRY;
    }

    public float gettRZ() {
        return tRZ;
    }

    public void settRZ(float tRZ) {
        this.tRZ = tRZ;
    }

    public float getDespYSinColision() {
        return despYSinColision;
    }

    public void setDespYSinColision(float despYSinColision) {
        this.despYSinColision = despYSinColision;
    }

    public int getIndexTexture() {
        return indexTexture;
    }

    public void setIndexTexture(int indexTexture) {
        this.indexTexture = indexTexture;
    }

    public int getFramesPerTexture() {
        return framesPerTexture;
    }

    public void setFramesPerTexture(int framesPerTexture) {
        this.framesPerTexture = framesPerTexture;
    }

    public int getCurFrame() {
        return curFrame;
    }

    public void setCurFrame(int curFrame) {
        this.curFrame = curFrame;
    }

    public boolean isMixedShape() {
        return isMixedShape;
    }

    public void setMixedShape(boolean isMixedShape) {
        this.isMixedShape = isMixedShape;
    }

    public float[] getTextureCoordinates() {
        return textureCoordinates;
    }

    public void setTextureCoordinates(float[] textureCoordinates) {
        this.textureCoordinates = textureCoordinates;
    }

    public float[] getVertices() {
        return vertices;
    }

    public void setVertices(float[] vertices) {
        this.vertices = vertices;
    }

    public float[] getColors() {
        return colors;
    }

    public void setColors(float[] colors) {
        this.colors = colors;
    }

    public float[] getNormals() {
        return normals;
    }

    public void setNormals(float[] normals) {
        this.normals = normals;
    }

    public float getDecremento() {
        return decremento;
    }

    public void setDecremento(float decremento) {
        this.decremento = decremento;
    }

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }

    public Float getMinY() {
        return minY;
    }

    public void setMinY(Float minY) {
        this.minY = minY;
    }

    public boolean isTrizar() {
        return trizar;
    }

    public void setTrizar(boolean trizar) {
        this.trizar = trizar;
    }

    public void setVerticesArray(float[] vertices) {
        this.vertices = vertices;
    }

    public void setNormalsArray(float[] normals) {
        this.normals = normals;
    }

    public void setTextureCoordinatesArray(float[] textureCoordinates) {
        this.textureCoordinates = textureCoordinates;
    }

    public void setColorsVertexArray(float colors[]){
        this.colors = colors;
    }

    public float[] getzAxis() {
        return zAxis;
    }

    public void setzAxis(float[] zAxis) {
        this.zAxis = zAxis;
    }

    public float[] getyAxis() {
        return yAxis;
    }

    public void setyAxis(float[] yAxis) {
        this.yAxis = yAxis;
    }

    public float[] getxAxis() {
        return xAxis;
    }

    public void setxAxis(float[] xAxis) {
        this.xAxis = xAxis;
    }

    public Shape getLaserShape() {
        return LaserShape;
    }

    public void setLaserShape(Shape laserShape) {
        LaserShape = laserShape;
    }

    public boolean isAgrupable() {
        return agrupable;
    }

    public void setAgrupable(boolean agrupable) {
        this.agrupable = agrupable;
    }

    public float[] getcR() {
        return cR;
    }

    public void setcR(float[] cR) {
        this.cR = cR;
    }

    public float getcRX() {
        return cR[0];
    }

    public void setcRX(float cRX) {
        cR[0] = cRX;
    }

    public float getcRY() {
        return cR[1];
    }

    public void setcRY(float cRY) {
        cR[1] = cRY;
    }

    public float getcRZ() {
        return cR[2];
    }

    public void setcRZ(float cRZ) {
        cR[2] = cRZ;
    }

    public boolean isDesaparecible() {
        return desaparecible;
    }

    public void setDesaparecible(boolean desaparecible) {
        this.desaparecible = desaparecible;
    }

    public Shape getInterruptor2() {
        return Interruptor2;
    }

    public void setInterruptor2(Shape interruptor2) {
        Interruptor2 = interruptor2;
    }

    public Shape getPuerta1() {
        return Puerta1;
    }

    public void setPuerta1(Shape puerta1) {
        Puerta1 = puerta1;
    }

    public Shape getPuerta2() {
        return Puerta2;
    }

    public void setPuerta2(Shape puerta2) {
        Puerta2 = puerta2;
    }

    public int getSpeedIndexTexture() {
        return speedIndexTexture;
    }

    public void setSpeedIndexTexture(int speedIndexTexture) {
        this.speedIndexTexture = speedIndexTexture;
    }

    public boolean isCapazVariarAnguloGravedad() {
        return capazVariarAnguloGravedad;
    }

    public void setCapazVariarAnguloGravedad(boolean capazVariarAnguloGravedad) {
        this.capazVariarAnguloGravedad = capazVariarAnguloGravedad;
    }
}
