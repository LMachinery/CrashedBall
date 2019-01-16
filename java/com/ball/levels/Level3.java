package com.ball.levels;

import com.ball.activities.R;
import com.ball.shapes.Cone;
import com.ball.shapes.Cube;
import com.ball.shapes.Cylinder;
import com.ball.shapes.Cylinder3;
import com.ball.shapes.Plane;
import com.ball.shapes.Sphere;
import com.ball.shapes.ShapeOpengl;

import java.util.ArrayList;
import java.util.List;

public class Level3 extends Level{
	
	@Override
	protected void crearNivel(){
		String level[][] = 
			{{"PI+N0 "				,"PH+N0 PA+N0 "					,"PP+N0 PA+N0 "				,"PP+N0 PA+N0 "					,"PH+N0 PA+N0 "		,"PD+N0 "},//1
     		 {"PI+N0 "				,"PH+N0 "						,"PP+N0 "   				,"PP+N0 "						,"PH+N0 "  			,"PD+N0 "},//2
     		 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PP+N0 EC+N6 "				,"PP+N0 "						,"PH+N0 "      		,"PD+N0 MD+N1 "},//3
     		 {"PI+N0 "         		,"PH+N0 "						,"PP+N0 "					,"PP+N0 A2+N0 "					,"PH+N0 "      		,"PD+N0 MD+N1 "},//4
     		 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PP+N0 "					,"PP+N0 "						,"PH+N0 AB+N0 "		,"PD+N0 "},//5
     		 {"PI+N0 MI+N1 "		,"PH+N0 "   					,"PP+N0 A2+N0 "				,"PP+N0 MO+N1 "					,"PH+N0 "      		,"PD+N0 MD+N1 "},//6
     		 {"PI+N0 "      		,"PH+N0 AB+N0 "					,"PP+N0 "   				,"PP+N0 "						,"PH+N0 "      		,"PD+N0 MD+N1 "},//7
     		 {"PI+N0 "      		,"PH+N0 "						,"PP+N0 "					,"PP+N0 AB+N0 "					,"PH+N0 "   		,"PD+N0 "},//8
     		 {"PI+N0 MI+N1 "		,"PH+N0 A2+N0 "					,"PP+N0 A2+N0 "				,"PP+N0 "						,"PH+N0 AB+N0 "		,"PD+N0 "},//9
     		 {"PI+N0 "				,"PH+N0 "						,"PP+N0 "   				,"PP+N0 "						,"PH+N0 "  			,"PD+N0 MD+N1 "},//10
     		 {"PI+N0 MI+N1 "		,"PH+N0 "   		        	,"PP+N0 AB+N0 "    			,"PP+N0 TR+N0 "					,"PH+N0 A2+N0 " 	,"PD+N0 MD+N1 "},//11
     		 {"PI+N0 MI+N1 "		,"PH+N0 AB+N0 "					,"PP+N0 "					,"PP+N0 AB+N0 "	        		,"PH+N0 "   		,"PD+N0 "},//12
     		 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PP+N0 "					,"PP+N0 "						,"PH+N0 "      		,"PD+N0 MD+N1 "},//13
     		 {""    				,"PI+N0 PA+N0 "        			,"PP+N0 AB+N0 " 			,"PP+N0 MO+N1 "					,"PD+N0 PA+N0 "	    ,""},//14
     		 {""		    		,"PI+N0 "					    ,"PP+N0 "   				,"PP+N0 "   					,"PD+N0 "  			,""},//15
     		 {""    				,"PI+N0 MI+N1 "					,"PP+N0 A2+N0 "				,"PP+N0 AB+N0 "					,"PD+N0 MD+N1 "   	,""},//16
     		 {""            		,"PI+N0 MI+N1 "					,"PP+N0 "					,"PP+N0 TR+N0 "    				,"PD+N0 "           ,""},//17
     		 {""    				,"PI+N0 "						,"PH+N0 TR+N0 "				,"PP+N0 "						,"PD+N0 MD+N1 "   	,""},//18
     		 {""            		,"PI+N0 MI+N1 "					,"PP+N0 "					,"PP+N0 AB+N0 "					,"PD+N0 MD+N1 "		,""},//19
             {""            		,"PI+N0 MI+N1 "					,"PP+N0 A2+N0 "				,"PP+N0 "						,"PD+N0 "		    ,""},//20
             {""            		,"PI+N0 "   					,"PP+N0 "					,"PP+N0 "						,"PD+N0 MD+N1 "		,""},//21
             {""            		,"PI+N0 MI+N1 "					,"PP+N0 MO+N1 "				,"PP+N0 AB+N0 "					,"PD+N0  "  		,""},//22
             {""            		,"PI+N0 MI+N1 "					,"PP+N0 "					,"PP+N0 "						,"PD+N0 MD+N1 "		,""},//23
             {""            		,"PI+N0 "   					,"PP+N0 A2+N0 "				,"PP+N0 "						,"PD+N0 MD+N1 "		,""},//24
             {""            		,"PI+N0 MI+N1 "					,"PP+N0 "					,"PP+N0 A2+N0 "					,"PD+N0 "   		,""},//25
             {""            		,"PI+N0 "   					,"PP+N0 "					,"PP+N0 A2+N0 "					,"PD+N0 "   		,""},//26
             {""            		,"PI+N0 MI+N1 "					,"PP+N0 "					,"PP+N0 "   					,"PD+N0 MD+N1 "		,""},//27
             {""            		,"PI+N0  "  					,"PP+N0 TE-Y0 "				,"PH+N0 TE+Y0 "					,"PD+N0 MD+N1 "		,""},//28
             {""            		,"PI+N0 MI+N1 "					,"PP+N0 "   				,"PH+N0 "   					,"PD+N0 "   		,""},//29
             {""            		,"PI+N0 MI+N1 "					,"PP+N0 MO+N1 "   			,"PP+N0 CT-Y0 "					,"PD+N0 MD+N1 "		,""},//30
             {""            		,"PI+N0 "   					,"PH+N0 MO+N1 "   			,"PP+N0 "   					,"PD+N0 MD+N1 "		,""},//31
             {""            		,"PI+N0 "   					,"PP+N0 "   				,"PP+N0 "   					,"PD+N0 "   		,""},//32
             {""            		,"PI+N0 "   					,"PP+N0 CT+Y0 " 			,"PP+N0 TE+Y0 "					,"PD+N0 MD+N1 "		,""},//33
             {""            		,"PI+N0 MI+N1 "					,"PH+N0 "					,"PP+N0 AB+N0 "					,"PD+N0  "  		,""},//34
             {""            		,"PI+N0 MI+N1 "					,"PH+N0 "					,"PP+N0 "						,"PD+N0 MD+N1 "		,""},//35
             {""            		,"PI+N0 "   					,"PH+N0 A2+N0 "				,"PH+N0 "						,"PD+N0 MD+N1 "		,""},//36
             {""            		,""            					,""         				,""     						,""         		,""},//37
             {""            		,""            					,""         				,"PC+N3 "  						,""         		,""},//38
             {""            		,""            					,"PC+N5 "     				,""     						,""         		,""},//39
             {""            		,""            					,""         				,""     						,""         		,""},//40
             {""            		,""            					,"PC+N8 "     				,""     						,""         		,""},//41
             {""            		,""            					,""         				,""     						,""         		,""},//42
             {"PI+N8 MI+N9 "		,"PH+N8 PA+N7 "	    			,"PP+N8 PA+N7 "				,"PD+N8 MD+N9 "	            	,""                 ,""},//43
             {"PI+N8 MI+N9 "		,"PH+N8 "			    		,"PP+N8 "					,"PD+N8 MD+N9 "	            	,""                 ,""},//44
             {"PI+N8 "   		    ,"PH+N8 AB+N8 " 	    		,"PP+N8 MO+N9 "				,"PD+N8 "   	            	,""                 ,""},//45
             {"PI+N8 "   			,"PH+N8 "        		    	,"PP+N8 "					,"PD+N8 MD+N9 "	            	,""                 ,""},//46
             {"PI+N8 MI+N9 " 		,"PH+N8 TE-Y8 "    	    		,"PP+N8 A2+N8 "				,"PD+N8 "   	            	,""                 ,""},//47
             {"PI+N8 MI+N9 "		,"PH+N8 TE-Y8 "    		    	,"PP+N8 TE-Y8 "				,"PD+N8 MD+N9 "	            	,""                 ,""},//48
             {"PI+N8 MI+N9 "		,"PH+N8 "				    	,"PP+N8 "					,"PD+N8 MD+N9 "	            	,""                 ,""},//49
             {"PI+N8 MI+N9 "		,"PH+N8 "				    	,"PP+N8 "					,"PD+N8 MD+N9 "	            	,""                 ,""},//50
             {"PI+N8 MI+N9 "		,"PH+N8 "				    	,"PP+N8 MO+N9 "				,"PD+N8 MD+N9 "	            	,""                 ,""},//51
             {""            		,""            					,""         				,""     						,""         		,""},//52
             {""            		,""            					,""         				,""     						,""         		,""},//53
             {""                    ,""                       		,"PH+N6 K1+N6 PA+N5 "   	,""         	            	,""                 ,""},//54
             {""                    ,"PI+N6 MI+N7 "          		,"PH+N6 TM+N6 "			   	,"PD+N6 MD+N7 "	            	,""                 ,""},//55
             {""                    ,"PI+N6 MI+N7 "          		,"PH+N6 "   			   	,"PD+N6 MD+N7 "	            	,""                 ,""},//56
             {""                    ,"PI+N6 "                  		,"PH+N6 "            	   	,"PD+N6 "   	            	,""                 ,""},//57
             {""                    ,"PI+N6 MI+N7 "          		,"PH+N6 "            	   	,"PD+N6 MD+N7 "	            	,""                 ,""},//58
             {""                    ,"PI+N6 "                  		,"PH+N6 PR+N6 "			   	,"PD+N6 MD+N7 "	            	,""                 ,""},//59
             {""                    ,"PI+N6 MI+N7 "          		,"PH+N6 "   			   	,"PD+N6 MD+N7 "	            	,""                 ,""},//60
             {""                    ,"PI+N6 MI+N7 "          		,"PH+N6 TM+N6 "  		   	,"PD+N6 "   	            	,""                 ,""},//61
             {""                    ,"PI+N6 "                  		,"PH+N6 "            	   	,"PD+N6 "   	            	,""                 ,""},//62
             {""                    ,"PI+N5 MI+N6 "          		,"PH+N5 "            	   	,"PD+N5 MD+N6 "	            	,""                 ,""},//63
             {""                    ,"PI+N4 MI+N5 "          		,"PH+N4 MO+N6 "           	,"PD+N4 MD+N5 "	            	,""                 ,""},//64
             {""                    ,"PI+N3 "                  		,"PH+N3 "            	   	,"PD+N3 "   	            	,""                 ,""},//65
             {""                    ,"PI+N2 MI+N3 "          		,"PH+N2 "           	   	,"PD+N2 MD+N2 "	            	,""                 ,""},//66
             {""                    ,"PI+N2 MI+N3 "          		,"PH+N2 TR+N2 "        	   	,"PD+N2 MD+N3 "	            	,""                 ,""},//67
             {""                    ,"PI+N2 "                  		,"PH+N2 "            	   	,"PD+N2 "   	            	,""                 ,""},//68
             {""                    ,"PI+N2 MI+N3 "          		,"PH+N2 "            	   	,"PD+N2 MD+N3 "	            	,""                 ,""},//69
             {"PI+N2 MI+N3 "        ,"PA+N2 PP+N2 "            		,"PH+N2 "           	   	,"PA+N2 PP+N2 "   	         	,"PD+N2 MD+N3 "     ,""},//70
             {"PI+N2 MI+N3 "        ,"PH+N2 AB+N2 "            		,"PH+N2 "            	   	,"PP+N2 "   	            	,"PD+N2 MD+N3 "     ,""},//71
             {"PI+N2 MI+N3 "        ,"PP+N2 "                  		,"PH+N2 MO+N4 "        	   	,"PP+N2 "   	            	,"PD+N2 MD+N3 "     ,""},//72
             {"PI+N2 MI+N3 "        ,"PP+N2 AB+N2 "            		,"PH+N2 GT+N2 "       	   	,"PP+N2 GT+N2 "   	           	,"PD+N2 MD+N3 "     ,""},//73
             {"PI+N2 MI+N3 "        ,"PP+N2 "                  		,"PH+N2 "            	   	,"PP+N2 A2+N2 "	            	,"PD+N2 MD+N3 "     ,""},//74
             {"PI+N2 MI+N3 "        ,"PP+N2 "                		,"PH+N2 AB+N2 "        	   	,"PP+N2 "   	            	,"PD+N2 MD+N3 "     ,""},//75
             {"PI+N2 MI+N3 "        ,"PP+N2 A2+N2 "            		,"PH+N2 "            	   	,"PP+N2 "   	            	,"PD+N2 MD+N3 "     ,""},//76
             {"PI+N2 MI+N3 "        ,"PP+N2 "                  		,"PH+N2 TE-Y2 "        	   	,"PP+N2 TE-Y2 "             	,"PD+N2 MD+N3 "     ,""},//77
             {"PI+N2 MI+N3 "        ,"PP+N2 TR+N2 "            		,"PH+N2 "           	   	,"PP+N2 "                    	,"PD+N2 MD+N3 "     ,""},//78
             {"PI+N2 MI+N3 "        ,"PP+N2 "                  		,"PH+N2 "           	   	,"PP+N2 "                   	,"PD+N2 MD+N3 "     ,""},//79
             {"PI+N2 MI+N3 "        ,"PP+N2 "                  		,"PH+N2 "           	   	,"PP+N2 CT-Y2 "               	,"PD+N2 MD+N3 "     ,""},//80
             {""                    ,""                       		,""                 	   	,""                         	,""                 ,""},//81
             {""                    ,""                       		,""                 	   	,""                         	,""                 ,""},//82
             {""                    ,""                       		,""                 	   	,"PC+N4 "                      	,""                 ,""},//83
             {""                    ,""                       		,""                 	   	,""                         	,""                 ,""},//84
             {""                    ,""                       		,""                 	   	,""                         	,""                 ,""},//85
             {""                    ,""                       		,""                 	   	,"PC+N3 "                      	,""                 ,""},//86
             {""                    ,""                       		,""                 	   	,""                         	,""                 ,""},//87
             {""                    ,""                       		,""                 	   	,""                         	,""                 ,""},//88
             {""                    ,""                       		,""                 	   	,"PC+N5 "                      	,""                 ,""},//89
             {""                    ,""                       		,""                 	   	,""                         	,""                 ,""},//90
             {""                    ,""                       		,""                 	   	,""                         	,""                 ,""},//91
             {"PI+N2 MI+N3 "        ,"PP+N2 PA+N1 "           		,"PH+N2 PA+N1 "            	,"PD+N2 MD+N3 "                	,""                  ,""},//92
             {"PI+N2 MI+N3 "        ,"PP+N2 PR+N2 "            		,"PH+N2 "           	   	,"PD+N2 MD+N3 "                	,""                  ,""},//93
             {"PI+N2 MI+N3 "        ,"PP+N2 "                  		,"PH+N2 AB+N2 "        	   	,"PD+N2 MD+N3 "                	,""                  ,""},//94
             {"PI+N2 MI+N3 "        ,"PP+N2 "                  		,"PH+N2 "           	   	,"PD+N2 MD+N3 "                	,""                  ,""},//95
             {"PI+N2 MI+N3 "        ,"PP+N2 "                  		,"PH+N2 TR+N2 "        	   	,"PD+N2 MD+N3 "                	,""                  ,""},//96
             {"PI+N2 MI+N3 "        ,"PP+N2 "                  		,"PH+N2 "           	   	,"PD+N2 MD+N3 "                	,""                  ,""},//97
             {"PI+N2 MI+N3 "        ,"PP+N2 PR+N2 "            		,"PH+N2 MO+N3 "        	   	,"PD+N2 MD+N3 "                	,""                  ,""},//98
             {"PI+N2 MI+N3 "        ,"PP+N2 "               		,"PH+N2 MO+N3 "        	   	,"PD+N2 MD+N3 "                	,""                  ,""},//99
             {""                    ,"PP+N2 K2+N2 "           		,"PH+N2 "           	   	,""                         	,""                  ,""},//100
             {""                    ,""                        		,""                    	   	,""                         	,""                  ,""},//101
             {""                    ,""                        		,""                    	   	,""                         	,""                  ,""},//102
             {"P2+N1 MI+N1 "        ,"PE+N2 PA+N1 "                	,"PE+N2 PA+N1 "        	   	,"P3+N1 "                   	,""                  ,""},//103
             {"P2+N0 "              ,"PE+N1 "                  		,"PE+N1 MO+N2 "           	,"P3+N0 MD+N0 "               	,""                  ,""},//104
             {"P2+N-1 MI+N-1 "      ,"PE+N0 AB+N-1 "           		,"PE+N0 CR+N-1 MO+N1 "     	,"P3+N-1 MD+N-1 "              	,""                  ,""},//105
             {"P2+N-2 MI+N-2 "      ,"PE+N-1 "               		,"PE+N-1 "           	   	,"P3+N-2 MD+N-2 "               ,""                  ,""},//106
             {"P2+N-3 MI+N-3 "      ,"PE+N-2 "               		,"PE+N-2 TR+N-3 "      	   	,"P3+N-3 MD+N-3 "               ,""                  ,""},//107
             {"P2+N-4 MI+N-4 "      ,"PE+N-3 "               		,"PE+N-3 TR+N-4 "      	   	,"P3+N-4 MD+N-4 "               ,""                  ,""},//108
             {"P2+N-5 MI+N-5 "      ,"PE+N-4 CR+N-5 "          		,"PE+N-4 "                	,"P3+N-5 MD+N-5 "               ,""                  ,""},//109
             {"P2+N-6 MI+N-6 "      ,"PE+N-5 MO+N-4 "          		,"PE+N-5 "               	,"P3+N-6 MD+N-6 "               ,""                  ,""},//110
             {"P2+N-7 MI+N-7 "      ,"PE+N-6 MO+N-5 "          		,"PE+N-6 "           	   	,"P3+N-7 MD+N-7 "               ,""                  ,""},//111
             {"P2+N-8 MI+N-8 "      ,"PE+N-7 TE-Y-8 "              	,"PE+N-7 TE-Y-8 "          	,"P3+N-8 MD+N-8 "               ,""                  ,""},//112
             {"P2+N-9 MI+N-9 "      ,"PE+N-8 "               		,"PE+N-8 "           	   	,"P3+N-9 MD+N-9 "               ,""                  ,""},//113
             {"P2+N-10 MI+N-10 "    ,"PE+N-9 "               		,"PE+N-9 "           	   	,"P3+N-10 MD+N-10 "             ,""                  ,""},//114
             {"P2+N-11 MI+N-11 "    ,"PE+N-10 AB+N-11 "         	,"PE+N-10 "           	   	,"P3+N-11 MD+N-11 "             ,""                  ,""},//115
             {"P2+N-12 MI+N-12 "    ,"PE+N-11 "               		,"PE+N-11 CR+N-11 "         ,"P3+N-12 MD+N-12 "             ,""                  ,""},//116
             {"P2+N-13 MI+N-13 "    ,"PE+N-12 "                 	,"PE+N-12 "           	   	,"P3+N-13 MD+N-13 "             ,""                  ,""},//117
             {"P2+N-14 MI+N-14 "    ,"PE+N-13 "                  	,"PE+N-13 MO+N-12 "        	,"P3+N-14 MD+N-14 "             ,""                  ,""},//118
             {"P2+N-15 MI+N-15 "    ,"PE+N-14 TE-Y-15 "             ,"PE+N-14 "           	   	,"P3+N-15 MD+N-15 "             ,""                  ,""},//119
             {"P2+N-16 MI+N-16 "    ,"PE+N-15 "               		,"PE+N-15 "           	   	,"P3+N-16 MD+N-16 "             ,""                  ,""},//120
             {""                    ,""                        		,""                    	   	,""                             ,""                  ,""},//121
             {""                    ,""                        		,""                    	   	,""                             ,""                  ,""},//122
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 PA+N-17 "             ,"PH+N-16 PA+N-17 "        	,"PD+N-16 MD+N-15 "             ,""                  ,""},//123
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 "                     ,"PH+N-16 "               	,"PD+N-16 MD+N-15 "             ,""                  ,""},//124
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 AB+N-16 "             ,"PH+N-16 PU+N-16 "         ,"PD+N-16 MD+N-15 "             ,""                  ,""},//125
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 "                     ,"PH+N-16 "                 ,"PD+N-16 MD+N-15 "             ,""                  ,""},//126
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 "                     ,"PH+N-16 CR+N-16 "        	,"PD+N-16 MD+N-15 "             ,""                  ,""},//127
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 FC+N-16 "             ,"PH+N-16 "               	,"PD+N-16 MD+N-15 "             ,""                  ,""},//128
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 "                     ,"PH+N-16 FC+N-16 "        	,"PD+N-16 MD+N-15 "             ,""                  ,""},//129
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 "                     ,"PH+N-16 MO+N-15 "        	,"PD+N-16 MD+N-15 "             ,""                  ,""},//130
             {""                    ,""                             ,""                      	,""                             ,""                  ,""},//131
             {""                    ,""                             ,""                      	,""                             ,""                  ,""},//132
             {""                    ,""                             ,"PC+Y-15 "                	,""                             ,""                  ,""},//132
             {""                    ,""                             ,""                     	,""                             ,""                  ,""},//133
             {""                    ,""                             ,""                     	,""                             ,""                  ,""},//134
             {""                    ,""                             ,"PC+Y-13 MO+N-12 "        	,""                             ,""                  ,""},//135
             {""                    ,""                             ,""                     	,""                             ,""                  ,""},//136
             {""                    ,""                             ,""                     	,""                             ,""                  ,""},//137
             {""                    ,""                             ,""                     	,""                             ,""                  ,""},//138
             {""                    ,""                             ,"PC+Y-11 "                	,""                             ,""                  ,""},//139
             {""                    ,""                             ,""                     	,""                             ,""                  ,""},//140
             {""                    ,""                             ,""                     	,""                             ,""                  ,""},//141
             {"P2+N-12 MI+N-12 "    ,"PE+N-11 PA+N-12 "           	,"PE+N-11 PA+N-12 "        	,"P3+N-12 "                   	,""                  ,""},//142
             {"P2+N-13 MI+N-13 "    ,"PE+N-12 "                    	,"PE+N-12 "           	   	,"P3+N-13 MD+N-13 "            	,""                  ,""},//143
             {"P2+N-14 "            ,"PE+N-13 TE-Y-14 "            	,"PE+N-13 AB+N-14 "       	,"P3+N-14 MD+N-14 "            	,""                  ,""},//144
             {"P2+N-15 MI+N-15 "    ,"PE+N-14 "                    	,"PE+N-14 "           	   	,"P3+N-15 "                   	,""                  ,""},//144
             {"P2+N-16 MI+N-16 "    ,"PE+N-15 "                    	,"PE+N-15 "           	   	,"P3+N-16 MD+N-16 "            	,""                  ,""},//145
             {"P2+N-17 "            ,"PE+N-16 CR+N-16 "             ,"PE+N-16 A2+N-17 "        	,"P3+N-17 MD+N-17 "            	,""                  ,""},//146
             {"P2+N-18 MI+N-18 "    ,"PE+N-17 "                    	,"PE+N-17 "           	   	,"P3+N-18 MD+N-18 "            	,""                  ,""},//147
             {"P2+N-19 MI+N-19 "    ,"PE+N-18 MO+N-17 "           	,"PE+N-18 "           	   	,"P3+N-19 "                 	,""                  ,""},//148
             {"P2+N-20 MI+N-20 "    ,"PE+N-19 FC+N-20 "            	,"PE+N-19 A2+N-20 "        	,"P3+N-20 MD+N-19 "            	,""                  ,""},//149
             {"P2+N-21 "            ,"PE+N-20 "                    	,"PE+N-20 "         	   	,"P3+N-21 MD+N-20 "            	,""                  ,""},//150
             {""                    ,""                         	,""                    	   	,""                         	,""                  ,""},//151
             {""                    ,""                         	,""                    	   	,""                         	,""                  ,""},//152
             {""                    ,"PH+N-22 PA+N-23 K2+N-22 "     ,"PH+N-22 PA+N-23 "        	,""                             ,""                  ,""},//153
             {"PI+N-22 MI+N-21 "    ,"PH+N-22 MO+N-21 "             ,"PD+N-22 PA+N-22 "         ,""                             ,""                  ,""},//154
             {"PI+N-22 MI+N-21 "    ,"PH+N-22 TM+N-22 "             ,"PH+N-22 PA+N-22 "         ,"PD+N-22 MD+N-21 "             ,""                  ,""},//155
             {""                    ,"PI+N-22 PA+N-22 "             ,"PH+N-22 "             	,"PD+N-22 "                     ,""                  ,""},//156
             {"PI+N-22 "            ,"PH+N-22 PA+N-22 "             ,"PH+N-22 TM+N-22 "       	,"PD+N-22 MD+N-21 "             ,""                  ,""},//157
             {"PI+N-22 MI+N-21 "    ,"PH+N-22 CR+N-22 "             ,"PD+N-22 PA+N-22 "         ,""                             ,""                  ,""},//158
             {"PI+N-22 MI+N-21 "    ,"PH+N-22 CR+N-22 "             ,"PH+N-22 PA+N-22 "         ,"PD+N-22 MD+N-21 "             ,""                  ,""},//159
             {""                    ,"PI+N-22 PA+N-22 "             ,"PH+N-22 "             	,"PD+N-22 MD+N-21 "             ,""                  ,""},//160
             {"PI+N-22 MI+N-21 "    ,"PH+N-22 PA+N-22 "             ,"PH+N-22 "             	,"PD+N-22 MD+N-21 "             ,""                  ,""},//161
             {"PI+N-22 MI+N-21 "    ,"PH+N-22 "                     ,"PD+N-22 PA+N-22 "         ,""                             ,""                  ,""},//162
             {"PI+N-22 MI+N-21 "    ,"PH+N-22 TM+N-22 "             ,"PH+N-22 PA+N-22 "         ,"PD+N-22 MD+N-21 "             ,""                  ,""},//163
             {""                    ,"PI+N-22 PA+N-22 "             ,"PH+N-22 "             	,"PD+N-22 "                     ,""                  ,""},//164
             {"PI+N-22 "            ,"PH+N-22 PA+N-22 "             ,"PH+N-22 FC+N-22  "       	,"PD+N-22 MD+N-21 "             ,""                  ,""},//165
             {"PI+N-22 MI+N-21 "    ,"PH+N-22 "                     ,"PD+N-22 PA+N-22 "         ,""                             ,""                  ,""},//166
             {"PI+N-22 MI+N-21 "    ,"PH+N-22 FC+N-22 "             ,"PH+N-22 PA+N-22 "         ,"PD+N-22 MD+N-21 "             ,""                  ,""},//167
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//168
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//169
             {""                    ,""                             ,"PC+Y-22 "                	,""                             ,""                  ,""},//170
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//171
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//172
             {""                    ,""                             ,""                     	,"PC+Y-20 "                     ,""                  ,""},//173
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//174
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//175
             {""                    ,"PC+Y-18 "                     ,""                     	,""                             ,""                  ,""},//176
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//177
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//178
             {""                    ,"PC+Y-16 "                     ,""                     	,""                             ,""                  ,""},//179
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//177
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//178
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 PA+N-17 "             ,"PH+N-16 PA+N-17 "        	,"PD+N-16 "                     ,""                  ,""},//179
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 "                     ,"PH+N-16 "             	,"PD+N-16 MD+N-15 "             ,""                  ,""},//180
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 TM+N-16 "             ,"PH+N-16 "             	,"PD+N-16 "                     ,""                  ,""},//181
             {"PI+N-16 "            ,"PH+N-16 "                     ,"PH+N-16 "             	,"PD+N-16 MD+N-15 "             ,""                  ,""},//182
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 MO+N-15 "             ,"PH+N-16 "                	,"PD+N-16 MD+N-15 "             ,""                  ,""},//183
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 MO+N-15 "             ,"PH+N-16 PR+N-16 "         ,"PD+N-16 "                     ,""                  ,""},//184
             {"PI+N-16 "            ,"PH+N-16 FC+N-16 MO+N-15 "     ,"PH+N-16 "             	,"PD+N-16 MD+N-15 "             ,""                  ,""},//185
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 "                     ,"PH+N-16 "             	,"PD+N-16 MD+N-15 "             ,""                  ,""},//186
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 "                     ,"PH+N-16 TE-Y-16 "        	,"PD+N-16 MD+N-15 "             ,""                  ,""},//187
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 GT+N-16 "             ,"PH+N-16 "             	,"PD+N-16 "                     ,""                  ,""},//188
             {"PI+N-16 "            ,"PH+N-16 "                     ,"PH+N-16 FC+N-16  "      	,"PD+N-16 MD+N-15 "             ,""                  ,""},//189
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 "                     ,"PH+N-16 "             	,"PD+N-16 MD+N-15 "             ,""                  ,""},//190
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//191
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//192
             {""                    ,""                             ,"PC+Y-18 "                	,""                             ,""                  ,""},//193
             {""                    ,""                             ,""                         ,""                             ,""                  ,""},//194
             {""                    ,""                             ,""                         ,"PC+Y-26 "                     ,""                  ,""},//195
             {""                    ,""                             ,""                     	,""                             ,""                  ,""},//196
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 PA+N-17 "             ,"PH+N-16 PA+N-17 "        	,"PD+N-16 "                     ,""                  ,""},//197
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 "                     ,"PH+N-16 "             	,"PD+N-16 MD+N-15 "             ,""                  ,""},//198
             {"PI+N-16 MI+N-15 "    ,"PH+N-16 AB+N-16 "             ,"PH+N-16 "             	,"PD+N-16 "                     ,""                  ,""},//199
             {"PI+N-16 "            ,"PH+N-16 "                     ,"PH+N-16 "             	,"PD+N-16 MD+N-15 "             ,""                  ,""},//200
		};
		//Mundo
		world.getTextureResources().add(R.drawable.level3_fondo);
		//Constantes
		crashResource = R.raw.agua;
		musicResource = R.raw.bosque_musica;
        resourceCintaCheckPoint = R.drawable.level3_check_point;
        resourcePaloCheckPoint = R.drawable.level3_tronco;
		this.level = level;
	}
	
