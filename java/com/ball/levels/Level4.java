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
 * Created by miguel on 02/03/2015.
 */
public class Level4 extends Level{

    @Override
    protected void crearNivel(){
        String level[][] =
                {{""    				,"PI+N0 "   					,"PH+N0 PA+N0 "				,"PH+N0 PA+N0 "					,"PD+N0 "   		,""},//1
                 {""    				,"PI+N0  "						,"PH+N0 "   				,"PH+N0 "						,"PD+N0 "  			,""},//2
                 {""            		,"PI+N0 MI+N1 "					,"PH+N0 EC+N6 "    			,"PH+N0 "						,"PD+N0 MD+N1 "     ,""},//3
                 {""             		,"PI+N0 "						,"PH+N0 "					,"PH+N0 "   					,"PD+N0 MD+N1 "     ,""},//4
                 {""            		,"PI+N0 MI+N1 "					,"PH+N0 "   				,"PH+N0 "						,"PD+N0 "   		,""},//5
                 {""            		,"PI+N0 MI+N1 "					,"PH+N0 "       			,"PH+N0 "           			,"PD+N0 MD+N1 "     ,""},//6
                 {""              		,"PI+N0 "   					,"PH+N0 "   				,"PH+N0 CL+N0 "					,"PD+N0 MD+N1 "     ,""},//7
                 {""              		,"PI+N0 "		    			,"PH+N0 MO+N1 "	    		,"PH+N0 "   					,"PD+N0 "   		,""},//8
                 {""        		    ,"PI+N0 MI+N1 "					,"PH+N0 "   				,"PH+N0 "						,"PD+N0 "   		,""},//9
                 {""    				,"PI+N0 "						,"PH+N0 CJ+N0 "   			,"PH+N0 "						,"PD+N0 MD+N1 "     ,""},//10
                 {""	            	,"PI+N0 MI+N1 "             	,"PH+N0 MO+N1 "        		,"PH+N0 "                		,"PD+N0 MD+N1 "   	,""},//11
                 {""            		,"PI+N0 MI+N1 "   				,"PH+N0 "					,"PH+N0 RD+N0 "   	        	,"PD+N0 "   		,""},//12
                 {""            		,"PI+N0 MI+N1 "					,"PH+N0 "					,"PH+N0 "     					,"PD+N0 MD+N1 "     ,""},//13
                 {""    				,"PI+N0 "           			,"PH+N0 "       			,"PH+N0 "						,"PD+N0 "   	    ,""},//14
                 {""		    		,"PI+N0 "					    ,"PH+N0 CL+N0 "   			,"PH+N0 "   					,"PD+N0 "  			,""},//15
                 {""    				,"PI+N0 MI+N1 "					,"PH+N0 "   				,"PH+N0 "          			    ,"PD+N0 MD+N1 "   	,""},//16
                 {""            		,"PI+N0 MI+N1 "					,"PH+N0 MO+N1 "				,"PH+N0 "       				,"PD+N0 "           ,""},//17
                 {""    				,"PI+N0 "						,"PH+N0 CL+N0 "				,"PH+N0 PT+N0 "					,"PD+N0 MD+N1 "   	,""},//18
                 {""            		,"PI+N0 MI+N1 "					,"PH+N0 "					,"PH+N0 MO+N1 "   				,"PD+N0 MD+N1 "		,""},//19
                 {""            		,"PI+N0 MI+N1 "					,"PH+N0 "   				,"PH+N0 "   					,"PD+N0 "		    ,""},//20
                 {"PI+N0 MI+N1 "        ,"PH+N0 PA+N0 "         		,"PH+N0 "   				,"PH+N0 "   					,"PH+N0 PA+N0 "	    ,"PD+N0 MD+N1 "},//21
                 {"PI+N0 MI+N1 "        ,"PH+N0 "                		,"PH+N0 MO+N1 "   			,"PH+N0 "   					,"PH+N0 "   	    ,"PD+N0 "},//22
                 {"PI+N0 MI+N1 "        ,"PH+N0 PM+N0 "           		,"PH+N0 MO+N1 "   			,"PH+N0 P2+N0 "   				,"PH+N0 CL+N0 "     ,"PD+N0 "},//23
                 {"PI+N0 "              ,"PH+N0 "                		,"PH+N0 "   				,"PH+N0 "   					,"PH+N0 "   	    ,"PD+N0 MD+N1 "},//24
                 {"PI+N0 MI+N1 "        ,"PH+N0 "                		,"PH+N0 CL+N0 "   			,"PH+N0 "   					,"PH+N0 "   	    ,"PD+N0 MD+N1 "},//25
                 {""                    ,"PA+N0 PI+N0 "            		,"PH+N0 "          			,"PH+N0 "   					,"PH+N0 CJ+N0 "   	,"PD+N0 "},//26
                 {""                    ,""                     		,"PA+N0 PI+N0 "          	,"PH+N0 "   					,"PH+N0 "          	,"PD+N0 MD+N1 "},//27
                 {""                    ,""                     		,""                       	,"PA+N0 PI+N0 MI+N1 "   		,"PH+N0 "          	,"PD+N0 "},//28
                 {""                    ,""                     		,""                       	,"PI+N0 "          				,"PH+N0 CM+N0 "     ,"PD+N0 MD+N1 "},//29
                 {""                    ,""                     		,""                       	,"PI+N0 MI+N1 "          		,"PH+N0 "           ,"PD+N0 MD+N1 "},//30
                 {""                    ,""                     		,""                       	,"PI+N0 MI+N1 "          		,"PH+N0 "           ,"PD+N0 MD+N1 "},//31
                 {""                    ,""                     		,""                       	,""               				,""                	,""},//32
                 {""                    ,""                     		,""                       	,""               				,""                	,""},//33
                 {""                    ,""                     		,""                       	,""               				,""                	,""},//34
                 {""                    ,""                     		,""                       	,"PI+N1 MI+N2 "         		,"PH+N1 PA+N0"      ,"PD+N1 "},//35
                 {""                    ,""                     		,""                       	,"PI+N1 "          				,"PH+N1 "          	,"PD+N1 MD+N2 "},//36
                 {""                    ,""                     		,"PI+N1 "                   ,"PH+N1 PA+N1 "                 ,"PH+N1 "          	,"PD+N1 "},//37
                 {""                    ,""                     		,"PI+N1 MI+N2 "             ,"PH+N1 "                 		,"PH+N1 RD+N1 "     ,"PD+N1 "},//38
                 {""                    ,""                     		,"PI+N1 "                   ,"PH+N1 "                      	,"PH+N1 "           ,"PD+N1 MD+N2 "},//39
                 {""                    ,""                     		,"PI+N1 MI+N2 "             ,"PH+N1 "                      	,"PD+N1 PA+N1 "     ,""},//40
                 {""                    ,""                     		,"PI+N1 MI+N2 "             ,"PH+N1 CJ+N1 "                 ,"PD+N1 MD+N2 "    	,""},//41
                 {""                    ,""                     		,"PI+N1 "                   ,"PH+N1 "                       ,"PD+N1 "          	,""},//42
                 {""                    ,"PI+N1 "                     	,"PH+N1 PA+N1 "             ,"PH+N1 "                       ,"PD+N1 MD+N2 "     ,""},//43
                 {""                    ,"PI+N1 MI+N2 "               	,"PH+N1 "                   ,"PD+N1 PA+N1 "                 ,""               	,""},//44
                 {""                    ,"PI+N1 MI+N2 "                	,"PH+N1 "                   ,"PD+N1 "                       ,""               	,""},//45
                 {""                    ,"PI+N1 "                     	,"PH+N1 CM+N1 "             ,"PD+N1 MD+N2 "                 ,""               	,""},//46
                 {""                    ,"PI+N1 MI+N2 "               	,"PH+N1 PE+N0 "             ,"PD+N1 "                       ,""               	,""},//47
                 {""                    ,"PI+N1 "                     	,"PH+N1 "                   ,"PD+N1 MD+N2 "                 ,""               	,""},//48
                 {""                    ,"PI+N1 MI+N2 "                	,"PH+N1 MO+N2 "             ,"PD+N1 MD+N2 "                 ,""               	,""},//49
                 {""                    ,"PI+N1 MI+N2 "                	,"PH+N1 PE+N0 "             ,"PD+N1 MD+N2 "                 ,""               	,""},//50
                 {"PI+N1 "              ,"PH+N1 PA+N1 "                 ,"PH+N1 "                   ,"PD+N1 "                       ,""               	,""},//51
                 {""                    ,"PH+N1 K1+N1 "                 ,"PA+N1 "                   ,""                             ,""               	,""},//52
                 {"PI+N1 "              ,"PH+N1 "                       ,"PD+N1 "                   ,""                             ,""               	,""},//53
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PD+N1 MD+N2 "             ,""                             ,""               	,""},//54
                 {"PI+N1 "              ,"PH+N1 PT+N0 "                 ,"PD+N1 "                   ,""                             ,""               	,""},//55
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PH+N1 PA+N1 "             ,"PD+N1 MD+N2 "                 ,""               	,""},//56
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PH+N1 "                   ,"PD+N1 "                       ,""               	,""},//57
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PH+N1 "                   ,"PD+N1 "                       ,""               	,""},//58
                 {"PI+N1 "              ,"PH+N1 RD+N1 "                 ,"PH+N1 MD+N1 "             ,"PD+N1 MD+N2 "                 ,""               	,""},//59
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PH+N1 "                   ,"PD+N1 "                       ,""               	,""},//60
                 {""                    ,""                             ,""                         ,""                             ,""               	,""},//61
                 {""                    ,""                             ,""                         ,""                             ,""               	,""},//62
                 {""                    ,""                             ,"PC+N2 "                   ,""                             ,""               	,""},//63
                 {""                    ,""                             ,""                         ,""                             ,""               	,""},//64
                 {""                    ,"PC+N3 "                       ,""                         ,""                             ,""               	,""},//65
                 {""                    ,""                             ,""                         ,""                             ,""               	,""},//66
                 {""                    ,""                             ,"PC+N4 "                   ,""                             ,""               	,""},//67
                 {""                    ,""                             ,"MO+N5 "                   ,""                             ,""               	,""},//68
                 {""                    ,""                             ,""                         ,""                             ,""               	,""},//69
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PH+N1 "                   ,"PD+N1 "                       ,""               	,""},//70
                 {"PI+N1 "              ,"PH+N1 FG+N1 "                 ,"PH+N1 FG+N1 "             ,"PD+N1 MD+N2 "                 ,""               	,""},//71
                 {"PI+N1 MI+N2 "        ,"PH+N1 PL+N1 "                 ,"PH+N1 PL+N1 "             ,"PD+N1 "                       ,""               	,""},//72
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PH+N1 "                   ,"PD+N1 MD+N2 "                 ,""               	,""},//73
                 {"PI+N1 MI+N2 "        ,"PH+N1 CL+N1 "                 ,"PH+N1 GT+N1 "             ,"PD+N1 MD+N2 "                 ,""               	,""},//74
                 {"PI+N1 "              ,"PH+N1 "                       ,"PH+N1 "                   ,"PD+N1 MD+N2 "                 ,""               	,""},//75
                 {"PI+N1 "              ,"PH+N1 MO+N2 "                 ,"PH+N1 "                   ,"PH+N1 PÀ+N1 "                 ,"PD+N1 "          	,""},//76
                 {"PI+N1 MI+N2 "        ,"PH+N1 RD+N1 "                 ,"PH+N1 "                   ,"PH+N1 RD+N1 "                 ,"PD+N1 MD+N2 "   	,""},//77
                 {"PI+N1 "              ,"PH+N1 "                       ,"PH+N1 "                   ,"PH+N1 "                       ,"PD+N1 "          	,""},//78
                 {"PI+N1 MI+N2 "        ,"PH+N1 CL+N1 "                 ,"PH+N1 PT+N1 "             ,"PH+N1 CL+N1 "                 ,"PD+N1 MD+N2 "     ,""},//79
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PH+N1 "                   ,"PH+N1 "                       ,"PD+N1 MD+N2 "     ,""},//80
                 {"PI+N1 MI+N2 "        ,"PH+N1 CL+N1 "                 ,"PH+N1 MO+N2 "             ,"PH+N1 "                       ,"PD+N1 MD+N2 "     ,""},//81
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PH+N1 "                   ,"PH+N1 CL+N1 "                 ,"PD+N1 MD+N2 "     ,""},//82
                 {"PI+N1 "              ,"PH+N1 "                       ,"PH+N1 CJ+N1 "             ,"PH+N1 "                       ,"PD+N1 "           ,""},//83
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PH+N1 PT+N0 "             ,"PH+N1 "                       ,"PD+N1 MD+N2 "     ,""},//84
                 {"PI+N1 MI+N2 "        ,"PH+N1 CL+N1 "                 ,"PH+N1 "                   ,"PH+N1 CL+N1 "                 ,"PD+N1 "           ,""},//85
                 {"PI+N1 "              ,"PH+N1 "                       ,"PH+N1 "                   ,"PH+N1 "                       ,"PD+N1 MD+N2 "     ,""},//86
                 {"PI+N1 MI+N2 "        ,"PH+N1 "                       ,"PH+N1 PT+N0 "             ,"PH+N1 "                       ,"PD+N1 MD+N2 "     ,""},//87
                 {"PI+N1 "              ,"PH+N1 MO+N2 "                 ,"PH+N1 "                   ,"PH+N1 "                       ,"PD+N1 "           ,""},//88
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//89
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//90
                 {""                    ,""                             ,"PC+N2 "                   ,""                             ,""                 ,""},//91
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//92
                 {"PI+N1 "              ,"PH+N1 PA+N0 "                 ,"PH+N1 PA+N0 "             ,"PH+N1 PA+N0 "                 ,"PD+N1 "           ,""},//93
                 {"PI+N1 "              ,"PH+N1 "                       ,"PH+N1 "                   ,"PH+N1 "                       ,"PD+N1 "           ,""},//94
                 {"PI+N1 "              ,"PH+N1 CL+N1 "                 ,"PH+N1 PT+N1 "             ,"PH+N1 CL+N1 "                 ,"PD+N1 "           ,""},//95
                 {"PI+N1 "              ,"PH+N1 "                       ,"PH+N1 "                   ,"PH+N1 "                       ,"PD+N1 "           ,""},//96
                 {"PI+N1 "              ,"PH+N1 "                       ,"PH+N1 PE+N1 "             ,"PH+N1 "                       ,"PD+N1 "           ,""},//97
                 {"PI+N1 "              ,"PH+N1 CL+N1 "                 ,"PH+N1 "                   ,"PH+N1 CL+N1 "                 ,"PD+N1 "           ,""},//98
                 {"PI+N1 "              ,"PH+N1 "                       ,"PH+N1 MO+N2 "             ,"PH+N1 "                       ,"PD+N1 "           ,""},//99
                 {""                    ,"PH+N1 K2+N1 "                 ,"PH+N1 MO+N2 "             ,"PH+N1 CL+N1 "                 ,"PD+N1 "           ,""},//100
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//101
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//102
                 {""                    ,""                             ,"PC+N2 "                   ,""                             ,""                 ,""},//103
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//104
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//105
                 {""                    ,""                             ,"PC+N4 "                   ,""                             ,""                 ,""},//106
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//107
                 {""                    ,""                             ,""                         ,""                             ,""                 ,""},//108
                 {"PI+N1 "              ,"PH+N1 PA+N0 "                 ,"PH+N1 PA+N0 "             ,"PH+N1 PA+N0 "                 ,"PD+N1 "           ,""},//109
                };
        //Mundo
        world.getTextureResources().add(R.drawable.level3_fondo);
        //Constantes
        crashResource = R.raw.cristal;
        musicResource = R.raw.ceramica_musica;
        resourceCintaCheckPoint = R.drawable.level4_check_point;
        resourcePaloCheckPoint = R.drawable.level4_columna;
        this.level = level;
    }

