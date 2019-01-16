package com.ball.levels;

import com.ball.activities.R;
import com.ball.shapes.Cone;
import com.ball.shapes.Cube;
import com.ball.shapes.Cylinder;
import com.ball.shapes.Plane;
import com.ball.shapes.Sphere;
import com.ball.shapes.Shape;
import com.ball.shapes.ShapeOpengl;
import com.ball.shapes.Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 02/05/2015.
 */
public class Level10 extends Level{

    private List<ShapeOpengl> shapesNave = new ArrayList<ShapeOpengl>();

    @Override
    protected void crearNivel(){
        String level[][] =
                {
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//1
                        {"",                                    "",                                             "EC+N6 ",                           "",                                         "",                     ""},//2
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//3
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//4
                        {"",                                    "CB+N0 ",                                       "",                                 "",                                         "",                     ""},//5
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//6
                        {"",                                    "",                                             "",                                 "AD+N0 ",                                   "",                     ""},//7
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//8
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//9
                        {"",                                    "GB+N0 ",                                       "",                                 "",                                         "",                     ""},//10
                        {"",                                    "",                                             "MO+N3 ",                           "",                                         "",                     ""},//11
                        {"",                                    "AV+Z0 ",                                       "MO+N4 ",                           "",                                         "AV-Z0 ",               ""},//12
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//13
                        {"",                                    "",                                             "LV+N0 ",                           "",                                         "",                    ""},//14
                        {"",                                    "",                                             "",                                 "AD+N0 ",                                   "",                     ""},//15
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//16
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//17
                        {"",                                    "MO+N3 ",                                       "",                                 "AE+N0 ",                                   "",                     ""},//18
                        {"",                                    "MO+N4 ",                                       "",                                 "",                                         "",                     ""},//19
                        {"",                                    "MO+N3 ",                                       "",                                 "",                                         "",                     "AE+N2 "},//20
                        {"",                                    "",                                             "",                                 "AE+N0 ",                                   "",                     ""},//21
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//22
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//23
                        {"CB+N0 ",                              "CB+N2 ",                                       "HL+N0 ",                           "CB+N5 ",                                   "",                     ""},//24
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//25
                        {"",                                    "",                                             "",                                 "AE+N2 ",                                   "",                     ""},//26
                        {"",                                    "",                                             "LV+N0 LV+N6 ",                     "",                                         "",                     ""},//27
                        {"",                                    "",                                             "",                                 "",                                         "AD+N0 ",               ""},//28
                        {"",                                    "GB+N0 ",                                       "",                                 "GB+N1 ",                                   "",                     ""},//29
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//30
                        {"",                                    "",                                             "MO+N3 ",                           "",                                         "CB+N0 ",               ""},//31
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//32
                        {"",                                    "AD+N0 ",                                       "MO+N5 ",                           "",                                         "",                     "AE+N0 "},//33
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//34
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//35
                        {"CB+N0 ",                              "CB+N4 ",                                       "CB+N1 ",                           "CB+N6 ",                                   "CB+N2 ",               ""},//36
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//37
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//38
                        {"",                                    "",                                             "MO+N6 ",                           "",                                         "",                     ""},//39
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//40
                        {"CB+N1 ",                              "HL+N3 ",                                       "MO+N6 ",                           "",                                         "HL+N1 ",               ""},//41
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//42
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//43
                        {"",                                    "",                                             "LV+N4 LV+N8 ",                     "",                                         "",                     ""},//44
                        {"",                                    "MO+N8 ",                                       "",                                 "",                                         "",                     ""},//45
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//46
                        {"",                                    "MO+N8 ",                                       "",                                 "",                                         "",                     ""},//47
                        {"",                                    "",                                             "LV+N4 LV+N9 ",                    "",                                         "",                     ""},//48
                        {"",                                    "MO+N8 ",                                       "",                                 "",                                         "",                     ""},//49
                        {"",                                    "",                                             "",                                 "",                                         "",                     "AE+N0 "},//50
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//51
                        {"CB+N4 ",                              "CB+N3 CB+N7 ",                                 "CB+N5 ",                           "CB+N6 ",                                   "",                     ""},//52
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//53
                        {"",                                    "",                                             "",                                 "",                                         "AD+N0 ",               ""},//54
                        {"",                                    "AV+Z4 ",                                       "",                                 "AV+Z0 ",                                   "",                     ""},//55
                        {"AV+Z8 ",                              "",                                             "AV+Z2 ",                           "",                                         "AV+Z8 ",               ""},//56
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//57
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//58
                        {"",                                    "CM+N9 ",                                       "",                                 "CM+N7 ",                                   "",                     ""},//59
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//60
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//61
                        {"",                                    "MO+N5 ",                                       "",                                 "",                                         "",                     ""},//62
                        {"",                                    "",                                             "EL+N5 ",                           "",                                         "",                     ""},//63
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//64
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//65
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//66
                        {"",                                    "AV+Z1 ",                                       "MO+N8 ",                           "AV+Z3 ",                                   "",                     ""},//67
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//68
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//69
                        {"",                                    "",                                             "CM+N4 ",                           "",                                         "",                     ""},//70
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//71
                        {"",                                    "",                                             "LV+N4 LV+N9 ",                     "",                                         "",                     ""},//72
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//73
                        {"",                                    "CB+N1 ",                                       "CB+N3 ",                           "CB+N6 ",                                   "CB+N8 ",               ""},//74
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//75
                        {"",                                    "EL+N6 ",                                       "",                                 "EL+N5 ",                                   "",                     ""},//76
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//77
                        {"",                                    "HL+N1 ",                                       "",                                 "",                                         "HL+N3 ",               ""},//78
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//79
                        {"",                                    "",                                             "MO+N6 ",                           "AD+N3 ",                                   "",                     ""},//80
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//81
                        {"",                                    "",                                             "PT+N2 ",                           "",                                         "",                     ""},//82
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//83
                        {"",                                    "CB+N5 ",                                       "",                                 "CB+N2 ",                                   "",                     ""},//84
                        {"",                                    "",                                             "MO+N6 ",                           "",                                         "",                     ""},//85
                        {"",                                    "",                                             "",                                 "",                                         "AV+Z6 ",               ""},//86
                        {"",                                    "",                                             "LV+N4 ",                           "",                                         "",                     ""},//87
                        {"",                                    "EL+N2 ",                                       "",                                 "EL+N4 ",                                   "",                     ""},//88
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//89
                        {"",                                    "",                                             "",                                 "",                                         "AE+N2 ",               ""},//90
                        {"",                                    "",                                             "PT+N4 ",                           "",                                         "",                     "AE+N2 "},//91
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//92
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//93
                        {"",                                    "AD+N3 ",                                       "",                                 "",                                         "",                     ""},//94
                        {"",                                    "",                                             "MO+N8 ",                           "HL+N5 ",                                   "",                     ""},//95
                        {"",                                    "CM+N6 ",                                       "",                                 "",                                         "CM+N8 ",               ""},//96
                        {"",                                    "MO+N8 ",                                       "",                           "",                                         "",                     ""},//97
                        {"",                                    "",                                             "",                                 "",                                         "",                     ""},//98
                        {"",                                    "",                                             "",                                 "",                                         "AE+N0 ",               ""},//99
                        {"CB+N5 ",                              "",                                             "CB+N2 ",                           "CB+N3 ",                                   "",                     ""},//100

                };
        //Mundo
        world.getTextureResources().add(R.drawable.level3_fondo);
        //Constantes
        crashResource = R.raw.cristal;
        musicResource = R.raw.sky_music;
        this.level = level;
    }

