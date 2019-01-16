package com.ball.shapes;

import java.util.ArrayList;
import java.util.List;

public class Cone extends ShapeOpengl {
	public float R;
	public float r;
	public Cone(float cx, float cy, float cz, int divAngulo, float r, float R){
		super(cx,cy,cz);
		this.R = R;
		this.r = r;
		int incrementoAngulo = 360/divAngulo;
		List<float[]> triangulos = new ArrayList<float[]>();
		List<float[]> textures = new ArrayList<float[]>();
		for(int angulo = 45;angulo < 360+45;angulo += incrementoAngulo){
			float vertex1[] = new float[9];
			float vertex2[] = new float[9];
			//P1
			vertex1[0] = 0;
			vertex1[1] = R;
			vertex1[2] = 0;
            //P2
            vertex1[3] = (float)(r*Math.cos(Math.toRadians(angulo+incrementoAngulo)));
            vertex1[4] = 0;
            vertex1[5] = (float)(r*Math.sin(Math.toRadians(angulo+incrementoAngulo)));
			//P3
			vertex1[6] = (float)(r*Math.cos(Math.toRadians(angulo)));
			vertex1[7] = 0;
			vertex1[8] = (float)(r*Math.sin(Math.toRadians(angulo)));
			//P4
			vertex2[0] = (float)(r*Math.cos(Math.toRadians(angulo)));
			vertex2[1] = 0;
			vertex2[2] = (float)(r*Math.sin(Math.toRadians(angulo)));
			//P5
			vertex2[3] = (float)(r*Math.cos(Math.toRadians(angulo+incrementoAngulo)));
			vertex2[4] = 0;
			vertex2[5] = (float)(r*Math.sin(Math.toRadians(angulo+incrementoAngulo)));
			//P6
			vertex2[6] = 0;
			vertex2[7] = 0;
			vertex2[8] = 0;
			//Shape
			triangulos.add(vertex1);
			triangulos.add(vertex2);
			List<float[]> texturas = obtenerUVCoordenadas(angulo,incrementoAngulo);
			textures.add(texturas.get(0));
			textures.add(texturas.get(1));
		}
		float[] triangles = new float[triangulos.size()*9];
		float[] textureUVM = new float[textures.size()*6];
		for(int i = 0;i < triangulos.size(); i++){
			float triangle[] 	= triangulos.get(i);
			float texture[] 	= textures.get(i);
			int j = i*9;
			for(int k = 0;k < triangle.length;k++){
				triangles[j+k] 	= triangle[k];
			}
			j = i*6;
			for(int k = 0;k < texture.length;k++){
				textureUVM[j+k] = texture[k];
			}
		}
		setVertex(triangles);
		setVertexTextureCoordinates(textureUVM);
        setRGBA(1f,1f,1f,1f);
        calculateNormals();
	}

    public Cone(){

    }

	public List<float[]> obtenerUVCoordenadas(int angulo,int incrementoAngulo){
		List<float[]> textures = new ArrayList<float[]>();
		float texture1[] = {    		
				// Mapping coordinates for the vertices
				0.5f, 0.5f,		// top left		(V2)
                (float)(0.5f+0.5*Math.sin(Math.toRadians(angulo+incrementoAngulo))), (float)(0.5f+0.5*Math.cos(Math.toRadians(angulo+incrementoAngulo))),		// top right	(V3)
				(float)(0.5f+0.5*Math.sin(Math.toRadians(angulo))), (float)(0.5f+0.5*Math.cos(Math.toRadians(angulo))),		// bottom left	(V1)
		};
		textures.add(texture1);
		textures.add(texture1);
		return textures;
	}
	
	@Override
	public boolean colisiona(Sphere sphere){
		super.colisiona(sphere);
		if ((Math.sqrt(Math.pow(cxER, 2)+Math.pow(czER, 2)) < sphere.getRadio()+getr()*(1-Math.abs(cyER)/getR()))&&(cyER < getR()+ sphere.getRadio())&&(cyER > -sphere.getRadio())){
			return true;
		}
		return false;
	}

    public double getR(){
        return R*getAnimator().getScale();
    }

    public double getr(){
        return r*getAnimator().getScale();
    }
}
