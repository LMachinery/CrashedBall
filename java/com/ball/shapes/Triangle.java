package com.ball.shapes;

public class Triangle extends ShapeOpengl {
	public float width;
	public float height;
	public float depth;
	public Triangle(float cx, float cy, float cz, float width, float height, float depth){
		super(cx,cy,cz);
		this.width = width;
		this.height = height;
		this.depth = depth;
		float vertex[] = null;
		if (width == 0){
			float vertexL[] = {0,-height,-depth,
							   0,-height,depth,
                               0,height,0,
			};
			vertex = vertexL;
		}
		if (height == 0){
			float vertexL[] = {-width,0,-depth,
                                -width,0,depth,
								width,0,0,
			};
			vertex = vertexL;
		}
		if (depth == 0){
			float vertexL[] = {-width,-height,0,
                                width,-height,0,
								0,height,0,
            };
			vertex = vertexL;
            float textureCoordinates[] = {
                    // Mapping coordinates for the vertices
                    1.0f, 1.0f,		// bottom right	(V4)
                    0.0f, 1.0f,		// bottom left	(V1)
                    0.5f, 0.0f,		// top right	(V3)
            };
            setVertexTextureCoordinates(textureCoordinates);
		}
		setVertex(vertex);
        setVertexTextureCoordinates(getTextureCoordinates());
        setRGBA(1f,1f,1f,1f);
        calculateNormals();
	}

    public Triangle(){

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
        return  width*animator.getScale();
    }

    public double getHeight(){
        return  height*animator.getScale();
    }

    public double getDepth(){
        return  depth*animator.getScale();
    }
}
