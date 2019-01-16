package com.ball.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ball.levels.Level;
import com.ball.levels.Level1;
import com.ball.levels.Level10;
import com.ball.levels.Level2;
import com.ball.levels.Level3;
import com.ball.levels.Level4;
import com.ball.levels.Level5;
import com.ball.levels.Level6;
import com.ball.levels.Level7;
import com.ball.levels.Level8;
import com.ball.levels.Level9;
import com.ball.views.ControlsView;
import com.ball.views.SurfaceView;
/**
 * Our OpenGL program's main activity
 */
public class MyGLActivity extends Activity implements SensorEventListener{
   
   public SurfaceView glView;   // Use GLSurfaceView
   // Call back when the activity is started, to initialize the view
   private MediaPlayer ambientMusic = null;
   private MediaPlayer crashSound = null;
   private MediaPlayer laserSound = null;
   private MediaPlayer checkPointSound = null;
   private int levelIndex;
   private Level level;
   //Dialogo de sallida
   private AlertDialog dialog;
   private SensorManager mSensorManager;
   private TextView txtCoins;
   private TextView txtScore;
    //Mini Ball
    private ImageView imgMiniBall;
    private ImageView imgMicroBall;
    private ImageView imgJumperBall;
    private ImageView imgRepulsiveBall;
    private ImageView imgSolidBall;
    private View gameView;


   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

       LayoutInflater inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       gameView = inflater.inflate(R.layout.game, null);

      Intent intent = getIntent();
      levelIndex = intent.getIntExtra("level",1);
      level = getLevel(levelIndex);
      initGameView();
      glView = (SurfaceView)this.findViewById(R.id.surface_view_game);
      glView.setLevel(this,level);

      mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
      mSensorManager.registerListener(this,
              mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
              SensorManager.SENSOR_DELAY_NORMAL);
      
      //inicializando sonidos
      crashSound = MediaPlayer.create(this, level.crashResource);
	  ambientMusic = MediaPlayer.create(this, level.musicResource);
	  ambientMusic.setLooping(true);
	  ambientMusic.start();

