package com.ball.levels;

import com.ball.activities.R;
import com.ball.shapes.Cone;
import com.ball.shapes.Cube;
import com.ball.shapes.Cylinder;
import com.ball.shapes.Plane;
import com.ball.shapes.Sphere;
import com.ball.shapes.ShapeOpengl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 22/03/2015.
 */
public class Level6 extends Level {

    @Override
    protected void crearNivel(){
        String level[][] =
                {{"PI+N0 ",         "PH+N0 PA+N0 ",         "PH+N0 PA+N0 ",         "PH+N0 PA+N0 ",     "PH+N0 PA+N0 ",     "PD+N0 "},//1
                 {"PI+N0 MI+N1 ",   "PH+N0 ",               "PH+N0 ",               "PH+N0 ",           "PH+N0 ",           "PD+N0 "},//2
                 {"PI+N0 ",         "PH+N0 ",               "PH+N0 EC+N6 ",         "PH+N0 ",           "PH+N0 ",           "PD+N0 MD+N1 "},//3
                 {"PI+N0 MI+N1 ",   "PH+N0 ",               "PH+N0 ",               "PH+N0 MN+N0 ",     "PH+N0 ",           "PD+N0 MD+N1 "},//4
                 {"PI+N0 MI+N1 ",   "PH+N0 ",               "PH+N0 MO+N1 ",         "PH+N0 ",           "PH+N0 ",           "PD+N0 "},//5
                 {"PI+N0 MI+N1 ",   "PH+N0 M2+N0 ",         "PH+N0 PT+N0 ",         "PH+N0 ",           "PH+N0 CB+N0 ",     "PD+N0 "},//6
                 {"PI+N0 ",         "PH+N0 AT+N0 ",         "PH+N0 "      ,         "PH+N0 CB+N0 ",     "PH+N0 MN+N0 ",     "PD+N0 MD+N1 "},//7
                 {"PI+N0 MI+N1 ",   "PH+N0 ",               "PH+N0 PL+N0 ",         "PH+N0 ",           "PH+N0 PT+N0 ",     "PD+N0 MD+N1 "},//8
                 {"PI+N0 MI+N1 ",   "PH+N0 ",               "PH+N0 ",               "PH+N0 AT+Y0 ",     "PH+N0 PL+N0 ",     "PD+N0 MD+N1 "},//9
                 {"",               "",                     "",                     "",                 "",                 ""},//10
                 {"",               "",                     "",                     "",                 "",                 ""},//11
                 {"",               "",                     "",                     "",                 "",                 ""},//12
                 {"",               "PI+N2 ",               "PH+N2 PA+N1 ",         "PH+N2 PA+N1 ",     "PD+N2 MD+N3 ",     ""},//13
                 {"",               "PI+N2 MI+N3 ",         "PH+N2 ",               "PH+N2 ",           "PD+N2 ",           ""},//14
                 {"",               "PI+N2 MI+N3 ",         "PH+N2 MO+N3 ",         "PH+N2 OV+N2 ",     "PD+N2 MD+N3 ",     ""},//15
                 {"",               "PI+N2 ",               "PH+N2 ",               "PH+N2 ",           "PD+N2 MD+N3 ",     ""},//16
                 {"",               "PI+N2 MI+N3 ",         "PH+N2 EM+N2 ",         "PH+N2 EM+N2 ",     "PD+N2 ",           ""},//17
                 {"",               "PI+N2 MI+N3 ",         "PH+N2 ",               "PH+N2 AT+Y2 ",     "PD+N2 MD+N3 ",     ""},//18
                 {"",               "PI+N2 ",               "PH+N2 ",               "PH+N2 ",           "PD+N2 MD+N3 ",     ""},//19
                 {"",               "PI+N2 MI+N3 ",         "PH+N2 MN+N2 ",         "PH+N2 MO+N3 ",     "PD+N2 MD+N3 ",     ""},//20
                 {"",               "",                     "",                     "",                 "",                 ""},//21
                 {"PI+N0 MI+N1 ",   "PH+N0 ",               "PH+N0 ",               "PH+N0 ",           "PH+N0 ",           "PD+N0 MD+N1 "},//22
                 {"PI+N0 MI+N1 ",   "PH+N0 ",               "PH+N0 ",               "PH+N0 P2+N0 ",     "PH+N0 ",           "PD+N0 MD+N1 "},//23
                 {"PI+N0 ",         "PH+N0 M2+N0 ",         "PH+N0 ",               "PH+N0 AT+Y0 ",     "PH+N0 ",           "PD+N0 MD+N1 "},//24
                 {"PI+N0 MI+N1 ",   "PH+N0 ",               "PH+N0 EM+N0 ",         "PH+N0 ",           "PH+N0 MN+N0 ",     "PD+N0 "},//25
                 {"PI+N0 MI+N1 ",   "PH+N0 EM+N0 ",         "PH+N0 MN+N0 ",         "PH+N0 MO+N1 ",     "PH+N0 P2+N0 ",     "PD+N0 MD+N1 "},//26
                 {"PI+N0 ",         "PH+N0 ",               "PH+N0 ",               "PH+N0 ",           "PH+N0 ",           "PD+N0 "},//27
                 {"PI+N0 ",         "PH+N0 DV+N0 ",         "PH+N0 ",               "PH+N0 AT+Y0 ",     "PH+N0 ",           "PD+N0 "},//28
                 {"PI+N0 MI+N1 ",   "PH+N0 DV+N0 ",         "PH+N0 MO+N1 ",         "PH+N0 ",           "PH+N0 M2+N0 ",     "PD+N0 "},//29
                 {"PI+N0 MI+N1 ",   "PH+N0 DV+N0 ",         "PH+N0 MN+N0 ",         "PH+N0 ",           "PH+N0 ",           "PD+N0 "},//30
                 {"PA+N0 ",         "PI+N0 ",               "PH+N0 ",               "PH+N0 ",           "PH+N0 ",           "PD+N0 "},//31
                 {"",               "PI+N0 ",               "PH+N0 ",               "PH+N0 AT+Y0 ",     "PH+N0 M2+N0 ",     "PD+N0 MD+N1 "},//32
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PH+N0 ",           "PH+N0 ",           "PD+N0 MD+N1 "},//33
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 MN+N0 ",         "PH+N0 MO+N1 ",     "PH+N0 ",           "PD+N0 MD+N1 "},//34
                 {"",               "PI+N0 ",               "PH+N0 ",               "PH+N0 ",           "PH+N0 OV+N0 ",     "PD+N0 "},//35
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PH+N0 PT+N0 ",     "PH+N0 ",           "PD+N0 MD+N1 "},//36
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PH+N0 PL+N0 ",     "PH+N0 EM+N0 ",     "PD+N0 MD+N1 "},//37
                 {"",               "PI+N0 ",               "PH+N0 EM+N0 ",         "PH+N0 ",           "PH+N0 ",           "PD+N0 "},//38
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PH+N0 P2+N0 ",     "PH+N0 MN+N0 ",     "PD+N0 MD+N1 "},//39
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PH+N0 ",           "PH+N0 ",           "PD+N0 MD+N1 "},//40
                 {"",               "",                     "",                     "",                 "",                 ""},//41
                 {"",               "",                     "",                     "",                 "",                 ""},//42
                 {"",               "",                     "PC+N1 MO+N2 ",         "",                 "",                 ""},//43
                 {"",               "",                     "",                     "",                 "",                 ""},//44
                 {"",               "",                     "",                     "",                 "",                 ""},//45
                 {"",               "",                     "",                     "",                 "",                 ""},//46
                 {"",               "",                     "",                     "",                 "PC+N3 ",           ""},//47
                 {"",               "",                     "",                     "",                 "",                 ""},//48
                 {"",               "",                     "",                     "",                 "",                 ""},//49
                 {"",               "PC+N6 ",               "",                     "",                 "",                 ""},//50
                 {"",               "PC+N6 ",               "",                     "",                 "",                 ""},//51
                 {"",               "",                     "",                     "",                 "",                 ""},//52
                 {"",               "",                     "",                     "",                 "",                 ""},//53
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PH+N0 ",           "PD+N0 MD+N1 ",     ""},//54
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 MO+N1 ",         "PH+N0 ",           "PD+N0 MD+N1 ",     ""},//55
                 {"",               "PI+N0 ",               "PH+N0 ",               "PH+N0 ",           "PD+N0 "      ,     ""},//56
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 AT+Y0 ",         "PH+N0 M2+N0 ",     "PD+N0 MD+N1 ",     ""},//57
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PH+N0 ",           "PD+N0 MD+N1 ",     ""},//58
                 {"",               "PI+N0 ",               "PH+N0 CB+N0 ",         "PH+N0 CB+N0 ",     "PD+N0 ",           ""},//59
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PH+N0 ",           "PD+N0 MD+N1 ",     ""},//60
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 EM+N0 ",         "PH+N0 EM+N0 ",     "PD+N0 MD+N1 ",     ""},//61
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PH+N0 ",           "PD+N0 MD+N1 ",     ""},//62
                 {"",               "",                     "",                     "",                 "",                 ""},//63
                 {"",               "",                     "",                     "",                 "",                 ""},//64
                 {"",               "",                     "PC+N2 ",               "",                 "",                 ""},//65
                 {"",               "",                     "",                     "",                 "",                 ""},//66
                 {"",               "",                     "",                     "",                 "",                 ""},//67
                 {"",               "",                     "",                     "",                 "",                 ""},//68
                 {"",               "",                     "PC+N2 ",               "",                 "",                 ""},//69
                 {"",               "",                     "MO+N3 ",               "",                 "",                 ""},//70
                 {"",               "",                     "",                     "",                 "",                 ""},//71
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PD+N0 MD+N1 ",     "",                 ""},//70
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PD+N0 MD+N1 ",     "",                 ""},//71
                 {"",               "PI+N0 ",               "PH+N0 M2+N0 ",         "PD+N0 ",           "",                 ""},//73
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PD+N0 MD+N1 ",     "",                 ""},//74
                 {"",               "PI+N0 MI+N1 ",         "PH+N0 ",               "PD+N0 MD+N1 ",     "",                 ""},//75
                 {"",               "PI+N1 MI+N2 ",         "PH+N1 PA+N0 ",         "PD+N1 MD+N2 ",     "",                 ""},//76
                 {"",               "PI+N2 MI+N3 ",         "PH+N2 PA+N1 ",         "PD+N2 MD+N3 ",     "",                 ""},//77
                 {"",               "PI+N3 MI+N4 ",         "PH+N3 PA+N2 ",         "PD+N3 MD+N4 ",     "",                 ""},//78
                 {"",               "PI+N4 MI+N5 ",         "PH+N4 PA+N3 EM+N4 ",   "PD+N4 MD+N5 ",     "",                 ""},//79
                 {"",               "PI+N5 MI+N6 ",         "PH+N5 PA+N4 ",         "PD+N5 MD+N6 ",     "",                 ""},//80
                 {"",               "PI+N5 MI+N6 ",         "PH+N5 ",               "PD+N5 MD+N6 ",     "",                 ""},//81
                 {"",               "PI+N5 MI+N6 ",         "PH+N5 MO+N6 ",         "PD+N5 MD+N6 ",     "",                 ""},//82
                 {"",               "PI+N5 MI+N6 ",         "PH+N5 ",               "PD+N5 MD+N6 ",     "",                 ""},//83
                 {"",               "PI+N6 MI+N7 ",         "PH+N6 PA+N5 ",         "PD+N6 MD+N7 ",     "",                 ""},//84
                 {"",               "PI+N7 MI+N8 ",         "PH+N7 PA+N6 CB+N7 ",   "PD+N7 MD+N8 ",     "",                 ""},//85
                 {"",               "PI+N8 MI+N9 ",         "PH+N8 PA+N7 ",         "PD+N8 MD+N9 ",     "",                 ""},//86
                 {"",               "PI+N9 MI+N10 ",        "PH+N9 PA+N8 CB+N9 ",   "PD+N9 MD+N10 ",    "",                 ""},//87
                 {"",               "PI+N9 MI+N10 ",        "PH+N9 ",               "PD+N9 MD+N10 ",    "",                 ""},//88
                 {"",               "PI+N9 MI+N10 ",        "PH+N9 ",               "PD+N9 MD+N10 ",    "",                 ""},//89
                 {"",               "PI+N9 MI+N10 ",        "PH+N9 MO+N10 ",        "PD+N9 MD+N10 ",    "",                 ""},//90
                 {"",               "",                     "",                     "",                 "",                 ""},//91
                 {"",               "PI+N6 MI+N7 ",         "PH+N6 ",               "PH+N6 ",           "PH+N6 ",           "PD+N6 MD+N7 "},//92
                 {"",               "PI+N6 MI+N7 ",         "PH+N6 AS+N6 ",         "PH+N6 ",           "PH+N6 AS+N6 ",     "PD+N6 MD+N7 "},//93
                 {"",               "PI+N6 MI+N7 ",         "PH+N6 ",               "PH+N6 P2+N6 ",     "PH+N6 ",           "PD+N6 MD+N7 "},//94
                 {"",               "PI+N6 ",               "PH+N6 AT+Y6 ",         "PH+N6 ",           "PH+N6 OV+N6 ",     "PD+N6 MD+N7 "},//95
                 {"",               "PI+N6 MI+N7 ",         "PH+N6 ",               "PH+N6 MO+N7 ",     "PH+N6 ",           "PD+N6 MD+N7 "},//96
                 {"",               "PI+N6 MI+N7 ",         "PH+N6 DV+N6 ",         "PH+N6 MO+N7 ",     "PH+N6 AS+N6 ",     "PD+N6 MD+N7 "},//97
                 {"",               "PI+N6 ",               "PH+N6 DV+N6 ",         "PH+N6 ",           "PH+N6 AT+Y6 ",     "PD+N6 MD+N7 "},//98
                 {"",               "PI+N6 MI+N7 ",         "PH+N6 DV+N6 ",         "PH+N6 M2+N6 ",     "PH+N6 ",           "PD+N6 MD+N7 "},//99
                 {"",               "PI+N6 MI+N7 ",         "PH+N6 ",               "PH+N6 ",           "PH+N6 ",           "PD+N6 MD+N7 "},//100
                };
        //Mundo
        world.getTextureResources().add(R.drawable.level6_fondo);
        //Constantes
        crashResource = R.raw.tierra;
        musicResource = R.raw.space_musica;
        ay = 0.0021f;
        this.level = level;
    }

