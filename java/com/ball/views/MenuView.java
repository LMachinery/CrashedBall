package com.ball.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;

import com.ball.activities.MenuActivity;
import com.ball.activities.R;
import com.ball.extras.Animator;

import java.util.ArrayList;


public class MenuView extends TransitionView{
	private Paint paint = new Paint();
	//Datos de estrella
	private final int estrellas = 80;
	private float eangulo[];
	private float er[];
	private final int estrellasIniciales = 5;
	//Datos de titulo
	private final float escalaTitulo = 1.5f;
    private final int defaultIncrAngulo = 10;
	private Animator animatorEsfera = new Animator();
    private Animator animatorTitulo = new Animator();
    public MenuActivity menuAcitivty;

    public MenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void initView(Canvas canvas){
        //Datos de animacion titulo
        animatorTitulo.setMaxAngleX(45);
        animatorTitulo.setMinAngleX(-45);
        animatorTitulo.setIncrAngleX(defaultIncrAngulo);
        //Animacion de sphere
        animatorEsfera.setAlpha(0);
        animatorEsfera.setIncrAlpha(3);
        animatorEsfera.setIncrAngleX(6);
        animatorEsfera.setBidirectionalAngleX(false);
        //Estrellas
        er = new float[estrellas];
        eangulo = new float[estrellas];
        //Angulos
        for(int i=0;i<estrellasIniciales+1;i++){
            eangulo[i] = (float)(Math.random()*2*Math.PI);
            if (i == 5){
                eangulo[i] = 0;
            }
        }
        //Radios
        er[0] = (float)(getR0(canvas,eangulo[0])-20);
        er[1] = (float)(getR0(canvas,eangulo[1])+400);
        er[2] = (float)(getR0(canvas,eangulo[2])+600);
        er[3] = (float)(getR0(canvas,eangulo[3])+1100);
        er[4] = (float)(getR0(canvas,eangulo[4])+1300);
        er[5] = (float)(getR0(canvas,eangulo[5])+2000);
        for(int i=estrellasIniciales+1;i<estrellas;i++){
            er[i] = (float)(2500+canvas.getWidth()/2+i*(canvas.getWidth()*2)/estrellas);
            eangulo[i] = (float)((i*8*Math.PI)/estrellas);
        }
    }

    @Override
    public void drawView(Canvas canvas){
        long currPos = 0;
        if (menuAcitivty != null){
            currPos = menuAcitivty.getCurrentPosition();
        }
        double angulo = animatorEsfera.getAngleX();
        for(int i=0;i<estrellas;i++){
            float r = er[i]-(currPos*canvas.getWidth())/3200;
            if (r < 0){
                if (i > estrellasIniciales){
                    r = r%canvas.getWidth();
                    r = canvas.getWidth()+r;
                }
                else{
                    r = 0;
                }
            }
            float scale = (r*3f)/(canvas.getWidth()/2);
            int x = (int)(canvas.getWidth()/2+r*Math.cos(eangulo[i]));
            int y = (int)(canvas.getHeight()/2+r*Math.sin(eangulo[i]));
            Matrix m = new Matrix();
            if ((i == 5)||((currPos > 32000)&&(currPos < 48000))){
                m.postRotate((float)angulo);
            }
            m.postScale(scale, scale);
            m.postTranslate(x, y);
        }
        animatorEsfera.increaseData();
        animatorTitulo.increaseData();
    }

    private int getR0(Canvas canvas,float angulo){
        double R1 = Math.abs((canvas.getWidth()/2)/Math.cos(angulo));
        double R2 = Math.abs((canvas.getHeight()/2)/Math.cos(Math.PI/2-angulo));
        return (int)Math.min(R1, R2);
    }

    @Override
    public void buttonClicked(int buttonId){
        Log.v("buttonClicked: ", "iiui: " + buttonId);
        if (menuAcitivty != null){
            if (buttonId == 0){
                Log.v("initLevelsView: ", "initLevelsView: " + buttonId);
                menuAcitivty.initLevelsView();
            }
            if (buttonId == 1){
                Log.v("initControlsView: ", "initControlsView: " + buttonId);
                menuAcitivty.initControlsView();
            }
        }
    }
}
