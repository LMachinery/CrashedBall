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
 * Created by miguel on 29/03/2015.
 */
public class Level7 extends Level {

    @Override
    protected void crearNivel(){
        String level[][] =
                {       {"",                "PI+N0 ",               "PH+N0 PA+N0 ",            "PH+N0 PA+N0 ",                "PD+N0 ",           ""},//1
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 ",                  "PH+N0 ",                      "PD+N0 MD+N1 ",     ""},//2
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 EC+N6 ",            "PH+N0 ",                      "PD+N0 MD+N1 ",     ""},//3
                        {"",                "PI+N0 ",               "PH+N0 ",                  "PH+N0 ",                      "PD+N0 MD+N1 ",     ""},//4
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 BM+N0 ",            "PH+N0 BM+N0 ",                "PD+N0 ",           ""},//5
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 ",                  "PH+N0 ",                      "PD+N0 MD+N1 ",     ""},//6
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 PZ+Y0 ",            "PH+N0 PN-Y0 ",                "PD+N0 MD+N1 ",     ""},//7
                        {"",                "PI+N0 ",               "PH+N0 ",                  "PH+N0 ",                      "PD+N0 ",           ""},//8
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 ",                  "PH+N0 MO+N1 ",                "PD+N0 MD+N1 ",     ""},//9
                        {"",                "PI+N0 ",               "PH+N0 RD+Z0 AP+N0 ",      "PH+N0 RP-Z0 RD+Z1 AP+N0 ",    "PD+N0 MD+N1 ",     ""},//10
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 ",                  "PH+N0 ",                      "PD+N0 MD+N1 ",     ""},//11
                        {"",                "PI+N0 ",               "PF+N0 ",                  "PF+N0 ",                      "PD+N0 ",           ""},//12
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 ",                  "PH+N0 ",                      "PD+N0 MD+N1 ",     ""},//13
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 CI-Z4 ",            "PH+N0 CI+Z4 ",                "PD+N0 MD+N1 ",     ""},//14
                        {"",                "PI+N0 ",               "PH+N0 ",                  "PH+N0 ",                      "PD+N0 ",           ""},//15
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 MO+N1 ",            "PH+N0 ",                      "PD+N0 MD+N1 ",     ""},//16
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 ",                  "PH+N0 ",                      "PD+N0 MD+N1 ",     ""},//17
                        {"",                "PI+N0 ",               "PH+N0 AI+N0 ",            "PH+N0 AI+N0 ",                "PD+N0 MD+N1 ",     ""},//18
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 ",                  "PH+N0 ",                      "PD+N0 ",           ""},//19
                        {"",                "PI+N0 ",               "PH+N0 ",                  "PH+N0 ",                      "PD+N0 MD+N1 ",     ""},//20
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 TB+X0 ",            "PH+N0 TB+X0 ",                "PD+N0 MD+N1 ",     ""},//21
                        {"",                "PI+N0 MI+N1 ",         "PH+N0 ",                  "PH+N0 ",                      "PD+N0 ",           ""},//22
                        {"",                "PI+N0 ",               "PH+N0 MO+N1 ",            "PH+N0 CL+N0 ",                "PD+N0 MD+N1 ",     ""},//23
                        {"",                "",                     "",                        "",                            "",                 ""},//24
                        {"",                "",                     "",                        "",                            "",                 ""},//25
                        {"",                "",                     "PC+N1 ",                  "",                            "",                 ""},//26
                        {"",                "",                     "MO+N2 ",                  "",                            "",                 ""},//27
                        {"",                "",                     "",                        "",                            "",                 ""},//28
                        {"",                "PC+N2 ",               "",                        "",                            "",                 ""},//29
                        {"",                "MO+N3 ",               "",                        "",                            "",                 ""},//30
                        {"",                "",                     "",                        "",                            "",                 ""},//31
                        {"PC+N3 ",          "",                     "",                        "",                            "",                 ""},//32
                        {"PI+N4 MI+N5 ",    "PH+N4 PA+N3 ",         "PH+N4 PA+N3 ",            "PH+N4 PA+N3 ",                "PD+N4 ",           ""},//33
                        {"PI+N4 MI+N5 ",    "PH+N4 ",               "PH+N4 P2+N4 PL+N4 RD+Z4", "PH+N4 ",                      "PD+N4 MD+N5 ",     ""},//34
                        {"PI+N4 MI+N5 ",    "PH+N4 HR+N4 ",         "PH+N4 ",                  "PH+N4 AI+N4 ",                "PD+N4 MD+N5 ",     ""},//35
                        {"PI+N4 MI+N5 ",    "PH+N4 ",               "PH+N4 ",                  "PH+N4 ",                      "PD+N4 ",           ""},//36
                        {"PI+N4 MI+N5 ",    "PH+N4 CL+N4 ",         "PH+N4 ",                  "PH+N4 ",                      "PD+N4 MD+N5 ",     ""},//37
                        {"PI+N4 ",          "PH+N4 HR+N4 ",         "PH+N4 PT+N4 CN+N4 ",      "PH+N4 HR+N4 ",                "PD+N4 MD+N5 ",     ""},//38
                        {"PI+N4 MI+N5 ",    "PH+N4 ",               "PH+N4 ",                  "PH+N4 ",                      "PD+N4 MD+N5 ",     ""},//39
                        {"PI+N4 MI+N5 ",    "PH+N4 ",               "PH+N4 ",                  "PH+N4 ",                      "PD+N4 ",           ""},//40
                        {"",                "PA+N4 PI+N4 ",         "PH+N4 ",                  "PH+N4 ",                      "PD+N4 MD+N5 ",     ""},//41
                        {"",                "PI+N4 ",               "PH+N4 CI-Z4 ",            "PH+N4 CI+Z4 ",                "PD+N4 MD+N5 ",     ""},//42
                        {"",                "PI+N4 MI+N5 ",         "PH+N4 ",                  "PH+N4 ",                      "PD+N4 MD+N5 ",     ""},//43
                        {"",                "PI+N4 MI+N5 ",         "PH+N4 ",                  "PH+N4 CL+N4 ",                "PD+N4 MD+N5 ",     ""},//44
                        {"",                "PI+N4 ",               "PH+N4 ",                  "PH+N4 ",                      "PD+N4 MD+N5 ",     ""},//45
                        {"",                "PI+N4 MI+N5 ",         "PH+N4 CI-Z4 ",            "PH+N4 TB+X4 ",                "PD+N4 MD+N5 ",     ""},//46
                        {"",                "PI+N4 MI+N5 ",         "PH+N4 ",                  "PH+N4 ",                      "PD+N4 ",           ""},//47
                        {"",                "PI+N4 MI+N5 ",         "PH+N4 ",                  "PH+N4 ",                      "PD+N4 MD+N5 ",     ""},//48
                        {"",                "PI+N4 ",               "PH+N4 RP-Z4 RD+Z5 AP+N4 ","PH+N4 RP-Z4 RD+Z5 AP+N4 ",    "PD+N4 MD+N5 ",     ""},//49
                        {"",                "PI+N4 MI+N5 ",         "PH+N4 ",                  "PH+N4 ",                      "PD+N4 ",           ""},//50
                        {"",                "PI+N4 MI+N5 ",         "PH+N4 ",                  "PH+N4 ",                      "PD+N4 MD+N5 ",     ""},//51
                        {"",                "PI+N4 MI+N5 ",         "PH+N4 ",                  "PH+N4 ",                      "PD+N4 MD+N5 ",     ""},//52
                        {"",                "PI+N4 ",               "PH+N4 PZ+Y4 ",            "PH+N4 PN-Y4 ",                "PD+N4 MD+N5 ",     ""},//53
                        {"",                "PI+N4 MI+N5 ",         "PH+N4 ",                  "PH+N4 ",                      "PD+N4 ",           ""},//54
                        {"",                "PI+N3 MI+N4 ",         "PH+N3 ",                  "PH+N3 ",                      "PD+N3 MD+N4 ",     ""},//55
                        {"",                "PI+N3 MI+N4 ",         "PF+N3 ",                  "PF+N3 ",                      "PD+N3 MD+N4 ",     ""},//56
                        {"",                "PI+N3 MI+N4 ",         "PH+N3 MO+N4 ",            "PH+N3 ",                      "PD+N3 MD+N4 ",     ""},//57
                        {"",                "PI+N2 MI+N3 ",         "PH+N2 ",                  "PH+N2 ",                      "PD+N2 MD+N3 ",     ""},//58
                        {"",                "PI+N2 MI+N3 ",         "PF+N2 ",                  "PF+N2 ",                      "PD+N2 MD+N3 ",     ""},//59
                        {"",                "PI+N2 MI+N3 ",         "PH+N2 ",                  "PH+N2 MO+N3 ",                "PD+N2 MD+N3 ",     ""},//60
                        {"",                "PI+N1 MI+N2 ",         "PH+N1 ",                  "PH+N1 ",                      "PD+N1 MD+N2 ",     ""},//61
                        {"",                "PI+N1 MI+N2 ",         "PF+N1 ",                  "PF+N1 ",                      "PD+N1 MD+N2 ",     ""},//62
                        {"",                "PI+N1 MI+N2 ",         "PH+N1 ",                  "PH+N1 MO+N2 ",                "PD+N1 MD+N2 ",     ""},//63
                        {"",                "PI+N1 MI+N2 ",         "PH+N1 CI-Z1 ",            "PH+N1 CL+N1 ",                "PD+N1 MD+N2 ",     ""},//64
                        {"",                "PI+N1 MI+N2 ",         "PH+N1 ",                  "PH+N1 ",                      "PD+N1 MD+N2 ",     ""},//65
                        {"",                "",                     "",                        "",                            "",                 ""},//66
                        {"",                "",                     "",                        "",                            "",                 ""},//67
                        {"",                "",                     "",                        "PC+N3 ",                      "",                 ""},//68
                        {"",                "",                     "",                        "",                            "",                 ""},//69
                        {"",                "",                     "",                        "",                            "",                 ""},//70
                        {"",                "",                     "PC+N5 ",                  "",                            "",                 ""},//71
                        {"",                "",                     "MO+N6 ",                  "",                            "",                 ""},//72
                        {"",                "",                     "",                        "",                            "",                 ""},//73
                        {"",                "PI+N1 MI+N2 ",         "PH+N1 PA+N0 ",            "PH+N1 PA+N0 ",                "PD+N1 MD+N2 ",     ""},//74
                        {"",                "PI+N1 MI+N2 ",         "PH+N1 ",                  "PH+N1 ",                      "PD+N1 MD+N2 ",     ""},//75
                        {"",                "PI+N1 MI+N2 ",         "PH+N1 CI-Z5 ",            "PH+N1 CI+Z4 ",                "PD+N1 MD+N2 ",     ""},//76
                        {"",                "PI+N1 ",               "PH+N1 ",                  "PH+N1 ",                      "PD+N1 ",           ""},//77
                        {"",                "PI+N1 MI+N2 ",         "PH+N1 ",                  "PH+N1 MO+N2 ",                "PD+N1 MD+N2 ",     ""},//78
                        {"",                "PI+N1 MI+N2 ",         "PH+N1 ",                  "PH+N1 MO+N2 ",                "PD+N1 MD+N2 ",     ""},//79
                        {"",                "PI+N1 MI+N2 ",         "PH+N1 ",                  "PH+N1 ",                      "PD+N1 MD+N2 ",     ""},//80
                        {"",                "PI+N1 MI+N2 ",         "PH+N1 PT+N1 CN+N1 ",      "PH+N1 PT+N1 CN+N1 ",          "PD+N1 MD+N2 ",     ""},//81
                        {"",                "PI+N1 MI+N2 ",         "PH+N1 ",                  "PH+N1 ",                      "PD+N1 MD+N2 ",     ""},//82
                        {"",                "PI+N1 ",               "PH+N1 ",                  "PH+N1 ",                      "PD+N1 ",           ""},//83
                        {"",                "",                     "PA+N1 PI+N1 ",            "PH+N1 ",                      "PD+N1 MD+N2 ",     ""},//84
                        {"",                "",                     "PI+N1 ",                  "PH+N1 ",                      "PD+N1 MD+N2 ",     ""},//85
                        {"",                "",                     "PI+N1 MI+N2 ",            "PH+N1 AP+N1 ",                "PD+N1 MD+N2 ",     ""},//86
                        {"",                "",                     "PI+N1 MI+N2 ",            "PH+N1 AP+N1 ",                "PD+N1 ",           ""},//87
                        {"",                "",                     "PI+N1 ",                  "PH+N1 AP+N1 ",                "PD+N1 MD+N2 ",     ""},//88
                        {"",                "",                     "PI+N1 MI+N2 ",            "PH+N1 AP+N1 ",                "PD+N1 MD+N2 ",     ""},//89
                        {"",                "",                     "PI+N1 MI+N2 ",            "PH+N1 ",                      "PD+N1 MD+N2 ",     ""},//90
                        {"",                "",                     "PI+N2 MI+N3 ",            "PH+N2 PA+N1 ",                "PD+N2 MD+N3 ",     ""},//91
                        {"",                "",                     "PI+N2 MI+N3 ",            "PH+N2 TB+X2 ",                "PD+N2 MD+N3 ",     ""},//92
                        {"",                "",                     "PI+N3 MI+N4 ",            "PH+N3 PA+N2 ",                "PD+N3 MD+N4 ",     ""},//93
                        {"",                "",                     "PI+N3 MI+N4 ",            "PH+N3 CI-Z3 ",                "PD+N3 MD+N4 ",     ""},//94
                        {"",                "",                     "PI+N4 MI+N5 ",            "PH+N4 PA+N3 ",                "PD+N4 MD+N5 ",     ""},//95
                        {"",                "PI+N4 MI+N5 ",         "PA+N4 PH+N4 ",            "PH+N4 ",                      "PD+N4 MD+N5 ",     ""},//96
                        {"PI+N4 MI+N5 ",    "PA+N4 PH+N4 ",         "PH+N4 ",                  "PH+N4 MO+N5 ",                "PD+N4 MD+N5 ",     ""},//97
                        {"PI+N4 MI+N5 ",    "PH+N4 ",               "PH+N4 RD+Z4 ",            "PH+N4 HR+N4 ",                "PD+N4 MD+N5 ",     ""},//98
                        {"PI+N4 MI+N5 ",    "PH+N4 ",               "PH+N4 P2+N4 PL+N4 ",      "PH+N4 ",                      "PD+N4 MD+N5 ",     ""},//99
                        {"PI+N4 MI+N5 ",    "PH+N4 HR+N4 ",         "PH+N4 ",                  "PH+N4 P2+N4 PL+N4 ",          "PD+N4 MD+N5 ",     ""},//100
                        {"PI+N4 MI+N5 ",    "PH+N4 ",               "PH+N4 MO+N5 ",            "PH+N4 HR+N4 ",                "PD+N4 MD+N5 ",     ""},//101
                        {"PI+N4 MI+N5 ",    "PH+N4 ",               "PH+N4 MO+N5 ",            "PH+N4 ",                      "PD+N4 MD+N5 ",     ""},//102
                };
        //Mundo
        world.getTextureResources().add(R.drawable.level7_fondo);
        //Constantes
        crashResource = R.raw.metal;
        musicResource = R.raw.industrial_musica;
        this.level = level;
    }

