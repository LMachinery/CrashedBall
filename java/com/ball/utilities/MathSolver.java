package com.ball.utilities;

/**
 * Created by miguel on 22/01/2016.
 */
public class MathSolver {

    public float[] calcularVectorPerpendicularUnitario(float vector1[],float vector2[]){
        float vectorResultado[] = cross(vector1,vector2);
        float vectorUnitarioResultado[] = calcularVectorUnitario(vectorResultado);
        return multiply(-1,vectorUnitarioResultado);
    }

    public float[] rotarPuntoAlrededorDeEje(float P[],float PAxis1[],float PAxis2[],float thetaGrados){
        float PA[] = restar(P,PAxis1);
        float AB[] = restar(PAxis2,PAxis1);
        float ABU[] = calcularVectorUnitario(AB);
        //Partial results
        float RES1[] = multiply(dot(ABU,PA),ABU);
        float RES2[] = multiply((float)Math.cos(Math.toRadians(thetaGrados)),restar(PA,RES1));
        float RES3[] = multiply((float)Math.sin(Math.toRadians(thetaGrados)),cross(ABU,PA));
        return sumar(sumar(sumar(PAxis1,RES1),RES2),RES3);
    }

    public float[] rotarMatrizAlrededorEje(float vertexPositionData[],float PAxis1[],float PAxis2[],float thetaGrados){
        for(int i=0;i<vertexPositionData.length;i+=3){
            float P1[] = new float[]{vertexPositionData[i],vertexPositionData[i+1],vertexPositionData[i+2]};
            P1 = rotarPuntoAlrededorDeEje(P1,PAxis1,PAxis2,thetaGrados);
            vertexPositionData[i]   =   P1[0];
            vertexPositionData[i+1] =   P1[1];
            vertexPositionData[i+2] =   P1[2];
        }
        return vertexPositionData;
    }

    public float[] cross(float vector1[],float vector2[]){
        return new float[] { resolverDeterminante(vector1[1],vector1[2],vector2[1],vector2[2]),
                            -resolverDeterminante(vector1[0],vector1[2],vector2[0],vector2[2]),
                             resolverDeterminante(vector1[0],vector1[1],vector2[0],vector2[1])
        };
    }

    public float[] calcularVectorUnitario(float vector[]){
        float modulo = calcularModuloVector(vector);
        return new float[]{ vector[0]/modulo,
                            vector[1]/modulo,
                            vector[2]/modulo
        };
    }

    public float[] restar(float v1[],float v2[]){
        return new float[]{ v1[0]-v2[0],
                            v1[1]-v2[1],
                            v1[2]-v2[2]
        };
    }

    public float[] sumar(float v1[],float v2[]){
        return new float[]{ v1[0]+v2[0],
                            v1[1]+v2[1],
                            v1[2]+v2[2]
        };
    }

    public float[] traslate(float v3[],float vLargo[]){
        float resultado[] = new float[vLargo.length];
        for(int i=0;i<vLargo.length;i++){
            resultado[i] = vLargo[i]+v3[i%3];
        }
        return resultado;
    }

    public float[] rotateMatix(float thetaGrados,String axis,float vLargo[]){
        float pAxis[] = new float[0];
        if (axis.equals(Constants.xAxis)){
            pAxis = new float[]{1f,0f,0f};
        }
        if (axis.equals(Constants.yAxis)){
            pAxis = new float[]{0f,1f,0f};
        }
        if (axis.equals(Constants.zAxis)){
            pAxis = new float[]{0f,0f,1f};
        }
        float resultado[] = new float[vLargo.length];
        for(int i=0;i<vLargo.length;i+=3){
            float pCur[] = new float[]{vLargo[i],vLargo[i+1],vLargo[i+2]};
            float[] puntoResultado = rotarPuntoAlrededorDeEje(pCur,new float[]{0f,0f,0f},pAxis,thetaGrados);
            resultado[i]   = puntoResultado[0];
            resultado[i+1] = puntoResultado[1];
            resultado[i+2] = puntoResultado[2];
        }
        return resultado;
    }

    public float calcularAngulo2EntreVectores(float V1[],float V2[]){
        float coseno = dot(V1,V2)/(calcularModuloVector(V1)*calcularModuloVector(V2));
        if (Math.abs(coseno) > 1){
            coseno = Math.signum(coseno);
        }
        return (float)Math.acos(coseno);
    }

    public float[] multiply(float val,float v1[]){
        return new float[]{val*v1[0],val*v1[1],val*v1[2]};
    }

    public float calcularModuloVector(float vector[]){
        return (float)Math.sqrt(Math.pow(vector[0],2)+Math.pow(vector[1],2)+Math.pow(vector[2],2));
    }

    public float resolverDeterminante(float x1,float x2,float y1,float y2){
        return x1*y2-x2*y1;
    }

    public float dot(float v1[],float v2[]){
        return v1[0]*v2[0]+v1[1]*v2[1]+v1[2]*v2[2];
    }

    public float[] obtenerEcuacionPlano(float vector1[],float vector2[]){
        return cross(vector1,vector2);
    }

    public float obtenerDistanciaPuntoPlano(float plano[],float punto[]){
        return dot(plano,punto)/calcularModuloVector(plano);
    }
}
