package com.ball.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by miguel on 15/02/2015.
 */
public class CustomButton {

    private int x;
    private int y;
    private Bitmap background;
    private String text;
    private Paint btnPaint = new Paint();
    private boolean showTransition;

    public CustomButton(Context context,int x,int y,int background,String text,boolean showTransicion){
        this.setX(x);
        this.setY(y);
        this.setBackground(BitmapFactory.decodeResource(context.getResources(), background));
        this.setText(text);
        this.showTransition = showTransicion;
    }

    public void drawButton(Canvas canvas){
        canvas.drawBitmap(getBackground(), getAbsouteX(), getAbsouteY(), getBtnPaint());
        getBtnPaint().setTextAlign(Paint.Align.CENTER);
        getBtnPaint().setColor(Color.rgb(255,255,255));
        final int size = 33;
        getBtnPaint().setTextSize(size);
        canvas.drawText(getText(), x, y+size/3, getBtnPaint());
    }

    public boolean isClicked(float xClick,float yClick){
        if (getBackground() != null){
            if ((xClick >= getAbsouteX())&&(xClick <= getAbsouteX() + getBackground().getWidth())&&(yClick >= getAbsouteY())&&(yClick <= getAbsouteY() + getBackground().getHeight())){
                return true;
            }
        }
        return false;
    }

    private int getAbsouteX(){
        return getX() - getBackground().getWidth()/2;
    }

    private int getAbsouteY(){
        return getY() - getBackground().getHeight()/2;
    }

    public int getWidth(){
        return this.getBackground().getWidth();
    }

    public int getHeigth(){
        return this.getBackground().getHeight();
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Bitmap getBackground() {
        return background;
    }

    public void setBackground(Bitmap background) {
        this.background = background;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Paint getBtnPaint() {
        return btnPaint;
    }

    public void setBtnPaint(Paint btnPaint) {
        this.btnPaint = btnPaint;
    }

    public boolean isShowTransition() {
        return showTransition;
    }

    public void setShowTransition(boolean showTransition) {
        this.showTransition = showTransition;
    }
}