    @Override
    protected List<ShapeOpengl> crearObjeto(String figura,float x,float y,float z){
        List<ShapeOpengl> shapes = new ArrayList<>();
        if (figura.equals("AI")){
            shapes.add(crearCuboAplastadoraIndustrial(x-0.3f,y,z,0.8f));
            shapes.add(crearCuboAplastadoraIndustrial(x-0.2f,y,z,0));
            shapes.add(crearCuboAplastadoraIndustrial(x-0.1f,y,z,0.8f));
            shapes.add(crearCuboAplastadoraIndustrial(x,y,z,0));
            shapes.add(crearCuboAplastadoraIndustrial(x+0.1f,y,z,0.8f));
            shapes.add(crearCuboAplastadoraIndustrial(x+0.2f,y,z,0));
            shapes.add(crearCuboAplastadoraIndustrial(x+0.3f,y,z,0.8f));
        }
        if (figura.equals("AP")){
            shapes.add(crearCuboAplastador(x,y,z));
            shapes.add(crearSotenedorAplastador(x,y,z));
        }
        if (figura.equals("BM")){
            float signo = 1;
            for(float i=0;i<8;i++){
                shapes.add(crearCuboMovimiento(x,y+0.1f*i,z,signo));
                signo *= -1;
            }
        }
        if (figura.equals("CI")){
            shapes.add(crearCilindrosIndustriales(x,y,z,1));
            shapes.add(crearCuboIndustrial(x,y,z,90));
            shapes.add(crearCuboIndustrial(x,y,z,0));
        }
        if (figura.equals("CL")){
            shapes.add(crearEsferaColgador(x, y, z));
            shapes.add(crearPlanoColgador(x, y, z));
        }
        if (figura.equals("CN")){
            //Conos
            shapes.add(crearConoMetalico(x-lengthPlano/2,y,z));
            shapes.add(crearConoMetalico(x,y,z));
            shapes.add(crearConoMetalico(x+lengthPlano/2,y,z));
        }
        if (figura.equals("EC")){
            crearEsferaCristalina(x,y,z);
        }
        if (figura.equals("HR")){
            shapes.add(crearCuboMetal(x, y, z));
            shapes.add(crearCuboFuego(x, y+0.1f, z));
            shapes.add(crearCuboMetal(x, y+0.2f, z));
            shapes.add(crearCuboFuego(x, y+0.3f, z));
            shapes.add(crearCuboMetal(x, y+0.4f, z));
            shapes.add(crearCuboFuego(x, y+0.5f, z));
            shapes.add(crearCuboMetal(x, y+0.6f, z));
            shapes.add(crearCuboFuego(x, y+0.7f, z));
            shapes.add(crearCuboMetal(x, y+0.8f, z));
        }
        if (figura.equals("MD")){
            shapes.add(crearConoMetalico(x-lengthPlano/2-lengthPared*2,y,z));
        }
        if (figura.equals("MI")){
            shapes.add(crearConoMetalico(x+lengthPlano/2+lengthPared*2,y,z));
        }
        if (figura.equals("MO")){
            shapes.add(crearMoneda(x, y, z));
        }
        if (figura.equals("P2")){
            shapes.add(crearCuboHorizontalPalanca(x-0.08f-0.1f,y+0.1f,z,0,-1));
            shapes.add(crearCuboVerticalPalanca(x-0.08f-0.2f+0.049f,y+0.1f,z,-1));
            shapes.add(crearCuboHorizontalPalanca(x-0.08f-0.1f-0.1f,y+0.1f+0.2f,z,-0.2f,-1));
            shapes.add(crearCuboPalanca(x-0.08f-0.35f,y+0.1f,z,-1));
            shapes.add(crearCilindroPalanca(x-0.08f,y+0.1f,z,-1));
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
        if (figura.equals("PF")){
            shapes.add(crearPlanoFosforescente(x, y, z));
        }
        if (figura.equals("PI")){
            shapes.add(crearParedIzquierdaProfundidad(x, y, z));
        }
        if (figura.equals("PH")){
            shapes.add(crearPlanoHorizontal(x,y,z));
        }
        if (figura.equals("PL")){
            shapes.add(crearCuboHorizontalPalanca(x+0.08f+0.1f,y+0.1f,z,0,1));
            shapes.add(crearCuboVerticalPalanca(x+0.08f+0.2f-0.049f,y+0.1f,z,1));
            shapes.add(crearCuboHorizontalPalanca(x+0.08f+0.1f+0.1f,y+0.1f+0.2f,z,-0.2f,1));
            shapes.add(crearCuboPalanca(x+0.08f+0.35f,y+0.1f,z,1));
            shapes.add(crearCilindroPalanca(x+0.08f,y+0.1f,z,1));
        }
        if (figura.equals("PN")){
            for(int i=0;i<4;i++){
                shapes.add(crearCuboPasadizo(x-0.1f,y+0.2f*i+0.1f,z));
            }
            shapes.add(crearCuboVertical(x - 0.1f, y, z));
        }
        if (figura.equals("PT")){
            for(int i=0;i<=6;i+=2){
                if (i != 6){
                    shapes.add(crearCuboPuerta(x,y,z,i*lengthPared,1));
                }
                shapes.add(crearCuboPuerta(x,y,z,(i-1)*lengthPared,-1));
            }
            shapes.add(crearCuboPuertaHorizontal(x,y,z));
            shapes.add(crearCuboPuertaHorizontal2(x,y,z));
            shapes.add(crearCuboPuertaVertical(x-lengthPlano,y,z));
            shapes.add(crearCuboPuertaVertical(x+lengthPlano,y,z));
        }
        if (figura.equals("PZ")){
            for(int i=0;i<5;i++){
                shapes.add(crearCuboPasadizo(x+0.1f,y+0.2f*i,z));
            }
            shapes.add(crearCuboVertical(x+0.1f,y,z));
        }
        if (figura.equals("RD")){
            shapes.add(crearCilindroRueda(x-lengthPlano, y, z,1));
            shapes.add(crearCuboVerticalRueda(x-lengthPlano, y, z,0,1));
            shapes.add(crearCuboVerticalRueda(x-lengthPlano, y, z,45,1));
            shapes.add(crearCuboVerticalRueda(x-lengthPlano, y, z,90,1));
            shapes.add(crearCuboVerticalRueda(x-lengthPlano, y, z,135,1));
            shapes.add(crearSotenedorRueda(x-lengthPlano,y,z));
        }
        if (figura.equals("RP")){
            shapes.add(crearCilindroRueda(x-lengthPlano, y, z,0.6f));
            shapes.add(crearCuboVerticalRueda(x-lengthPlano, y, z,0,0.6f));
            shapes.add(crearCuboVerticalRueda(x-lengthPlano, y, z,45,0.6f));
            shapes.add(crearCuboVerticalRueda(x-lengthPlano, y, z,90,0.6f));
            shapes.add(crearCuboVerticalRueda(x-lengthPlano, y, z,135,0.6f));
        }
        if (figura.equals("TB")){
            shapes.add(crearPlanoTurbina(x, y+0.3f, z));
            shapes.add(crearCilindroTurbina(x, y+0.3f, z));
            shapes.add(crearPlanoTurbina(x, y+1.3f, z));
            shapes.add(crearCilindroTurbina(x, y+1.3f, z));
            shapes.add(crearCuboTurbinas(x-0.4f, y, z));
            shapes.add(crearCuboTurbinas(x+0.4f, y, z));
        }
        continueShapeCreation(shapes,figura,x,y,z);
        return shapes;
    }

    private void crearEsferaCristalina(float cx,float cy,float cz){
        sphere = new Sphere(cx,cy+radioEsfera*5,cz,12,24,radioEsfera);
        sphere.getTextureResources().add(R.drawable.level7_esfera);
    }

    private Plane crearPlanoHorizontal(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level7_piso);
        return plane;
    }