    @Override
    protected List<ShapeOpengl> crearObjeto(String figura,float x,float y,float z){
        List<ShapeOpengl> shapes = new ArrayList<>();
        if (figura.equals("AD")){
            shapes.add(crearCabezaAndroid(x, y, z));
            shapes.add(crearCilindroAndroid(x, y - 0.2f, z));
            shapes.add(crearAntenaAndroid(x, y, z + 0.1f, 25));
            shapes.add(crearAntenaAndroid(x, y, z + 0.1f, -25));
            shapes.add(crearCuboBrazoAndroid(x - 0.3f - 0.075f, y - 0.15f, z + 0.1f, 0.3f + 0.075f));
            shapes.add(crearCuboBrazoAndroid(x + 0.3f + 0.075f, y - 0.15f, z + 0.1f, - 0.3f - 0.075f));
            shapes.add(crearCuboPiernaAndroid(x - 0.05f - 0.1f, y - 0.35f - 0.15f, z + 0.1f));
            shapes.add(crearCuboPiernaAndroid(x + 0.05f + 0.1f, y - 0.35f - 0.15f, z + 0.1f));
            shapes.add(crearCuboLaser(x-0.3f-0.075f,y - 0.15f,z+0.3f));
            shapes.add(crearCuboLaser(x+0.3f+0.075f,y - 0.15f,z+0.3f));
            shapes.get(shapes.size()-5).setLaserShape(shapes.get(shapes.size()-1));
            shapes.get(shapes.size()-6).setLaserShape(shapes.get(shapes.size()-2));
            shapes.add(crearPlanoFuego2(x - 0.05f - 0.1f, y-0.35f-0.15f-0.1f, z));
            shapes.add(crearPlanoFuego2(x + 0.05f + 0.1f, y-0.35f-0.15f-0.1f, z));
        }
        if (figura.equals("AE")){
            shapes.add(crearAlaAve(x, y, z, 1f));
            shapes.add(crearAlaAve(x, y, z, -1f));
            shapes.add(crearTroncoAve(x+0.05f, y-0.4f, z));
            shapes.add(crearEsferaCaraAve(x-0.3f, y-0.4f, z));
            shapes.add(crearPicoAve(x-0.3f, y-0.4f, z));
        }
        if (figura.equals("AV")){
            shapes.add(crearCilindroAvion(x, y, z));
            shapes.add(crearConoAvion(x, y, z+0.3f));
            shapes.add(crearAletaAvion(x, y, z, 270));
            shapes.add(crearAletaAvion(x, y, z, 90));
            shapes.add(crearAletaAvion(x, y, z, 180));
            shapes.add(crearAletaAvion(x, y, z, 0));
        }
        if (figura.equals("CB")){
            shapes.add(crearCubo(x, y, z));
        }
        if (figura.equals("CM")){
            shapes.add(crearPlano(x, y, z));
            shapes.add(crearPlanoCuerda(x, y-1.2f, z-0.01f));
        }
        if (figura.equals("EC")){
            crearEsferaCristalina(x,y,z);

            shapesNave = new ArrayList<ShapeOpengl>();
            shapesNave.add(crearPlanoFuego(x, y-radioEsfera, z));
            shapesNave.add(crearTrianguloMetal(x, y-radioEsfera, z));
            shapesNave.add(crearTrianguloMetal2(x+0.1f,y-0.01f-radioEsfera,z,0));
            shapesNave.add(crearTrianguloMetal2(x-0.1f,y-0.01f-radioEsfera,z,180));
            shapes.addAll(shapesNave);
        }
        if (figura.equals("EL")){
            shapes.add(crearPlanoElectricidad(x, y, z,0.03f));
            shapes.add(crearPlanoElectricidad(x+1f, y, z, 0f));
            shapes.add(crearPlanoElectricidad(x-1f, y, z, 0f));
            shapes.add(crearCilindroLasers(x, y+1.5f, z));
            shapes.add(crearCilindroLasers(x, y-1.5f, z));
        }
        if (figura.equals("GB")){
            shapes.add(crearEsferaGlobo(x, y, z));
            shapes.add(crearCilindroDinamita(x, y-0.7f-0.4f, z));
            shapes.add(crearHiloGlobo(x, y-0.7f, z));
            shapes.add(crearFuegoDinamita(x-0.3f-0.07f, y-0.7f-0.4f, z));
        }
        if (figura.equals("HL")){
            shapes.add(crearEsferaHelicoptero(x, y, z));
            shapes.add(crearCuboHelice(x, y + radioEsfera * 4, z, 0));
            shapes.add(crearCuboHelice(x, y+radioEsfera*4, z, 90));
            shapes.add(crearCuboVerticalHelice(x, y+(float)(radioEsfera*3f), z));
            shapes.add(crearCiindroHelicoptero(x+0.3f, y, z));
            shapes.add(crearCilindroHelicoptero2(x+1f, y+0.15f, z));
            shapes.add(crearConoHelicoptero(x + 0.45f, y, z));
            shapes.add(crearConoColaHelicoptero(x + 1.3f, y + 0.15f, z, 0));
            shapes.add(crearConoColaHelicoptero(x+1.3f, y+0.15f, z, 120));
            shapes.add(crearConoColaHelicoptero(x+1.3f, y+0.15f, z, 240));
        }
        if (figura.equals("LV")){
            shapes.add(crearPlanoLaser(x, y, z));
            shapes.add(crearPlanoLaser(x, y-0.5f, z));
        }
        if (figura.equals("MO")){
            shapes.add(crearMoneda(x, y, z));
        }
        if (figura.equals("PT")){
            shapes.add(crearEsferaPlatillo(x, y, z));
            shapes.add(crearCilindroPlatillo(x, y, z));
        }
        continueShapeCreation(shapes,figura,x,y,z);
        return shapes;
    }
    private void crearEsferaCristalina(float cx,float cy,float cz){
        sphere = new Sphere(cx,cy+radioEsfera*5,cz,12,24,radioEsfera);
        sphere.getTextureResources().add(R.drawable.level10_esfera);
    }