       txtCoins = (TextView)this.findViewById(R.id.txtMonedas);
       txtScore = (TextView)this.findViewById(R.id.txtPuntaje);
       updateTxtCoins(0);
       //Poderes de ball
       imgMiniBall = (ImageView)this.findViewById(R.id.imgMiniBall);
       imgMicroBall = (ImageView)this.findViewById(R.id.imgMicroBall);
       imgJumperBall = (ImageView)this.findViewById(R.id.imgJumperBall);
       imgRepulsiveBall = (ImageView)this.findViewById(R.id.imgRepulsiveBall);
       imgSolidBall = (ImageView)this.findViewById(R.id.imgSolidBall);
       //Click en efecto bolas
       imgMiniBall.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               setBallEffect(glView.render.scoreMinBall);
           }
       });
       imgMicroBall.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               setBallEffect(glView.render.scoreMicroBall);
           }
       });
       imgJumperBall.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               setBallEffect(glView.render.scoreJumperBall);
           }
       });
       imgRepulsiveBall.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               setBallEffect(glView.render.scoreRepulsiveBall);
           }
       });
       imgSolidBall.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               setBallEffect(glView.render.scoreIndestructibleBall);
           }
       });
       updateBallIcons();
   }

   private void setBallEffect(int scoreEffect){
       if (glView.render.coins >= scoreEffect){
           glView.render.tiempoInicioConteo = System.currentTimeMillis();
           glView.render.coins -= scoreEffect;
           if (scoreEffect == glView.render.scoreMinBall){
                updateSphereScoreMinBall();
           }
           if (scoreEffect == glView.render.scoreMicroBall){
               updateSphereScoreMicroBall();
           }
           if (scoreEffect == glView.render.scoreJumperBall){
               updateSphereScoreJumperBall();
           }
           if (scoreEffect == glView.render.scoreRepulsiveBall){
               updateEsferaScoreRepulsiveBall();
           }
           if (scoreEffect == glView.render.scoreIndestructibleBall){
               updateSphereScoreSolidBall();
           }
           glView.render.level.sphere.power  = scoreEffect;
           updateTxtCoins(glView.render.coins);
           updateBallIcons();
           startLaserSound();
       }
   }

   private void updateSphereScoreMinBall(){
       glView.render.level.sphere.getAnimator().setMinScale(0.75f);
       glView.render.level.sphere.getAnimator().setRepetibleScale(false);
       glView.render.level.sphere.getAnimator().setIncrScale(-0.005f);
       glView.render.level.sphere.getAnimator().setRepetibleGreen(false);
       glView.render.level.sphere.getAnimator().setGreen(50);
       glView.render.level.sphere.getAnimator().setIncrGreen(4);
       glView.render.level.sphere.getAnimator().setMinGreen(0);
       glView.render.level.sphere.getAnimator().setRepetibleBlue(false);
       glView.render.level.sphere.getAnimator().setBlue(50);
       glView.render.level.sphere.getAnimator().setIncrBlue(4);
       glView.render.level.sphere.getAnimator().setMinBlue(0);
   }

    private void updateSphereScoreMicroBall(){
        glView.render.level.sphere.getAnimator().setMinScale(0.5f);
        glView.render.level.sphere.getAnimator().setRepetibleScale(false);
        glView.render.level.sphere.getAnimator().setIncrScale(-0.005f);
        glView.render.level.sphere.getAnimator().setRepetibleGreen(false);
        glView.render.level.sphere.getAnimator().setGreen(50);
        glView.render.level.sphere.getAnimator().setIncrGreen(4);
        glView.render.level.sphere.getAnimator().setMinGreen(0);
        glView.render.level.sphere.getAnimator().setRepetibleBlue(false);
        glView.render.level.sphere.getAnimator().setBlue(50);
        glView.render.level.sphere.getAnimator().setIncrBlue(4);
        glView.render.level.sphere.getAnimator().setMinBlue(0);
    }

    private void updateSphereScoreJumperBall(){
        glView.render.level.vyJump = 0.1f;
    }

    private void updateEsferaScoreRepulsiveBall(){
        glView.render.level.sphere.getAnimator().setMinScale(0.85f);
        glView.render.level.sphere.getAnimator().setMaxScale(1.25f);
        glView.render.level.sphere.getAnimator().setIncrScale(-0.005f);
        glView.render.level.sphere.getAnimator().setBlue(170);
        glView.render.level.sphere.getAnimator().setRed(170);
    }

    private void updateSphereScoreSolidBall(){
        glView.render.level.sphere.getAnimator().setBlue(253);
        glView.render.level.sphere.getAnimator().setRed(111);
        glView.render.level.sphere.getAnimator().setGreen(182);
    }

   public void updateTxtCoins(final int value){
       runOnUiThread(new Runnable() {
           @Override
           public void run() {
               txtCoins.setText(value+"");
           }
       });
   }

    public void updateTxtSeconds(final String value){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                txtScore.setText(value);
            }
        });
    }

   public void updateBallIcons(){
       runOnUiThread(new Runnable() {
           @Override
           public void run() {
               Drawable drawableMiniBall = getResources().getDrawable( R.drawable.ball_mini );
               Drawable drawableMicroBall = getResources().getDrawable( R.drawable.ball_micro );
               Drawable drawableJumperBall = getResources().getDrawable( R.drawable.ball_jump );
               Drawable drawableRepulsiveBall = getResources().getDrawable( R.drawable.ball_repulsive );
               Drawable drawableSolidBall = getResources().getDrawable( R.drawable.ball_solid );
               if (glView.render.coins < glView.render.scoreMinBall){
                   drawableMiniBall.setColorFilter(Color.GRAY , PorterDuff.Mode.MULTIPLY );
               }
               else{
                   drawableMiniBall.setColorFilter(Color.WHITE , PorterDuff.Mode.MULTIPLY );
               }
               if (glView.render.coins < glView.render.scoreMicroBall){
                   drawableMicroBall.setColorFilter(Color.GRAY , PorterDuff.Mode.MULTIPLY );
               }
               else{
                   drawableMicroBall.setColorFilter(Color.WHITE , PorterDuff.Mode.MULTIPLY );
               }
               if (glView.render.coins < glView.render.scoreJumperBall){
                   drawableJumperBall.setColorFilter(Color.GRAY , PorterDuff.Mode.MULTIPLY );
               }
               else{
                   drawableJumperBall.setColorFilter(Color.WHITE , PorterDuff.Mode.MULTIPLY );
               }
               if (glView.render.coins < glView.render.scoreRepulsiveBall){
                   drawableRepulsiveBall.setColorFilter(Color.GRAY , PorterDuff.Mode.MULTIPLY );
               }
               else{
                   drawableRepulsiveBall.setColorFilter(Color.WHITE , PorterDuff.Mode.MULTIPLY );
               }
               if (glView.render.coins < glView.render.scoreIndestructibleBall){
                   drawableSolidBall.setColorFilter(Color.GRAY , PorterDuff.Mode.MULTIPLY );
               }
               else{
                   drawableSolidBall.setColorFilter(Color.WHITE , PorterDuff.Mode.MULTIPLY );
               }
               imgMiniBall.setImageDrawable(drawableMiniBall);
               imgMicroBall.setImageDrawable(drawableMicroBall);
               imgJumperBall.setImageDrawable(drawableJumperBall);
               imgRepulsiveBall.setImageDrawable(drawableRepulsiveBall);
               imgSolidBall.setImageDrawable(drawableSolidBall);
           }
       });
   }

   public void initGameView(){
       this.setContentView(gameView);
   }
   
   public Level restartLevel(){
	   Level level = getLevel(levelIndex);
	   level.textures = this.level.textures;
	   level.texturesResources = this.level.texturesResources;
	   level.assignTextureToObjects();
       glView.render.level.sphere.power = -1;
       glView.render.tiempoInicioConteo = System.currentTimeMillis()-(glView.render.timePoderSegundos+5)*1000;
	   return level;
   }

    private Level getLevel(int level){
        if (level == 1){
            return new Level1();
        }
        if (level == 2){
            return new Level2();
        }
        if (level == 3){
            return new Level3();
        }
        if (level == 4){
            return new Level4();
        }
        if (level == 5){
            return new Level5();
        }
        if (level == 6){
            return new Level6();
        }
        if (level == 7){
            return new Level7();
        }
        if (level == 8){
            return new Level8();
        }
        if (level == 9){
            return new Level9();
        }
        if (level == 10){
            return new Level10();
        }
        return null;
    }

   public void restartMusic(){
	   ambientMusic.seekTo(0);
   }
   
   public void startCrashSound(){
	   crashSound.start();
   }
   
   // Call back when the activity is going into the background
   @Override
   protected void onPause() {
      super.onPause();
      glView.onPause();
   }
   
   // Call back after onPause()
   @Override
   protected void onResume() {
      super.onResume();
      glView.onResume();
   }
   
   @Override
   protected void onDestroy() {
      super.onDestroy();
      mSensorManager.unregisterListener(this);
   }


    int orientation = -1;
    int sign = 1;
    int previousSignv1 = 0;
    int previousSignv2 = 0;
   @Override
   public void onSensorChanged(SensorEvent event) {
       synchronized (this) {
           switch (event.sensor.getType()) {
           case Sensor.TYPE_ACCELEROMETER:

               float v1 = Math.abs(event.values[0]);
               float v2 = Math.abs(event.values[1]);

               if (orientation == -1){
                   if (Math.min(v1,v2) == v2){
                       orientation = 1;
                       sign = -1;
                   }
                   else{
                       orientation = 0;
                   }
               }
               else{
                   int signoActualv1 = (int)Math.signum(v1);
                   if (signoActualv1 != previousSignv1){
                       orientation = 0;
                       sign = 1;
                   }
                   int signoActualv2 = (int)Math.signum(v2);
                   if (signoActualv2 != previousSignv2){
                       orientation = 1;
                       sign = -1;
                   }
               }
               previousSignv1 = (int)Math.signum(event.values[0]);
               previousSignv2 = (int)Math.signum(event.values[1]);
               glView.render.sensorRotationValue = -sign*event.values[orientation];
               break;
           case Sensor.TYPE_GRAVITY:
               break;
           }
       }
   	}
   
   
   	@Override
   	public void onAccuracyChanged(Sensor sensor, int accuracy) {
   		// TODO Auto-generated method stub
	
   	}

    @Override
    public void onBackPressed() {
        confirmarSalida();
    }

    private void confirmarSalida(){
        startLaserSound();
        glView.render.pause = true;
        AlertDialog.Builder builder = new AlertDialog.Builder(this,R.style.CustomDialog);
        //LayoutInflater inflater = getLayoutInflater();
        //builder.setView(inflater.inflate(R.layout.options, null));
        dialog = builder.create();
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener(){
            @Override
            public void onDismiss(DialogInterface dialog) {
                glView.render.pause = false;
            }
        });
        //Layout
        LinearLayout layoutVertical = new LinearLayout(this);
        layoutVertical.setOrientation(LinearLayout.VERTICAL);
        //Boton Continue
        Button btnContinue = new Button(this);
        btnContinue.setText("Continue");
        btnContinue.setBackgroundResource(R.drawable.button);
        btnContinue.setTextColor(Color.WHITE);
        btnContinue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startLaserSound();
                dialog.cancel();
                glView.render.pause = false;
            }
        });
        layoutVertical.addView(btnContinue);
        //Button Controls
        Button btnControls = new Button(this);
        btnControls.setText("Controls");
        btnControls.setBackgroundResource(R.drawable.button);
        btnControls.setTextColor(Color.WHITE);
        btnControls.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startLaserSound();
                iniciarVistaControles();
                dialog.cancel();
            }
        });
        layoutVertical.addView(btnControls);
        dialog.setView(layoutVertical);
        //Boton Levels Menu
        Button btnLevelsView = new Button(this);
        btnLevelsView.setText("Levels Menu");
        btnLevelsView.setBackgroundResource(R.drawable.button);
        btnLevelsView.setTextColor(Color.WHITE);
        btnLevelsView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startLaserSound();
                dialog.cancel();
                if ((ambientMusic != null) && (ambientMusic.isPlaying()))
                {
                    ambientMusic.stop();
                    ambientMusic.release();
                }
                Intent intent = new Intent(v.getContext(), MenuActivity.class);
                intent.putExtra("idView",1);
                startActivity(intent);
                finish();
            }
        });
        layoutVertical.addView(btnLevelsView);
        //Button Main Menu
        Button btnMainMenu = new Button(this);
        btnMainMenu.setText("Main Menu");
        btnMainMenu.setBackgroundResource(R.drawable.button);
        btnMainMenu.setTextColor(Color.WHITE);
        btnMainMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startLaserSound();
                dialog.cancel();
                if ((ambientMusic != null) && (ambientMusic.isPlaying()))
                {
                    ambientMusic.stop();
                    ambientMusic.release();
                }
                Intent intent = new Intent(v.getContext(), MenuActivity.class);
                intent.putExtra("idView",0);
                startActivity(intent);
                finish();
            }
        });
        layoutVertical.addView(btnMainMenu);
        //dialog show
        dialog.show();
    }

    /////////////////////////////////Vista de controles/////////////////////////////////////////////

    public void iniciarVistaControles(){
        setContentView(R.layout.controls);
        ControlsView controlsView = (ControlsView)this.findViewById(R.id.controlsView);
        controlsView.glActivity = this;
        controlsView.strBack = "Continue";
    }

    public void startLaserSound(){
        laserSound = MediaPlayer.create(this, R.raw.lasers);
        laserSound.setLooping(false);
        laserSound.setVolume(1.3f, 1.3f);
        laserSound.start();
    }

    public void startCheckPointSound(){
        if ((checkPointSound != null)&&(checkPointSound.isPlaying())){
            checkPointSound.seekTo(0);
        }
        else{
            checkPointSound = MediaPlayer.create(this, R.raw.check_point);
            checkPointSound.setLooping(false);
            checkPointSound.setVolume(1.3f, 1.3f);
            checkPointSound.start();
        }
    }

    public void startMonedaSound(){
        MediaPlayer coinSound = MediaPlayer.create(this, R.raw.moneda);
        if (coinSound != null){
            coinSound.setLooping(false);
            coinSound.setVolume(2f, 2f);
            coinSound.start();
        }
    }

    public void startDrumSound(){
        MediaPlayer drumSound = MediaPlayer.create(this, R.raw.drum);
        if (drumSound != null){
            drumSound.setLooping(false);
            drumSound.setVolume(2f, 2f);
            drumSound.start();
        }
    }

    public void startPuertaSound(){
        MediaPlayer doorSound = MediaPlayer.create(this, R.raw.puerta);
        if (doorSound != null){
            doorSound.setLooping(false);
            doorSound.setVolume(1.3f, 1.3f);
            doorSound.start();
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
}