    private Cube crearParedDerechaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx-lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level6_pared);
        return cube;
    }

    private Cube crearParedIzquierdaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx+lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level6_pared);
        return cube;
    }

    private Cube crearParedAnchura(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared,cz+lengthPlano+lengthPared,lengthPlano,lengthPared,lengthPared);
        cube.getTextureResources().add(R.drawable.level6_pared);
        return cube;
    }

    ////////////////////////////////////Crear Pasadizo//////////////////////////////////////////////

    private Cube crearCuboPasadizo(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared/2,cz,lengthPlano,lengthPared/2,lengthPared/2);
        cube.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearCuboVertical(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+0.5f,cz,0.02f,0.5f,0.02f);
        cube.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cube.setSolid(true);
        return cube;
    }

    ////////////////////////////////////////Rueda///////////////////////////////////////////////////

    private Cylinder crearCilindroRueda(float cx, float cy, float cz, float escale){
        Cylinder cylinderRueda = new Cylinder(cx,cy+0.4f*escale,cz,0.2f*escale,0.03f*escale,12);
        cylinderRueda.getTextureResources().add(R.drawable.level7_esfera);
        cylinderRueda.getAnimator().setAngleX(90);
        cylinderRueda.setSolid(true);
        cylinderRueda.getAnimator().setBidirectionalAngleZ(false);
        cylinderRueda.setOrderRotation(new ArrayList<String>());
        cylinderRueda.getOrderRotation().add("X");
        cylinderRueda.getOrderRotation().add("Y");
        cylinderRueda.getOrderRotation().add("Z");
        return cylinderRueda;
    }

    private Cube crearCuboVerticalRueda(float cx, float cy, float cz, float anguloY, float escale){
        Cube cube = new Cube(cx,cy+0.4f*escale,cz,0.02f*escale,0.02f*escale,0.3f*escale);
        cube.getTextureResources().add(R.drawable.level7_esfera);
        cube.getAnimator().setAngleX(90);
        cube.setSolid(true);
        cube.getAnimator().setAngleZ(anguloY);
        cube.setOrderRotation(new ArrayList<String>());
        cube.getAnimator().setBidirectionalAngleZ(false);
        cube.getOrderRotation().add("X");
        cube.getOrderRotation().add("Y");
        cube.getOrderRotation().add("Z");
        return cube;
    }

    private Plane crearSotenedorRueda(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy+0.1f+1f+0.4f,cz,0.01f,1f,0);
        plane.getTextureResources().add(R.drawable.level7_caja_metalica);
        plane.setNoRotar(true);
        plane.setSolid(true);
        return plane;
    }

    /////////////////////////////////////////Aplastador/////////////////////////////////////////////

    private Cube crearCuboAplastador(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+0.1f,cz,0.2f,0.1f,0.1f);
        cube.getTextureResources().add(R.drawable.level7_caja_metalica);
        cube.getAnimator().setMaxY(1f);
        cube.getAnimator().setMinY(0f);
        cube.getAnimator().setIncrY(0.01f);
        cube.setSolid(true);
        return cube;
    }

    private Plane crearSotenedorAplastador(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy+0.1f+1f,cz,0.01f,1f,0);
        plane.getTextureResources().add(R.drawable.level7_caja_metalica);
        plane.getAnimator().setMaxY(1f);
        plane.getAnimator().setMinY(0f);
        plane.getAnimator().setIncrY(0.01f);
        plane.setSolid(true);
        return plane;
    }

    ////////////////////////////////////Bloques movimiento//////////////////////////////////////////

    private Cube crearCuboMovimiento(float cx, float cy, float cz, float signoIncrX){
        Cube cube = new Cube(cx,cy+0.05f,cz,0.15f,0.05f,0.05f);
        cube.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cube.getAnimator().setMaxX(0.1f);
        cube.getAnimator().setMinX(-0.1f);
        cube.getAnimator().setIncrX(0.002f*signoIncrX);
        cube.setSolid(true);
        return cube;
    }

    ////////////////////////////////////Plane fosforescente/////////////////////////////////////////

    private Plane crearPlanoFosforescente(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level7_fosforescente);
        plane.getAnimator().setIncrRed(3);
        plane.getAnimator().setMinRed(30);
        plane.getAnimator().setIncrGreen(3);
        plane.getAnimator().setMinGreen(30);
        plane.getAnimator().setIncrBlue(3);
        plane.getAnimator().setMinBlue(30);
        plane.setSolid(true);
        return plane;
    }

    /////////////////////////////Crear cilindros industriales///////////////////////////////////////

    private Cylinder crearCilindrosIndustriales(float cx, float cy, float cz, float escale){
        Cylinder cylinderRueda = new Cylinder(cx,cy,cz,0.3f*escale,0.03f*escale,12);
        cylinderRueda.getTextureResources().add(R.drawable.level7_metal_oxidado);
        cylinderRueda.getAnimator().setAngleX(90);
        cylinderRueda.setSolid(true);
        cylinderRueda.getAnimator().setBidirectionalAngleY(false);
        cylinderRueda.setOrderRotation(new ArrayList<String>());
        cylinderRueda.getOrderRotation().add("X");
        cylinderRueda.getOrderRotation().add("Y");
        cylinderRueda.getOrderRotation().add("Z");
        return cylinderRueda;
    }

    private Cube crearCuboIndustrial(float cx, float cy, float cz, float anguloinicialY){
        Cube cube = new Cube(cx,cy,cz,0.04f,0.04f,0.6f);
        cube.getAnimator().setAngleX(90);
        cube.getTextureResources().add(R.drawable.level7_metal_oxidado);
        cube.setSolid(true);
        cube.getAnimator().setAngleZ(anguloinicialY);
        cube.setOrderRotation(new ArrayList<String>());
        cube.getOrderRotation().add("X");
        cube.getOrderRotation().add("Y");
        cube.getOrderRotation().add("Z");
        return cube;
    }

    ///////////////////////////////////Aplastadores industriales////////////////////////////////////

    private Cylinder crearCuboAplastadoraIndustrial(float cx, float cy, float cz, float startY){
        Cylinder cylinder = new Cylinder(cx,cy+0.4f,cz,0.05f,0.4f,8);
        cylinder.getTextureResources().add(R.drawable.level7_aplastadores);
        cylinder.setSolid(true);
        cylinder.getAnimator().setIncrY(0.005f);
        cylinder.getAnimator().setY(startY);
        cylinder.getAnimator().setMaxY(0.8f);
        return cylinder;
    }

    ///////////////////////////////////////////Turbinas/////////////////////////////////////////////

    private Plane crearPlanoTurbina(float cx, float cy, float cz){
        Plane planeTurbina = new Plane(cx,cy,cz,0.2f,0.4f,0);
        planeTurbina.getTextureResources().add(R.drawable.level7_aplastadores);
        planeTurbina.getAnimator().setAngleZ(90);
        planeTurbina.setSolid(true);
        planeTurbina.setOrderRotation(new ArrayList<String>());
        planeTurbina.getOrderRotation().add("Z");
        planeTurbina.getOrderRotation().add("Y");
        planeTurbina.getOrderRotation().add("X");
        return planeTurbina;
    }

    private Cylinder crearCilindroTurbina(float cx, float cy, float cz){
        Cylinder cylinderTurbina = new Cylinder(cx,cy,cz,0.075f,0.4f,8);
        cylinderTurbina.getTextureResources().add(R.drawable.level7_aplastadores);
        cylinderTurbina.setSolid(true);
        cylinderTurbina.getAnimator().setAngleZ(90);
        cylinderTurbina.setOrderRotation(new ArrayList<String>());
        cylinderTurbina.getOrderRotation().add("Z");
        cylinderTurbina.getOrderRotation().add("Y");
        cylinderTurbina.getOrderRotation().add("X");
        return cylinderTurbina;
    }

    private Cube crearCuboTurbinas(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+0.6f,cz,0.1f,0.6f,0.05f);
        cube.getTextureResources().add(R.drawable.level7_aplastadores);
        cube.setSolid(true);
        cube.setNoRotar(true);
        return cube;
    }

    /////////////////////////////////////Colgador///////////////////////////////////////////////////

    private Sphere crearEsferaColgador(float cx, float cy, float cz){
        Sphere sphere = new Sphere(cx-lengthPlano,cy+radioEsfera*2,cz,8,16,0.2f);
        sphere.getTextureResources().add(R.drawable.level7_esfera2);
        sphere.setSolid(true);
        sphere.setcRY(radioEsfera*6);
        sphere.getAnimator().setMaxAngleZ(45);
        sphere.getAnimator().setMinAngleZ(-45);
        sphere.getAnimator().setIncrAngleZ(1);
        sphere.setAgrupable(false);
        return sphere;
    }


    private Plane crearPlanoColgador(float cx, float cy, float cz){
        Plane plane = new Plane(cx-lengthPlano,cy+radioEsfera*2+0.9f,cz,0.03f,0.9f,0);
        plane.getTextureResources().add(R.drawable.level7_esfera);
        plane.setcRY(radioEsfera*6-0.9f);
        plane.setSolid(true);
        plane.getAnimator().setMaxAngleZ(45);
        plane.getAnimator().setMinAngleZ(-45);
        plane.getAnimator().setIncrAngleZ(1);
        return plane;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Cone crearConoMetalico(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,4,0.1f,0.4f);
        cone.getTextureResources().add(R.drawable.level7_esfera2);
        cone.setSolid(true);
        return cone;
    }

    private Cube crearPlanoCubo(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy-lengthPared*2,cz,lengthPlano,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level7_piso);
        return cube;
    }

    /////////////////////////////////////Crear horno////////////////////////////////////////////////

    private Cube crearCuboMetal(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+0.05f,cz,0.2f,0.05f,0.2f);
        cube.getTextureResources().add(R.drawable.level7_piso);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearCuboFuego(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+0.05f,cz,0.19f,0.05f,0.19f);
        cube.getTextureResources().add(R.drawable.level7_fosforescente);
        cube.setSolid(true);
        cube.getAnimator().setIncrRed(5);
        cube.getAnimator().setMinRed(80);
        cube.getAnimator().setIncrGreen(5);
        cube.getAnimator().setMinGreen(80);
        cube.getAnimator().setIncrBlue(5);
        cube.getAnimator().setMinBlue(80);
        return cube;
    }

    /////////////////////////////////Palancas///////////////////////////////////////////////////////

    private Cube crearCuboHorizontalPalanca(float cx, float cy, float cz, float crY, float signo){
        Cube cube = new Cube(cx,cy+0.4f,cz,0.1f,0.05f,0.05f);
        cube.getTextureResources().add(R.drawable.level7_esfera2);
        cube.setSolid(true);
        cube.getAnimator().setIncrAngleX(2*signo);
        cube.getAnimator().setBidirectionalAngleX(false);
        cube.setcRY(crY);
        return cube;
    }

    private Cube crearCuboVerticalPalanca(float cx, float cy, float cz, float signo){
        Cube cube = new Cube(cx,cy+0.5f,cz,0.049f,0.1f,0.049f);
        cube.getTextureResources().add(R.drawable.level7_esfera2);
        cube.setSolid(true);
        cube.getAnimator().setIncrAngleX(2*signo);
        cube.getAnimator().setBidirectionalAngleX(false);
        cube.setcRY(-0.1f);
        return cube;
    }

    private Cube crearCuboPalanca(float cx, float cy, float cz, float signo){
        Cube cube = new Cube(cx,cy+0.4f+0.2f,cz,0.075f,0.075f,0.075f);
        cube.getTextureResources().add(R.drawable.level7_esfera2);
        cube.setSolid(true);
        cube.getAnimator().setIncrAngleX(2*signo);
        cube.getAnimator().setBidirectionalAngleX(false);
        cube.setcRY(-0.2f);
        return cube;
    }

    private Cylinder crearCilindroPalanca(float cx, float cy, float cz, float signo){
        Cylinder cylinderTurbina = new Cylinder(cx,cy+0.4f,cz,0.2f,0.05f,8);
        cylinderTurbina.getTextureResources().add(R.drawable.level7_aplastadores);
        cylinderTurbina.setSolid(true);
        cylinderTurbina.getAnimator().setAngleZ(90);
        cylinderTurbina.getAnimator().setIncrAngleX(2*signo);
        cylinderTurbina.setOrderRotation(new ArrayList<String>());
        cylinderTurbina.getOrderRotation().add("Z");
        cylinderTurbina.getOrderRotation().add("Y");
        cylinderTurbina.getOrderRotation().add("X");
        cylinderTurbina.getAnimator().setBidirectionalAngleX(false);
        return cylinderTurbina;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////Crear puerta//////////////////////////////////////////////

    private Cube crearCuboPuerta(float cx, float cy, float cz, float despY, float signo){
        Cube cube = new Cube(cx-lengthPlano/2+despY,cy+lengthPlano/2,cz,lengthPared/2,lengthPlano/4,lengthPared/2);
        cube.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cube.setSolid(true);
        if (signo < 0){
            cube.getAnimator().setIncrY(-0.01f);
            cube.getAnimator().setY(1.5f);
            cube.getAnimator().setMaxY(1.2f);
            cube.getAnimator().setMinY(0.6f);
        }
        else{
            cube.getAnimator().setIncrY(0.01f);
            cube.getAnimator().setMaxY(0.6f);
            cube.getAnimator().setMinY(0f);
        }
        return cube;
    }

    private Cube crearCuboPuertaHorizontal(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared/2,cz,lengthPlano,lengthPared/2,lengthPared/2);
        cube.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cube.setSolid(true);
        cube.getAnimator().setIncrY(0.01f);
        cube.getAnimator().setMaxY(0.6f);
        cube.getAnimator().setMinY(0f);
        return cube;
    }

    private Cube crearCuboPuertaHorizontal2(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+2*lengthPared/2+2*lengthPlano/4,cz,lengthPlano,lengthPared/2,lengthPared/2);
        cube.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cube.setSolid(true);
        cube.getAnimator().setY(1.2f);
        cube.getAnimator().setIncrY(-0.01f);
        cube.getAnimator().setMaxY(1.2f);
        cube.getAnimator().setMinY(0.6f);
        return cube;
    }

    private Cube crearCuboPuertaVertical(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPlano*2,cz,lengthPared/2,lengthPlano*2,lengthPared/2);
        cube.getTextureResources().add(R.drawable.level6_platillo_circulo);
        cube.setSolid(true);
        return cube;
    }
}
