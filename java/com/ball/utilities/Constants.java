package com.ball.utilities;

import android.content.Context;
import android.os.Environment;

import com.ball.activities.R;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 23/01/2016.
 */
public class Constants {

    public static String xAxis = "X";
    public static String yAxis = "Y";
    public static String zAxis = "Z";
    public static int NO_TEXTURE = -1;

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////Identifiers//////////////////////////////////////////////
    public final static byte NO_MORE_SHAPE_DATA = -1;
    public final static byte X0 = 1;
    public final static byte Y0 = 2;
    public final static byte Z0 = 3;
    public final static byte ANGLE_X0 = 4;
    public final static byte ANGLE_Y0 = 5;
    public final static byte ANGLE_Z0 = 6;
    public final static byte SCALE0 = 7;
    public final static byte RED0 = 10;
    public final static byte GREEN0 = 11;
    public final static byte BLUE0 = 12;
    public final static byte ALPHA0 = 13;
    //Move vars
    public final static byte incrX = 14;
    public final static byte incrY = 15;
    public final static byte incrZ = 16;
    public final static byte incrAngleX = 17;
    public final static byte incrAngleY = 18;
    public final static byte incrAngleZ = 19;
    public final static byte incrScale = 20;
    public final static byte incrRed = 23;
    public final static byte incrGreen = 24;
    public final static byte incrBlue = 25;
    public final static byte iincrAlpha = 26;
    //Limit vars
    public final static byte limitX = 27;
    public final static byte limitY = 28;
    public final static byte limitZ = 29;
    public final static byte limitAngleX = 30;
    public final static byte limitAngleY = 31;
    public final static byte limitAngleZ = 32;
    public final static byte limitScale = 33;
    public final static byte limitRed = 36;
    public final static byte limitGreen = 37;
    public final static byte limitBlue = 38;
    public final static byte limitAlpha = 39;
    //Bidirectional
    public final static byte bidirectionalX = 40;
    public final static byte bidirectionalY = 41;
    public final static byte bidirectionalZ = 42;
    public final static byte bidirectionalAngleX = 43;
    public final static byte bidirectionalAngleY = 44;
    public final static byte bidirectionalAngleZ = 45;
    public final static byte bidirectionalScale = 46;
    public final static byte bidirectionalColor = 47;
    public final static byte orderRotation = 48;
    //Transitions
    public final static byte xTrans0 = 49;
    public final static byte yTrans0 = 50;
    public final static byte zTrans0 = 51;
    //Shape type
    public final static byte shapeType = 52;
    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////

    //Level vars
    public static String LEVEL_TYPE = "LEVEL_TYPE";
    public static int LEVEL_EDITOR = 1;
    public static int MODEL_EDITOR = 2;
    public static int GAME_PLAY = 3;