    @Override
    protected List<ShapeOpengl> crearObjeto(String figura,float x,float y,float z){
        List<ShapeOpengl> shapes = new ArrayList<>();
        if (figura.equals("CJ")){
            shapes.add(crearCaja(x,y,z));
        }
        if (figura.equals("CL")){
            shapes.add(crearColumna(x, y, z));
        }
        if (figura.equals("CM")){
            shapes.add(crearConoMetalico(x,y,z));
        }
        if (figura.equals("EC")){
            crearEsferaCristalina(x,y,z);
        }
        if (figura.equals("GT")){
            shapes.add(crearCuerpoGuillotina(x,y+0.15f,z));
            shapes.add(crearColumnaVerticalGuillotina(x-lengthPlano+0.05f,y+0.3f+0.6f,z));
            shapes.add(crearColumnaVerticalGuillotina(x+lengthPlano-0.05f,y+0.3f+0.6f,z));
            shapes.add(crearColumnaHorizontalGuillotina(x,y+1.2f+0.3f,z));
            shapes.add(crearCuchilloGuillotina(x,y+(1.2f+0.3f+0.2f)/2,z));
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
            shapes.add(crearPlanoCubo(x,y,z));
        }
        if (figura.equals("PD")){
            shapes.add(crearParedDerechaProfundidad(x,y,z));
        }
        if (figura.equals("PE")){
            shapes.add(crearPoste(x-0.5f,y,z));
            shapes.add(crearPoste(x+0.5f,y,z));
            shapes.add(crearCono(x+0.5f,y,z,0));
            shapes.add(crearCono180(x-0.5f,y,z,0));
            shapes.add(crearCono(x+0.5f,y+0.2f,z,0.05f));
            shapes.add(crearCono180(x-0.5f,y+0.2f,z,-0.05f));
            shapes.add(crearCono(x+0.5f,y+0.4f,z,0.1f));
            shapes.add(crearCono180(x-0.5f,y+0.4f,z,-0.1f));
            shapes.add(crearCono(x+0.5f,y+0.6f,z,0.15f));
            shapes.add(crearCono180(x-0.5f,y+0.6f,z,-0.15f));
        }
        if (figura.equals("PH")){
            shapes.add(crearPlanoHorizontal(x,y,z));
        }
        if (figura.equals("PI")){
            shapes.add(crearParedIzquierdaProfundidad(x,y,z));
        }
        if (figura.equals("PM")){
            shapes.add(crearPosteMovimiento(x,y,z));
            shapes.add(crearPosteHorizontalMovimiento(x,y,z,0.04f));
            shapes.add(crearPosteHorizontalMovimiento(x,y+0.1f,z,0.08f));
            shapes.add(crearPosteHorizontalMovimiento(x,y+0.2f,z,0.12f));
            shapes.add(crearPosteHorizontalMovimiento(x,y+0.3f,z,0.16f));
            shapes.add(crearPosteHorizontalMovimiento(x,y+0.4f,z,0.20f));
            shapes.add(crearPosteHorizontalMovimiento(x,y+0.5f,z,0.24f));
            shapes.add(crearPosteHorizontalMovimiento(x,y+0.6f,z,0.28f));
        }
        if (figura.equals("PT")){
            shapes.add(crearTuboVertical(x,y,z));
            shapes.add(crearTuboVerticalAbajo(x,y,z));
            shapes.add(crearTuboHorizontalDerecha(x,y,z));
            shapes.add(crearTuboHorizontalIzquierda(x,y,z));
        }
        if (figura.equals("P2")){
            shapes.add(crearPosteMovimiento(x,y,z));
            shapes.add(crearPosteHorizontalMovimiento(x,y,z,-0.04f));
            shapes.add(crearPosteHorizontalMovimiento(x,y+0.1f,z,-0.08f));
            shapes.add(crearPosteHorizontalMovimiento(x,y+0.2f,z,-0.12f));
            shapes.add(crearPosteHorizontalMovimiento(x,y+0.3f,z,-0.16f));
            shapes.add(crearPosteHorizontalMovimiento(x,y+0.4f,z,-0.20f));
            shapes.add(crearPosteHorizontalMovimiento(x,y+0.5f,z,-0.24f));
            shapes.add(crearPosteHorizontalMovimiento(x,y+0.6f,z,-0.28f));
        }
        if (figura.equals("RD")){
            shapes.add(crearRueda(x,y,z));
            shapes.add(crearTubo(x,y,z));
            shapes.add(crearRueda(x,y+0.2f,z));
            shapes.add(crearTubo(x,y+0.2f,z));
            shapes.add(crearRueda(x,y+0.4f,z));
            shapes.add(crearTubo(x,y+0.4f,z));
            shapes.add(crearRueda(x,y+0.6f,z));
            shapes.add(crearTubo(x,y+0.6f,z));
            shapes.add(crearRueda(x,y+0.8f,z));
        }
        continueShapeCreation(shapes,figura,x,y,z);
        return shapes;
    }

