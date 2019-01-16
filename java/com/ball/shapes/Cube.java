package com.ball.shapes;

public class Cube extends ShapeOpengl {
	public float width;
	public float height;
	public float depth;
	public Cube(float cx, float cy, float cz, float width, float height, float depth){
		super(cx,cy,cz);
		this.width = width;
		this.height = height;
		this.depth = depth;
		Plane plane1 = new Plane(width,0,0,0,-height,depth);
		Plane plane2 = new Plane(-width,0,0,0,height,depth);
		Plane plane3 = new Plane(0,height,0,width,0,depth);
		Plane plane4 = new Plane(0,-height,0,-width,0,depth);
		Plane plane5 = new Plane(0,0,depth,width,height,0);
		Plane plane6 = new Plane(0,0,-depth,width,-height,0);
		//Vertices
		float[] vertex = new float[plane1.getVertices().length*6];
		copyVertex(plane1,0,vertex);
		copyVertex(plane2,1,vertex);
		copyVertex(plane3,2,vertex);
		copyVertex(plane4,3,vertex);
		copyVertex(plane5,4,vertex);
		copyVertex(plane6,5,vertex);
		//Texturas
		float[] textureCoordinates = new float[plane1.getTextureCoordinates().length*6];
		copyTexture(plane1,0,textureCoordinates);
		copyTexture(plane2,1,textureCoordinates);
		copyTexture(plane3,2,textureCoordinates);
		copyTexture(plane4,3,textureCoordinates);
		copyTexture(plane5,4,textureCoordinates);
		copyTexture(plane6,5,textureCoordinates);
		setVertex(vertex);
		setVertexTextureCoordinates(textureCoordinates);
        setRGBA(1f,1f,1f,1f);
        calculateNormals();
	}

    public Cube(){

    }

	private void copyVertex(Plane plane, int idPlano, float[] vertex){
		int index = plane.getVertices().length*idPlano;
		for(int i = 0; i< plane.getVertices().length; i++){
			if (i%3 == 0){
				vertex[index+i] = plane.getVertices()[i]+ plane.getX();
			}
			if (i%3 == 1){
				vertex[index+i] = plane.getVertices()[i]+ plane.getY();
			}
			if (i%3 == 2){
				vertex[index+i] = plane.getVertices()[i]+ plane.getZ();
			}
		}
	}
	
	private void copyTexture(Plane plane, int idPlano, float[] texture){
		int index = plane.getTextureCoordinates().length*idPlano;
		for(int i = 0; i< plane.getTextureCoordinates().length; i++){
			texture[index+i] = plane.getTextureCoordinates()[i];
		}
	}
	
	@Override
	public boolean colisiona(Sphere sphere){
		super.colisiona(sphere);
		if ((Math.abs(cyER) < sphere.getRadio()+getHeight())&&(Math.abs(cxER) < sphere.getRadio()+getWidth())&&(Math.abs(czER) < sphere.getRadio()+getDepth())){
			return true;
		}
		return false;
	}

    public double getWidth(){
        return  width*getAnimator().getScale();
    }

    public double getHeight(){
        return  height*getAnimator().getScale();
    }

    public double getDepth(){
        return  depth*getAnimator().getScale();
    }
}
