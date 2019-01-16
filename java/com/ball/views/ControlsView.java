package com.ball.views;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

import com.ball.activities.MenuActivity;
import com.ball.activities.MyGLActivity;
import com.ball.activities.R;
import com.ball.extras.Animator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 17/02/2015.
 */
public class ControlsView extends TransitionView{

    private Paint paint = new Paint();
    private Animator animatorCirculos = new Animator();
    private Animator animatorFlecha = new Animator();
    private Animator animatorTablet = new Animator();
    private Animator animatorDedo = new Animator();
    private Animator animatorTitulo = new Animator();
    private Bitmap sphere = BitmapFactory.decodeResource(getResources(), R.drawable.esfera);
    private Bitmap arrow = BitmapFactory.decodeResource(getResources(), R.drawable.flecha);
    private Bitmap tablet = BitmapFactory.decodeResource(getResources(), R.drawable.tablet);
    private Bitmap dedo = BitmapFactory.decodeResource(getResources(), R.drawable.dedo);
    private Bitmap dedoDestino = BitmapFactory.decodeResource(getResources(), R.drawable.dedo_destino);
    //Imagenes de titulos
    private Bitmap imgMoveForward = BitmapFactory.decodeResource(getResources(), R.drawable.move_forward);
    private Bitmap imgMoveBackward = BitmapFactory.decodeResource(getResources(), R.drawable.move_backward);
    private Bitmap imgMoveLeftRight = BitmapFactory.decodeResource(getResources(), R.drawable.move_left_right);
    private Bitmap imgJump = BitmapFactory.decodeResource(getResources(), R.drawable.jump);
    private int controlNumber = 0;
    public String strBack = "Menu";
    //Datos de animacion saltar
    private boolean saltando = false;
    private float v0 = -8;
    private float vy = v0;
    private float ay = 0.15f;
    private float distY = 0;
    private double dedoX = 0;
    private double dedoY = 0;
    private double lastIncrX = 1;
    private int cambiosIncr = 0;
    //Contantes
    private final int circulos = 15;
    private final int incrAngulo = 3;
    //Activity
    public MenuActivity menuAcitivty;
    public MyGLActivity glActivity;

    public ControlsView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void initView(Canvas canvas){
        //Animator circulos
        animatorCirculos.setAngleX(0);
        animatorCirculos.setIncrAngleX(incrAngulo);
        animatorCirculos.setMinAngleX(0);
        animatorCirculos.setMaxAngleX(360);
        animatorCirculos.setBidirectionalAngleX(false);
        //Animator flecha
        animatorFlecha.setMaxY(4*canvas.getHeight()/6);
        animatorFlecha.setMinY(canvas.getHeight()/4);
        animatorFlecha.setY(animatorFlecha.getMaxY());
        animatorFlecha.setIncrY(-incrAngulo);
        animatorFlecha.setBidirectionalY(false);
        //Animator tablet
        animatorTablet.setMaxAngleX(45);
        animatorTablet.setMinAngleX(-45);
        animatorTablet.setIncrAngleX(2);
        //Animator dedo
        float distance = canvas.getWidth()/10;
        //Punto final
        animatorDedo.setMinX(canvas.getWidth()/2);
        animatorDedo.setMaxY(canvas.getHeight()/2);
        //Punto inicial
        animatorDedo.setMaxX(animatorDedo.getMinX()+distance);
        animatorDedo.setMinY(animatorDedo.getMaxY()-distance);
        //Inicia en el punto inicial
        animatorDedo.setX(animatorDedo.getMaxX());
        animatorDedo.setY(animatorDedo.getMinY());
        //Incremento
        animatorDedo.setIncrX(-distance/6);
        animatorDedo.setIncrY(distance/6);
        lastIncrX = animatorDedo.getIncrX();
        //Animator titulo
        animatorTitulo.setIncrAlpha(4);
        animatorTitulo.setMinAlpha(100);
        animatorTitulo.setMaxScale(1.5f);
        animatorTitulo.setMinScale(0.9f);
        animatorTitulo.setIncrScale(0.01f);
        //Boton customizado
        buttons = new ArrayList<CustomButton>();
        buttons.add(new CustomButton(context,0,canvas.getHeight()/2,R.drawable.flecha_i,"",false));
        buttons.get(0).setX(buttons.get(0).getWidth());
        buttons.add(new CustomButton(context,0,canvas.getHeight()/2,R.drawable.flecha_d,"",false));
        buttons.get(1).setX(canvas.getWidth()-buttons.get(1).getWidth());
        buttons.add(new CustomButton(context,canvas.getWidth()/2,canvas.getHeight(),R.drawable.button,strBack,true));
        buttons.get(2).setY(buttons.get(2).getY()-buttons.get(2).getHeigth());
        showButtons = false;
    }

