package com.ball.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.ball.activities.MenuActivity;
import com.ball.activities.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 16/02/2015.
 */
public class TransitionView extends View {

    Bitmap backgroundLights = BitmapFactory.decodeResource(getResources(), R.drawable.menu_fondo3);
    //Black Square Effect
    protected int blackSquareAlpha = 255;
    private int incrAlpha = -5;
    //Buttons Data
    List<CustomButton> buttons = new ArrayList<CustomButton>();
    protected int buttonId = -1;
    //Intialize data
    private boolean intialized = false;
    Context context;
    //Circle Data
    private final int circlesN = 30;
    private float cx[];
    private float cy[];
    private float r[];
    //Sonido
    public MediaPlayer buttonMusic = null;
    int rectangles = 8;
    private int lucesIntensivity[] = new int[rectangles];
    private int incrIntensivity[] = new int[rectangles];
    private int maxAlpha = 255;
    private int minAlpha = 40;
    ////////////////////////////////////
    private List<Bitmap> titleLetters;
    private List<Float> titleLettersYPos;
    private List<Integer> titleAlpha;
    private List<Integer> incrTitleAlpha;
    //Bitmap title
    private Bitmap bitmapBackground;
    private Bitmap bitmapTransparencyGradient;
    private Bitmap bitmapBtnBackground;
    private Bitmap bitmapCristal;
    private List<Float> bitmapsX0Coord;
    private List<Float> bitmapsY0Coord;
    private List<Float> bitmapsXCoord;
    private List<Float> bitmapsYCoord;
    private List<Float> bitmapsSpeedX;
    private List<Float> bitmapsSpeedY;
    private Paint paint = new Paint();
    //Title transition
    private int alphaTitle = 255;
    //private int incrAlphaTitle = -4;
    private int xBackground = 0;
    private int yBackgroundGrandient = 0;
    private Rect rectBitmap1;
    private Rect rectBitmap2;
    private final int SPACE_SIZE = 30;
    private final int Y_TITLE = 30;
    private int MARGIN_BUTTONS = -1;
    private final int HALF_LENGHT_TEXT = 5;
    private final int INCR_ALPHA = 3;
    private final int DIVISIONS_BITMAP = 25;
    private float xTitle = -1;
    private float gravity = 0.7f;
    //Position buttons
    private float xBtnPlay = -1;
    private float xBtnLevelEditor = -1;
    private float xBtnModelEditor = -1;
    private boolean resetPosButtons = true;
    //Mouse touch
    private float touchX = -1f;
    private float touchY = -1f;
    public boolean showButtons = true;


