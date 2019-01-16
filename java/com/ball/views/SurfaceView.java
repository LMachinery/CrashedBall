package com.ball.views;

import android.content.Context;
import android.graphics.Paint;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.ball.activities.MyGLActivity;
import com.ball.levels.Level;

public class SurfaceView extends GLSurfaceView{

	public MyGLRenderer render;
	
	public SurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
	}

    public void setLevel(MyGLActivity activity,Level level){
        setEGLContextClientVersion(2);
        render = new MyGLRenderer(activity,level);
        setRenderer(render); // Use a custom renderer
        setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
    }

	float yini = 0;
	float yMoveAnt = -1;
	long lastTime = -1;
	@Override
	public boolean onTouchEvent(MotionEvent arg1) {
		// TODO Auto-generated method stub
        if (render != null){
            if (arg1.getAction() == MotionEvent.ACTION_DOWN){
                yini = arg1.getY();
                if (lastTime != -1){
                    if (System.currentTimeMillis() - lastTime < 300){
                        render.level.onDoubleTouchPerformed(render);
                    }
                }
                lastTime = System.currentTimeMillis();
                yMoveAnt = -1;
            }
            if (arg1.getAction() == MotionEvent.ACTION_UP){
                yMoveAnt = -1;
            }
            if (arg1.getAction() == MotionEvent.ACTION_MOVE){
                if (yMoveAnt != -1){
                    render.level.onTouchMoved(arg1.getY(),yMoveAnt);
                }
                yMoveAnt = arg1.getY();
            }
        }
		return true;
	}
}
