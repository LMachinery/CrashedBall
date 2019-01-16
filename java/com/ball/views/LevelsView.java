package com.ball.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ball.activities.MenuActivity;
import com.ball.activities.R;
import com.ball.extras.Animator;

import java.util.ArrayList;

public class LevelsView extends TransitionView{
    //Imagenes de niveles
    private Bitmap level1Img = BitmapFactory.decodeResource(getResources(), R.drawable.level1);
    private Bitmap level2Img = BitmapFactory.decodeResource(getResources(), R.drawable.level2);
    private Bitmap level3Img = BitmapFactory.decodeResource(getResources(), R.drawable.level3);
    private Bitmap level4Img = BitmapFactory.decodeResource(getResources(), R.drawable.level4);
    private Bitmap level5Img = BitmapFactory.decodeResource(getResources(), R.drawable.level5);
    private Bitmap level6Img = BitmapFactory.decodeResource(getResources(), R.drawable.level6);
    private Bitmap level7Img = BitmapFactory.decodeResource(getResources(), R.drawable.level7);
    private Bitmap level8Img = BitmapFactory.decodeResource(getResources(), R.drawable.level8);
    private Bitmap level9Img = BitmapFactory.decodeResource(getResources(), R.drawable.level9);
    private Bitmap level10Img = BitmapFactory.decodeResource(getResources(), R.drawable.level10);
    //Imagenes de los titulos de los niveles
    private Bitmap title1Img = BitmapFactory.decodeResource(getResources(), R.drawable.cristal_world);
    private Bitmap title2Img = BitmapFactory.decodeResource(getResources(), R.drawable.snow_world);
    private Bitmap title3Img = BitmapFactory.decodeResource(getResources(), R.drawable.forest_world);
    private Bitmap title4Img = BitmapFactory.decodeResource(getResources(), R.drawable.ceramic_world);
    private Bitmap title5Img = BitmapFactory.decodeResource(getResources(), R.drawable.ice_world);
    private Bitmap title6Img = BitmapFactory.decodeResource(getResources(), R.drawable.spacial_world);
    private Bitmap title7Img = BitmapFactory.decodeResource(getResources(), R.drawable.industrial_world);
    private Bitmap title8Img = BitmapFactory.decodeResource(getResources(), R.drawable.city_world);
    private Bitmap title9Img = BitmapFactory.decodeResource(getResources(), R.drawable.islands_world);
    private Bitmap title10Img = BitmapFactory.decodeResource(getResources(), R.drawable.sky_world);
    private Bitmap overImg = BitmapFactory.decodeResource(getResources(), R.drawable.mundos);
	Paint paint = new Paint();
	Rect src = null;
	Rect srcOverImg = null;
	Rect destOverImg = null;
	public MenuActivity menuAcitivty;
	public int showLevel = 1;
	private float x1;
	private float x0 = 0;
	private final float incr = 0.025f;
	//Alpha
    Animator alphaAnimator = new Animator();
	//Dimensiones del rectangulo
	private final int num = 15;
	private final int den = 16;
	//Escala
	float scaleTitles = 1;
	float incrScale = 0.01f;
    //Margen antes de mostrar los niveles
    int border = 0;
    int levelsWidth = 0;
    int levelsHeight = 0;

    public LevelsView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void initView(Canvas canvas){
        //Boton customizado
        buttons = new ArrayList<CustomButton>();
        buttons.add(new CustomButton(context,0,canvas.getHeight()/2,R.drawable.flecha_i,"",false));
        buttons.get(0).setX(buttons.get(0).getWidth());
        border = buttons.get(0).getWidth()*4;
        buttons.add(new CustomButton(context,0,canvas.getHeight()/2,R.drawable.flecha_d,"",false));
        buttons.get(1).setX(canvas.getWidth()-buttons.get(1).getWidth());
        buttons.add(new CustomButton(context,canvas.getWidth()/2,canvas.getHeight()-border/4,R.drawable.button,"Menu",true));
        levelsWidth = canvas.getWidth()-border;
        levelsHeight = canvas.getHeight()-border;
        //Seteando datos de transparencia
        alphaAnimator.setIncrAlpha(3);
        alphaAnimator.setMaxAlpha(250);
        alphaAnimator.setMinAlpha(100);
        showButtons = false;
    }

