package com.ball.levels;

import com.ball.activities.R;
import com.ball.shapes.Cone;
import com.ball.shapes.Cube;
import com.ball.shapes.Cylinder;
import com.ball.shapes.Plane;
import com.ball.shapes.Sphere;
import com.ball.shapes.ShapeOpengl;
import com.ball.shapes.Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 05/04/2015.
 */
public class Level9 extends Level{

    @Override
    protected void crearNivel(){
        String level[][] =
                {
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 PA+N0 ",                                 "PH+N0 PA+N0 ",                     "PH+N0 PA+N0 ",                                   "PH+N0 PA+N0 ",               "PD+N0 MD+N1 "},//1
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 EC+N6 ",                     "PH+N0 ",                                         "PH+N0 ",                     "PD+N0 MD+N1 "},//2
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                         "PH+N0 ",                     "PD+N0 MD+N1 "},//3
                        {"PI+N0 ",                                                                    "PH+N0 PR+N0 ",                                 "PH+N0 ",                           "PH+N0 ",                                         "PH+N0 PR+N0 ",               "PD+N0 MD+N1 "},//4
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 MO+N1 ",                     "PH+N0 CA+N0 ",                                   "PH+N0 ",                     "PD+N0 "},//5
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 MO+N1 ",                     "PH+N0 ",                                         "PH+N0 ",                     "PD+N0 MD+N1 "},//6
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 PL+N0 ",                                 "PH+N0 ",                           "PH+N0 ",                                         "PH+N0 ",                     "PD+N0 MD+N1 "},//7
                        {"PI+N0 ",                                                                    "PH+N0 ",                                       "PH+N0 TV+N0 ",                     "PH+N0 ",                                         "PH+N0 ",                     "PD+N0 MD+N1 "},//8
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 PR+N0 ",                                   "PH+N0 ",                     "PD+N0 "},//9
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 CA+N0 ",                                 "PH+N0 ",                           "PH+N0 ",                                         "PH+N0 CA+N0 ",               "PD+N0 MD+N1 "},//10
                        {"PI+N0 ",                                                                    "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 MO+N1 ",                                   "PH+N0 ",                     "PD+N0 MD+N1 "},//11
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 CA+N0 ",                     "PH+N0 PL+N0 ",                                   "PH+N0 TV+N0 ",               "PD+N0 MD+N1 "},//12
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 TV+N0 ",                                 "PH+N0 ",                           "PH+N0 ",                                         "PH+N0 ",                     "PD+N0 "},//13
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 BA+N0 ",                                   "PH+N0 PL+N0 ",               "PD+N0 MD+N1 "},//14
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                         "PH+N0 ",                     "PD+N0 MD+N1 "},//15
                        {"PI+N0 ",                                                                    "PH+N0 PL+N0 ",                                 "PH+N0 TR+N0 ",                     "PH+N0 ",                                         "PH+N0 ",                     "PD+N0 MD+N1 "},//16
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                         "PH+N0 PL+N0 ",               "PD+N0 MD+N1 "},//17
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                         "PH+N0 ",                     "PD+N0 "},//18
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 MO+N1 ",                     "PH+N0 PL+N0 ",                                   "PH+N0 ",                     "PD+N0 MD+N1 "},//19
                        {"PI+N0 ",                                                                    "PH+N0 ",                                       "PH+N0 PL+N0 ",                     "PH+N0 TR+N0 ",                                   "PH+N0 ",                     "PD+N0 MD+N1 "},//20
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                         "PH+N0 ",                     "PD+N0 MD+N1 "},//21
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 CI+Z0 ",                                 "PH+N0 PL+N0 ",                     "PH+N0 CI-Z1 ",                                   "PH+N0 PL+N0 ",               "PD+N0 MD+N1 "},//22
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                         "PH+N0 ",                     "PD+N0 "},//23
                        {"PI+N0 ",                                                                    "PH+N0 ",                                       "PH+N0 BA+N0 ",                     "PH+N0 ",                                         "PH+N0 MO+N1 ",               "PD+N0 MD+N1 "},//24
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                         "PH+N0 MO+N1 ",               "PD+N0 MD+N1 "},//25
                        {"PI+N0 MI+N1 ",                                                              "PH+N0 PL+N0 ",                                 "PH+N0 TE+Y0 ",                     "PH+N0 TE-Y0 ",                                   "PH+N0 PL+N0 ",               "PD+N0 MD+N1 "},//26
                        {"",                                                                          "PI+N0 PA+N0 ",                                 "PH+N0 ",                           "PH+N0 ",                                         "PD+N0 PA+N0 ",               ""},//27
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 TE-Y0 ",                     "PH+N0 TE+Y0 ",                                   "PD+N0 MD+N1 ",               ""},//28
                        {"",                                                                          "PI+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                         "PD+N0 ",                     ""},//29
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 TE+Y0 ",                     "PH+N0 TE-Y0 ",                                   "PD+N0 MD+N1 ",               ""},//30
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 ",                           "PH+N0 ",                                         "PD+N0 ",                     ""},//31
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 MO+N1 ",                     "PH+N0 ",                                         "PD+N0 MD+N1 ",               ""},//32
                        {"",                                                                          "PI+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                         "PD+N0 MD+N1 ",               ""},//33
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 ML+N0 ",                     "PH+N0 ML+N0 ",                                   "PD+N0 ",                     ""},//34
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 ",                           "PH+N0 ",                                         "PD+N0 MD+N1 ",               ""},//35
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 ",                           "PH+N0 MO+N1 ",                                   "PD+N0 MD+N1 ",               ""},//36
                        {"",                                                                          "PI+N0 ",                                       "PH+N0 TN+N0 ",                     "PH+N0 TN+N0 ",                                   "PD+N0 MD+N1 ",               ""},//37
                        {"",                                                                          "",                                             "",                                 "",                                               "",                           ""},//38
                        {"",                                                                          "",                                             "TV+N-8 TI+N-8 ",                   "TV+N-8 ",                                        "",                           ""},//39
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "CS+N0 PV+N0 PH+N0 ",               "CS+N0 P2+N0 PH+N0 ",                             "PD+N0 ",                     ""},//40
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 ",                           "PH+N0 ",                                         "PD+N0 MD+N1 ",               ""},//42
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 ML+N0 ",                     "PH+N0 ML+N0 ",                                   "PD+N0 MD+N1 ",               ""},//43
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 ",                           "PH+N0 ",                                         "PD+N0 MD+N1 ",               ""},//44
                        {"",                                                                          "PI+N0 ",                                       "AR+N0 PL+N0 ",                     "AR+N0 ",                                         "PD+N0 ",                     ""},//45
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 ",                           "AR+N0 PL+N0 ",                                   "PD+N0 MD+N1 ",               ""},//46
                        {"",                                                                          "PI+N0 ",                                       "AR+N0 ",                           "AR+N0 ",                                         "PD+N0 MD+N1 ",               ""},//47
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 CA+N0 ",                     "AR+N0 ",                                         "PD+N0 MD+N1 ",               ""},//48
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 ",                           "AR+N0 ",                                         "PD+N0 ",                     ""},//49
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 MO+N1 ",                     "AR+N0 CA+N0 ",                                   "PD+N0 MD+N1 ",               ""},//50
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 MO+N1 ",                     "AR+N0 ",                                         "PD+N0 MD+N1 ",               ""},//51
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 ",                           "AR+N0 ",                                         "PD+N0 MD+N1 ",               ""},//52
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 CA+N0 ",                     "AR+N0 CA+N0 ",                                   "PD+N0 MD+N1 ",               ""},//53
                        {"",                                                                          "PI+N0 ",                                       "AR+N0 CA+N0 ",                     "AR+N0 CA+N0 ",                                   "PD+N0 MD+N1 ",               ""},//54
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 CA+N0 ",                     "AR+N0 ",                                         "PD+N0 MD+N1 ",               ""},//55
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 ",                           "AR+N0 CA+N0 ",                                   "PD+N0 MD+N1 ",               ""},//56
                        {"",                                                                          "PI+N0 ",                                       "AR+N0 ",                           "AR+N0 ",                                         "PD+N0 ",                     ""},//57
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 ",                           "AR+N0 PM+N0 ",                                   "PD+N0 MD+N1 ",               ""},//58
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 ",                           "AR+N0 ",                                         "PD+N0 MD+N1 ",               ""},//59
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 PR+N0 ",                     "AR+N0 ",                                         "PD+N0 MD+N1 ",               ""},//60
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 ",                           "AR+N0 ",                                         "PD+N0 ",                     ""},//61
                        {"",                                                                          "PI+N0 ",                                       "AR+N0 MO+N1 ",                     "AR+N0 PM+N0 ",                                   "PD+N0 MD+N1 ",               ""},//62
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 MO+N1 ",                     "AR+N0 ",                                         "PD+N0 MD+N1 ",               ""},//63
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "AR+N0 ",                           "AR+N0 ",                                         "PD+N0 MD+N1 ",               ""},//64
                        {"",                                                                          "",                                             "PI+N0 MI+N1 PA+N0 ",               "AR+N0 TN+N0 ",                                   "PD+N0 MD+N1 ",               ""},//65
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 TN+N0 ",                                   "PD+N0 MD+N1 ",               ""},//66
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 TN+N0 ",                                   "PD+N0 MD+N1 ",               ""},//67
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 TN+N0 ",                                   "PD+N0 MD+N1 ",               ""},//68
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 ",                                         "PD+N0 MD+N1 ",               ""},//69
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 ",                                         "PD+N0 MD+N1 ",               ""},//70
                        {"",                                                                          "",                                             "",                                 "MO+N1 ",                                         "",                           ""},//71
                        {"",                                                                          "",                                             "",                                 "TV+N-8 ",                                        "",                           ""},//72
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "CS+N0 P2+N0 PV+N0 PH+N0 ",                       "PD+N0 ",                     ""},//73
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "PH+N0 ",                                         "PD+N0 MD+N1 ",               ""},//74
                        {"",                                                                          "",                                             "PI+N0 ",                           "PH+N0 ",                                         "PD+N0 ",                     ""},//75
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "PH+N0 PL+N0 ",                                   "PD+N0 MD+N1 ",               ""},//76
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "PH+N0 ",                                         "PD+N0 ",                     ""},//77
                        {"",                                                                          "",                                             "PI+N0 ",                           "PH+N0 PL+N0 ",                                   "PD+N0 MD+N1 ",               ""},//78
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "PH+N0 ",                                         "PD+N0 MD+N1 ",               ""},//79
                        {"",                                                                          "",                                             "",                                 "",                                               "",                           ""},//80
                        {"",                                                                          "",                                             "",                                 "TV+N-8 ",                                        "",                           ""},//81
                        {"",                                                                          "",                                             "PI+N0 ",                           "CS+N0 P2+N0 PV+N0 PH+N0 ",                       "PD+N0 ",                     ""},//82
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "PH+N0 ",                                         "PD+N0 MD+N1 ",               ""},//83
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "PH+N0 ML+N0 ",                                   "PD+N0 ",                     ""},//84
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "PH+N0 MO+N1 ",                                   "PD+N0 MD+N1 ",               ""},//85
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 PA+N0 ",                     "PH+N0 ",                                         "PD+N0 MD+N1 ",               ""},//86
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 TE+Y0 ",                     "PH+N0 TE-Y0 ",                                   "PD+N0 ",                     ""},//87
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 ",                           "PH+N0 ",                                         "PD+N0 MD+N1 ",               ""},//88
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 TE+Y0 ",                     "PH+N0 TE-Y0 ",                                   "PD+N0 ",                     ""},//89
                        {"",                                                                          "PI+N0 MI+N1 ",                                 "PH+N0 ",                           "PH+N0 ",                                         "PD+N0 MD+N1 ",               ""},//90
                        {"",                                                                          "",                                             "",                                 "",                                               "",                           ""},//91
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 PA+N-1 ",                                  "AR+N0 PA+N-1 ",              "PD+N0 MD+N1 "},//92
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 ",                                         "AR+N0 PM+N0 ",               "PD+N0 MD+N1 "},//93
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 ",                                         "AR+N0 ",                     "PD+N0 MD+N1 "},//94
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 PM+N0 ",                                   "AR+N0 ",                     "PD+N0 MD+N1 "},//95
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 MO+N1 ",                                   "AR+N0 PR+N0 ",               "PD+N0 MD+N1 "},//96
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 MO+N1 ",                                   "AR+N0 ",                     "PD+N0 MD+N1 "},//97
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 CI-Z0 ",                                   "AR+N0 CI-Z0 ",               "PD+N0 MD+N1 "},//98
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 ",                                         "AR+N0 ",                     "PD+N0 MD+N1 "},//99
                        {"",                                                                          "",                                             "PI+N0 MI+N1 ",                     "AR+N0 ",                                         "AR+N0 ",                     "PD+N0 MD+N1 "},//100
                };
        //Mundo
        world.getTextureResources().add(R.drawable.level9_fondo);
        //Constantes
        crashResource = R.raw.plastico;
        musicResource = R.raw.island_musica;
        this.level = level;
    }

    @Override
    protected List<ShapeOpengl> crearObjeto(String figura,float x,float y,float z){
        List<ShapeOpengl> shapes = new ArrayList<>();
        if (figura.equals("AR")){
            shapes.add(crearPlanoHorizontalArena(x, y, z));
        }
        if (figura.equals("BA")){
            shapes.add(crearBalsa(x,y,z));
            shapes.add(crearPaloBalsa(x,y,z,-lengthPlano-0.2f));
            shapes.add(crearPaloBalsa(x+0.3f,y,z,-lengthPlano-0.2f));
            shapes.add(crearPaloBalsa(x-0.3f,y,z,-lengthPlano-0.2f));

            shapes.add(crearPaloBalsa(x,y,z,lengthPlano+0.2f));
            shapes.add(crearPaloBalsa(x+0.3f,y,z,lengthPlano+0.2f));
            shapes.add(crearPaloBalsa(x-0.3f,y,z,lengthPlano+0.2f));
        }
        if (figura.equals("CA")){
            shapes.add(crearConoArena(x,y,z));
        }
        if (figura.equals("CI")){
            shapes.add(crearCilindrosIndustriales(x,y,z,1));
            shapes.add(crearCuboIndustrial(x,y,z,90));
            shapes.add(crearCuboIndustrial(x,y,z,0));
        }
        if (figura.equals("CS")){
            shapes.add(crearCacada(x,y,z));
            shapes.add(crearCacada(x,y-lengthPlano*2,z));
        }
        if (figura.equals("EC")){
            crearEsferaCristalina(x,y,z);
        }
        if (figura.equals("MD")){
            shapes.add(crearConoMetalico(x-lengthPlano/2-lengthPared,y,z));
        }
        if (figura.equals("MI")){
            shapes.add(crearConoMetalico(x+lengthPlano/2+lengthPared,y,z));
        }
        if (figura.equals("ML")){
            shapes.add(crearCuboMolino(x,y,z,0));
            shapes.add(crearCuboMolino(x,y,z,180));
            shapes.add(crearCuboMolino(x,y,z,240));
            shapes.add(crearCuboMolino(x-lengthPlano,y,z));
            shapes.add(crearCuboMolino(x+lengthPlano,y,z));
        }
        if (figura.equals("MO")){
            shapes.add(crearMoneda(x, y, z));
        }
        if (figura.equals("P2")){
            shapes.add(crearParedVertical(x+lengthPlano+lengthPared, y, z));
            shapes.add(crearParedVertical(x+lengthPlano+lengthPared, y-lengthPlano*2, z));
        }
        if (figura.equals("PH")){
            shapes.add(crearPlanoHorizontal(x,y,z));
        }
        if (figura.equals("PA")){
            shapes.add(crearParedAnchura(x,y,z));
        }
        if (figura.equals("PD")){
            shapes.add(crearParedDerechaProfundidad(x,y,z));
        }
        if (figura.equals("PI")){
            shapes.add(crearParedIzquierdaProfundidad(x, y, z));
        }
        if (figura.equals("PL")){
            shapes.add(crearTriangulo(x, y, z+0.1f));
            shapes.add(crearTriangulo(x+0.06f, y-0.06f, z));
            shapes.add(crearTriangulo(x+0.16f, y-0.07f, z-0.12f));
            shapes.add(crearTriangulo(x-0.12f, y-0.19f, z));
            shapes.add(crearTriangulo(x-0.19f, y-0.4f, z+0.2f));
            shapes.add(crearTriangulo(x-0.27f, y-0.2f, z+0.26f));
            shapes.add(crearTriangulo(x+0.27f, y, z-0.26f));
        }
        if (figura.equals("PM")){
            shapes.add(crearConoPalmera(x, y, z));
            shapes.add(crearHojaPalmera(x, y+0.6f+0.2f, z, 0));
            shapes.add(crearHojaPalmera(x, y+0.6f+0.2f, z, 45));
            shapes.add(crearHojaPalmera(x, y+0.6f+0.2f, z, 135));
            shapes.add(crearHojaPalmera(x, y+0.6f+0.2f, z, -45));
            shapes.add(crearHojaPalmera(x, y+0.6f+0.2f, z, -135));
            shapes.add(crearHojaPalmera(x, y+0.6f+0.2f, z, -90));
            shapes.add(crearHojaPalmera(x, y+0.6f+0.2f, z, 90));
        }
        if (figura.equals("PR")){
            shapes.add(crearPiedra(x, y, z));
        }
        if (figura.equals("PV")){
            shapes.add(crearParedVertical(x-lengthPlano-lengthPared, y, z));
            shapes.add(crearParedVertical(x-lengthPlano-lengthPared, y-lengthPlano*2, z));
        }
        if (figura.equals("TE")){
            shapes.add(crearTroncoVerticalGrueso(x,y,z));
            shapes.add(crearConoVertical0(x,y+0.2f,z));
            shapes.add(crearConoVertical90(x,y+0.5f,z));
            shapes.add(crearConoVertical90(x,y+0.6f,z));
            shapes.add(crearConoVertical0(x,y+0.7f,z));
        }
        if (figura.equals("TI")){
            shapes.add(crearTronco(x+lengthPlano, y, z));
        }
        if (figura.equals("TN")){
            shapes.add(crearCuboTriangulo(x-lengthPlano/1.5f,y,z,135));
            shapes.add(crearCuboTriangulo(x+lengthPlano/1.5f,y,z,45));
        }
        if (figura.equals("TR")){
            shapes.add(crearPezEsfera1(x, y, z));
            shapes.add(crearPezEsfera2(x+0.4f, y, z));
        }
        if (figura.equals("TV")){
            shapes.add(crearTronco(x, y, z));
        }
        continueShapeCreation(shapes,figura,x,y,z);
        return shapes;
    }
    private void crearEsferaCristalina(float cx,float cy,float cz){
        sphere = new Sphere(cx,cy+radioEsfera*5,cz,12,24,radioEsfera);
        sphere.getTextureResources().add(R.drawable.level9_pelota);
    }

    private Plane crearPlanoHorizontal(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level9_agua1);
        plane.getTextureResources().add(R.drawable.level9_agua2);
        plane.getTextureResources().add(R.drawable.level9_agua3);
        plane.getTextureResources().add(R.drawable.level9_agua4);
        plane.getTextureResources().add(R.drawable.level9_agua5);
        plane.getTextureResources().add(R.drawable.level9_agua6);
        plane.getTextureResources().add(R.drawable.level9_agua7);
        plane.getTextureResources().add(R.drawable.level9_agua8);
        plane.setRGBA(1f, 1f, 1f, 0.4f);
        plane.setDespYSinColision(radioEsfera/1.5f);
        plane.setWatter(true);
        plane.createMirroredTextureCoordinates(lengthPlano);
        return plane;
    }

    private Plane crearPlanoHorizontalArena(float cx, float cy, float cz){
        Plane planeArena = new Plane(cx,cy+radioEsfera/1.5f,cz,lengthPlano,0,lengthPlano);
        planeArena.getTextureResources().add(R.drawable.level9_arena);
        planeArena.createMirroredTextureCoordinates(lengthPlano);
        return planeArena;
    }

    private Cube crearParedDerechaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx-lengthPlano+lengthPared,cy+lengthPared+radioEsfera/1.5f,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level4_piso);
        return cube;
    }

    private Cube crearParedIzquierdaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx+lengthPlano-lengthPared,cy+lengthPared+radioEsfera/1.5f,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level4_piso);
        return cube;
    }

    private Cube crearParedAnchura(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared+radioEsfera/1.5f,cz+lengthPlano+lengthPared,lengthPlano,lengthPared,lengthPared);
        cube.getTextureResources().add(R.drawable.level4_piso);
        return cube;
    }

    private Cone crearConoArena(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy+radioEsfera/1.5f,cz,8,lengthPlano,0.5f);
        cone.getTextureResources().add(R.drawable.level9_arena);
        cone.setSolid(true);
        return cone;
    }

    private Sphere crearPiedra(float cx, float cy, float cz){
        Sphere sphere = new Sphere(cx,cy,cz,4,8,radioEsfera*2.5f);
        sphere.getTextureResources().add(R.drawable.level3_cono2);
        sphere.setSolid(true);
        return sphere;
    }

    private Cone crearConoMetalico(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy+radioEsfera/1.5f,cz,4,0.1f,0.4f);
        cone.getTextureResources().add(R.drawable.level3_cono2);
        cone.setSolid(true);
        return cone;
    }

    ///////////////////////////////////////Balsa////////////////////////////////////////////////////

    private Cube crearBalsa(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+radioEsfera/1.5f,cz,lengthPared*3,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level9_balsa);
        cube.setSolid(true);
        cube.getAnimator().setAngleY(90);
        //Movimiento X
        cube.getAnimator().setMaxX(0.4f);
        cube.getAnimator().setMinX(-0.4f);
        cube.getAnimator().setIncrX(0.004f);
        return cube;
    }

    private Plane crearPaloBalsa(float cx, float cy, float cz, float despZ){
        Plane plane = new Plane(cx,cy+3*lengthPared/4+radioEsfera/1.5f,cz-0.3f*Math.signum(despZ),0.04f,0,0.3f);
        plane.getTextureResources().add(R.drawable.level9_balsa);
        plane.setcRZ(0.3f*Math.signum(despZ));
        plane.getAnimator().setIncrAngleX(0.1f);
        if (despZ < 0){
            plane.getAnimator().setMaxAngleX(10);
            plane.getAnimator().setMinAngleX(5);
        }
        else{
            plane.getAnimator().setMaxAngleX(-5);
            plane.getAnimator().setMinAngleX(-10);
        }
        plane.setSolid(true);
        //Movimiento X
        plane.getAnimator().setMaxX(0.4f);
        plane.getAnimator().setMinX(-0.4f);
        plane.getAnimator().setIncrX(0.004f);
        //Desplazamiento Z
        plane.getAnimator().setMaxZ(-despZ);
        plane.getAnimator().setMinZ(-despZ);
        plane.getAnimator().setZ(-despZ+0.3f*Math.signum(despZ));
        return plane;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Cylinder crearTronco(float cx, float cy, float cz){
        Cylinder tronco = new Cylinder(cx,cy+0.2f,cz,0.2f,0.3f,16);
        tronco.getAnimator().setAngleZ(90);
        tronco.getTextureResources().add(R.drawable.level3_tronco);
        tronco.setSolid(true);
        //TraslacionY
        tronco.getAnimator().setMaxY(-0.05f);
        tronco.getAnimator().setMinY(-0.1f);
        tronco.getAnimator().setIncrY(0.0005F);
        //TraslacionX
        tronco.getAnimator().setMaxX(0.1f);
        tronco.getAnimator().setMinX(-0.1f);
        tronco.getAnimator().setIncrX(0.0003F);
        return tronco;
    }

    /////////////////////////////////Planta/////////////////////////////////////////////////////////

    private Triangle crearTriangulo(float cx, float cy, float cz){
        Triangle triangle = new Triangle(cx,cy+radioEsfera/1.5f,cz,0.1f,0.4f,0);
        triangle.getTextureResources().add(R.drawable.level9_hierva);
        triangle.setSolid(true);
        return triangle;
    }

    //////////////////////////////////Pezcado///////////////////////////////////////////////////////

    private Sphere crearPezEsfera1(float cx, float cy, float cz){
        Sphere sphere = new Sphere(cx,cy+radioEsfera/1.5f,cz,4,8,radioEsfera);
        sphere.getTextureResources().add(R.drawable.level9_pez_cabeza);
        sphere.setSolid(true);
        sphere.getAnimator().setMaxY(0.03f);
        sphere.getAnimator().setMinY(-0.06f);
        sphere.getAnimator().setIncrY(0.0005);
        sphere.getAnimator().setMinX(-0.5f);
        sphere.getAnimator().setIncrX(-0.002f);
        return sphere;
    }

    private Sphere crearPezEsfera2(float cx, float cy, float cz){
        Sphere sphere = new Sphere(cx-0.05f,cy+radioEsfera/1.5f,cz,4,8,radioEsfera*2);
        sphere.getTextureResources().add(R.drawable.level9_pez_cuerpo);
        sphere.setSolid(true);
        sphere.getAnimator().setMaxY(0.03f);
        sphere.getAnimator().setMinY(-0.06f);
        sphere.getAnimator().setIncrY(0.0005);
        sphere.getAnimator().setMinX(-0.5f);
        sphere.getAnimator().setIncrX(-0.002f);
        return sphere;
    }

    /////////////////////////////Crear cilindros industriales///////////////////////////////////////

    private Cylinder crearCilindrosIndustriales(float cx, float cy, float cz, float escale){
        Cylinder cylinderRueda = new Cylinder(cx,cy,cz,0.3f*escale,0.03f*escale,12);
        cylinderRueda.getTextureResources().add(R.drawable.level9_balsa);
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
        cube.getTextureResources().add(R.drawable.level9_balsa);
        cube.setSolid(true);
        cube.getAnimator().setAngleZ(anguloinicialY);
        cube.setOrderRotation(new ArrayList<String>());
        cube.getOrderRotation().add("X");
        cube.getOrderRotation().add("Y");
        cube.getOrderRotation().add("Z");
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////Arbol espinado/////////////////////////////////////////////////////////

    private Cylinder crearTroncoVerticalGrueso(float cx, float cy, float cz){
        Cylinder tronco = new Cylinder(cx,cy+0.5f,cz,0.2f,0.5f,16);
        tronco.getTextureResources().add(R.drawable.level3_tronco);
        tronco.setSolid(true);
        return tronco;
    }

    private Cone crearConoVertical90(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,6,0.2f,0.4f);
        cone.getAnimator().setAngleZ(90);
        cone.getTextureResources().add(R.drawable.level3_cono2);
        cone.setSolid(true);
        return cone;
    }

    private Cone crearConoVertical0(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,6,0.2f,0.4f);
        cone.getAnimator().setAngleZ(90);
        cone.getAnimator().setAngleY(90);
        cone.getTextureResources().add(R.drawable.level3_cono2);
        cone.setSolid(true);
        return cone;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////Molino//////////////////////////////////////////////////

    private Cube crearCuboMolino(float cx, float cy, float cz, float anguloInicial){
        Cube cube = new Cube(cx,cy+2*lengthPlano,cz,lengthPlano,0.05f,0.05f);
        cube.getTextureResources().add(R.drawable.level9_balsa);
        cube.getAnimator().setIncrAngleX(1);
        cube.getAnimator().setMaxAngleX(360);
        cube.getAnimator().setMinAngleX(0);
        cube.getAnimator().setAngleX(anguloInicial);
        cube.getAnimator().setBidirectionalAngleX(false);
        cube.setcRY(-lengthPlano);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearCuboMolino(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPlano,cz,lengthPared/2,lengthPlano,lengthPlano);
        cube.getTextureResources().add(R.drawable.level9_balsa);
        cube.setSolid(true);
        cube.getAnimator().setIncrAngleX(1);
        cube.getAnimator().setMaxAngleX(360);
        cube.getAnimator().setMinAngleX(0);
        cube.getAnimator().setBidirectionalAngleX(false);
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////Triangle hundible///////////////////////////////////////////////

    private Cube crearCuboTriangulo(float cx, float cy, float cz, float AnguloZ){
        Cube cube = new Cube(cx,cy+lengthPlano/1.3f,cz,lengthPared/2,lengthPlano,lengthPared/2);
        cube.getTextureResources().add(R.drawable.level7_aplastadores);
        cube.setSolid(true);
        cube.getAnimator().setAngleZ(AnguloZ);
        cube.getAnimator().setMinY(-0.2f);
        cube.getAnimator().setMaxY(0.03f);
        cube.getAnimator().setIncrY(-0.003f);
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////Hueco/////////////////////////////////////////////////////

    private Plane crearCacada(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy+radioEsfera/1.5f-lengthPlano,cz+lengthPlano,lengthPlano,lengthPlano,0);
        plane.getTextureResources().add(R.drawable.level9_agua1);
        plane.getTextureResources().add(R.drawable.level9_agua2);
        plane.getTextureResources().add(R.drawable.level9_agua3);
        plane.getTextureResources().add(R.drawable.level9_agua4);
        plane.getTextureResources().add(R.drawable.level9_agua5);
        plane.getTextureResources().add(R.drawable.level9_agua6);
        plane.getTextureResources().add(R.drawable.level9_agua7);
        plane.getTextureResources().add(R.drawable.level9_agua8);
        plane.createMirroredTextureCoordinates(lengthPlano);
        return plane;
    }

    private Cube crearParedVertical(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy-lengthPlano+radioEsfera/1.5f,cz+lengthPlano,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level4_piso);
        cube.getAnimator().setAngleX(90);
        return cube;
    }

    //////////////////////////////////Palmera///////////////////////////////////////////////////////

    private Cone crearConoPalmera(float cx, float cy, float cz){
        Cone conePalmera = new Cone(cx,cy,cz,6,0.15f,0.6f);
        conePalmera.getTextureResources().add(R.drawable.level4_columns_hor);
        conePalmera.setSolid(true);
        return conePalmera;
    }

    private Triangle crearHojaPalmera(float cx, float cy, float cz, float anguloZ){
        Triangle triangleHoja = new Triangle(cx,cy,cz+0.1f,0.1f,0.2f,0);
        triangleHoja.getTextureResources().add(R.drawable.level3_hojas);
        triangleHoja.getAnimator().setAngleZ(anguloZ);
        if (anguloZ < 0){
            triangleHoja.getAnimator().setMinAngleZ(anguloZ);
        }
        triangleHoja.setcRY(-0.2f);
        triangleHoja.setSolid(true);
        return triangleHoja;
    }
}