    @Override
    public void drawView(Canvas canvas){
        paint.setStyle(Paint.Style.STROKE);
        float cx = canvas.getWidth()/2;
        float cy = canvas.getHeight()/2;
        float r1 = canvas.getHeight()/4;
        double anguloTablet = animatorTablet.getAngleX();
        //Calculando escala
        float escale = r1/(sphere.getWidth()/2);
        double distance = 0;
        Matrix escalaMatrix = new Matrix();
        escalaMatrix.setScale(escale,escale);
        if (controlNumber == 2){
            distance = anguloTablet*(canvas.getWidth()/4)/animatorTablet.getMaxAngleX();
            escalaMatrix.postRotate((float)anguloTablet*2,escale*sphere.getWidth()/2,escale*sphere.getHeight()/2);
        }
        if ((controlNumber == 3)&&(saltando)){
            distY += vy;
            vy += ay;
            if (distY > 0){
                distY = 0;
                vy = v0;
                saltando = false;
            }
        }
        escalaMatrix.postTranslate((float)(cx-r1+distance),cy-r1+distY);
        canvas.drawBitmap(sphere,escalaMatrix,paint);
        //Circulos
        double angulo = animatorCirculos.getAngleX();
        for(int i=0;i<circulos;i++){
            double curAng = angulo+(i*360)/circulos;
            while (curAng > 360){
                curAng -= 360;
            }
            if ((curAng >= 90)&&(curAng <= 270)){
                double sinAng = Math.sin(Math.toRadians(curAng));
                float r2 = (float)(r1*Math.abs(sinAng));
                RectF ovalBounds = new RectF((float)(cx-r1+distance), (float)(cy-r2+distY), (float)(cx+r1+distance), (float)(cy+r2+distY));
                if (sinAng >= 0){
                    canvas.drawArc(ovalBounds , 0 , 180 , true , paint);
                }
                else{
                    canvas.drawArc(ovalBounds , 180 , 180 , true , paint);
                }
            }
        }
        //Flecha indicadora de movimiento
        float xFlecha = canvas.getWidth()/2-arrow.getWidth()/2;
        double yFlecha = animatorFlecha.getY();
        if (controlNumber == 0){
            canvas.drawBitmap(arrow,xFlecha,(float)yFlecha,paint);
            drawTitleMovement(imgMoveForward,canvas);
        }
        if (controlNumber == 1){
            Matrix matrixEscala = new Matrix();
            matrixEscala.setScale(1,-1);
            matrixEscala.postTranslate(xFlecha,(float)yFlecha);
            canvas.drawBitmap(arrow,matrixEscala,paint);
            drawTitleMovement(imgMoveBackward,canvas);
        }
        if (controlNumber == 2){
            Matrix matrixAngulo = new Matrix();
            matrixAngulo.setRotate((float)animatorTablet.getAngleX(),tablet.getWidth()/2,tablet.getHeight()/2);
            matrixAngulo.postTranslate(canvas.getWidth()/2 - tablet.getWidth()/2, canvas.getHeight()/2 - tablet.getHeight()/2);
            canvas.drawBitmap(tablet, matrixAngulo, paint);
            drawTitleMovement(imgMoveLeftRight,canvas);
        }
        if (controlNumber == 3){
            if (!saltando){
                if (animatorDedo.getIncrX() != lastIncrX){
                    cambiosIncr++;
                    lastIncrX = animatorDedo.getIncrX();
                }
                if (cambiosIncr >= 4){
                    cambiosIncr = 0;
                    saltando = true;
                }
                animatorDedo.increaseData();
            }
            canvas.drawBitmap(dedoDestino, (float)(animatorDedo.getMinX()-dedoDestino.getWidth()/2),(float)(animatorDedo.getMaxY()+dedo.getHeight()-dedoDestino.getHeight()/2), paint);
            canvas.drawBitmap(dedo, (float)animatorDedo.getX(), (float)animatorDedo.getY(), paint);
            drawTitleMovement(imgJump,canvas);
        }
        animatorCirculos.increaseData();
        animatorFlecha.increaseData();
        animatorTablet.increaseData();
        animatorTitulo.increaseData();
    }

    private void drawTitleMovement(Bitmap img,Canvas canvas){
        Matrix matrixTitle = new Matrix();
        double curEscale = animatorTitulo.getScale();
        matrixTitle.postScale((float)curEscale,(float)curEscale);
        matrixTitle.postTranslate((float)(canvas.getWidth()/2-img.getWidth()*curEscale/2),canvas.getHeight()/6);
        paint.setAlpha(animatorTitulo.getAlpha());
        canvas.drawBitmap(img,matrixTitle,paint);
    }

    @Override
    public void buttonClicked(int buttonId){
        if (buttonId == 0){
            if (controlNumber > 0){
                controlNumber--;
            }
            if (menuAcitivty != null){
                menuAcitivty.startLaserSound();
            }
            else{
                glActivity.startLaserSound();
            }
        }
        if (buttonId == 1){
            if (controlNumber < 3){
                controlNumber++;
            }
            if (menuAcitivty != null){
                menuAcitivty.startLaserSound();
            }
            else{
                glActivity.startLaserSound();
            }
        }
        if (buttonId == 2){
            if (menuAcitivty != null){
                menuAcitivty.initMainView();
            }
            else{
                glActivity.initGameView();
                glActivity.glView.render.pause = false;
            }
        }
        //Ajustando controles
        if (controlNumber == 0){
            animatorCirculos.setIncrAngleX(incrAngulo);
            animatorFlecha.setIncrY(-incrAngulo);
            distY = 0;
        }
        if (controlNumber == 1){
            animatorCirculos.setIncrAngleX(-incrAngulo);
            animatorFlecha.setIncrY(incrAngulo);
            distY = 0;
        }
        if (controlNumber == 2){
            animatorCirculos.setIncrAngleX(0);
            distY = 0;
        }
    }
}