    public static int START_MODEL = 100;
    public static int END_MODEL = 101;
    public static List<Integer[]> getTextureList(){
        List<Integer[]> allTextures = new ArrayList<>();
        allTextures.add(new Integer[]{R.drawable.texture1});
        allTextures.add(new Integer[]{R.drawable.texture2});
        allTextures.add(new Integer[]{R.drawable.texture3});
        allTextures.add(new Integer[]{R.drawable.texture4});
        allTextures.add(new Integer[]{R.drawable.texture5});
        allTextures.add(new Integer[]{R.drawable.texture6});
        allTextures.add(new Integer[]{R.drawable.texture7});
        allTextures.add(new Integer[]{R.drawable.texture8});
        allTextures.add(new Integer[]{R.drawable.texture9});
        allTextures.add(new Integer[]{R.drawable.texture10});
        allTextures.add(new Integer[]{R.drawable.texture11});
        allTextures.add(new Integer[]{R.drawable.texture12});
        allTextures.add(new Integer[]{R.drawable.texture13});
        allTextures.add(new Integer[]{R.drawable.moneda_textura});
        allTextures.add(new Integer[]{R.drawable.level2_pared});
        allTextures.add(new Integer[]{R.drawable.level2_piso});
        allTextures.add(new Integer[]{R.drawable.level7_metal_oxidado});
        allTextures.add(new Integer[]{R.drawable.level1_ventilador});
        allTextures.add(new Integer[]{R.drawable.piedra});
        allTextures.add(new Integer[]{R.drawable.level9_agua1,R.drawable.level9_agua2,R.drawable.level9_agua3,R.drawable.level9_agua4,R.drawable.level9_agua5,R.drawable.level9_agua6,R.drawable.level9_agua7,R.drawable.level9_agua8});
        allTextures.add(new Integer[]{R.drawable.bumpy_bricks_public_domain});
        allTextures.add(new Integer[]{R.drawable.level3_piso2});
        allTextures.add(new Integer[]{R.drawable.level7_piso});
        allTextures.add(new Integer[]{R.drawable.level6_platillo_circulo});
        allTextures.add(new Integer[]{R.drawable.level10_dinamita});
        allTextures.add(new Integer[]{R.drawable.esfera});
        allTextures.add(new Integer[]{R.drawable.level1_caja});
        allTextures.add(new Integer[]{R.drawable.level1_cono});
        allTextures.add(new Integer[]{R.drawable.level1_esfera});
        allTextures.add(new Integer[]{R.drawable.level1_pared});
        allTextures.add(new Integer[]{R.drawable.level1_piso});
        allTextures.add(new Integer[]{R.drawable.level2_arbol});
        allTextures.add(new Integer[]{R.drawable.level2_caja});
        allTextures.add(new Integer[]{R.drawable.level2_cono});
        allTextures.add(new Integer[]{R.drawable.level2_esfera});
        allTextures.add(new Integer[]{R.drawable.level2_muneco_cara});
        allTextures.add(new Integer[]{R.drawable.level2_muneco_cuerpo});
        allTextures.add(new Integer[]{R.drawable.level2_piso2});
        allTextures.add(new Integer[]{R.drawable.level2_sombrero});
        allTextures.add(new Integer[]{R.drawable.level3_arbol});
        allTextures.add(new Integer[]{R.drawable.level3_cono});
        allTextures.add(new Integer[]{R.drawable.level3_esfera});
        allTextures.add(new Integer[]{R.drawable.level3_hojas});
        allTextures.add(new Integer[]{R.drawable.level3_pared});
        allTextures.add(new Integer[]{R.drawable.level3_piso});
        allTextures.add(new Integer[]{R.drawable.level3_piso2});
        allTextures.add(new Integer[]{R.drawable.level3_tronco});
        allTextures.add(new Integer[]{R.drawable.level4_caja});
        allTextures.add(new Integer[]{R.drawable.level4_columna});
        allTextures.add(new Integer[]{R.drawable.level4_columns_hor});
        allTextures.add(new Integer[]{R.drawable.level4_cono});
        allTextures.add(new Integer[]{R.drawable.level4_esfera});
        allTextures.add(new Integer[]{R.drawable.level4_pared});
        allTextures.add(new Integer[]{R.drawable.level4_piso});
        allTextures.add(new Integer[]{R.drawable.level5_cono});
        allTextures.add(new Integer[]{R.drawable.level5_cubo});
        allTextures.add(new Integer[]{R.drawable.level5_esfera});
        allTextures.add(new Integer[]{R.drawable.level5_pared});
        allTextures.add(new Integer[]{R.drawable.level5_pincho});
        allTextures.add(new Integer[]{R.drawable.level5_piso});
        allTextures.add(new Integer[]{R.drawable.level6_diamante});
        allTextures.add(new Integer[]{R.drawable.level6_esfera});
        allTextures.add(new Integer[]{R.drawable.level6_laser});
        allTextures.add(new Integer[]{R.drawable.level6_ovni_cabeza});
        allTextures.add(new Integer[]{R.drawable.level6_ovni_cuerpo});
        allTextures.add(new Integer[]{R.drawable.level6_pared});
        allTextures.add(new Integer[]{R.drawable.level6_piso});
        allTextures.add(new Integer[]{R.drawable.level7_aplastadores});
        allTextures.add(new Integer[]{R.drawable.level7_caja_metalica});
        allTextures.add(new Integer[]{R.drawable.level7_esfera});
        allTextures.add(new Integer[]{R.drawable.level7_esfera2});
        allTextures.add(new Integer[]{R.drawable.level7_fosforescente});
        allTextures.add(new Integer[]{R.drawable.level8_auto_senal});
        allTextures.add(new Integer[]{R.drawable.level8_carro});
        allTextures.add(new Integer[]{R.drawable.level8_carro2});
        allTextures.add(new Integer[]{R.drawable.level8_casco});
        allTextures.add(new Integer[]{R.drawable.level8_cono});
        allTextures.add(new Integer[]{R.drawable.level8_contruccion_senal});
        allTextures.add(new Integer[]{R.drawable.level8_edificio});
        allTextures.add(new Integer[]{R.drawable.level8_edificio2});
        allTextures.add(new Integer[]{R.drawable.level8_edificio3});
        allTextures.add(new Integer[]{R.drawable.level8_esfera});
        allTextures.add(new Integer[]{R.drawable.level8_ladrillo});
        allTextures.add(new Integer[]{R.drawable.level8_llanta});
        allTextures.add(new Integer[]{R.drawable.level8_pared});
        allTextures.add(new Integer[]{R.drawable.level8_pasador});
        allTextures.add(new Integer[]{R.drawable.level8_piso});
        allTextures.add(new Integer[]{R.drawable.level8_plano_cono});
        allTextures.add(new Integer[]{R.drawable.level8_puerta});
        allTextures.add(new Integer[]{R.drawable.level9_arena});
        allTextures.add(new Integer[]{R.drawable.level9_balsa});
        allTextures.add(new Integer[]{R.drawable.level9_hierva});
        allTextures.add(new Integer[]{R.drawable.level9_pelota});
        allTextures.add(new Integer[]{R.drawable.level9_pez_cabeza});
        allTextures.add(new Integer[]{R.drawable.level9_pez_cuerpo});
        allTextures.add(new Integer[]{R.drawable.level10_ala_ave});
        allTextures.add(new Integer[]{R.drawable.level10_android});
        allTextures.add(new Integer[]{R.drawable.level10_cabeza});
        allTextures.add(new Integer[]{R.drawable.level10_cometa});
        allTextures.add(new Integer[]{R.drawable.level10_cuerpo_helicoptero});
        allTextures.add(new Integer[]{R.drawable.level10_electricidad1,R.drawable.level10_electricidad2,R.drawable.level10_electricidad3,R.drawable.level10_electricidad4});
        allTextures.add(new Integer[]{R.drawable.level10_fuego1,R.drawable.level10_fuego2,R.drawable.level10_fuego3,R.drawable.level10_fuego4,R.drawable.level10_fuego5,R.drawable.level10_fuego6});
        allTextures.add(new Integer[]{R.drawable.level10_esfera});
        allTextures.add(new Integer[]{R.drawable.level10_helicoptero});
        allTextures.add(new Integer[]{R.drawable.level10_globo});
        return allTextures;
    }

