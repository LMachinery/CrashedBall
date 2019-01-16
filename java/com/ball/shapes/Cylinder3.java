package com.ball.shapes;

import java.util.ArrayList;
import java.util.List;

public class Cylinder3 extends Cylinder {

    public Cylinder3(float cx, float cy, float cz, float r, float R, int divAngulo){
        super(cx,cy,cz,r,R,divAngulo);
    }

    @Override
	public List<float[]> obtenerUVCoordenadas(int angulo,int incrementoAngulo){
		float x = angulo/360f;
		float incr = incrementoAngulo/360f;
		float coordenadas1[] = {0.5f,0.5f,
								0.5f-0.5f*(float)Math.cos(Math.toRadians(angulo)),0.5f+0.5f*(float)Math.sin(Math.toRadians(angulo)),
								0.5f-0.5f*(float)Math.cos(Math.toRadians(angulo+incrementoAngulo)),0.5f+0.5f*(float)Math.sin(Math.toRadians(angulo+incrementoAngulo))
								};
		float coordenadas2[] = {x+incr,0.4f,
								x,0.4f,
								x+incr,0.6f,
								};
		float coordenadas3[] = {x,0.4f,
				   				x+incr,0.6f,
				   				x,0.6f,
				   				};
		float coordenadas4[] = {0.5f+0.5f*(float)Math.cos(Math.toRadians(angulo)),0.5f+0.5f*(float)Math.sin(Math.toRadians(angulo)),
                                0.5f,0.5f,
   								0.5f+0.5f*(float)Math.cos(Math.toRadians(angulo+incrementoAngulo)),0.5f+0.5f*(float)Math.sin(Math.toRadians(angulo+incrementoAngulo))};
		List<float[]> texturas = new ArrayList<float[]>();
		texturas.add(coordenadas1);
		texturas.add(coordenadas2);
		texturas.add(coordenadas3);
		texturas.add(coordenadas4);
		return texturas;
	}
}
