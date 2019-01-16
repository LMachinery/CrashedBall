package com.ball.shapes;

import java.util.ArrayList;
import java.util.List;

public class Cylinder2 extends Cylinder {

    public Cylinder2(float cx, float cy, float cz, float r, float R, int divAngulo){
        super(cx,cy,cz,r,R,divAngulo);
    }

    @Override
	public List<float[]> obtenerUVCoordenadas(int angulo,int incrementoAngulo){
		float x = angulo/360f;
		float incr = incrementoAngulo/360f;
		float coordenadas1[] = {x,0, 
								x+incr,0.4f,
								x,0.4f
								};
		float coordenadas2[] = {x+incr,0.4f,
								x,0.4f,
								x+incr,0.6f,
								};
		float coordenadas3[] = {x,0.4f,
				   				x+incr,0.6f,
				   				x,0.6f,
				   				};
		float coordenadas4[] = {x+incr,0.6f,
   								x,0.6f,
   								x,1f};
		List<float[]> texturas = new ArrayList<float[]>();
		texturas.add(coordenadas1);
		texturas.add(coordenadas2);
		texturas.add(coordenadas3);
		texturas.add(coordenadas4);
		return texturas;
	}
}