    @Override
    public void drawView(Canvas canvas){
        x1 = 1-showLevel;
        if (x0 > x1+incr){
            x0 -= incr;
        }
        else if (x0 < x1-incr){
            x0 += incr;
        }
        else {
            x0 = x1;
        }
        paint.setColor(Color.argb((int)alphaAnimator.getAlpha(), 255, 255, 255));
        ///////////////////////////////////////////////////////////////////////////////////
        //Drawing levels
        Rect dest = getRectImg(canvas,1);
        drawBitmap(canvas,level1Img,dest);
        dest = getRectImg(canvas,2);
        drawBitmap(canvas,level2Img,dest);
        dest = getRectImg(canvas,3);
        drawBitmap(canvas,level3Img,dest);
        dest = getRectImg(canvas,4);
        drawBitmap(canvas,level4Img,dest);
        dest = getRectImg(canvas,5);
        drawBitmap(canvas,level5Img,dest);
        dest = getRectImg(canvas,6);
        drawBitmap(canvas,level6Img,dest);
        dest = getRectImg(canvas,7);
        drawBitmap(canvas,level7Img,dest);
        dest = getRectImg(canvas,8);
        drawBitmap(canvas,level8Img,dest);
        dest = getRectImg(canvas,9);
        drawBitmap(canvas,level9Img,dest);
        dest = getRectImg(canvas,10);
        drawBitmap(canvas,level10Img,dest);
        ///////////////////////////////////////////////////////////////////////////////////
        //Drawing titles
        dest = getRectTitle(canvas,1);
        drawBitmap(canvas,title1Img,dest);
        dest = getRectTitle(canvas,2);
        drawBitmap(canvas,title2Img,dest);
        dest = getRectTitle(canvas,3);
        drawBitmap(canvas,title3Img,dest);
        dest = getRectTitle(canvas,4);
        drawBitmap(canvas,title4Img,dest);
        dest = getRectTitle(canvas,5);
        drawBitmap(canvas,title5Img,dest);
        dest = getRectTitle(canvas,6);
        drawBitmap(canvas,title6Img,dest);
        dest = getRectTitle(canvas,7);
        drawBitmap(canvas,title7Img,dest);
        dest = getRectTitle(canvas,8);
        drawBitmap(canvas,title8Img,dest);
        dest = getRectTitle(canvas,9);
        drawBitmap(canvas,title9Img,dest);
        dest = getRectTitle(canvas,10);
        drawBitmap(canvas,title10Img,dest);
        //Dibujar marco
        if (destOverImg == null){
            destOverImg = new Rect(border/2,border/2,canvas.getWidth()-border/2, canvas.getHeight()-border/2);
        }
        paint.setColor(Color.argb(255, 255, 255, 255));
        canvas.drawBitmap(overImg, srcOverImg, destOverImg, paint);
        //Escala titulo
        if (scaleTitles >= 2){
            incrScale = -1*Math.abs(incrScale);
        }
        if (scaleTitles <= 1){
            incrScale = Math.abs(incrScale);
        }
        scaleTitles += incrScale;
    }

    private void drawBitmap(Canvas canvas,Bitmap bitmap,Rect dest){
        if ((dest.right >= 0)&&(dest.left <= canvas.getWidth())){
            canvas.drawBitmap(bitmap, src, dest, paint);
        }
    }

    private Rect getRectImg(Canvas canvas,int level){
        int width = (canvas.getWidth()-border)/2;
        int height = (canvas.getHeight()-border)/2;
        float factor = 1;
        int x = (int)(canvas.getWidth()/2+(4*canvas.getWidth()/6)*((level-1)+x0));
        int y = canvas.getHeight()/2;
        factor = Math.abs(1-Math.abs(((float)(x-canvas.getWidth()/2))/((float)(canvas.getWidth()))));
        return new Rect(x-(int)(width*factor), y-(int)(height*factor), x+(int)(width*factor), y+(int)(height*factor));
    }

    private Rect getRectTitle(Canvas canvas,int level){
        int width = title1Img.getWidth()/5;
        int height = title1Img.getHeight()/5;
        float factor = 1;
        int x = (int)(canvas.getWidth()/2+(4*canvas.getWidth()/6)*((level-1)+x0));
        int y = canvas.getHeight()/2;
        factor = Math.abs(1-Math.abs(((float)(x-canvas.getWidth()/2))/((float)(canvas.getWidth()))))*scaleTitles;
        return new Rect(x-(int)(width*factor), y-(int)(height*factor), x+(int)(width*factor), y+(int)(height*factor));
    }

    @Override
    public void buttonClicked(int buttonId){
        if (menuAcitivty != null){
            if (buttonId == 0){
                menuAcitivty.previousLevel();
            }
            if (buttonId == 1){
                menuAcitivty.netxLevel();
            }
            if (buttonId == 2){
                menuAcitivty.initMainView();
            }
            //Nivel
            if (buttonId == 3){
                menuAcitivty.startGame(showLevel);
            }
        }
    }

    @Override
    public void onActionDown(float x,float y){
        if ((x >= border/2)&&(x <= border/2+levelsWidth)&&(y >= border/2)&&(y <= border/2+levelsHeight)){
            if (Math.abs(x1-x0) < incr*3){
                if (blackSquareAlpha < 0){
                    buttonId = 3;
                    startTransition();
                }
            }
        }
    }
}