	@Override
	protected List<ShapeOpengl> crearObjeto(String figura,float x,float y,float z){
        List<ShapeOpengl> shapes = new ArrayList<>();
        if (figura.equals("AB")){
            shapes.add(crearArbol(x,y,z));
        }
        if (figura.equals("A2")){
            shapes.add(crearTroncoVertical(x,y,z));
            shapes.add(crearArbolHojas(x,y+0.4f,z,radioEsfera*1.4f));
            shapes.add(crearArbolHojas(x,y+0.5f,z,radioEsfera*1.1f));
            shapes.add(crearArbolHojas(x,y+0.6f,z,radioEsfera*0.8f));
            shapes.add(crearArbolHojas(x,y+0.7f,z,radioEsfera*0.5f));
        }
        if (figura.equals("CM")){
            shapes.add(crearConoMetalico(x,y,z));
        }
        if (figura.equals("CT")){
            shapes.add(crearTroncoGrados(x,y,z,0));
            shapes.add(crearTroncoGrados(x,y,z,10));
            shapes.add(crearTroncoGrados(x,y,z,20));
            shapes.add(crearTroncoGrados(x,y,z,30));
            shapes.add(crearTroncoGrados(x,y,z,40));
        }
        if (figura.equals("CR")){
            shapes.add(crearCuboCuadricula(x-lengthPlano,y,z));
            shapes.add(crearCuboCuadricula(x-lengthPlano/2,y,z));
            shapes.add(crearCuboCuadricula(x,y,z));
            shapes.add(crearCuboCuadricula(x+lengthPlano/2,y,z));
            shapes.add(crearCuboCuadricula(x+lengthPlano,y,z));

            shapes.add(crearCuboCuadricula2(x-lengthPlano,y+lengthPlano/2,z));
            shapes.add(crearCuboCuadricula2(x-lengthPlano,y+lengthPlano*2,z));

        }
        if (figura.equals("EC")){
            crearEsferaCristalina(x,y,z);
        }
        if (figura.equals("FC")){
            shapes.add(crearCilindroFlechas(x+lengthPlano/2, y + lengthPlano*2, z + lengthPlano / 2));
            shapes.add(crearCilindroFlechas(x-lengthPlano/2, y + lengthPlano*2, z + lengthPlano / 2));
            shapes.add(crearCastilloFlechasSuperior(x,y+lengthPlano*2,z));
            shapes.add(crearCastilloFlechasSoporte(x-lengthPlano,y+lengthPlano,z));
            shapes.add(crearCastilloFlechasSoporte(x+lengthPlano,y+lengthPlano,z));
            shapes.add(crearCuboFlecha(x+lengthPlano/2,y+lengthPlano*2,z));
            shapes.add(crearConoFlecha(x+lengthPlano/2,y+lengthPlano*2,z));
            shapes.add(crearCuboFlecha(x-lengthPlano/2,y+lengthPlano*2,z));
            shapes.add(crearConoFlecha(x-lengthPlano/2,y+lengthPlano*2,z));
        }
        if (figura.equals("GT")){
            shapes.add(crearTroncoVerticalDelgado(x-lengthPlano,y,z));
            shapes.add(crearTroncoVerticalDelgado(x+lengthPlano,y,z));
            shapes.add(crearConoMetalico0(x-lengthPlano/2,y,z));
            shapes.add(crearConoMetalico180(x-lengthPlano/2,y,z));
            shapes.add(crearConoMetalico0(x,y,z));
            shapes.add(crearConoMetalico180(x,y,z));
            shapes.add(crearConoMetalico0(x+lengthPlano/2,y,z));
            shapes.add(crearConoMetalico180(x+lengthPlano/2,y,z));
            shapes.add(crearTroncoHorizontalDelgado(x,y,z));
            shapes.add(crearTroncoHorizontalDelgado180(x,y,z));
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
            shapes.add(crearPlanoCuboRotado(x,y,z));
        }
        if (figura.equals("PH")){
            shapes.add(crearPlanoHorizontal(x,y,z));
        }
		if (figura.equals("PI")){
			shapes.add(crearParedIzquierdaProfundidad(x,y,z));
		}
        if (figura.equals("PP")){
            shapes.add(crearPlanoPiedra(x,y,z));
        }
        if (figura.equals("PR")){
            shapes.add(crearPiedra(x,y,z));
        }
        if (figura.equals("PU")){
            ShapeOpengl puerta1 = crearPlanoPuerta(x-0.2f,y,z+lengthPlano+0.05F);
            ShapeOpengl puerta2 = crearPlanoPuerta(x+0.2f,y,z+lengthPlano+0.05F);
            ShapeOpengl boton1Puerta = crearBotonPuerta(x-0.4f,y,z+lengthPlano+0.05F+0.1f);
            ShapeOpengl boton2Puerta = crearBotonPuerta(x+0.4f,y,z+lengthPlano+0.05F+0.1f);

            boton1Puerta.setPuerta1(puerta1);
            boton1Puerta.setPuerta2(puerta2);
            boton1Puerta.setInterruptor2(boton2Puerta);

            boton2Puerta.setPuerta1(puerta1);
            boton2Puerta.setPuerta2(puerta2);
            boton2Puerta.setInterruptor2(boton1Puerta);

            shapes.add(puerta1);
            shapes.add(puerta2);
            shapes.add(boton1Puerta);
            shapes.add(boton2Puerta);
        }
        if (figura.equals("P2")){
            shapes.add(crearParedProfundidadRotada(x+lengthPlano,y,z));
        }
        if (figura.equals("P3")){
            shapes.add(crearParedProfundidadRotada(x-lengthPlano,y,z));
        }
        if (figura.equals("TE")){
            shapes.add(crearTroncoVerticalGrueso(x,y,z));
            shapes.add(crearConoVertical0(x,y+0.2f,z));
            shapes.add(crearConoVertical80(x,y+0.5f,z));
            shapes.add(crearConoVertical80(x,y+0.6f,z));
            shapes.add(crearConoVertical0(x,y+0.7f,z));
        }
        if (figura.equals("TM")){
            shapes.add(crearTroncoMovimiento(x,y,z));
        }
        if (figura.equals("TR")){
            shapes.add(crearTronco(x,y,z));
        }
        continueShapeCreation(shapes,figura,x,y,z);
        return shapes;
	}