    @Override
    protected List<ShapeOpengl> crearObjeto(String figura,float x,float y,float z){
        List<ShapeOpengl> shapes = new ArrayList<>();
        if (figura.equals("AS")){
            shapes.add(crearCilindroAntenaSatelital(x,y,z));
            shapes.add(crearConoAntenaSatelital(x,y,z));
        }
        if (figura.equals("AT")){
            shapes.add(crearCilindroAntena(x,y,z,0.4f,0.2f));
            shapes.add(crearCilindroAntena(x,y,z,0.3f,0.5f));
            shapes.add(crearCilindroAntena(x,y,z,0.2f,0.8f));
            shapes.add(crearConoAntena(x,y,z));
        }
        if (figura.equals("CB")){
            shapes.add(crearConoBrillante(x,y,z));
        }
        if (figura.equals("DV")){
            shapes.add(crearCilindroVerticalDisparador(x,y,z));

            shapes.add(crearCilindroDisparador(x,y+0.2f,z));
            shapes.add(crearConoDispardor(x,y+0.2f,z));
            shapes.add(crearCuboDisparador(x,y+0.2f,z));

            shapes.add(crearCilindroDisparador(x,y+0.5f,z));
            shapes.add(crearConoDispardor(x,y+0.5f,z));
            shapes.add(crearCuboDisparador(x,y+0.5f,z));

            shapes.add(crearCilindroDisparador(x,y+0.8f,z));
            shapes.add(crearConoDispardor(x,y+0.8f,z));
            shapes.add(crearCuboDisparador(x,y+0.8f,z));
        }
        if (figura.equals("EC")){
            crearEsferaCristalina(x,y,z);
        }
        if (figura.equals("EM")){
            shapes.add(crearEsferaMetalica(x,y,z));
            shapes.add(crearConoMetalicoParaEsfera(x,y,z,0));
            shapes.add(crearConoMetalicoParaEsfera(x,y,z,45));
            shapes.add(crearConoMetalicoParaEsfera(x,y,z,315));
        }
        if (figura.equals("M2")){
            shapes.add(crearMontanaDeTierra2(x,y,z));
        }
        if (figura.equals("MD")){
            shapes.add(crearConoMetalico(x-lengthPlano/2-lengthPared*2,y,z));
        }
        if (figura.equals("MI")){
            shapes.add(crearConoMetalico(x+lengthPlano/2+lengthPared*2,y,z));
        }
        if (figura.equals("MN")){
            shapes.add(crearMontanaDeTierra(x,y,z));
        }
        if (figura.equals("MO")){
            shapes.add(crearMoneda(x, y, z));
        }
        if (figura.equals("OV")){
            shapes.add(crearExtraterrestreCara(x,y,z));
            shapes.add(crearCuerpoOvni1(x,y,z));
            shapes.add(crearCuerpoOvni2(x,y,z));
            shapes.add(crearBrazoOvni(x,y,z,0));
            shapes.add(crearBrazoOvni(x,y,z,30));
            shapes.add(crearBrazoOvni(x,y,z,60));
            shapes.add(crearBrazoOvni(x,y,z,90));
        }
        if (figura.equals("P2")){
            shapes.add(crearEsferaPlatillo2(x, y, z));
            shapes.add(crearCilindroPlatillo2(x, y, z));
            shapes.add(crearConoBrillantePlatillo2(x, y, z));
        }
        if (figura.equals("PA")){
            shapes.add(crearParedAnchura(x,y,z));
        }
        if (figura.equals("PC")){
            shapes.add(crearPlanoCubo(x,y,z));
        }
        if (figura.equals("PD")){
            shapes.add(crearParedDerechaProfundidad(x,y,z));
        }
        if (figura.equals("PH")){
            shapes.add(crearPlanoHorizontal(x,y,z));
        }
        if (figura.equals("PI")){
            shapes.add(crearParedIzquierdaProfundidad(x,y,z));
        }
        if (figura.equals("PL")){
            shapes.add(crearPlanoLuminoso(x,y,z));
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
        sphere.getTextureResources().add(R.drawable.level6_esfera);
    }

    private Plane crearPlanoHorizontal(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level6_piso);
        return plane;
    }

