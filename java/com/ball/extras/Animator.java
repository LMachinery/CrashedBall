package com.ball.extras;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 15/02/2015.
 */
public class Animator {
    //Transicion de color
    private int red = 255;
    private int green = 255;
    private int blue = 255;
    private int alpha = 255;
    private int maxRed = 255;
    private int maxGreen = 255;
    private int maxBlue = 255;
    private int maxAlpha = 255;
    private int minRed = 150;
    private int minGreen = 150;
    private int minBlue = 150;
    private int minAlpha = 0;
    private int incrRed = 0;
    private int incrGreen = 0;
    private int incrBlue = 0;
    private int incrAlpha = 0;
    private boolean bidirectionalColor = true;
    private boolean repetibleRed = true;
    private boolean repetibleGreen = true;
    private boolean repetibleBlue = true;
    private boolean repetibleAlpha = true;
    //Transicion de escala
    private double scale = 1f;
    private double minScale = 1f;
    private double maxScale = 2f;
    private double incrScale = 0f;
    private boolean bidirectionalScale = true;
    private boolean repetibleScale = true;
    /////////Transicion de angulo
    //EjeX
    private double angleX = 0;
    private double minAngleX = 0;
    private double maxAngleX = 360;
    private double incrAngleX = 0;
    private boolean bidirectionalAngleX = true;
    private boolean repetibleAngleX = true;
    //EjeY
    private double angleY = 0;
    private double minAngleY = 0;
    private double maxAngleY = 360;
    private double incrAngleY = 0;
    private boolean bidirectionalAngleY = true;
    private boolean repetibleAngleY = true;
    //EjeZ
    private double angleZ = 0;
    private double minAngleZ = 0;
    private double maxAngleZ = 360;
    private double incrAngleZ = 0;
    private boolean bidirectionalAngleZ = true;
    private boolean repetibleAngleZ = true;
    //Transicion de posicion
    //x
    private double x = 0;
    private double minX = 0;
    private double maxX = 0;
    private double incrX = 0;
    private boolean bidirectionalX = true;
    private boolean repetibleX = true;
    //y
    private double y = 0;
    private double minY = 0;
    private double maxY = 0;
    private double incrY = 0;
    private boolean bidirectionalY = true;
    private boolean repetibleY = true;
    //z
    private double z = 0;
    private double minZ = 0;
    private double maxZ = 0;
    private double incrZ = 0;
    private boolean bidirectionalZ = true;
    private boolean repetibleZ = true;

    public void increaseData(){
        //Incrementando rojo
        if (incrRed != 0){
            double results[] = nextStep(red,incrRed,maxRed,minRed,isBidirectionalColor(),repetibleRed);
            red = (int)results[0];
            incrRed = (int)results[1];
        }
        //Incrementando verde
        if (incrGreen != 0){
            double results[] = nextStep(green,incrGreen,maxGreen,minGreen,isBidirectionalColor(),repetibleGreen);
            green = (int)results[0];
            incrGreen = (int)results[1];
        }
        //Incrementando azul
        if (incrBlue != 0){
            double results[] = nextStep(blue,incrBlue,maxBlue,minBlue,isBidirectionalColor(),repetibleBlue);
            blue = (int)results[0];
            incrBlue = (int)results[1];
        }
        //Incrementando transparencia
        if (incrAlpha != 0){
            double results[] = nextStep(alpha,incrAlpha,maxAlpha,minAlpha,isBidirectionalColor(),repetibleAlpha);
            alpha = (int)results[0];
            incrAlpha = (int)results[1];
        }
        //Incrementando escala
        if (incrScale != 0){
            double results[] = nextStep(scale,incrScale,maxScale,minScale,isBidirectionalScale(),repetibleScale);
            scale = results[0];
            incrScale = results[1];
        }
        //Incrementando anguloX
        if (incrAngleX != 0){
            double results[] = nextStep(angleX,incrAngleX,maxAngleX,minAngleX,isBidirectionalAngleX(),repetibleAngleX);
            angleX = results[0];
            incrAngleX = results[1];
        }
        //Incrementando anguloY
        if (incrAngleY != 0){
            double results[] = nextStep(angleY,incrAngleY,maxAngleY,minAngleY,isBidirectionalAngleY(),repetibleAngleY);
            angleY = results[0];
            incrAngleY = results[1];
        }
        //Incrementando anguloZ
        if (incrAngleZ != 0){
            double results[] = nextStep(angleZ,incrAngleZ,maxAngleZ,minAngleZ,isBidirectionalAngleZ(),repetibleAngleZ);
            angleZ = results[0];
            incrAngleZ = results[1];
        }
        //Incrementando X
        if (incrX != 0){
            double results[] = nextStep(x,incrX,maxX,minX,isBidirectionalX(),repetibleX);
            x = results[0];
            incrX = results[1];
        }
        //Incrementando Y
        if (incrY != 0){
            double results[] = nextStep(y,incrY,maxY,minY,isBidirectionalY(),repetibleY);
            y = results[0];
            incrY = results[1];
        }
        //Incrementando Z
        if (incrZ != 0){
            double results[] = nextStep(z,incrZ,maxZ,minZ,isBidirectionalZ(),repetibleZ);
            z = results[0];
            incrZ = results[1];
        }
    }