    public TransitionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        this.context = context;
        for(int i=0;i<rectangles;i++){
            lucesIntensivity[i] = minAlpha+i*(maxAlpha-minAlpha)/((int)(rectangles*1.3));
            incrIntensivity[i] = -4;
        }
        //Letters bitmaps
        titleLetters = new ArrayList<>();
        titleLetters.add(BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_title_l1));
        titleLetters.add(BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_title_l2));
        titleLetters.add(BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_title_l3));
        titleLetters.add(BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_title_l4));
        titleLetters.add(BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_title_l5));
        titleLetters.add(BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_title_l6));
        titleLetters.add(BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_title_l7));
        titleLetters.add(BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_title_l8));
        titleLetters.add(BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_title_l9));
        titleLetters.add(BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_title_l10));
        titleLetters.add(BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_title_l11));
        //Alpha title
        titleAlpha = new ArrayList<>();
        titleAlpha.add(1*255/11);
        titleAlpha.add(2*255/11);
        titleAlpha.add(3*255/11);
        titleAlpha.add(4*255/11);
        titleAlpha.add(5*255/11);
        titleAlpha.add(6*255/11);
        titleAlpha.add(7*255/11);///
        titleAlpha.add(8*255/11);
        titleAlpha.add(9*255/11);
        titleAlpha.add(10*255/11);
        titleAlpha.add(11*255/11);
        //Incr title
        incrTitleAlpha = new ArrayList<>();
        incrTitleAlpha.add(INCR_ALPHA);
        incrTitleAlpha.add(INCR_ALPHA);
        incrTitleAlpha.add(INCR_ALPHA);
        incrTitleAlpha.add(INCR_ALPHA);
        incrTitleAlpha.add(INCR_ALPHA);
        incrTitleAlpha.add(INCR_ALPHA);
        incrTitleAlpha.add(INCR_ALPHA);
        incrTitleAlpha.add(INCR_ALPHA);
        incrTitleAlpha.add(INCR_ALPHA);
        incrTitleAlpha.add(INCR_ALPHA);
        incrTitleAlpha.add(INCR_ALPHA);
        //Background bitmaps
        bitmapBackground = BitmapFactory.decodeResource(getResources(), R.drawable.bg_crashed_ball);
        bitmapBtnBackground = BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_bg_btn1);
        bitmapBtnBackground = getResizedBitmap(bitmapBtnBackground, (int)(bitmapBtnBackground.getWidth() * 1.5f), (int)(bitmapBtnBackground.getHeight() * 1.5f));
        bitmapTransparencyGradient = BitmapFactory.decodeResource(getResources(), R.drawable.main_menu_transparency_gradient);
        bitmapCristal = BitmapFactory.decodeResource(getResources(), R.drawable.texture1);
        rectBitmap1 = new Rect(bitmapBackground.getWidth(),0,0,bitmapBackground.getHeight());
        rectBitmap2 = new Rect(0, 0, bitmapBackground.getWidth(), bitmapBackground.getHeight());
    }

    public Bitmap getResizedBitmap(Bitmap bm, int newWidth, int newHeight) {
        int width = bm.getWidth();
        int height = bm.getHeight();
        float scaleWidth = ((float) newWidth) / width;
        float scaleHeight = ((float) newHeight) / height;
        // CREATE A MATRIX FOR THE MANIPULATION
        Matrix matrix = new Matrix();
        // RESIZE THE BIT MAP
        matrix.postScale(scaleWidth, scaleHeight);

        // "RECREATE" THE NEW BITMAP
        Bitmap resizedBitmap = Bitmap.createBitmap(
                bm, 0, 0, width, height, matrix, false);
        bm.recycle();
        return resizedBitmap;
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        ////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////Second Part//////////////////////////////////
        //Background display
        paint.setAlpha(255);
        int x0 = xBackground-canvas.getWidth();
        canvas.drawBitmap(bitmapBackground,rectBitmap1,new Rect(x0,0,x0+canvas.getWidth(),canvas.getHeight()),paint);
        canvas.drawBitmap(bitmapBackground,rectBitmap2, new Rect(xBackground, 0, xBackground + canvas.getWidth(), canvas.getHeight()), paint);
        canvas.drawBitmap(bitmapTransparencyGradient,new Rect(0, 0, bitmapTransparencyGradient.getWidth(), bitmapTransparencyGradient.getHeight()), new Rect(0, yBackgroundGrandient+canvas.getHeight(), canvas.getWidth(), yBackgroundGrandient+canvas.getHeight()+canvas.getHeight()), paint);
        canvas.drawBitmap(bitmapTransparencyGradient,new Rect(0, 0, bitmapTransparencyGradient.getWidth(), bitmapTransparencyGradient.getHeight()), new Rect(0, yBackgroundGrandient, canvas.getWidth(), yBackgroundGrandient+canvas.getHeight()), paint);
        xBackground += 2;
        if (xBackground > canvas.getWidth()){
            Rect rectTmp = rectBitmap1;
            rectBitmap1 = rectBitmap2;
            rectBitmap2 = rectTmp;
            xBackground = 0;
        }
        yBackgroundGrandient-=3;
        if (yBackgroundGrandient < -canvas.getHeight()){
            yBackgroundGrandient = 0;
        }
        //TITLE DISPLAY
        //Init
        if (xTitle == -1){
            xTitle = canvas.getWidth()/2-(titleLetters.size()*titleLetters.get(0).getWidth()+SPACE_SIZE)/2;
        }
        //Letters coordinates
        if (titleLettersYPos == null){
            titleLettersYPos = new ArrayList<>();
            for(int i=0;i<titleLetters.size();i++){
                titleLettersYPos.add((float)(this.getHeight()+30+i*150));
            }
        }
        //Draw tITLE
        float xLetter = xTitle;
        boolean titleMovementComplete = true;
        for(int i=0;i<titleLetters.size();i++){
            //Alpha
            alphaTitle = titleAlpha.get(i);
            paint.setAlpha(alphaTitle);
            alphaTitle += incrTitleAlpha.get(i);
            if ((alphaTitle > 255)||(alphaTitle < 100)){
                incrTitleAlpha.set(i,incrTitleAlpha.get(i)*(-1));
            }
            if (alphaTitle > 255){
                alphaTitle = 255;
            }
            if (alphaTitle < 100){
                alphaTitle = 100;
            }
            titleAlpha.set(i, alphaTitle);
            //Bitmap
            Bitmap bmpLetter = titleLetters.get(i);
            canvas.drawBitmap(bmpLetter,xLetter,titleLettersYPos.get(i),paint);
            if (titleLettersYPos.get(i) > Y_TITLE+2){
                titleLettersYPos.set(i,(float)(titleLettersYPos.get(i)+(Y_TITLE-titleLettersYPos.get(i))/10));
                titleMovementComplete = false;
            }
            else{
                titleLettersYPos.set(i,(float)Y_TITLE);
            }
            xLetter += bmpLetter.getWidth();
            if (i == 6){
                xLetter += SPACE_SIZE;
            }
        }
        //Move buttons
        if (titleMovementComplete){
            if (resetPosButtons){
                xBtnPlay = -bitmapBtnBackground.getWidth()-1;
                xBtnLevelEditor = canvas.getWidth()+1;
                xBtnModelEditor = canvas.getWidth()+1;
                resetPosButtons = false;
            }
        }
        //Draw buttons
        if (MARGIN_BUTTONS == -1){
            MARGIN_BUTTONS = canvas.getWidth()/2 - bitmapBtnBackground.getWidth()/2;
        }
        if (!resetPosButtons){
            paint.setColor(Color.rgb(0,0,0));
            paint.setTextSize(40);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.SANS_SERIF);
            //Next step movement buttons
            if (xBtnPlay < MARGIN_BUTTONS){
                xBtnPlay += (MARGIN_BUTTONS-xBtnPlay)/10;
            }
            xBtnLevelEditor = xBtnModelEditor;
            float btnEndPosition = canvas.getWidth()-bitmapBtnBackground.getWidth()-MARGIN_BUTTONS;
            if (xBtnModelEditor > btnEndPosition){
                xBtnModelEditor += (btnEndPosition-xBtnModelEditor)/10;
            }
            //Button background
            //Coordinates
            float y0 = (Y_TITLE+bitmapBtnBackground.getHeight()/2);
            float half = (canvas.getHeight()-y0)/2;
            float y1 = y0+half/2-bitmapBtnBackground.getHeight()/2;
            float y2 = canvas.getHeight()-half/2-bitmapBtnBackground.getHeight()/2;
            if (showButtons)
            {
                //Play
                float btnPlay = y1;
                canvas.drawBitmap(bitmapBtnBackground,xBtnPlay,btnPlay,paint);
                canvas.drawText("Play",xBtnPlay+(bitmapBtnBackground.getWidth())/2,btnPlay+bitmapBtnBackground.getHeight()/2+HALF_LENGHT_TEXT,paint);
                if ((touchX >= xBtnPlay)&&(touchX <= xBtnPlay+bitmapBtnBackground.getWidth())&&(touchY >= btnPlay)&&(touchY <= btnPlay+bitmapBtnBackground.getHeight())){
                    //mainMenu.play();
                    Log.v("Button Click1.......","Button Click1.......");
                    buttonClicked(0);
                    resetTouch ();

                }
                //Level editor
                float btnLevelEditor = y2;
                canvas.drawBitmap(bitmapBtnBackground,xBtnLevelEditor,btnLevelEditor,paint);
                canvas.drawText("Controls",xBtnLevelEditor+(bitmapBtnBackground.getWidth())/2,btnLevelEditor+bitmapBtnBackground.getHeight()/2+HALF_LENGHT_TEXT,paint);
                if ((touchX >= xBtnLevelEditor)&&(touchX <= xBtnLevelEditor+bitmapBtnBackground.getWidth())&&(touchY >= btnLevelEditor)&&(touchY <= btnLevelEditor+bitmapBtnBackground.getHeight())){
                    //mainMenu.levelEditor();
                    Log.v("Button Click2.......","Button Click2.......");
                    buttonClicked(1);
                    resetTouch ();
                }
            }
            /*
            //Model editor
            float btnModelEditor = y1;
            canvas.drawBitmap(bitmapBtnBackground,xBtnModelEditor,btnModelEditor,paint);
            canvas.drawText("Model editor",xBtnModelEditor+(bitmapBtnBackground.getWidth())/2,btnModelEditor+bitmapBtnBackground.getHeight()/2+HALF_LENGHT_TEXT,paint);
            if ((touchX >= xBtnModelEditor)&&(touchX <= xBtnModelEditor+bitmapBtnBackground.getWidth())&&(touchY >= btnModelEditor)&&(touchY <= btnModelEditor+bitmapBtnBackground.getHeight())){
                //mainMenu.model();
                resetTouch ();
            }
            */
        }
        //Draw foregound crystal
        if (bitmapsXCoord == null){
            bitmapsXCoord = new ArrayList<>();
            bitmapsYCoord = new ArrayList<>();
            bitmapsSpeedX = new ArrayList<>();
            bitmapsSpeedY = new ArrayList<>();
            bitmapsX0Coord = new ArrayList<>();
            bitmapsY0Coord = new ArrayList<>();
            float signo = 1f;
            for(int i=0;i<DIVISIONS_BITMAP;i++){
                for(int j=0;j<DIVISIONS_BITMAP;j++){
                    //Start data
                    float xC0 = (i*bitmapCristal.getWidth())/DIVISIONS_BITMAP;
                    float yC0 = (j*bitmapCristal.getHeight())/DIVISIONS_BITMAP;
                    //End data
                    float xC1 = (i*canvas.getWidth())/DIVISIONS_BITMAP;
                    float yC1 = (j*canvas.getHeight())/DIVISIONS_BITMAP;
                    //Fill data
                    bitmapsX0Coord.add(xC0);
                    bitmapsY0Coord.add(yC0);
                    bitmapsXCoord.add(xC1);
                    bitmapsYCoord.add(yC1);
                    bitmapsSpeedX.add((float)Math.random()*signo*10);
                    bitmapsSpeedY.add(-(float)Math.random()*25);
                    signo *= -1f;
                }
            }
        }
        paint.setAlpha(70);
        for(int i=0;i<bitmapsXCoord.size();i++){
            if (bitmapsYCoord.get(i) < canvas.getHeight()){
                float w0 = bitmapCristal.getWidth()/DIVISIONS_BITMAP;
                float h0 = bitmapCristal.getHeight()/DIVISIONS_BITMAP;
                float w1 = canvas.getWidth()/DIVISIONS_BITMAP;
                float h1 = canvas.getHeight()/DIVISIONS_BITMAP;
                //Speed
                bitmapsXCoord.set(i,bitmapsXCoord.get(i)+bitmapsSpeedX.get(i));
                bitmapsYCoord.set(i,bitmapsYCoord.get(i)+bitmapsSpeedY.get(i));
                bitmapsSpeedY.set(i,bitmapsSpeedY.get(i)+gravity);
                //Draw
                canvas.rotate(bitmapsXCoord.get(i)*5,bitmapsXCoord.get(i)+w1/2,bitmapsYCoord.get(i)+h1/2);
                canvas.drawBitmap(bitmapCristal,new Rect(bitmapsX0Coord.get(i).intValue(), bitmapsY0Coord.get(i).intValue(), (int)(bitmapsX0Coord.get(i).intValue()+w0), (int)(bitmapsY0Coord.get(i).intValue()+h0)), new Rect(bitmapsXCoord.get(i).intValue(), bitmapsYCoord.get(i).intValue(), (int)(bitmapsXCoord.get(i).intValue()+w1), (int)(bitmapsYCoord.get(i).intValue()+h1)),paint);
                canvas.rotate(-bitmapsXCoord.get(i)*5,bitmapsXCoord.get(i)+w1/2,bitmapsYCoord.get(i)+h1/2);
            }
        }
        ///////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////
        //Intializing View
        if (!intialized){
            //Circles
            cx = new float[circlesN];
            cy = new float[circlesN];
            r = new float[circlesN];
            for(int i=0;i<circlesN;i++){
                cx[i] = (float)(Math.random()*canvas.getWidth());
                cy[i] = (float)(Math.random()*canvas.getHeight());
                r[i] = 50+(float)(Math.random()*50);
            }
            //Inicializar vista
            initView(canvas);
            intialized = true;
        }
        //Drawing Buttons
        for(int i=0;i<buttons.size();i++){
            buttons.get(i).drawButton(canvas);
        }
        //Drawing View
        drawView(canvas);
        //Black Square Transition
        paint.setColor(Color.argb(blackSquareAlpha,0,0,0));
        if (blackSquareAlpha > 0){
            canvas.drawRect(0f,0f,(float)canvas.getWidth(),(float)canvas.getHeight(),paint);
        }
        if ((blackSquareAlpha >= 0)&&(blackSquareAlpha <= 255)){
            blackSquareAlpha += incrAlpha;
        }
        if (blackSquareAlpha >= 255){
            buttonClicked(buttonId);
            blackSquareAlpha = 254;
            incrAlpha = 0;
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        float mouseX = e.getX();
        float mouseY = e.getY();
        if (e.getAction() == MotionEvent.ACTION_DOWN){
            touchX = mouseX;
            touchY = mouseY;
            if (blackSquareAlpha < 0){
                for(int i=0;i<buttons.size();i++){
                    if (buttons.get(i) != null){
                        if (buttons.get(i).isClicked(e.getX(),e.getY())){
                            buttonId = i;
                            if (buttons.get(i).isShowTransition()){
                                startTransition();
                            }
                            else{
                                buttonClicked(buttonId);
                            }
                        }
                    }
                }
            }
            onActionDown(e.getX(),e.getY());
        }
        return false;
    }

    public void startTransition(){
        blackSquareAlpha = 0;
        incrAlpha = Math.abs(incrAlpha);
        onTransition();
    }

    public void startButtonSound(Context context){
        buttonMusic = MediaPlayer.create(context, R.raw.botons);
        buttonMusic.setLooping(false);
        buttonMusic.setVolume(0.8f, 0.8f);
        buttonMusic.start();
    }

    /////////////////////////////Metodos a sobreescribir en clases hijas////////////////////////////

    public void initView(Canvas canvas){

    }

    public void drawView(Canvas canvas){

    }

    public void buttonClicked(int buttonId){

    }

    public void onActionDown(float x,float y){

    }

    public void onTransition(){
        startButtonSound(context);
    }

    private void resetTouch (){
        touchX = -1;
        touchY = -1;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
}