    private Cube crearParedIzquierdaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx+lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level6_pared);
        return cube;
    }

    private Cube crearParedDerechaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx-lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level6_pared);
        return cube;
    }

    private Cube crearParedAnchura(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared,cz+lengthPlano+lengthPared,lengthPlano,lengthPared,lengthPared);
        cube.getTextureResources().add(R.drawable.level6_pared);
        return cube;
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

    ////////////////////////////////////Platillo volador2///////////////////////////////////////////

    private Sphere crearEsferaPlatillo2(float cx, float cy, float cz){
        Sphere spherePlatillo = new Sphere(cx+lengthPlano,cy+0.4f+radioEsfera*1.5f,cz,6,8,radioEsfera);
        spherePlatillo.getTextureResources().add(R.drawable.level6_platillo_circulo2);
        spherePlatillo.getAnimator().setIncrAngleY(1);
        spherePlatillo.getAnimator().setBidirectionalAngleY(false);
        spherePlatillo.setcRX(-lengthPlano);
        spherePlatillo.setSolid(true);
        spherePlatillo.setRGBA(1f, 1f, 1f, 0.4f);
        return spherePlatillo;
    }

    private Cylinder crearCilindroPlatillo2(float cx, float cy, float cz){
        Cylinder cylinderPlatillo2 = new Cylinder(cx+lengthPlano,cy+0.4f+radioEsfera*1.5f,cz,0.5f,0.01f,8);
        cylinderPlatillo2.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cylinderPlatillo2.getAnimator().setIncrAngleY(1);
        cylinderPlatillo2.getAnimator().setBidirectionalAngleY(false);
        cylinderPlatillo2.setcRX(-lengthPlano);
        cylinderPlatillo2.setSolid(true);
        return cylinderPlatillo2;
    }

    private Cone crearConoBrillantePlatillo2(float cx, float cy, float cz){
        Cone cone = new Cone(cx+lengthPlano,cy,cz,6,0.2f,0.4f+radioEsfera*1.5f);
        cone.getTextureResources().add(R.drawable.level6_diamante);
        cone.setSolid(true);
        cone.setRGBA(1f, 0.4f, 0.4f, 0.4f);
        cone.getAnimator().setIncrRed(1);
        cone.getAnimator().setIncrGreen(2);
        cone.getAnimator().setIncrBlue(3);
        cone.setcRX(-lengthPlano);
        cone.getAnimator().setIncrAngleY(1);
        cone.getAnimator().setBidirectionalAngleY(false);
        return cone;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////


    private Cone crearConoBrillante(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,6,0.2f,0.6f);
        cone.getTextureResources().add(R.drawable.level6_diamante);
        cone.getAnimator().setMaxScale(1.7f);
        cone.getAnimator().setMinScale(0.6f);
        cone.getAnimator().setIncrScale(0.005f);
        cone.setSolid(true);
        return cone;
    }

    ///////////////////////////////Plane Luminoso///////////////////////////////////////////////////

    private Plane crearPlanoLuminoso(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy+0.5f,cz,0.2f,1.5f,0);
        plane.getTextureResources().add(R.drawable.level6_laser);
        plane.setSolid(true);
        plane.setcRY(1.5f);
        plane.getAnimator().setIncrAngleZ(0.5);
        plane.getAnimator().setMaxAngleZ(30);
        plane.getAnimator().setMinAngleZ(-30);
        plane.setRGBA(1f, 0.4f, 0.4f, 0.6f);
        plane.getAnimator().setIncrRed(1);
        plane.getAnimator().setIncrGreen(2);
        plane.getAnimator().setIncrBlue(3);
        return plane;
    }

    ////////////////////////////////Crear Extraterrestre////////////////////////////////////////////

    private Sphere crearExtraterrestreCara(float cx, float cy, float cz){
        Sphere caraExtraterrestre = new Sphere(cx,cy+0.5f+radioEsfera,cz,8,16,radioEsfera);
        caraExtraterrestre.getTextureResources().add(R.drawable.level6_ovni_cabeza);
        caraExtraterrestre.setSolid(true);
        caraExtraterrestre.getAnimator().setMaxAngleY(45);
        caraExtraterrestre.getAnimator().setMinAngleY(-45);
        caraExtraterrestre.getAnimator().setIncrAngleY(1);
        return caraExtraterrestre;
    }

    private Cone crearCuerpoOvni1(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy+0.3f,cz,6,0.2f,0.4f);
        cone.getTextureResources().add(R.drawable.level6_ovni_cuerpo);
        cone.setSolid(true);
        return cone;
    }

    private Cone crearCuerpoOvni2(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy+0.3f,cz,6,0.2f,0.4f);
        cone.getTextureResources().add(R.drawable.level6_ovni_cuerpo);
        cone.getAnimator().setAngleZ(180);
        cone.getAnimator().setAngleY(90);
        cone.setSolid(true);
        return cone;
    }

    private Plane crearBrazoOvni(float cx, float cy, float cz, float angulo){
        Plane brazo = new Plane(cx,cy+0.3f,cz,0.6f,0.05f,0f);
        brazo.getTextureResources().add(R.drawable.level6_ovni_cuerpo);
        brazo.getAnimator().setMaxAngleZ(30);
        brazo.getAnimator().setMinAngleZ(-30);
        brazo.getAnimator().setIncrAngleZ(1);
        //brazo.getAnimator().setAnguloZ(angulo/3);
        brazo.getAnimator().setAngleY(angulo);
        brazo.setSolid(true);
        return brazo;
    }

    ///////////////////////////////////////sphere metal////////////////////////////////////////////

    private Sphere crearEsferaMetalica(float cx, float cy, float cz){
        Sphere caraExtraterrestre = new Sphere(cx,cy+radioEsfera,cz,8,16,radioEsfera);
        caraExtraterrestre.getTextureResources().add(R.drawable.level6_platillo_circulo);
        caraExtraterrestre.setSolid(true);
        return caraExtraterrestre;
    }

    private Cone crearConoMetalicoParaEsfera(float cx, float cy, float cz, double angulo){
        Cone cone = new Cone(cx,cy+0.1f,cz,6,0.05f,0.4f);
        cone.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cone.getAnimator().setAngleZ(angulo);
        cone.getAnimator().setMaxScale(2);
        cone.getAnimator().setMinScale(0.5);
        cone.getAnimator().setIncrScale(0.01);
        cone.setSolid(true);
        return cone;
    }

    /////////////////////////////////////Montañas de tierra//////////////////////////////////////////

    private Cone crearMontanaDeTierra(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,6,0.6f,0.7f);
        cone.getTextureResources().add(R.drawable.level6_piso);
        cone.setSolid(true);
        return cone;
    }

    private Cone crearMontanaDeTierra2(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,6,0.5f,0.3f);
        cone.getTextureResources().add(R.drawable.level6_piso);
        cone.setSolid(true);
        return cone;
    }

    ////////////////////////////////////////////Antena//////////////////////////////////////////////

    private Cylinder crearCilindroAntena(float cx, float cy, float cz, float Rad, float incrY){
        Cylinder cylinderAntena = new Cylinder(cx,cy+incrY,cz,Rad,0.01f,8);
        cylinderAntena.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cylinderAntena.setSolid(true);
        return cylinderAntena;
    }

    private Cone crearConoAntena(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,6,0.05f,1.4f);
        cone.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cone.setSolid(true);
        return cone;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Cone crearConoMetalico(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,4,0.1f,0.4f);
        cone.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cone.setSolid(true);
        return cone;
    }

    /////////////////////////////////////Disparador vertical////////////////////////////////////////

    private Cylinder crearCilindroVerticalDisparador(float cx, float cy, float cz){
        Cylinder cylinderAntena = new Cylinder(cx-0.2f,cy+0.5f,cz,0.03f,0.5f,8);
        cylinderAntena.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cylinderAntena.setSolid(true);
        return cylinderAntena;
    }

    private Cylinder crearCilindroDisparador(float cx, float cy, float cz){
        Cylinder cylinderAntena = new Cylinder(cx,cy,cz,0.15f,0.01f,8);
        cylinderAntena.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cylinderAntena.setSolid(true);
        cylinderAntena.getAnimator().setAngleZ(90);
        return cylinderAntena;
    }

    private Cone crearConoDispardor(float cx, float cy, float cz){
        Cone cone = new Cone(cx-0.2f,cy,cz,6,0.05f,0.6f);
        cone.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cone.getAnimator().setAngleZ(270);
        cone.setSolid(true);
        return cone;
    }

    private Cube crearCuboDisparador(float cx, float cy, float cz){
        Cube cube = new Cube(cx+0.4f,cy,cz,0.05f,0.05f,0.05f);
        cube.getAnimator().setBidirectionalAngleZ(false);
        cube.getTextureResources().add(R.drawable.level6_laser);
        cube.setRGBA(1f, 0.6f, 0.6f, 0.5f);
        cube.getAnimator().setIncrX(0.05f);
        cube.getAnimator().setBidirectionalX(false);
        cube.getAnimator().setMaxX(6);
        cube.setSolid(true);
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Cube crearPlanoCubo(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy-lengthPared*2,cz,lengthPlano,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level6_piso);
        return cube;
    }

    /////////////////////////////////////Antena satelital///////////////////////////////////////////

    private Cylinder crearCilindroAntenaSatelital(float cx, float cy, float cz){
        Cylinder cylinderAntena = new Cylinder(cx,cy+0.4f,cz,0.4f,0.01f,8);
        cylinderAntena.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cylinderAntena.setSolid(true);
        cylinderAntena.getAnimator().setMaxAngleZ(45);
        cylinderAntena.getAnimator().setMinAngleZ(-45);
        cylinderAntena.getAnimator().setIncrAngleZ(1);
        cylinderAntena.getAnimator().setMaxAngleX(45);
        cylinderAntena.getAnimator().setMinAngleX(-45);
        cylinderAntena.getAnimator().setIncrAngleX(0.5);
        cylinderAntena.setcRY(-0.4f);
        return cylinderAntena;
    }

    private Cone crearConoAntenaSatelital(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,6,0.05f,0.9f);
        cone.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cone.getAnimator().setMaxAngleZ(45);
        cone.getAnimator().setMinAngleZ(-45);
        cone.getAnimator().setIncrAngleZ(1);
        cone.getAnimator().setMaxAngleX(45);
        cone.getAnimator().setMinAngleX(-45);
        cone.getAnimator().setIncrAngleX(0.5);
        cone.setSolid(true);
        return cone;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
}

