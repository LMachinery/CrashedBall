package com.ball.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.ball.views.ControlsView;
import com.ball.views.LevelsView;
import com.ball.views.MenuView;

public class MenuActivity extends Activity{

    private MediaPlayer ambientMusic = null;
    private MediaPlayer laserSound = null;
    private final int totalLevels = 10;

    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        //Intent obtener el id de la vista a iniciar
        Intent intent = getIntent();
        int idView = intent.getIntExtra("idView",0);
        if (idView == 0){
            initMainView();
        }
        if (idView == 1){
            initLevelsView();
        }
        if (idView == 2){
            initControlsView();
        }
        startAmbientMusic();
        //Play crash sound
        playCrashSound();
	}

    private MediaPlayer mpCrash;
    public void playCrashSound(){
        mpCrash = MediaPlayer.create(this,R.raw.cristal);
        mpCrash.start();
    }

    //////////////////////////////////Vista de Menu Principal///////////////////////////////////////

    public void initMainView(){
        setContentView(R.layout.menu);
        MenuView menuView = (MenuView)this.findViewById(R.id.menuView1);
        menuView.menuAcitivty = this;
    }

    //////////////////////////////////Vista de niveles//////////////////////////////////////////////

    private LevelsView niveles;
    public void initLevelsView(){
        setContentView(R.layout.niveles);
        niveles = (LevelsView)this.findViewById(R.id.levelsView);
        niveles.menuAcitivty = this;
    }

    /////////////////////////////////Vista de controles/////////////////////////////////////////////

    public void initControlsView(){
        setContentView(R.layout.controls);
        ControlsView controlsView = (ControlsView)this.findViewById(R.id.controlsView);
        controlsView.menuAcitivty = this;
    }

    public void netxLevel(){
        startLaserSound();
        if (niveles.showLevel < totalLevels){
            niveles.showLevel++;
        }
    }

    public void previousLevel(){
        startLaserSound();
        if (niveles.showLevel > 1){
            niveles.showLevel--;
        }
    }

    public void startGame(int level){
        stopAmbientMusic();
        Intent intent = new Intent(this, MyGLActivity.class);
        intent.putExtra("level", level);
        startActivity(intent);
        finish();
    }

    /////////////////////////////////Metodos de sonido//////////////////////////////////////////////

    public void stopAmbientMusic(){
        if ((ambientMusic != null)&&(ambientMusic.isPlaying())){
            ambientMusic.stop();
            ambientMusic.release();
            ambientMusic = null;
        }
    }

    public void startAmbientMusic(){
        ambientMusic = MediaPlayer.create(this, R.raw.cristal_musica);
        ambientMusic.setLooping(true);
        ambientMusic.setVolume(0.4f, 0.4f);
        ambientMusic.start();
    }

    public void startLaserSound(){
        laserSound = MediaPlayer.create(this, R.raw.lasers);
        laserSound.setLooping(false);
        laserSound.setVolume(1.3f, 1.3f);
        laserSound.start();
    }

    public long getCurrentPosition(){
        if ((ambientMusic != null)&&(ambientMusic.isPlaying())){
            return ambientMusic.getCurrentPosition();
        }
        return 0;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	protected void onResume() {
		super.onResume();
	}
	
	@Override
	protected void onDestroy() {
	   super.onDestroy();
        stopAmbientMusic();
	}

    private void confirmarSalida(){
        startLaserSound();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alert0, null);
        builder.setView(view);
        // Set other dialog properties
        // Create the AlertDialog
        final AlertDialog dialog = builder.create();
        dialog.show();
        // Add the buttons
        Button btnYes = (Button)view.findViewById(R.id.btnYes);
        btnYes.setTextColor(Color.WHITE);
        btnYes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                dialog.cancel();
                startLaserSound();
                finish();
            }
        });
        Button btnNo = (Button)view.findViewById(R.id.btnNo);
        btnNo.setTextColor(Color.WHITE);
        btnNo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                dialog.cancel();
                startLaserSound();
            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        confirmarSalida();
    }
}