    private Plane crearPlanoHorizontal(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level9_agua1);
        plane.setRGBA(1f, 1f, 1f, 0.4f);
        plane.createMirroredTextureCoordinates(lengthPlano);
        return plane;
    }

    private Cube crearCubo(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,0.2f,0.15f,0.2f);
        cube.getTextureResources().add(R.drawable.level8_piso);
        cube.setRGBA(1f, 1f, 1f, 1f);
        cube.setSolid(true);
        return cube;
    }

    //////////////////////////////////////////Nave//////////////////////////////////////////////////

    private Plane crearPlanoFuego(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,0.12f,0.12f,0);
        plane.getTextureResources().add(R.drawable.level10_fuego1);
        plane.getTextureResources().add(R.drawable.level10_fuego2);
        plane.getTextureResources().add(R.drawable.level10_fuego3);
        plane.getTextureResources().add(R.drawable.level10_fuego4);
        plane.getTextureResources().add(R.drawable.level10_fuego5);
        plane.getTextureResources().add(R.drawable.level10_fuego6);
        plane.getAnimator().setZ(0.1f);
        plane.getAnimator().setMaxZ(0.1F);
        plane.getAnimator().setY(-0.12f);
        plane.getAnimator().setMinY(-0.12f);
        return plane;
    }

    private Triangle crearTrianguloMetal(float cx, float cy, float cz){
        Triangle triangle = new Triangle(cx,cy,cz,0.25f,0,0.25f);
        triangle.getTextureResources().add(R.drawable.level7_aplastadores);
        triangle.getAnimator().setAngleY(-90);
        triangle.getAnimator().setMinAngleY(-90);
        return triangle;
    }

    private Triangle crearTrianguloMetal2(float cx, float cy, float cz, float angulo){
        Triangle triangle = new Triangle(cx,cy,cz,0.15f,0,0.2f);
        triangle.getTextureResources().add(R.drawable.level7_aplastadores);
        triangle.getAnimator().setAngleY(angulo);
        return triangle;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////Android//////////////////////////////////////////////////

    private Sphere crearCabezaAndroid(float cx, float cy, float cz){
        Sphere sphere = new Sphere(cx,cy,cz,8,16,0.3f);
        sphere.getTextureResources().add(R.drawable.level10_android_cabeza);
        sphere.getAnimator().setAngleY(20);
        sphere.setSolid(true);
        return sphere;
    }

    private Cylinder crearCilindroAndroid(float cx, float cy, float cz){
        Cylinder cylinderAndroid = new Cylinder(cx,cy,cz,0.31f,0.25f,12);
        cylinderAndroid.getTextureResources().add(R.drawable.level10_android);
        cylinderAndroid.setSolid(true);
        return cylinderAndroid;
    }

    private Plane crearAntenaAndroid(float cx, float cy, float cz, float angulo){
        Plane plane = new Plane(cx,cy,cz,0.02f,0.4f,0);
        plane.getTextureResources().add(R.drawable.level10_android_cabeza);
        plane.getAnimator().setAngleZ(angulo);
        plane.setSolid(true);
        return plane;
    }

    private Cylinder crearCuboBrazoAndroid(float cx, float cy, float cz, float cRX){
        Cylinder cylinderBrazo = new Cylinder(cx,cy,cz,0.1f,0.2f,12);
        cylinderBrazo.getTextureResources().add(R.drawable.level10_android);
        cylinderBrazo.setcRY(0.1f);
        cylinderBrazo.setSolid(true);
        cylinderBrazo.getAnimator().setMinAngleX(-90);
        cylinderBrazo.getAnimator().setMaxAngleX(0);
        cylinderBrazo.getAnimator().setIncrAngleX(-1);
        return cylinderBrazo;
    }

    private Cylinder crearCuboPiernaAndroid(float cx, float cy, float cz){
        Cylinder cylinderBrazo = new Cylinder(cx,cy,cz,0.12f,0.2f,12);
        cylinderBrazo.getTextureResources().add(R.drawable.level10_android);
        cylinderBrazo.setSolid(true);
        return cylinderBrazo;
    }

    private Cube crearCuboLaser(float cx, float cy, float cz){
        Cube cubeLaser = new Cube(cx,cy,cz,0.02f,0.02f,0.05f);
        cubeLaser.getTextureResources().add(R.drawable.cristal_laser);
        cubeLaser.setSolid(true);
        cubeLaser.setVz(0.05f);
        cubeLaser.setAgrupable(false);
        return cubeLaser;
    }

    private Plane crearPlanoFuego2(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,0.1f,0.1f,0);
        plane.getTextureResources().add(R.drawable.level10_fuego2);
        plane.getTextureResources().add(R.drawable.level10_fuego3);
        plane.getTextureResources().add(R.drawable.level10_fuego4);
        plane.getTextureResources().add(R.drawable.level10_fuego5);
        plane.getTextureResources().add(R.drawable.level10_fuego6);
        plane.getTextureResources().add(R.drawable.level10_fuego1);
        plane.getAnimator().setZ(0.1f);
        plane.getAnimator().setMaxZ(0.1F);
        plane.getAnimator().setY(-0.2f);
        plane.getAnimator().setMinY(-0.2f);
        plane.setSolid(true);
        return plane;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////Globo dinamita/////////////////////////////////////////////

    private Sphere crearEsferaGlobo(float cx, float cy, float cz){
        Sphere sphere = new Sphere(cx,cy,cz,6,6,0.4f);
        sphere.getTextureResources().add(R.drawable.level10_globo);
        sphere.setSolid(true);
        sphere.getAnimator().setMaxY(0.5f);
        sphere.getAnimator().setMinY(-0.5f);
        sphere.getAnimator().setIncrY(0.005f);
        return sphere;
    }

    private Cylinder crearCilindroDinamita(float cx, float cy, float cz){
        Cylinder cylinderDinamita = new Cylinder(cx,cy,cz,0.1f,0.3f,8);
        cylinderDinamita.getTextureResources().add(R.drawable.level10_dinamita);
        cylinderDinamita.getAnimator().setAngleZ(90);
        cylinderDinamita.setSolid(true);
        cylinderDinamita.getAnimator().setMaxY(0.5f);
        cylinderDinamita.getAnimator().setMinY(-0.5f);
        cylinderDinamita.getAnimator().setIncrY(0.005f);
        return cylinderDinamita;
    }

    private Plane crearHiloGlobo(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,0.02f,0.4f,0);
        plane.getTextureResources().add(R.drawable.level10_hilo);
        plane.setSolid(true);
        plane.getAnimator().setMaxY(0.5f);
        plane.getAnimator().setMinY(-0.5f);
        plane.getAnimator().setIncrY(0.005f);
        return plane;
    }

    private Plane crearFuegoDinamita(float cx, float cy, float cz){
        Plane planeFuego = new Plane(cx,cy,cz,0.05f,0.1f,0);
        planeFuego.getTextureResources().add(R.drawable.level10_fuego2);
        planeFuego.getTextureResources().add(R.drawable.level10_fuego3);
        planeFuego.getTextureResources().add(R.drawable.level10_fuego4);
        planeFuego.getTextureResources().add(R.drawable.level10_fuego5);
        planeFuego.getTextureResources().add(R.drawable.level10_fuego6);
        planeFuego.getTextureResources().add(R.drawable.level10_fuego1);
        planeFuego.getAnimator().setAngleZ(-90);
        planeFuego.getAnimator().setMinAngleZ(-90);
        planeFuego.setSolid(true);
        planeFuego.getAnimator().setMaxY(0.5f);
        planeFuego.getAnimator().setMinY(-0.5f);
        planeFuego.getAnimator().setIncrY(0.005f);
        return planeFuego;
    }

    ///////////////////////////////////////////Avion////////////////////////////////////////////////

    private Cylinder crearCilindroAvion(float cx, float cy, float cz){
        Cylinder cylinder = new Cylinder(cx,cy,cz,0.4f,0.3f,6);
        cylinder.getTextureResources().add(R.drawable.level7_caja_metalica);
        cylinder.getAnimator().setAngleX(90);
        cylinder.setSolid(true);
        return cylinder;
    }

    private Cone crearConoAvion(float cx, float cy, float cz){
        Cone coneAvion = new Cone(cx,cy,cz,6,0.4f,0.3f);
        coneAvion.getTextureResources().add(R.drawable.level7_caja_metalica);
        coneAvion.getAnimator().setAngleX(90);
        coneAvion.setSolid(true);
        return coneAvion;
    }

    private Cone crearAletaAvion(float cx, float cy, float cz, float anguloZ){
        Cone aletaAvion = new Cone(cx,cy,cz,6,0.3f,1.2f);
        aletaAvion.getTextureResources().add(R.drawable.level7_caja_metalica);
        aletaAvion.getAnimator().setAngleZ(anguloZ);
        aletaAvion.setSolid(true);
        aletaAvion.getAnimator().setBidirectionalAngleZ(false);
        return aletaAvion;
    }

    /////////////////////////////////////Lasers verticales//////////////////////////////////////////

    private Plane crearPlanoLaser(float cx, float cy, float cz){
        Plane planeLaser = new Plane(cx,cy,cz,lengthPlano*15,0.02f,0);

        planeLaser.getTextureResources().add(R.drawable.level10_lase1);
        planeLaser.getTextureResources().add(R.drawable.level10_lase2);
        planeLaser.getTextureResources().add(R.drawable.level10_lase3);
        planeLaser.getTextureResources().add(R.drawable.level10_lase4);

        planeLaser.getAnimator().setMaxY(0.5f);
        planeLaser.getAnimator().setMinY(-0.5f);
        planeLaser.getAnimator().setIncrY(0.008f);
        planeLaser.setSolid(true);
        return planeLaser;
    }

    private Cube crearCuboLaser2(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,0.025f,lengthPlano*10,0.1f);
        cube.getTextureResources().add(R.drawable.level8_pared);
        cube.setSolid(true);
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////Ave//////////////////////////////////////////

    private Triangle crearAlaAve(float cx, float cy, float cz, float signo){
        Triangle triangle = new Triangle(cx,cy,cz,0.4f,0.4f,0f);
        triangle.getTextureResources().add(R.drawable.level10_ala_ave);
        triangle.setSolid(true);
        triangle.setcRY(-0.4f);
        if (signo > 0){
            triangle.getAnimator().setMaxAngleX(80);
            triangle.getAnimator().setMinAngleX(25);
            triangle.getAnimator().setAngleX(25);
            triangle.getAnimator().setIncrAngleX(1);
        }
        else{
            triangle.getAnimator().setMaxAngleX(-25);
            triangle.getAnimator().setMinAngleX(-80);
            triangle.getAnimator().setAngleX(-25);
            triangle.getAnimator().setIncrAngleX(-1);
        }
        triangle.getAnimator().setMinX(-5);
        triangle.getAnimator().setMaxX(5);
        triangle.getAnimator().setIncrX(-0.015f);
        triangle.getAnimator().setBidirectionalX(false);
        return triangle;
    }

    private Cylinder crearTroncoAve(float cx, float cy, float cz){
        Cylinder cylinder = new Cylinder(cx,cy,cz,0.2f,0.25f,6);
        cylinder.getTextureResources().add(R.drawable.level10_ala_ave);
        cylinder.getAnimator().setAngleZ(90);

        cylinder.getAnimator().setMinX(-5);
        cylinder.getAnimator().setMaxX(5);
        cylinder.getAnimator().setIncrX(-0.015f);
        cylinder.getAnimator().setBidirectionalX(false);
        return cylinder;
    }

    private Sphere crearEsferaCaraAve(float cx, float cy, float cz){
        Sphere sphere = new Sphere(cx,cy,cz,6,6,0.2f);
        sphere.getTextureResources().add(R.drawable.level10_cabeza);
        sphere.setSolid(true);
        sphere.getAnimator().setMinX(-5);
        sphere.getAnimator().setMaxX(5);
        sphere.getAnimator().setIncrX(-0.015f);
        sphere.getAnimator().setBidirectionalX(false);
        return sphere;
    }

    private Cone crearPicoAve(float cx, float cy, float cz){
        Cone coneAve = new Cone(cx,cy,cz,6,0.15f,0.3f);
        coneAve.getTextureResources().add(R.drawable.level10_pico);
        coneAve.getAnimator().setAngleZ(90);
        coneAve.setSolid(true);
        coneAve.getAnimator().setMinX(-5);
        coneAve.getAnimator().setMaxX(5);
        coneAve.getAnimator().setIncrX(-0.015f);
        coneAve.getAnimator().setBidirectionalX(false);
        return coneAve;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////Helicoptero//////////////////////////////////////////////////

    private Sphere crearEsferaHelicoptero(float cx, float cy, float cz){
        Sphere sphere = new Sphere(cx,cy,cz,6,6,radioEsfera*3);
        sphere.getTextureResources().add(R.drawable.level10_helicoptero);
        sphere.setSolid(true);

        sphere.getAnimator().setMaxY(0.8f);
        sphere.getAnimator().setMinY(-0.8f);
        sphere.getAnimator().setIncrY(0.02f);
        return sphere;
    }

    private Cylinder crearCiindroHelicoptero(float cx, float cy, float cz){
        Cylinder cylinder = new Cylinder(cx,cy,cz,0.3f,0.3f,6);
        cylinder.getTextureResources().add(R.drawable.level10_cuerpo_helicoptero);
        cylinder.getAnimator().setAngleZ(-90);
        cylinder.getAnimator().setMinAngleZ(-90);
        cylinder.setSolid(true);

        cylinder.getAnimator().setMaxY(0.8f);
        cylinder.getAnimator().setMinY(-0.8f);
        cylinder.getAnimator().setIncrY(0.02f);
        return cylinder;
    }

    private Cylinder crearCilindroHelicoptero2(float cx, float cy, float cz){
        Cylinder cylinder = new Cylinder(cx,cy,cz,0.15f,0.4f,6);
        cylinder.getTextureResources().add(R.drawable.level10_cuerpo_helicoptero);
        cylinder.getAnimator().setAngleZ(-90);
        cylinder.getAnimator().setMinAngleZ(-90);
        cylinder.setSolid(true);

        cylinder.getAnimator().setMaxY(0.8f);
        cylinder.getAnimator().setMinY(-0.8f);
        cylinder.getAnimator().setIncrY(0.02f);
        return cylinder;
    }

    private Cube crearCuboHelice(float cx, float cy, float cz, float anguloY){
        Cube cube = new Cube(cx,cy,cz,1f,0.02f,0.1f);
        cube.getTextureResources().add(R.drawable.level3_cono);
        cube.getAnimator().setIncrAngleY(0.1f);
        cube.getAnimator().setAngleY(anguloY);
        cube.getAnimator().setIncrAngleY(1f);
        cube.getAnimator().setBidirectionalAngleY(false);
        cube.setSolid(true);

        cube.getAnimator().setMaxY(0.8f);
        cube.getAnimator().setMinY(-0.8f);
        cube.getAnimator().setIncrY(0.02f);
        return cube;
    }

    private Cube crearCuboVerticalHelice(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,0.04f,0.2f,0.04f);
        cube.getTextureResources().add(R.drawable.level3_cono);
        cube.setSolid(true);

        cube.getAnimator().setMaxY(0.8f);
        cube.getAnimator().setMinY(-0.8f);
        cube.getAnimator().setIncrY(0.02f);
        return cube;
    }

    private Cone crearConoHelicoptero(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,6,0.3f,0.8f);
        cone.getTextureResources().add(R.drawable.level10_cuerpo_helicoptero);
        double angulo = Math.toDegrees(Math.atan2(0.8f, 0.3f));
        cone.getAnimator().setAngleZ(-angulo);
        cone.getAnimator().setMinAngleZ(-angulo);
        cone.getAnimator().setAngleY(360f/5f);
        cone.setSolid(true);

        cone.getAnimator().setMaxY(0.8f);
        cone.getAnimator().setMinY(-0.8f);
        cone.getAnimator().setIncrY(0.02f);
        return cone;
    }

    private Cone crearConoColaHelicoptero(float cx, float cy, float cz, float anuloX){
        Cone cone = new Cone(cx,cy,cz,6,0.1f,0.5f);
        cone.getTextureResources().add(R.drawable.level10_cuerpo_helicoptero);
        cone.setSolid(true);
        cone.getAnimator().setAngleX(anuloX);
        cone.getAnimator().setBidirectionalAngleX(false);
        cone.getAnimator().setIncrAngleX(2f);

        cone.getAnimator().setMaxY(0.8f);
        cone.getAnimator().setMinY(-0.8f);
        cone.getAnimator().setIncrY(0.02f);
        return cone;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////Cometa/////////////////////////////////////////////////

    private Plane crearPlano(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,0.5f,0.5f,0);
        plane.getTextureResources().add(R.drawable.level10_cometa);
        plane.setSolid(true);
        plane.getAnimator().setAngleZ(45);

        plane.getAnimator().setMaxY(0.5f);
        plane.getAnimator().setMinY(-0.5f);
        plane.getAnimator().setIncrY(0.01f);

        plane.getAnimator().setMaxZ(0.5f);
        plane.getAnimator().setMinZ(-0.5f);
        plane.getAnimator().setIncrZ(0.002f);
        return plane;
    }

    private Plane crearPlanoCuerda(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,0.02f,1.8f,0);
        plane.getTextureResources().add(R.drawable.level7_caja_metalica);
        plane.setSolid(true);

        plane.getAnimator().setMaxY(0.5f);
        plane.getAnimator().setMinY(-0.5f);
        plane.getAnimator().setIncrY(0.01f);

        plane.getAnimator().setMaxZ(0.5f);
        plane.getAnimator().setMinZ(-0.5f);
        plane.getAnimator().setIncrZ(0.002f);
        return plane;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////Electricidad///////////////////////////////////////////////////

    private Plane crearPlanoElectricidad(float cx, float cy, float cz, float incrX){
        Plane plane = new Plane(cx,cy,cz,1.5f,0.02f,0);
        plane.getTextureResources().add(R.drawable.level10_electricidad1);
        plane.getTextureResources().add(R.drawable.level10_electricidad2);
        plane.getTextureResources().add(R.drawable.level10_electricidad3);
        plane.getTextureResources().add(R.drawable.level10_electricidad4);
        plane.getAnimator().setAngleZ(90);

        plane.getAnimator().setMaxX(0.5f);
        plane.getAnimator().setMinX(-0.5f);
        plane.getAnimator().setIncrX(incrX);
        plane.setSolid(true);
        return plane;
    }

    private Cylinder crearCilindroLasers(float cx, float cy, float cz){
        Cylinder cil = new Cylinder(cx,cy,cz,0.3f,1.5f,8);
        cil.getTextureResources().add(R.drawable.level7_caja_metalica);
        cil.getAnimator().setAngleZ(90);
        cil.setSolid(true);
        return cil;
    }

    ////////////////////////////////////Platillo volador////////////////////////////////////////////

    private Sphere crearEsferaPlatillo(float cx, float cy, float cz){
        Sphere spherePlatillo = new Sphere(cx,cy+0.4f+radioEsfera*1.5f,cz,6,8,radioEsfera*1.5f);
        spherePlatillo.getTextureResources().add(R.drawable.level6_platillo_circulo);
        spherePlatillo.getAnimator().setIncrAngleY(1);
        spherePlatillo.getAnimator().setBidirectionalAngleY(false);
        //y
        spherePlatillo.getAnimator().setMaxY(0.4);
        spherePlatillo.getAnimator().setMinY(-0.4);
        spherePlatillo.getAnimator().setIncrY(0.01);
        //Z
        spherePlatillo.getAnimator().setMaxZ(0.5);
        spherePlatillo.getAnimator().setMinZ(-0.5);
        spherePlatillo.getAnimator().setIncrZ(0.01);
        spherePlatillo.setSolid(true);
        return spherePlatillo;
    }

    private Cylinder crearCilindroPlatillo(float cx, float cy, float cz){
        Cylinder cylinderPlatillo = new Cylinder(cx,cy+0.4f+radioEsfera*1.5f,cz,0.8f,0.03f,8);
        cylinderPlatillo.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cylinderPlatillo.getAnimator().setIncrAngleY(1);
        cylinderPlatillo.getAnimator().setBidirectionalAngleY(false);
        //y
        cylinderPlatillo.getAnimator().setMaxY(0.4);
        cylinderPlatillo.getAnimator().setMinY(-0.4);
        cylinderPlatillo.getAnimator().setIncrY(0.01);
        //Z
        cylinderPlatillo.getAnimator().setMaxZ(0.5);
        cylinderPlatillo.getAnimator().setMinZ(-0.5);
        cylinderPlatillo.getAnimator().setIncrZ(0.01);
        cylinderPlatillo.setSolid(true);
        return cylinderPlatillo;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void onUpdateDrawingData(){
        sphere.setVz(-0.04f);
        if ((sphere.getCx() < -lengthPlano*4)){
            sphere.setCx(-lengthPlano*4);
        }
        if ((sphere.getCx() > lengthPlano*4)){
            sphere.setCx(lengthPlano*4);
        }
        for(ShapeOpengl shapeActual : shapes){
            if (shapeActual.getTextureResources().size() > 0){
                if ((shapeActual.getTextureResources().get(0).intValue() == R.drawable.level7_aplastadores)||(shapeActual.getTextureResources().get(0).intValue() == R.drawable.level10_fuego1)){
                    shapeActual.setCx(sphere.getCx());
                    shapeActual.setCz(sphere.getCz());
                    if ((shapeActual.getCy() < -lengthPlano)){
                        shapeActual.setCy(-lengthPlano);
                    }
                    if ((shapeActual.getCy() > lengthPlano*4)){
                        shapeActual.setCy(lengthPlano*4);
                    }

                }
                if (shapeActual.getLaserShape() != null){
                    if (shapeActual.getAnimator().getAngleX() == -90){
                        Shape shapeLaser = shapeActual.getLaserShape();
                        if (sphere.getCz() < shapeLaser.getCz()){
                            shapeLaser.setCz(shapeActual.getCz()+0.3f);
                            shapeLaser.setCx(shapeActual.getCx());
                            shapeLaser.setCy(shapeActual.getCy());
                            float relacionXZ = (float)(shapeLaser.getCx()- sphere.getCx())/(float)(shapeLaser.getCz()- sphere.getCz());
                            float relacionYZ = (float)(shapeLaser.getCy()- sphere.getCy())/(float)(shapeLaser.getCz()- sphere.getCz());
                            shapeLaser.setVx(relacionXZ*shapeLaser.getVz());
                            shapeLaser.setVy(relacionYZ*shapeLaser.getVz());
                        }
                    }
                }
            }
        }
        if (yMoveAnt > 0){
            if (y-yMoveAnt < 0){
                changeShapeY(0.015f);
            }
            if (y-yMoveAnt > 0){
                changeShapeY(-0.015f);
            }
            y = -1;
            yMoveAnt = -1;
        }
    }

    private float y = -1;
    private float yMoveAnt = -1;

    @Override
    public void onTouchMoved(float y,float yMoveAnt){
        this.y = y;
        this.yMoveAnt = yMoveAnt;
    }

    private void changeShapeY(float vy){
        float cy = -1;
        for(ShapeOpengl shapeActual : shapes){
            if (shapeActual.getTextureResources().size() > 0){
                if ((shapeActual.getTextureResources().get(0).intValue() == R.drawable.level7_aplastadores)||(shapeActual.getTextureResources().get(0).intValue() == R.drawable.level10_fuego1)){
                    if (cy == -1){
                        cy = shapeActual.getCy()+vy;
                    }
                    shapeActual.setCy(cy);
                }
            }
        }
    }
}
