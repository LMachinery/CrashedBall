package com.ball.shapes;

import java.util.ArrayList;
import java.util.List;

public class Sphere extends ShapeOpengl {
	public float radio;
    public int power = -1;
	public Sphere(float cx, float cy, float cz, int divAnguloElevacion, int divAnguloIncidencia, float radio){
		super(cx,cy,cz);
		this.radio = radio;
		int incrementoAnguloElevacion = 180/divAnguloElevacion;
		int incrementoAnguloIncidencia = 360/divAnguloIncidencia;
		List<float[]> triangulos = new ArrayList<float[]>();
		List<float[]> textures = new ArrayList<float[]>();
		for(int anguloElevacion = 90;anguloElevacion > -90; anguloElevacion -= incrementoAnguloElevacion){
			for(int anguloIncidencia = 0;anguloIncidencia < 360; anguloIncidencia += incrementoAnguloIncidencia){
				float vertex1[] = new float[9];
				float vertex2[] = null;
				if (anguloElevacion == 90){
					//P1
					vertex1[0] = 0;
					vertex1[1] = radio;
					vertex1[2] = 0;
                    //P2
                    vertex1[3] = calcularX(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
                    vertex1[4] = calcularY(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
                    vertex1[5] = calcularZ(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
					//P3
					vertex1[6] = calcularX(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia);
					vertex1[7] = calcularY(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia);
					vertex1[8] = calcularZ(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia);
				}
				else if (anguloElevacion-incrementoAnguloElevacion == -90){
					//P1
					vertex1[0] = calcularX(radio,anguloElevacion,anguloIncidencia);
					vertex1[1] = calcularY(radio,anguloElevacion,anguloIncidencia);
					vertex1[2] = calcularZ(radio,anguloElevacion,anguloIncidencia);
					//P2
					vertex1[3] = calcularX(radio,anguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
					vertex1[4] = calcularY(radio,anguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
					vertex1[5] = calcularZ(radio,anguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
					//P3
					vertex1[6] = 0;
					vertex1[7] = -radio;
					vertex1[8] = 0;
				}
				else{
					vertex1 = new float[9];
					//P1
					vertex1[0] = calcularX(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia);
					vertex1[1] = calcularY(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia);
					vertex1[2] = calcularZ(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia);
					//P2
					vertex1[3] = calcularX(radio,anguloElevacion,anguloIncidencia);
					vertex1[4] = calcularY(radio,anguloElevacion,anguloIncidencia);
					vertex1[5] = calcularZ(radio,anguloElevacion,anguloIncidencia);
					//P3
					vertex1[6] = calcularX(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
					vertex1[7] = calcularY(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
					vertex1[8] = calcularZ(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
					
					//Triangle 2
					vertex2 = new float[9];
					//P4
					vertex2[0] = calcularX(radio,anguloElevacion,anguloIncidencia);
					vertex2[1]= calcularY(radio,anguloElevacion,anguloIncidencia);
					vertex2[2]= calcularZ(radio,anguloElevacion,anguloIncidencia);
					//P6
					vertex2[3]= calcularX(radio,anguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
					vertex2[4]= calcularY(radio,anguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
					vertex2[5]= calcularZ(radio,anguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
                    //P5
                    vertex2[6]= calcularX(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
                    vertex2[7]= calcularY(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
                    vertex2[8]= calcularZ(radio,anguloElevacion-incrementoAnguloElevacion,anguloIncidencia+incrementoAnguloIncidencia);
				}
				List<float[]> textures0 = obtenerUVCoordenadas(anguloElevacion,anguloIncidencia,incrementoAnguloElevacion,incrementoAnguloIncidencia,vertex2);
				triangulos.add(vertex1);
				textures.add(textures0.get(0));
				if (vertex2 != null){
					triangulos.add(vertex2);
					textures.add(textures0.get(1));
				}
			}
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

    public Sphere(){

    }

	public float calcularX(float radio,int anguloElevacion,int anguloIncidencia){
		return (float)(radio*Math.cos(Math.toRadians(anguloElevacion))*Math.cos(Math.toRadians(anguloIncidencia)));
	}
	
	public float calcularY(float radio,int anguloElevacion,int anguloIncidencia){
		return (float)(radio*Math.sin(Math.toRadians(anguloElevacion)));
	}
	
	public float calcularZ(float radio,int anguloElevacion,int anguloIncidencia){
		return (float)(radio*Math.cos(Math.toRadians(anguloElevacion))*Math.sin(Math.toRadians(anguloIncidencia)));
	}
	
	public List<float[]> obtenerUVCoordenadas(int anguloElevacion,int anguloIncidencia,int incrementoAnguloElevacion,int incrementoAnguloIncidencia,float[] triangles2){
		List<float[]> textures = new ArrayList<float[]>();
		float texture1[] = {    		
				// Mapping coordinates for the vertices
				((float)anguloIncidencia)/360f, ((float)(anguloElevacion+90-incrementoAnguloElevacion))/180f,		// bottom left	(V1)
				((float)anguloIncidencia)/360f, ((float)anguloElevacion+90)/180f,		// top left		(V2)
                ((float)(anguloIncidencia+incrementoAnguloIncidencia))/360f, ((float)(anguloElevacion+90-incrementoAnguloElevacion))/180f,		// top right	(V3)
		};
        if (triangles2 == null){
            float texture1T[] = {
                // Mapping coordinates for the vertices
                    ((float)anguloIncidencia)/360f, ((float)anguloElevacion+90)/180f,		// top left		(V2)
                    ((float)(anguloIncidencia+incrementoAnguloIncidencia))/360f, ((float)(anguloElevacion+90-incrementoAnguloElevacion))/180f,		// top right	(V3)
                    ((float)anguloIncidencia)/360f, ((float)(anguloElevacion+90-incrementoAnguloElevacion))/180f,		// bottom left	(V1)
            };
            texture1 = texture1T;
        }
		textures.add(texture1);
		if (triangles2 != null){
			float texture2[] = {    		
					// Mapping coordinates for the vertices
                    ((float)anguloIncidencia)/360f, ((float)anguloElevacion+90)/180f,		// top left		(V2)
                    ((float)(anguloIncidencia+incrementoAnguloIncidencia))/360f, ((float)(anguloElevacion+90))/180f,		// bottom right	(V4)
					((float)(anguloIncidencia+incrementoAnguloIncidencia))/360f, ((float)(anguloElevacion+90-incrementoAnguloElevacion))/180f,		// top right	(V3)
			};
			textures.add(texture2);
		}
		return textures;
	}
	
	@Override
	public boolean colisiona(Sphere sphere){
        super.colisiona(sphere);
        float vector[] = {cxER,cyER,czER};
        float distance = modV(vector);
		if (distance < sphere.getRadio()+getRadio()){
			return true;
		}
		return false;
	}

    public double getRadio(){
        return radio*this.getAnimator().getScale();
    }
}