    //Este metodo retorna en la posicion 0 la variable var, y en la posicion 1 incrVar
    private double[] nextStep(double var,double incrVar,double maxVar,double minVar,boolean bidirectional,boolean repetible){
        var += incrVar;
        if (!repetible){
            if ((var > maxVar)||(var < minVar)){
                incrVar = 0;
            }
        }
        if (bidirectional){
            if (var > maxVar){
                var = maxVar;
                incrVar = -Math.abs(incrVar);
            }
            if (var < minVar){
                var = minVar;
                incrVar = Math.abs(incrVar);
            }
        }
        else{
            if (var > maxVar){
                var = minVar;
            }
            if (var < minVar){
                var = maxVar;
            }
        }
        //result
        double vars[] = new double[2];
        vars[0] = var;
        vars[1] = incrVar;
        return vars;
    }
/*
    public void addRotation(String ejeRotacion,double angulo,double incrRotacion,double maxAngulo,double minAngulo,boolean isBidirectional,double xanguloRotacion,double yanguloRotacion,double zanguloRotacion){
        ejesRotacion.add(ejeRotacion);
        angulosRotacion.add(angulo);
        incrAngulosRotacion.add(incrRotacion);
        maxAngulosRotacion.add(maxAngulo);
        minAngulosRotacion.add(minAngulo);
        isBidirectionalRotacion.add(isBidirectional);
        xRotacion.add(xanguloRotacion);
        yRotacion.add(yanguloRotacion);
        zRotacion.add(zanguloRotacion);
    }

    public void resetRotation(){
        ejesRotacion = new ArrayList<>();
        angulosRotacion = new ArrayList<>();
        incrAngulosRotacion = new ArrayList<>();
        maxAngulosRotacion = new ArrayList<>();
        minAngulosRotacion = new ArrayList<>();
        isBidirectionalRotacion = new ArrayList<>();
        xRotacion = new ArrayList<>();
        yRotacion = new ArrayList<>();
        zRotacion = new ArrayList<>();
    }
*/
    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getMaxRed() {
        return maxRed;
    }

    public void setMaxRed(int maxRed) {
        this.maxRed = maxRed;
    }

    public int getMaxGreen() {
        return maxGreen;
    }

    public void setMaxGreen(int maxGreen) {
        this.maxGreen = maxGreen;
    }

    public int getMaxBlue() {
        return maxBlue;
    }

    public void setMaxBlue(int maxBlue) {
        this.maxBlue = maxBlue;
    }

    public int getMaxAlpha() {
        return maxAlpha;
    }

    public void setMaxAlpha(int maxAlpha) {
        this.maxAlpha = maxAlpha;
    }

    public int getMinRed() {
        return minRed;
    }

    public void setMinRed(int minRed) {
        this.minRed = minRed;
    }

    public int getMinGreen() {
        return minGreen;
    }

    public void setMinGreen(int minGreen) {
        this.minGreen = minGreen;
    }

    public int getMinBlue() {
        return minBlue;
    }

    public void setMinBlue(int minBlue) {
        this.minBlue = minBlue;
    }

    public int getMinAlpha() {
        return minAlpha;
    }

    public void setMinAlpha(int minAlpha) {
        this.minAlpha = minAlpha;
    }

    public int getIncrRed() {
        return incrRed;
    }

    public void setIncrRed(int incrRed) {
        this.incrRed = incrRed;
    }

    public int getIncrGreen() {
        return incrGreen;
    }

    public void setIncrGreen(int incrGreen) {
        this.incrGreen = incrGreen;
    }

    public int getIncrBlue() {
        return incrBlue;
    }

    public void setIncrBlue(int incrBlue) {
        this.incrBlue = incrBlue;
    }

    public int getIncrAlpha() {
        return incrAlpha;
    }

    public void setIncrAlpha(int incrAlpha) {
        this.incrAlpha = incrAlpha;
    }

    public boolean isBidirectionalColor() {
        return bidirectionalColor;
    }