    private void crearEsferaCristalina(float cx,float cy,float cz){
        sphere = new Sphere(cx,cy+radioEsfera*5,cz,12,24,radioEsfera);
        sphere.getTextureResources().add(R.drawable.level3_esfera);
        sphere.setRGBA(1f, 1f, 1f, 0.6f);
    }

    private Cube crearParedIzquierdaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx+lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level3_pared);
        return cube;
    }

    private Cube crearParedDerechaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx-lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level3_pared);
        return cube;
    }

    private Cube crearParedAnchura(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared,cz+lengthPlano+lengthPared,lengthPlano,lengthPared,lengthPared);
        cube.getTextureResources().add(R.drawable.level3_pared);
        return cube;
    }

    private Cone crearConoMetalico(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,4,0.1f,0.4f);
        cone.getTextureResources().add(R.drawable.level3_cono);
        cone.setSolid(true);
        return cone;
    }

    private Cone crearArbol(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,8,0.3f,0.8f);
        cone.getTextureResources().add(R.drawable.level3_arbol);
        cone.setSolid(true);
        return cone;
    }

    private Cylinder crearTronco(float cx, float cy, float cz){
        Cylinder tronco = new Cylinder(cx,cy+0.2f,cz,0.2f,0.3f,16);
        tronco.getAnimator().setAngleZ(90);
        tronco.getTextureResources().add(R.drawable.level3_tronco);
        tronco.setSolid(true);
        return tronco;
    }

    ////////////////////////////////////////Arbol2//////////////////////////////////////////////////

    private Cylinder crearTroncoVertical(float cx, float cy, float cz){
        Cylinder tronco = new Cylinder(cx,cy+0.2f,cz,0.05f,0.4f,16);
        tronco.getTextureResources().add(R.drawable.level3_tronco);
        tronco.setSolid(true);
        return tronco;
    }

    private Sphere crearArbolHojas(float cx, float cy, float cz, float radio){
        Sphere sphere = new Sphere(cx,cy,cz,4,6,radio);
        sphere.getTextureResources().add(R.drawable.level3_hojas);
        sphere.setSolid(true);
        return sphere;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Cube crearPlanoCubo(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy-lengthPared*2,cz,lengthPlano,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level3_pared);
        return cube;
    }

    private Plane crearPlanoHorizontal(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level3_piso);
        return plane;
    }

    private Plane crearPlanoPiedra(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level3_piso2);
        return plane;
    }

    ///////////////////////////////Carrucel de troncos//////////////////////////////////////////////

    private Cylinder crearTroncoGrados(float cx, float cy, float cz, int angulo){
        final float radioCilindo = 0.1f;
        Cylinder tronco = new Cylinder(cx,cy+radioCilindo+(angulo*2*radioCilindo)/10f,cz,radioCilindo,0.5f,16);
        tronco.getAnimator().setAngleZ(90);
        tronco.getAnimator().setAngleY(angulo);
        tronco.getTextureResources().add(R.drawable.level3_tronco);
        tronco.setSolid(true);
        tronco.setOrderRotation(new ArrayList<String>());
        tronco.getOrderRotation().add("Z");
        tronco.getOrderRotation().add("X");
        tronco.getOrderRotation().add("Y");
        return tronco;
    }

    ////////////////////////Arbol espinado/////////////////////////////////////////////////////////

    private Cylinder crearTroncoVerticalGrueso(float cx, float cy, float cz){
        Cylinder tronco = new Cylinder(cx,cy+0.5f,cz,0.2f,0.5f,16);
        tronco.getTextureResources().add(R.drawable.level3_tronco);
        tronco.setSolid(true);
        return tronco;
    }

    private Cone crearConoVertical80(float cx, float cy, float cz){
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
        cone.setOrderRotation(new ArrayList<String>());
        cone.getOrderRotation().add("Z");
        cone.getOrderRotation().add("X");
        cone.getOrderRotation().add("Y");
        cone.setSolid(true);
        return cone;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Cylinder crearTroncoMovimiento(float cx, float cy, float cz){
        final float ty = 0.3f;
        Cylinder tronco = new Cylinder(cx,cy+0.5f+ty,cz,0.15f,0.5f,16);
        tronco.getTextureResources().add(R.drawable.level3_tronco);
        tronco.setSolid(true);
        tronco.getAnimator().setMaxY(ty);
        tronco.getAnimator().setMinY(-ty);
        tronco.getAnimator().setIncrY(0.01f);
        return tronco;
    }

    private Sphere crearPiedra(float cx, float cy, float cz){
        Sphere sphere = new Sphere(cx,cy,cz,8,16,radioEsfera*2);
        sphere.getTextureResources().add(R.drawable.level3_cono2);
        sphere.setSolid(true);
        return sphere;
    }

    /////////////////////////////////////Guillotina/////////////////////////////////////////////////

    private Cylinder crearTroncoVerticalDelgado(float cx, float cy, float cz){
        Cylinder tronco = new Cylinder(cx,cy+0.7f,cz,0.06f,0.7f,16);
        tronco.getTextureResources().add(R.drawable.level3_tronco);
        tronco.setSolid(true);
        return tronco;
    }

    private Cylinder crearTroncoHorizontalDelgado(float cx, float cy, float cz){
        Cylinder tronco = new Cylinder(cx,cy,cz,0.06f,lengthPlano,16);
        tronco.getTextureResources().add(R.drawable.level3_tronco);
        tronco.setSolid(true);
        tronco.getAnimator().setAngleZ(90);
        tronco.getAnimator().setMaxY(0.3f);
        tronco.getAnimator().setMinY(-0.3f);
        tronco.getAnimator().setIncrY(0.01f);
        return tronco;
    }

    private Cylinder crearTroncoHorizontalDelgado180(float cx, float cy, float cz){
        final float ty = 0.3f;
        Cylinder tronco = new Cylinder(cx,cy+ty*4,cz,0.06f,lengthPlano,16);
        tronco.getTextureResources().add(R.drawable.level3_tronco);
        tronco.setSolid(true);
        tronco.getAnimator().setAngleZ(90);
        tronco.getAnimator().setMaxY(ty);
        tronco.getAnimator().setMinY(-ty);
        tronco.getAnimator().setIncrY(-0.01f);
        return tronco;
    }

    private Cone crearConoMetalico0(float cx, float cy, float cz){
        final float ty = 0.3f;
        Cone cone = new Cone(cx,cy,cz,4,0.1f,ty);
        cone.getTextureResources().add(R.drawable.level3_cono2);
        cone.getAnimator().setMaxY(ty);
        cone.getAnimator().setMinY(-ty);
        cone.getAnimator().setIncrY(0.01f);
        cone.setSolid(true);
        return cone;
    }

    private Cone crearConoMetalico180(float cx, float cy, float cz){
        final float ty = 0.3f;
        Cone cone = new Cone(cx,cy+ty*4,cz,4,0.1f,ty);
        cone.getTextureResources().add(R.drawable.level3_cono2);
        cone.getAnimator().setAngleZ(180);
        cone.getAnimator().setMaxY(ty);
        cone.getAnimator().setMinY(-ty);
        cone.getAnimator().setIncrY(-0.01f);
        cone.setSolid(true);
        return cone;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Cube crearPlanoCuboRotado(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy-lengthPared*2,cz,lengthPlano,lengthPared/2,longitudInclinada);
        cube.getTextureResources().add(R.drawable.level3_piso);
        cube.getAnimator().setMaxAngleX(anguloInclinacion);
        cube.getAnimator().setMinAngleX(anguloInclinacion);
        cube.getAnimator().setIncrAngleX(1);
        cube.setCapazVariarAnguloGravedad(true);
        return cube;
    }

    private Cube crearParedProfundidadRotada(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared,cz,lengthPared,lengthPared,longitudInclinada);
        cube.getTextureResources().add(R.drawable.level3_pared);
        cube.getAnimator().setMaxAngleX(anguloInclinacion);
        cube.getAnimator().setMinAngleX(anguloInclinacion);
        cube.getAnimator().setIncrAngleX(1);
        cube.setCapazVariarAnguloGravedad(true);
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////Cuadricula/////////////////////////////////////////////////////

    private Cube crearCuboCuadricula(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPlano,cz,lengthPared/4,lengthPlano,lengthPared/4);
        cube.getTextureResources().add(R.drawable.level3_tronco);
        cube.setSolid(true);
        cube.getAnimator().setMaxY(0.8f);
        cube.getAnimator().setIncrY(0.01f);
        return cube;
    }

    private Cube crearCuboCuadricula2(float cx, float cy, float cz){
        Cube cube = new Cube(cx+lengthPlano,cy,cz,lengthPlano,lengthPared/4,lengthPared/4);
        cube.getTextureResources().add(R.drawable.level3_tronco);
        cube.setSolid(true);
        cube.getAnimator().setMaxY(0.8f);
        cube.getAnimator().setIncrY(0.01f);
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////Flechas////////////////////////////////////////////////////

    private Cylinder crearCilindroFlechas(float cx, float cy, float cz){
        Cylinder3 cilindro = new Cylinder3(cx,cy,cz,0.15f,0.1f,6);
        cilindro.getTextureResources().add(R.drawable.level3_pared);
        cilindro.setSolid(true);
        cilindro.getAnimator().setAngleX(90);
        return cilindro;
    }

    private Cube crearCastilloFlechasSuperior(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,lengthPlano,lengthPlano/2,lengthPlano/2);
        cube.getTextureResources().add(R.drawable.level3_tronco);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearCastilloFlechasSoporte(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,lengthPlano/6,lengthPlano*2,lengthPlano/2);
        cube.getTextureResources().add(R.drawable.level3_tronco);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearCuboFlecha(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,lengthPared/4,lengthPlano/2,lengthPared/4);
        cube.getTextureResources().add(R.drawable.level3_tronco);
        cube.setSolid(true);
        cube.getAnimator().setMinAngleX(90);
        cube.getAnimator().setMaxAngleX(135);
        cube.getAnimator().setIncrAngleX(0.5);
        double steps = (cube.getAnimator().getMaxAngleX()- cube.getAnimator().getMinAngleX())/ cube.getAnimator().getIncrAngleX();
        cube.getAnimator().setBidirectionalAngleX(false);
        cube.getAnimator().setIncrY(-0.02f);
        cube.getAnimator().setMinY(steps* cube.getAnimator().getIncrY());
        cube.getAnimator().setBidirectionalY(false);
        cube.getAnimator().setIncrZ(0.04f);
        cube.getAnimator().setMaxZ(steps* cube.getAnimator().getIncrZ());
        cube.getAnimator().setBidirectionalZ(false);
        return cube;
    }

    private Cone crearConoFlecha(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy+lengthPlano/2,cz,4,0.08f,0.3f);
        cone.getTextureResources().add(R.drawable.level3_cono2);
        cone.getAnimator().setMinAngleX(90);
        cone.getAnimator().setMaxAngleX(135);
        cone.getAnimator().setIncrAngleX(0.5);
        double steps = (cone.getAnimator().getMaxAngleX()- cone.getAnimator().getMinAngleX())/ cone.getAnimator().getIncrAngleX();
        cone.setSolid(true);
        cone.setcRY(-lengthPlano/2);
        cone.getAnimator().setBidirectionalAngleX(false);
        cone.getAnimator().setIncrY(-0.02f);
        cone.getAnimator().setMinY(steps* cone.getAnimator().getIncrY());
        cone.getAnimator().setBidirectionalY(false);
        cone.getAnimator().setIncrZ(0.04f);
        cone.getAnimator().setMaxZ(steps* cone.getAnimator().getIncrZ());
        cone.getAnimator().setBidirectionalZ(false);
        return cone;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
}
