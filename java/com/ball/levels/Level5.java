package com.ball.levels;

import com.ball.activities.R;
import com.ball.shapes.Cone;
import com.ball.shapes.Cube;
import com.ball.shapes.Cylinder;
import com.ball.shapes.Sphere;
import com.ball.shapes.Plane;
import com.ball.shapes.ShapeOpengl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 13/03/2015.
 */
public class Level5 extends Level {

    @Override
    protected void crearNivel(){
        String level[][] =
                {{"PI+N0 "    			,"PH+N0 PA+N0 "   			    ,"PH+N0 PA+N0 "   			,"PH+N0 PA+N0 "	   				,"PH+N0 PA+N0 "   	,"PD+N0 "},//1
                 {"PI+N0 "    			,"PH+N0 "						,"PH+N0 "   				,"PH+N0 "						,"PH+N0 "  			,"PD+N0 "},//2
                 {"PI+N0 MI+N1 "  		,"PH+N0 "		    			,"PH+N0 EC+N6 "    			,"PH+N0 "						,"PH+N0 "           ,"PD+N0 "},//3
                 {"PI+N0 "         		,"PH+N0 "						,"PH+N0 "					,"PH+N0 "   					,"PH+N0 "           ,"PD+N0 MD+N1 "},//4
                 {"PI+N0 MI+N1 "      	,"PH+N0 "   	  				,"PH+N0 "            		,"PH+N0 "						,"PH+N0 "   		,"PD+N0 "},//5
                 {"PI+N0 MI+N1 "        ,"PH+N0 "                       ,"PH+N0 MO+N1 "             ,"PH+N0 CB+N0 "                 ,"PH+N0 "           ,"PD+N0 MD+N1 "},//6
                 {"PI+N0 "              ,"PH+N0 CH+N0 "                 ,"PH+N0 "                   ,"PH+N0 "                       ,"PH+N0 PC+N0 "     ,"PD+N0 MD+N1 "},//7
                 {"PI+N0 MI+N1 "        ,"PH+N0 "                       ,"PH+N0 "                   ,"PH+N0 PC+N0 "                 ,"PH+N0 "           ,"PD+N0 "},//8
                 {"PI+N0 "              ,"PH+N0 "                       ,"PH+N0 "                   ,"PH+N0 "                       ,"PH+N0 "           ,"PD+N0 "},//9
                 {"PI+N0 MI+N1 "        ,"PH+N0 "                       ,"PH+N0 CB+N0 "             ,"PH+N0 CH+N0 "                 ,"PH+N0 "           ,"PD+N0 MD+N1 "},//10
                 {"PI+N0 "              ,"PH+N0 "                       ,"PH+N0 "                   ,"PH+N0 "                       ,"PH+N0 "           ,"PD+N0 "},//11
                 {"PI+N0 "              ,"PH+N0 PC+N0 "                 ,"PH+N0 "                   ,"PH+N0 PC+N0 "                 ,"PH+N0 CH+N0 "     ,"PD+N0 MD+N1 "},//12
                 {"PI+N0 MI+N1 "        ,"PH+N0 "                       ,"PH+N0 MO+N1 "             ,"PH+N0 "                       ,"PH+N0 "           ,"PD+N0 "},//13
                 {"PI+N0 MI+N1 "        ,"PH+N0 "                       ,"PH+N0 "                   ,"PH+N0 CM+N0 "                 ,"PH+N0 "           ,"PD+N0 MD+N1 "},//14
                 {"PI+N0 "              ,"PH+N0 CB+N0 "                 ,"PH+N0 "                   ,"PH+N0 "                       ,"PH+N0 PC+N0 "     ,"PD+N0 MD+N1 "},//15
                 {"PI+N0 MI+N1 "        ,"PH+N0 "                       ,"PH+N0 CH+N0 "             ,"PH+N0 "                       ,"PH+N0 "           ,"PD+N0 MD+N1 "},//16
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//17
                 {""                    ,""                             ,"CR+N0 "                   ,""                             ,""                 ,""},//18
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//19
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//20
                 {""                    ,""                             ,"CR+N1 "                   ,""                             ,""                 ,""},//21
                 {""                    ,""                             ,"CR+N1 PC+N1 "             ,""                             ,""                 ,""},//22
                 {""                    ,""                             ,"CR+N1 "                   ,""                             ,""                 ,""},//23
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//24
                 {""                    ,"PI+N1 MI+N1 "                 ,"CR+N1 "                   ,"PD+N1 MD+N2 "                 ,""                 ,""},//25
                 {""                    ,"PI+N1 "                       ,"CR+N1 "                   ,"PD+N1 "                       ,""                 ,""},//26
                 {""                    ,"PI+N1 MI+N1 "                 ,"CR+N1 PC+N1 "             ,"PD+N1 MD+N2 "                 ,""                 ,""},//27
                 {""                    ,"PI+N1 "                       ,"PH+N1 "                   ,"PD+N1 "                       ,""                 ,""},//28
                 {""                    ,"PI+N1 MI+N1 "                 ,"PH+N1 MO+N2 "             ,"PD+N1 MD+N2 "                 ,""                 ,""},//29
                 {"PI+N1  MI+N2 "       ,"PA+N1 PH+N1 "                 ,"PH+N1 "                   ,"PA+N1 PH+N1 "                 ,"PD+N1 MD+N2 "     ,""},//30
                 {"PI+N1 "              ,"PH+N1 CB+N1 "                 ,"PH+N1 "                   ,"PH+N1 PC+N1"                  ,"PD+N1 MD+N2 "     ,""},//31
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PH+N1 CH+N1 "             ,"PH+N1 "                       ,"PD+N1 "           ,""},//32
                 {"PI+N1 "              ,"PH+N1 PC+N1 "                 ,"PH+N1 "                   ,"PH+N1 CH+N1 "                 ,"PD+N1 "           ,""},//33
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PH+N1 "                   ,"PH+N1 "                       ,"PD+N1 MD+N2 "     ,""},//34
                 {"PI+N1 "              ,"PH+N1 "                       ,"PH+N1 TH+N1 "             ,"PH+N1 "                       ,"PD+N1 "           ,""},//35
                 {"PI+N1 MI+N2 "        ,"PH+N1 PC+N1 "                 ,"PH+N1 "                   ,"PH+N1 PC+N1 "                 ,"PD+N1 MD+N2 "     ,""},//36
                 {"PI+N1 "              ,"PH+N1 "                       ,"PH+N1 "                   ,"PH+N1 "                       ,"PD+N1 "           ,""},//37
                 {"PI+N1 MI+N2 "        ,"PH+N1 PC+N1 "                 ,"PH+N1 CP+N1 "             ,"PH+N1 CH+N1 "                 ,"PD+N1 MD+N2 "     ,""},//38
                 {"PI+N1 MI+N2 "        ,"PH+N1 CB+N1 "                 ,"PH+N1 "                   ,"PH+N1 "                       ,"PD+N1 MD+N2 "     ,""},//39
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//40
                 {""                    ,"PI+N2 MI+N3 "                 ,"PH+N2 PA+N1 "             ,"PH+N2 PA+N1 "                 ,"PD+N2 "           ,""},//41
                 {""                    ,"PI+N2 "                       ,"CR+N2 PC+N2 "             ,"CR+N2 "                       ,"PD+N2 MD+N3 "     ,""},//42
                 {""                    ,"PI+N2 MI+N3 "                 ,"CR+N2 PT+Y2 "             ,"CR+N2 PT-Y2 "                 ,"PD+N2 "           ,""},//43
                 {""                    ,"PI+N3 MI+N4 "                 ,"PH+N3 PA+N2 "             ,"PH+N3 PA+N2 "                 ,"PD+N3 MD+N4 "     ,""},//44
                 {""                    ,"PI+N3 "                       ,"PH+N3 "                   ,"PH+N3 "                       ,"PD+N3 MD+N4 "     ,""},//45
                 {""                    ,"PI+N3 "                       ,"PH+N3 "                   ,"PH+N3 PC+N3 "                 ,"PD+N3 "           ,""},//46
                 {""                    ,"PI+N3 MI+N4 "                 ,"PH+N3 CH+N3 "             ,"PH+N3 "                       ,"PD+N3 MD+N4 "     ,""},//47
                 {""                    ,"PI+N3 "                       ,"PH+N3 "                   ,"PH+N3 "                       ,"PD+N3 "           ,""},//48
                 {""                    ,"PI+N3 MI+N4 "                 ,"CR+N3 "                   ,"CR+N3 "                       ,"PD+N3 "           ,""},//49
                 {""                    ,"PI+N3 "                       ,"CR+N3 CB+N3 MO+N5 "       ,"CR+N3 "                       ,"PD+N3 MD+N4"      ,""},//50
                 {""                    ,"PI+N2 MI+N3 "                 ,"PH+N2 "                   ,"PH+N2 "                       ,"PD+N2 "           ,""},//51
                 {""                    ,"PI+N2 MI+N3 "                 ,"PH+N2 PE+N2 "             ,"PH+N2 PR+N2 "                 ,"PD+N2 MD+N3 "     ,""},//52
                 {""                    ,"PI+N2 "                       ,"PH+N2 MO+N3 "             ,"PH+N2 "                       ,"PD+N2 "           ,""},//53
                 {""                    ,"PI+N2 MI+N3 "                 ,"PH+N2 PC+N2 "             ,"PH+N2 PC+N2 "                 ,"PD+N2 MD+N3 "     ,""},//54
                 {""                    ,"PI+N2 "                       ,"PH+N2 "                   ,"PH+N2 "                       ,"PD+N2 MD+N3 "     ,""},//55
                 {""                    ,"PI+N2 MI+N3 "                 ,"PH+N2 "                   ,"PH+N2 "                       ,"PD+N2 "           ,""},//56
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//57
                 {"PI+N4 "              ,"PH+N4 PA+N3 "                 ,"PH+N4 PA+N3 "             ,"PH+N4 PA+N3 "                 ,"PD+N4 "           ,""},//58
                 {"PI+N4 MI+N5 "        ,"PH+N4 PE+N4 "                 ,"PH+N4 CP+N4 "             ,"PH+N4 TH+N4 "                 ,"PD+N4 MD+N5 "     ,""},//59
                 {"PI+N4 "              ,"PH+N4 "                       ,"PH+N4 "                   ,"PH+N4 "                       ,"PD+N4 "           ,""},//60
                 {"PI+N4 MI+N5 "        ,"PH+N4 PC+N4 "                 ,"PH+N4 "                   ,"PH+N4 "                       ,"PD+N4 MD+N5 "     ,""},//61
                 {"PI+N4 MI+N5 "        ,"PH+N4 "                       ,"PH+N4 MO+N5 "             ,"PH+N4 CB+N4 "                 ,"PD+N4 "           ,""},//62
                 {"PI+N4 "              ,"PH+N4 "                       ,"PH+N4 "                   ,"PH+N4 "                       ,"PD+N4 MD+N5 "     ,""},//63
                 {"PI+N4 MI+N5 "        ,"PH+N4 "                       ,"PH+N4 CM+N4 "             ,"PH+N4 "                       ,"PD+N4 MD+N5 "     ,""},//64
                 {"PI+N4 "              ,"PH+N4 CH+N4 "                 ,"PH+N4 "                   ,"PH+N4 "                       ,"PD+N4 "           ,""},//65
                 {"PI+N4 MI+N5 "        ,"PH+N4 "                       ,"PH+N4 MO+N5 "             ,"PH+N4 PC+N4 "                 ,"PD+N4 MD+N5 "     ,""},//66
                 {"PI+N4 "              ,"PH+N4 "                       ,"PH+N4 PC+N4 "             ,"PH+N4 "                       ,"PD+N4 "           ,""},//67
                 {"PI+N4 "              ,"CR+N4 "                       ,"CR+N4 "                   ,"CR+N4 "                       ,"PD+N4 MD+N5 "     ,""},//68
                 {"PI+N4 MI+N5 "        ,"CR+N4 PT+Y4 "                 ,"CR+N4 PT-Y4 "             ,"CR+N4 "                       ,"PD+N4 "           ,""},//69
                 {"PI+N3 MI+N4 "        ,"PH+N3 "                       ,"PH+N3 "                   ,"PH+N3 "                       ,"PD+N3 MD+N4 "     ,""},//70
                 {"PI+N3 "              ,"PH+N3 "                       ,"PH+N3 TH+N3 "             ,"PH+N3 MO+N4 "                 ,"PD+N3 MD+N4 "     ,""},//71
                 {"PI+N3 MI+N4 "        ,"PH+N3 "                       ,"PH+N3 "                   ,"PH+N3 CM+N3 "                 ,"PD+N3 "           ,""},//72
                 {"PI+N3 "              ,"PH+N3 TH+N3 "                 ,"PH+N3 "                   ,"PH+N3 "                       ,"PD+N3 MD+N4 "     ,""},//73
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//74
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//75
                 {""                    ,""                             ,"CR+N0 "                   ,""                             ,""                 ,""},//76
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//77
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//78
                 {""                    ,""                             ,""                         ,"CR+N1 "                       ,""                 ,""},//79
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//80
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//81
                 {""                    ,""                             ,""                         ,""                             ,"CR+N2 "           ,""},//82
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//83
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//84
                 {""                    ,""                             ,""                         ,"CR+N3 "                       ,""                 ,""},//85
                 {""                    ,""                             ,""                         ,"MO+N4 "                       ,""                 ,""},//86
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//87
                 {""                    ,"PI+N3 "                       ,"PH+N3 "                   ,"PH+N3 "                       ,"PD+N3 "           ,""},//88
                 {""                    ,"PI+N3 MI+N4 "                 ,"PH+N3 MO+N4 "             ,"PH+N3 MO+N4 "                 ,"PD+N3 MD+N4 "     ,""},//89
                 {""                    ,"PI+N3 MI+N4 "                 ,"PH+N3 "                   ,"PH+N3 MO+N4 "                 ,"PD+N3 "           ,""},//90
                 {""                    ,"PI+N3 "                       ,"PH+N3 PC+N3 "             ,"PH+N3 "                       ,"PD+N3 MD+N4 "     ,""},//91
                 {""                    ,"PI+N3 MI+N4 "                 ,"PH+N3 "                   ,"PH+N3 PT+Y3 "                 ,"PD+N3 "           ,""},//92
                 {""                    ,"PI+N3 MI+N4 "                 ,"PH+N3 "                   ,"PH+N3 "                       ,"PD+N3 MD+N4 "     ,""},//93
                 {""                    ,"PI+N3 MI+N4 "                 ,"PH+N3 TH+N3 "             ,"PH+N3 "                       ,"PD+N3 "           ,""},//94
                 {""                    ,"PI+N3 MI+N4 "                 ,"PH+N3 "                   ,"PH+N3 MO+N4 "                 ,"PD+N3 "           ,""},//95
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//86
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//97
                 {""                    ,""                             ,""                         ,"CR+N1 "                       ,""                 ,""},//98
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//99
                 {""                    ,"PI+N3 MI+N4 "                 ,"PH+N3 "                   ,"PH+N3 "                       ,"PD+N3 MD+N4 "     ,""},//100
                 {""                    ,"PI+N3 MI+N4 "                 ,"PH+N3 TH+N3 "             ,"PH+N3 MO+N4 "                 ,"PD+N3 MD+N4 "     ,""},//101
                 {""                    ,"PI+N3 MI+N4 "                 ,"PH+N3 "                   ,"PH+N3 MO+N4 "                 ,"PD+N3 MD+N4 "     ,""},//102
                };
        //Mundo
        world.getTextureResources().add(R.drawable.level5_fondo);
        //Constantes
        crashResource = R.raw.hielo;
        musicResource = R.raw.hielo_musica;
        this.level = level;
    }