    private void crearEsferaCristalina(float cx,float cy,float cz){
        sphere = new Sphere(cx,cy+radioEsfera*5,cz,12,24,radioEsfera);
        sphere.getTextureResources().add(R.drawable.level4_esfera);
    }

    private Cube crearParedIzquierdaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx+lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level4_pared);
        return cube;
    }

    private Cube crearParedDerechaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx-lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level4_pared);
        return cube;
    }

    private Cube crearParedAnchura(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared,cz+lengthPlano+lengthPared,lengthPlano,lengthPared,lengthPared);
        cube.getTextureResources().add(R.drawable.level4_pared);
        return cube;
    }

    private Cone crearConoMetalico(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,4,0.1f,0.4f);
        cone.getTextureResources().add(R.drawable.level4_cono);
        cone.setSolid(true);
        return cone;
    }

    private Cube crearPlanoCubo(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy-lengthPared*2,cz,lengthPlano,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level4_pared);
        cube.getAnimator().setMaxY(0.5f);
        cube.getAnimator().setMinY(-0.5f);
        cube.getAnimator().setIncrY(0.01f);
        return cube;
    }

    private Plane crearPlanoHorizontal(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level4_piso);
        return plane;
    }

    private Cylinder crearColumna(float cx, float cy, float cz){
        float Radio = 0.6f;
        Cylinder columna = new Cylinder(cx,cy+Radio,cz,0.2f,Radio,12);
        columna.getTextureResources().add(R.drawable.level4_columna);
        columna.setSolid(true);
        return columna;
    }

    /////////////////////////////////Elementos de rueda/////////////////////////////////////////////

    private Cylinder crearRueda(float cx, float cy, float cz){
        float Radio = 0.05f;
        float radio = 0.2f;
        Cylinder rueda = new Cylinder(cx,cy+Radio,cz,radio,Radio,12);
        rueda.getTextureResources().add(R.drawable.level4_columna);
        rueda.setSolid(true);
        rueda.getAnimator().setIncrAngleY(1);
        return rueda;
    }

    private Cylinder crearTubo(float cx, float cy, float cz){
        float Radio = 0.05f;
        float radio = 0.7f;
        Cylinder tubo = new Cylinder(cx,cy+3*Radio,cz,Radio,radio,6);
        tubo.setSolid(true);
        tubo.getTextureResources().add(R.drawable.level4_columns_hor);
        tubo.getAnimator().setIncrAngleY(-1);
        tubo.getAnimator().setBidirectionalAngleY(false);
        tubo.getAnimator().setAngleX(90);
        return tubo;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////Portal////////////////////////////////////////////////////
    private Cylinder crearTuboVertical(float cx, float cy, float cz){
        float Radio = 0.05f;
        float radio = 0.7f;
        Cylinder tubo = new Cylinder(cx,cy+0.3f,cz,Radio,radio,6);
        tubo.setSolid(true);
        tubo.getTextureResources().add(R.drawable.level4_columns_hor);
        tubo.getAnimator().setAngleZ(90);
        tubo.getAnimator().setMaxY(0.3f);
        tubo.getAnimator().setMinY(-0.3f);
        tubo.getAnimator().setIncrY(0.005f);
        return tubo;
    }

    private Cylinder crearTuboVerticalAbajo(float cx, float cy, float cz){
        float Radio = 0.05f;
        float radio = 0.7f;
        Cylinder tubo = new Cylinder(cx,cy+3*0.3f,cz,Radio,radio,6);
        tubo.setSolid(true);
        tubo.getTextureResources().add(R.drawable.level4_columns_hor);
        tubo.getAnimator().setAngleZ(90);
        tubo.getAnimator().setMaxY(0.3f);
        tubo.getAnimator().setMinY(-0.3f);
        tubo.getAnimator().setIncrY(-0.005f);
        return tubo;
    }

    private Cylinder crearTuboHorizontalDerecha(float cx, float cy, float cz){
        float Radio = 0.05f;
        float radio = 0.7f;
        Cylinder tubo = new Cylinder(cx-0.3f,cy+radio,cz,Radio,radio,6);
        tubo.setSolid(true);
        tubo.getTextureResources().add(R.drawable.level4_columns_hor);
        tubo.getAnimator().setMaxX(0.3);
        tubo.getAnimator().setMinX(-0.3);
        tubo.getAnimator().setIncrX(0.005);
        return tubo;
    }

    private Cylinder crearTuboHorizontalIzquierda(float cx, float cy, float cz){
        float Radio = 0.05f;
        float radio = 0.7f;
        Cylinder tubo = new Cylinder(cx+0.3f,cy+radio,cz,Radio,radio,6);
        tubo.setSolid(true);
        tubo.getTextureResources().add(R.drawable.level4_columns_hor);
        tubo.getAnimator().setMaxX(0.3);
        tubo.getAnimator().setMinX(-0.3);
        tubo.getAnimator().setIncrX(-0.005);
        return tubo;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////Postes espinados///////////////////////////////////////////////

    private Cube crearPoste(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+0.6f,cz,0.2f,0.6f,0.2f);
        cube.setSolid(true);
        cube.getTextureResources().add(R.drawable.level4_columns_hor);
        return cube;
    }

    private Cone crearCono(float cx, float cy, float cz, float tx){
        Cone cone = new Cone(cx,cy+0.1f,cz,12,0.1f,0.3f);
        cone.getTextureResources().add(R.drawable.level4_cono);
        cone.getAnimator().setAngleZ(90);
        cone.getAnimator().setMaxX(0.15);
        cone.getAnimator().setMinX(-0.15);
        cone.getAnimator().setIncrX(0.003);
        cone.getAnimator().setX(tx);
        cone.setSolid(true);
        return cone;
    }


    private Cone crearCono180(float cx, float cy, float cz, float tx){
        Cone cone = new Cone(cx,cy+0.1f,cz,12,0.1f,0.3f);
        cone.getTextureResources().add(R.drawable.level4_cono);
        cone.getAnimator().setAngleZ(270);
        cone.getAnimator().setMaxX(0.15);
        cone.getAnimator().setMinX(-0.15);
        cone.getAnimator().setIncrX(-0.003);
        cone.setSolid(true);
        return cone;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Cube crearCaja(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+0.2f,cz,0.2f,0.2f,0.2f);
        cube.getTextureResources().add(R.drawable.level4_caja);
        cube.setSolid(true);
        return cube;
    }

    ///////////////////////////////Poste en movimiento//////////////////////////////////////////////

    private Cube crearPosteMovimiento(float cx, float cy, float cz){
        final float width = 0.2f;
        Cube cube = new Cube(cx,cy+0.4f,cz,width,0.4f,width);
        cube.setSolid(true);
        cube.getTextureResources().add(R.drawable.level4_caja);
        return cube;
    }

    private Cube crearPosteHorizontalMovimiento(float cx, float cy, float cz, float tx){
        final float width = 0.05f;
        Cube cube = new Cube(cx,cy+width,cz,0.5f,width,width);
        cube.setSolid(true);
        cube.getTextureResources().add(R.drawable.level4_columns_hor);
        cube.getAnimator().setMaxX(0.3f);
        cube.getAnimator().setMinX(-0.3f);
        cube.getAnimator().setIncrX(0.003f);
        if (tx != 0){
            cube.getAnimator().setIncrX(0.003f*Math.signum(tx));
        }
        cube.getAnimator().setX(tx);
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////Puertas horizontales////////////////////////////////////////////

    private Cube crearPuertaHorizontal1(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,lengthPlano,0.2f,0.025f);
        cube.getTextureResources().add(R.drawable.level4_columns_hor);
        cube.getAnimator().setIncrAngleX(0.5f);
        cube.getAnimator().setBidirectionalAngleZ(false);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearPuertaHorizontal2(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,lengthPlano,0.2f,0.025f);
        cube.getTextureResources().add(R.drawable.level4_columns_hor);
        cube.getAnimator().setIncrAngleX(-0.5f);
        cube.getAnimator().setBidirectionalAngleZ(false);
        cube.setSolid(true);
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////Guillotina/////////////////////////////////////////////////////

    private Cube crearCuerpoGuillotina(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,lengthPlano,0.15f,0.05f);
        cube.getTextureResources().add(R.drawable.level4_columns_hor);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearColumnaVerticalGuillotina(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,0.05f,0.6f,0.05f);
        cube.getTextureResources().add(R.drawable.level4_columns_hor);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearColumnaHorizontalGuillotina(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,lengthPlano,0.05f,0.05f);
        cube.getTextureResources().add(R.drawable.level4_columns_hor);
        cube.setSolid(true);
        return cube;
    }

    private Plane crearCuchilloGuillotina(float cx, float cy, float cz){
        Plane cuchillo = new Plane(cx,cy,cz,lengthPlano,0.1f,0);
        cuchillo.getTextureResources().add(R.drawable.level4_cuchillo);
        cuchillo.getAnimator().setMaxY(0.4);
        cuchillo.getAnimator().setMinY(-0.4);
        cuchillo.getAnimator().setIncrY(-0.005);
        cuchillo.setSolid(true);
        return cuchillo;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////



    ////////////////////////////////////////////////////////////////////////////////////////////////
}
