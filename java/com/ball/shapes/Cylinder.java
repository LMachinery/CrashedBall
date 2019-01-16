package com.ball.shapes;

import java.util.ArrayList;
import java.util.List;

public class Cylinder extends ShapeOpengl {
	public float R;
	public float r;
	public Cylinder(float cx, float cy, float cz, float r, float R, int divAngulo){
		super(cx,cy,cz);
		this.r = r;
		this.R = R;
		int incrementoAngulo = 360/divAngulo;
		List<float[]> triangulos = new ArrayList<float[]>();
		List<float[]> textures = new ArrayList<float[]>();
		for(int anguloIncidencia = 0;anguloIncidencia < 360; anguloIncidencia += incrementoAngulo){
			float vertex1[] = new float[9];
			float vertex2[] = new float[9];
			float vertex3[] = new float[9];
			float vertex4[] = new float[9];
			float x1 = (float)(r*Math.cos(Math.toRadians(anguloIncidencia)));
			float z1 = (float)(r*Math.sin(Math.toRadians(anguloIncidencia)));
			float x2 = (float)(r*Math.cos(Math.toRadians(anguloIncidencia+incrementoAngulo)));
			float z2 = (float)(r*Math.sin(Math.toRadians(anguloIncidencia+incrementoAngulo)));
			
			//Triangle 1
			//P1
			vertex1[0] = 0;
			vertex1[1] = -R;
			vertex1[2] = 0;
            //P2
            vertex1[3] = x1;
            vertex1[4] = -R;
            vertex1[5] = z1;
            //P3
            vertex1[6] = x2;
            vertex1[7] = -R;
            vertex1[8] = z2;
			
			//Triangle 2
            //P1
            vertex2[0] = x1;
            vertex2[1] = R;
            vertex2[2] = z1;
            //P2
            vertex2[3] = x2;
            vertex2[4] = -R;
            vertex2[5] = z2;
            //P3
            vertex2[6] = x1;
            vertex2[7] = -R;
            vertex2[8] = z1;
			
			//Triangle 3
			//P1
			vertex3[0] = x2;
			vertex3[1] = -R;
			vertex3[2] = z2;
            //P2
            vertex3[3] = x1;
            vertex3[4] = R;
            vertex3[5] = z1;
			//P3
			vertex3[6] = x2;
			vertex3[7] = R;
			vertex3[8] = z2;
			
			//Triangle 4
			//P1
			vertex4[0] = x1;
			vertex4[1] = R;
			vertex4[2] = z1;
			//P2
			vertex4[3] = 0;
			vertex4[4] = R;
			vertex4[5] = 0;
            //P3
            vertex4[6] = x2;
            vertex4[7] = R;
            vertex4[8] = z2;
			
			//Setting vertex
			triangulos.add(vertex1);
			triangulos.add(vertex2);
			triangulos.add(vertex3);
			triangulos.add(vertex4);
			textures.addAll(obtenerUVCoordenadas(anguloIncidencia,incrementoAngulo));
		}
		
		float triangles[] = new float[triangulos.size()*9];
		float textureUVM[] = new float[textures.size()*6];
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

    public Cylinder(){

    }

	public List<float[]> obtenerUVCoordenadas(int angulo,int incrementoAngulo){
		float x = angulo/360f;
		float incr = incrementoAngulo/360f;
		float coordenadas1[] = {x,0,
                                x,0.1f,
								x+incr,0.1f,
								};
		float coordenadas2[] = {x,0.9f,
                                x+incr,0.1f,
                                x,0.1f,
								};
		float coordenadas3[] = {x+incr,0.1f,
				   				x,0.9f,
                                x+incr,0.9f,
				   				};
		float coordenadas4[] = {x+incr,0.9f,
                                x,0.9f,
                                x,1f,};
		List<float[]> texturas = new ArrayList<float[]>();
		texturas.add(coordenadas1);
		texturas.add(coordenadas2);
		texturas.add(coordenadas3);
		texturas.add(coordenadas4);
		return texturas;
	}
	
	@Override
	public boolean colisiona(Sphere sphere){
		super.colisiona(sphere);
		if ((Math.sqrt(Math.pow(cxER, 2)+Math.pow(czER, 2)) < sphere.getRadio()+getr())&&(Math.abs(cyER) < getR()+ sphere.getRadio())){
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