    @Override
    protected List<ShapeOpengl> crearObjeto(String figura,float x,float y,float z){
        List<ShapeOpengl> shapes = new ArrayList<>();
        if (figura.equals("CB")){
            shapes.add(crearCuboHielo(x-0.3F,y,z));
            shapes.add(crearCuboHielo(x+0.3f,y,z));
            shapes.add(crearCuboHielo45(x,y+0.3f,z));
        }
        if (figura.equals("CH")){
            shapes.add(crearConosHielo(x,y,z));
            shapes.add(crearConosHielo2(x+0.2f,y,z));
            shapes.add(crearConosHielo(x+0.5f,y,z));
            shapes.add(crearConosHielo(x+0.4f,y,z+0.2f));
        }

        if (figura.equals("CM")){
            shapes.add(crearCuboMovimiento(x,y,z));
            shapes.add(crearCuboPared(x-lengthPlano,y,z));
            shapes.add(crearCuboPared(x+lengthPlano,y,z));
        }
        if (figura.equals("CR")){
            shapes.add(crearCuboRompible(x,y,z));
        }
        if (figura.equals("CP")){
            shapes.add(crearCuboPinchos(x,y,z));
            shapes.add(crearCuboPinchos(x,y+1.4f-2*lengthPared*1.5f,z));
            shapes.add(crearPinchoParaCubo(x,y,z,lengthPared*1.5f));
            shapes.add(crearPinchoParaCubo(x-0.2f,y,z,lengthPared*1.2f));
            shapes.add(crearPinchoParaCubo(x-0.1f,y,z,lengthPared));
            shapes.add(crearPinchoParaCubo(x+0.1f,y,z,lengthPared*0.7f));
            shapes.add(crearPinchoParaCubo(x+0.2f,y,z,lengthPared*0.4f));
            shapes.add(crearCilindroParaCubo(x+0.4f,y,z));
            shapes.add(crearCilindroParaCubo(x-0.4f,y,z));
        }
        if (figura.equals("EC")){
            crearEsferaCristalina(x,y,z);
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
        if (figura.equals("PA")){
            shapes.add(crearParedAnchura(x,y,z));
        }
        if (figura.equals("PC")){
            shapes.add(crearPinchoHielo(x-0.15f,y,z));
            shapes.add(crearPinchoHielo1(x+0.1f,y,z+0.1f));
            shapes.add(crearPinchoHielo2(x,y,z));
            shapes.add(crearPinchoHielo3(x+0.05f,y,z+0.3f));
            shapes.add(crearPinchoHielo2(x-0.1f,y,z+0.1f));
            shapes.add(crearPinchoHielo1(x-0.3f,y,z+0.2f));
        }
        if (figura.equals("PD")){
            shapes.add(crearParedDerechaProfundidad(x,y,z));
        }
        if (figura.equals("PE")){
            shapes.add(crearCuboEspinadoPoste(x,y,z));
            shapes.add(crearCuboEspinado(x,y+0.3f,z));
        }
        if (figura.equals("PH")){
            shapes.add(crearPlanoHorizontal(x,y,z));
        }
        if (figura.equals("PI")){
            shapes.add(crearParedIzquierdaProfundidad(x,y,z));
        }
        if (figura.equals("PR")){
            shapes.add(crearCuboEspinadoPoste(x,y,z));
            shapes.add(crearCuboEspinado2(x,y+0.3f,z));
        }
        if (figura.equals("PT")){
            shapes.add(crearPuerta(x,y,z));
        }
        if (figura.equals("TH")){
            shapes.add(crearCilindroCentral(x,y,z));
            shapes.add(crearCuboCilindro(x,y,z));
            shapes.add(crearCuboCilindro2(x,y,z));
            shapes.add(crearPinchoHieloTronco(x,y+0.1f,z));
            shapes.add(crearPinchoHieloTronco(x,y+0.2f,z));
            shapes.add(crearPinchoHieloTronco(x,y+0.3f,z));
            shapes.add(crearPinchoHieloTronco(x,y+0.4f,z));
            shapes.add(crearPinchoHieloTronco(x,y+0.5f,z));
        }
        continueShapeCreation(shapes,figura,x,y,z);
        return shapes;
    }

    private void crearEsferaCristalina(float cx,float cy,float cz){
        sphere = new Sphere(cx,cy+radioEsfera*5,cz,12,24,radioEsfera);
        sphere.getTextureResources().add(R.drawable.level5_esfera);
        sphere.setRGBA(1f, 1f, 1f, 0.6f);
    }

    private Plane crearPlanoHorizontal(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level5_piso);
        plane.createMirroredTextureCoordinates(lengthPlano);
        return plane;
    }