    public void setBidirectionalColor(boolean bidirectionalColor) {
        this.bidirectionalColor = bidirectionalColor;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public double getMinScale() {
        return minScale;
    }

    public void setMinScale(double minScale) {
        this.minScale = minScale;
    }

    public double getMaxScale() {
        return maxScale;
    }

    public void setMaxScale(double maxScale) {
        this.maxScale = maxScale;
    }

    public double getIncrScale() {
        return incrScale;
    }

    public void setIncrScale(double incrScale) {
        this.incrScale = incrScale;
    }

    public boolean isBidirectionalScale() {
        return bidirectionalScale;
    }

    public void setBidirectionalScale(boolean bidirectionalScale) {
        this.bidirectionalScale = bidirectionalScale;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getMinX() {
        return minX;
    }

    public void setMinX(double minX) {
        this.minX = minX;
    }

    public double getMaxX() {
        return maxX;
    }

    public void setMaxX(double maxX) {
        this.maxX = maxX;
    }

    public double getIncrX() {
        return incrX;
    }

    public void setIncrX(double incrX) {
        this.incrX = incrX;
    }

    public boolean isBidirectionalX() {
        return bidirectionalX;
    }

    public void setBidirectionalX(boolean bidirectionalX) {
        this.bidirectionalX = bidirectionalX;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getMinY() {
        return minY;
    }

    public void setMinY(double minY) {
        this.minY = minY;
    }

    public double getMaxY() {
        return maxY;
    }

    public void setMaxY(double maxY) {
        this.maxY = maxY;
    }

    public double getIncrY() {
        return incrY;
    }

    public void setIncrY(double incrY) {
        this.incrY = incrY;
    }

    public boolean isBidirectionalY() {
        return bidirectionalY;
    }

    public void setBidirectionalY(boolean bidirectionalY) {
        this.bidirectionalY = bidirectionalY;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getMinZ() {
        return minZ;
    }

    public void setMinZ(double minZ) {
        this.minZ = minZ;
    }

    public double getMaxZ() {
        return maxZ;
    }

    public void setMaxZ(double maxZ) {
        this.maxZ = maxZ;
    }

    public double getIncrZ() {
        return incrZ;
    }

    public void setIncrZ(double incrZ) {
        this.incrZ = incrZ;
    }

    public boolean isBidirectionalZ() {
        return bidirectionalZ;
    }

    public void setBidirectionalZ(boolean bidirectionalZ) {
        this.bidirectionalZ = bidirectionalZ;
    }
/*
    public List<String> getEjesRotacion() {
        return ejesRotacion;
    }

    public void setEjesRotacion(List<String> ejesRotacion) {
        this.ejesRotacion = ejesRotacion;
    }

    public List<Double> getAngulosRotacion() {
        return angulosRotacion;
    }

    public void setAngulosRotacion(List<Double> angulosRotacion) {
        this.angulosRotacion = angulosRotacion;
    }

    public List<Double> getIncrAngulosRotacion() {
        return incrAngulosRotacion;
    }

    public void setIncrAngulosRotacion(List<Double> incrAngulosRotacion) {
        this.incrAngulosRotacion = incrAngulosRotacion;
    }

    public List<Double> getMaxAngulosRotacion() {
        return maxAngulosRotacion;
    }

    public void setMaxAngulosRotacion(List<Double> maxAngulosRotacion) {
        this.maxAngulosRotacion = maxAngulosRotacion;
    }

    public List<Double> getMinAngulosRotacion() {
        return minAngulosRotacion;
    }

    public void setMinAngulosRotacion(List<Double> minAngulosRotacion) {
        this.minAngulosRotacion = minAngulosRotacion;
    }

    public List<Boolean> getIsBidirectionalRotacion() {
        return isBidirectionalRotacion;
    }

    public void setIsBidirectionalRotacion(List<Boolean> isBidirectionalRotacion) {
        this.isBidirectionalRotacion = isBidirectionalRotacion;
    }

    public List<Double> getxRotacion() {
        return xRotacion;
    }

    public void setxRotacion(List<Double> xRotacion) {
        this.xRotacion = xRotacion;
    }

    public List<Double> getyRotacion() {
        return yRotacion;
    }

    public void setyRotacion(List<Double> yRotacion) {
        this.yRotacion = yRotacion;
    }

    public List<Double> getzRotacion() {
        return zRotacion;
    }

    public void setzRotacion(List<Double> zRotacion) {
        this.zRotacion = zRotacion;
    }
*/

    public boolean isBidirectionalAngleX() {
        return bidirectionalAngleX;
    }

    public void setBidirectionalAngleX(boolean bidirectionalAngleX) {
        this.bidirectionalAngleX = bidirectionalAngleX;
    }

    public boolean isBidirectionalAngleY() {
        return bidirectionalAngleY;
    }

    public void setBidirectionalAngleY(boolean bidirectionalAngleY) {
        this.bidirectionalAngleY = bidirectionalAngleY;
    }

    public boolean isBidirectionalAngleZ() {
        return bidirectionalAngleZ;
    }

    public void setBidirectionalAngleZ(boolean bidirectionalAngleZ) {
        this.bidirectionalAngleZ = bidirectionalAngleZ;
    }

    public double getAngleX() {
        return angleX;
    }

    public void setAngleX(double angleX) {
        this.angleX = angleX;
    }

    public double getMinAngleX() {
        return minAngleX;
    }

    public void setMinAngleX(double minAngleX) {
        this.minAngleX = minAngleX;
    }

    public double getMaxAngleX() {
        return maxAngleX;
    }

    public void setMaxAngleX(double maxAngleX) {
        this.maxAngleX = maxAngleX;
    }

    public double getIncrAngleX() {
        return incrAngleX;
    }

    public void setIncrAngleX(double incrAngleX) {
        this.incrAngleX = incrAngleX;
    }

    public double getAngleY() {
        return angleY;
    }

    public void setAngleY(double angleY) {
        this.angleY = angleY;
    }

    public double getMinAngleY() {
        return minAngleY;
    }

    public void setMinAngleY(double minAngleY) {
        this.minAngleY = minAngleY;
    }

    public double getMaxAngleY() {
        return maxAngleY;
    }

    public void setMaxAngleY(double maxAngleY) {
        this.maxAngleY = maxAngleY;
    }

    public double getIncrAngleY() {
        return incrAngleY;
    }

    public void setIncrAngleY(double incrAngleY) {
        this.incrAngleY = incrAngleY;
    }

    public double getAngleZ() {
        return angleZ;
    }

    public void setAngleZ(double angleZ) {
        this.angleZ = angleZ;
    }

    public double getMinAngleZ() {
        return minAngleZ;
    }

    public void setMinAngleZ(double minAngleZ) {
        this.minAngleZ = minAngleZ;
    }

    public double getIncrAngleZ() {
        return incrAngleZ;
    }

    public void setIncrAngleZ(double incrAngleZ) {
        this.incrAngleZ = incrAngleZ;
    }

    public double getMaxAngleZ() {
        return maxAngleZ;
    }

    public void setMaxAngleZ(double maxAngleZ) {
        this.maxAngleZ = maxAngleZ;
    }

    public boolean isRepetibleRed() {
        return repetibleRed;
    }

    public void setRepetibleRed(boolean repetibleRed) {
        this.repetibleRed = repetibleRed;
    }

    public boolean isRepetibleGreen() {
        return repetibleGreen;
    }

    public void setRepetibleGreen(boolean repetibleGreen) {
        this.repetibleGreen = repetibleGreen;
    }

    public boolean isRepetibleBlue() {
        return repetibleBlue;
    }

    public void setRepetibleBlue(boolean repetibleBlue) {
        this.repetibleBlue = repetibleBlue;
    }

    public boolean isRepetibleAlpha() {
        return repetibleAlpha;
    }

    public void setRepetibleAllpha(boolean repetibleAlpha) {
        this.repetibleAlpha = repetibleAlpha;
    }

    public boolean isRepetibleScale() {
        return repetibleScale;
    }

    public void setRepetibleScale(boolean repetibleScale) {
        this.repetibleScale = repetibleScale;
    }

    public boolean isRepetibleAngleX() {
        return repetibleAngleX;
    }

    public void setRepetibleAngleX(boolean repetibleAngleX) {
        this.repetibleAngleX = repetibleAngleX;
    }

    public boolean isRepetibleAngleY() {
        return repetibleAngleY;
    }

    public void setRepetibleAngleY(boolean repetibleAngleY) {
        this.repetibleAngleY = repetibleAngleY;
    }

    public boolean isRepetibleAngleZ() {
        return repetibleAngleZ;
    }

    public void setRepetibleAngleZ(boolean repetibleAngleZ) {
        this.repetibleAngleZ = repetibleAngleZ;
    }

    public boolean isRepetibleX() {
        return repetibleX;
    }

    public void setRepetibleX(boolean repetibleX) {
        this.repetibleX = repetibleX;
    }

    public boolean isRepetibleY() {
        return repetibleY;
    }

    public void setRepetibleY(boolean repetibleY) {
        this.repetibleY = repetibleY;
    }

    public boolean isRepetibleZ() {
        return repetibleZ;
    }

    public void setRepetibleZ(boolean repetibleZ) {
        this.repetibleZ = repetibleZ;
    }
}