    public static List<Integer[]> getBackgroundsList(){
        List<Integer[]> allBackground = new ArrayList<>();
        allBackground.add(new Integer[]{R.drawable.level1_fondo});
        allBackground.add(new Integer[]{R.drawable.level2_fondo});
        allBackground.add(new Integer[]{R.drawable.level3_fondo});
        allBackground.add(new Integer[]{R.drawable.level7_fondo});
        allBackground.add(new Integer[]{R.drawable.level9_fondo});
        return allBackground;
    }

    public static List<Integer[]> getBallTextures(){
        List<Integer[]> allBackground = new ArrayList<>();
        allBackground.add(new Integer[]{R.drawable.level1_esfera});
        allBackground.add(new Integer[]{R.drawable.level2_esfera});
        allBackground.add(new Integer[]{R.drawable.level3_esfera});
        allBackground.add(new Integer[]{R.drawable.level4_esfera});
        allBackground.add(new Integer[]{R.drawable.level5_esfera});
        allBackground.add(new Integer[]{R.drawable.level6_esfera});
        allBackground.add(new Integer[]{R.drawable.level7_esfera});
        allBackground.add(new Integer[]{R.drawable.level8_esfera});
        allBackground.add(new Integer[]{R.drawable.level10_esfera});
        return allBackground;
    }

    public static List<Integer> getBallCrashSoundList(){
        List<Integer> allBackground = new ArrayList<>();
        allBackground.add(R.raw.cristal);
        allBackground.add(R.raw.nieve);
        allBackground.add(R.raw.agua);
        allBackground.add(R.raw.cristal);
        allBackground.add(R.raw.hielo);
        allBackground.add(R.raw.tierra);
        allBackground.add(R.raw.metal);
        allBackground.add(R.raw.nieve);
        allBackground.add(R.raw.plastico);
        return allBackground;
    }

    public static List<Integer> getBackgroundSoundList(){
        List<Integer> allBackground = new ArrayList<>();
        allBackground.add(R.raw.bosque_musica);
        allBackground.add(R.raw.ceramica_musica);
        allBackground.add(R.raw.city_musica);
        allBackground.add(R.raw.cristal_musica);
        allBackground.add(R.raw.hielo_musica);
        allBackground.add(R.raw.industrial_musica);
        allBackground.add(R.raw.island_musica);
        allBackground.add(R.raw.nieve_musica);
        allBackground.add(R.raw.space_musica);
        allBackground.add(R.raw.sky_music);
        return allBackground;
    }

    public static List<String> getBackgroundSoundListValues(Context context){
        List<String> songsNames = new ArrayList<>();
        List<Integer> background = getBackgroundSoundList();
        for(int backId : background){
            songsNames.add(context.getResources().getResourceEntryName(backId));
        }
        return songsNames;
    }

    public final static String LEVEL_EXTENSION = "crlvl";
    public final static String SHAPE_EXTENSION = "crshp";
    public final static int LOAD_LEVEL_CODE = 0;
    public final static int SAVE_LEVEL_CODE = 1;
    public final static int SHAPE_TYPE_NORMAL = 0;
    public final static int SHAPE_TYPE_DANGEROUS = 1;
    public static String getLevelExternalExportDirectory(Context context){
        return Environment.getExternalStorageDirectory().getAbsolutePath()+ File.separator+context.getResources().getString(R.string.app_name)+"Levels";
    }
    public static String getModelExternalExportDirectory(Context context){
        return Environment.getExternalStorageDirectory().getAbsolutePath()+ File.separator+context.getResources().getString(R.string.app_name)+"Models";
    }
}