    private Cube crearParedIzquierdaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx+lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level5_pared);
        return cube;
    }

    private Cube crearParedDerechaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx-lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level5_pared);
        return cube;
    }

    private Cube crearParedAnchura(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared,cz+lengthPlano+lengthPared,lengthPlano,lengthPared,lengthPared);
        cube.getTextureResources().add(R.drawable.level5_pared);
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////Conos Hielo////////////////////////////////////////////////

    private Cone crearConosHielo(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,4,0.2f,0.6f);
        cone.getTextureResources().add(R.drawable.level5_cono);
        cone.setRGBA(1f, 1f, 1f, 0.6f);
        cone.setSolid(true);
        return cone;
    }

    private Cone crearConosHielo2(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,4,0.3f,0.8f);
        cone.getTextureResources().add(R.drawable.level5_cono);
        cone.setRGBA(1f, 1f, 1f, 0.6f);
        cone.setSolid(true);
        return cone;
    }

    private Cone crearConosHielo3(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,6,0.2f,0.7f);
        cone.getTextureResources().add(R.drawable.level5_cono);
        cone.setRGBA(1f, 1f, 1f, 0.6f);
        cone.setSolid(true);
        return cone;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Cube crearCuboHielo(float cx, float cy, float cz){
        Cube cubeHielo = new Cube(cx,cy+lengthPared*2,cz,lengthPared*2,lengthPared*2,lengthPared*2);
        cubeHielo.getTextureResources().add(R.drawable.level5_cubo);
        cubeHielo.setRGBA(1f, 1f, 1f, 0.5f);
        cubeHielo.setSolid(true);
        return cubeHielo;
    }

    private Cube crearCuboHielo45(float cx, float cy, float cz){
        Cube cubeHielo = new Cube(cx,cy+lengthPared*2,cz,lengthPared*2,lengthPared*2,lengthPared*2);
        cubeHielo.getTextureResources().add(R.drawable.level5_cubo);
        cubeHielo.setRGBA(1f, 1f, 1f, 0.5f);
        cubeHielo.getAnimator().setAngleZ(45);
        cubeHielo.setSolid(true);
        return cubeHielo;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////Pinchos Hielo////////////////////////////////////////////////////

    private Cone crearPinchoHielo(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,3,0.055f,0.4f);
        cone.getTextureResources().add(R.drawable.level5_pincho);
        cone.setRGBA(1f, 1f, 1f, 0.8f);
        cone.setSolid(true);
        return cone;
    }

    private Cone crearPinchoHielo1(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,3,0.045f,0.5f);
        cone.getTextureResources().add(R.drawable.level5_pincho);
        cone.setRGBA(1f, 1f, 1f, 0.8f);
        cone.setSolid(true);
        return cone;
    }

    private Cone crearPinchoHielo2(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,3,0.035f,0.2f);
        cone.getTextureResources().add(R.drawable.level5_pincho);
        cone.setRGBA(1f, 1f, 1f, 0.8f);
        cone.setSolid(true);
        return cone;
    }

    private Cone crearPinchoHielo3(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,3,0.03f,0.3f);
        cone.getTextureResources().add(R.drawable.level5_pincho);
        cone.setRGBA(1f, 1f, 1f, 0.8f);
        cone.setSolid(true);
        return cone;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Cube crearCuboRompible(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy-lengthPared,cz,lengthPlano,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level5_cono);
        cube.setTrizable(true);
        cube.setRGBA(1f, 1f, 1f, 0.4f);
        return cube;
    }

    ////////////////////////////////////Tubo hielo//////////////////////////////////////////////////

    private Cylinder crearCilindroCentral(float cx, float cy, float cz){
        Cylinder cylinder = new Cylinder(cx,cy+0.4f,cz,0.1f,0.4f,6);
        cylinder.getTextureResources().add(R.drawable.level5_cono);
        cylinder.setRGBA(1f, 1f, 1f, 0.7f);
        return cylinder;
    }

    private Cube crearCuboCilindro(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+0.4f,cz,lengthPlano*2,lengthPared/3,lengthPared/3);
        cube.getTextureResources().add(R.drawable.level5_cubo);
        cube.getAnimator().setIncrY(0.4F);
        cube.getAnimator().setMinY(-0.4f);
        cube.getAnimator().setIncrY(-0.005f);
        cube.getAnimator().setIncrAngleY(1);
        cube.getAnimator().setBidirectionalAngleY(false);
        cube.getAnimator().setIncrAngleZ(1);
        cube.getAnimator().setBidirectionalAngleZ(false);
        cube.setSolid(true);
        cube.setRGBA(1f, 1f, 1f, 0.2f);
        return cube;
    }

    private Cube crearCuboCilindro2(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+0.4f,cz,lengthPlano*2,lengthPared/3,lengthPared/3);
        cube.getTextureResources().add(R.drawable.level5_cubo);
        cube.getAnimator().setIncrY(0.4F);
        cube.getAnimator().setMinY(-0.4f);
        cube.getAnimator().setIncrY(-0.005f);
        cube.getAnimator().setIncrAngleY(-1);
        cube.getAnimator().setBidirectionalAngleY(false);
        cube.getAnimator().setIncrAngleZ(-1);
        cube.getAnimator().setBidirectionalAngleZ(false);
        cube.setSolid(true);
        cube.setRGBA(1f, 1f, 1f, 0.2f);
        return cube;
    }

    private Cone crearPinchoHieloTronco(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,6,0.1f,0.3f);
        cone.getTextureResources().add(R.drawable.level5_cubo);
        cone.setRGBA(1f, 1f, 1f, 1f);
        cone.setSolid(true);
        cone.getAnimator().setAngleX(90);
        cone.getAnimator().setIncrAngleY(2);
        cone.getAnimator().setBidirectionalAngleY(false);
        return cone;
    }

    ///////////////////////////////////////////Movimiento hielo/////////////////////////////////////

    private Cube crearCuboPinchos(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared*1.5f,cz,lengthPlano,lengthPared*1.5f,lengthPared/2);
        cube.getTextureResources().add(R.drawable.level5_pincho);
        cube.setSolid(true);
        cube.setRGBA(1f, 1f, 1f, 0.7f);
        return cube;
    }

    private Cone crearPinchoParaCubo(float cx, float cy, float cz, float posY){
        Cone cone = new Cone(cx,cy+lengthPared*1.5f,cz,6,0.04f,0.4f);
        cone.getTextureResources().add(R.drawable.level5_pincho);
        cone.setSolid(true);
        cone.getAnimator().setMaxY(lengthPared*1.5f);
        cone.getAnimator().setMinY(-lengthPared*1.5f);
        cone.getAnimator().setIncrY(0.003f);
        return cone;
    }

    private Cylinder crearCilindroParaCubo(float cx, float cy, float cz){
        Cylinder cylinder = new Cylinder(cx,cy+0.7f,cz,0.1f,0.7f,6);
        cylinder.getTextureResources().add(R.drawable.level5_pincho);
        cylinder.setRGBA(1f, 1f, 1f, 0.7f);
        return cylinder;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Cone crearConoMetalico(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,4,0.1f,0.4f);
        cone.getTextureResources().add(R.drawable.level5_pincho);
        cone.setSolid(true);
        return cone;
    }

    private Cube crearPuerta(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPlano,cz,lengthPlano,lengthPlano,lengthPared/2);
        cube.getTextureResources().add(R.drawable.level5_cubo);
        cube.setSolid(true);
        cube.setRGBA(1f, 1f, 1f, 0.7f);
        return cube;
    }

    /////////////////////////////////////Poste espinado/////////////////////////////////////////////

    private Cube crearCuboEspinado(float cx, float cy, float cz){
        Cube cubeHielo = new Cube(cx,cy+lengthPared*2,cz,lengthPlano,lengthPared/3,lengthPared*2);
        cubeHielo.getTextureResources().add(R.drawable.level5_cubo);
        cubeHielo.setRGBA(1f, 1f, 1f, 0.5f);
        cubeHielo.setSolid(true);
        cubeHielo.getAnimator().setIncrAngleZ(2);
        cubeHielo.getAnimator().setBidirectionalAngleZ(false);
        return cubeHielo;
    }

    private Cube crearCuboEspinado2(float cx, float cy, float cz){
        Cube cubeHielo = new Cube(cx,cy+lengthPared*2,cz,lengthPlano,lengthPared/3,lengthPared*2);
        cubeHielo.getTextureResources().add(R.drawable.level5_cubo);
        cubeHielo.setRGBA(1f, 1f, 1f, 0.5f);
        cubeHielo.setSolid(true);
        cubeHielo.getAnimator().setIncrAngleZ(-2);
        cubeHielo.getAnimator().setBidirectionalAngleZ(false);
        return cubeHielo;
    }

    private Cube crearCuboEspinadoPoste(float cx, float cy, float cz){
        Cube cubeHielo = new Cube(cx,cy+lengthPared*4,cz,lengthPared/2,lengthPared*4,lengthPared/2);
        cubeHielo.getTextureResources().add(R.drawable.level5_cubo);
        cubeHielo.setRGBA(1f, 1f, 1f, 0.5f);
        cubeHielo.setSolid(true);
        return cubeHielo;
    }
    ///////////////////////////////////Cube movimiento//////////////////////////////////////////////

    private Cube crearCuboMovimiento(float cx, float cy, float cz){
        Cube cubeHielo = new Cube(cx,cy+0.5f,cz,lengthPlano,0.2f,lengthPlano);
        cubeHielo.getTextureResources().add(R.drawable.level5_cubo);
        cubeHielo.setRGBA(1f, 1f, 1f, 0.5f);
        cubeHielo.setSolid(true);
        cubeHielo.getAnimator().setMaxY(0.4);
        cubeHielo.getAnimator().setMinY(-0.4);
        cubeHielo.getAnimator().setIncrY(-0.01);
        return cubeHielo;
    }

    private Cube crearCuboPared(float cx, float cy, float cz){
        Cube cubeHielo = new Cube(cx,cy+0.5f,cz,lengthPared/4,0.6f,lengthPared/2);
        cubeHielo.getTextureResources().add(R.drawable.level5_cubo);
        cubeHielo.setRGBA(1f, 1f, 1f, 0.5f);
        cubeHielo.setSolid(true);
        return cubeHielo;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
}
