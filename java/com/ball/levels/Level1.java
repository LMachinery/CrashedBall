package com.ball.levels;

import com.ball.activities.R;
import com.ball.shapes.Cone;
import com.ball.shapes.Cube;
import com.ball.shapes.Cylinder;
import com.ball.shapes.Plane;
import com.ball.shapes.ShapeOpengl;

import java.util.ArrayList;
import java.util.List;

public class Level1 extends Level{
	private float lengthCaja;
	
	@Override
	protected void crearNivel(){
		String level[][] = 
			{{"PI+N0 "				,"PH+N0 PA+N0 "					,"PH+N0 PA+N0 "		            		,"PD+N0 "						,""					,""},//1
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "	    	            		,"PD+N0 "						,""					,""},//2
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 EC+N6 "			            	,"PD+N0 "						,""					,""},//3
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "		            			,"PD+N0 "						,""					,""},//4
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "	                			,"PD+N0 "						,""					,""},//5
			 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PH+N0 "			            		,"PD+N0 "			    		,""					,""},//6
			 {"PI+N0 "				,"PH+N0 "			    		,"PH+N0 MO+N1 "		            		,"PD+N0 "						,""					,""},//7
			 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PH+N0 "	            				,"PD+N0 "						,""					,""},//8
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "	                    		,"PD+N0 "						,""					,""},//9
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "			            		,"PD+N0 MD+N1 "					,""					,""},//10
			 {"PI+N0 MI+N1 "		,"PH+N0 MO+N1 "					,"PH+N0 "		                 		,"PD+N0 "						,""					,""},//11
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "		            			,"PD+N0 MD+N1 "					,""					,""},//12
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "		            			,"PD+N0 "						,""					,""},//13
			 {"PI+N0 MI+N1 "		,"PH+N0 CS+N0 "					,"PH+N0 MO+N1 "		                	,"PD+N0 "						,""					,""},//14
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "			            		,"PD+N0 "						,""					,""},//15
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "			            		,"PD+N0 "						,""					,""},//16
			 {"PI+N0 "				,"PH+N0 MO+N1 "					,"PH+N0 CC+Y0 "		            		,"PD+N0 MD+N1 "					,""					,""},//17
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "		            			,"PD+N0 "						,""					,""},//18
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "			            		,"PD+N0 "						,""					,""},//19
			 {"PI+N0 "				,"PH+N0 VH+Z0 "					,"PH+N0 "			            		,"PD+N0 "						,""					,""},//20
			 {"PI+N0 "				,"PH+N0 CM+N0 "					,"PH+N0 MO+N1 "		            		,"PD+N0 "						,""					,""},//21
			 {"CI+N0 "				,"PH+N0 "						,"PH+N0 "			            		,"CD+N0 "						,""					,""},//22
			 {""					,""								,""						            	,""								,""					,""},//23
			 {"PI+N1 "				,"PH+N1 PA+N0 "					,"PH+N1 PA+N0 "	            			,"PD+N1 MD+N2 "					,""					,""},//24
			 {"PI+N1 "				,"PH+N1 "						,"PH+N1 "					            ,"PD+N1 "						,""					,""},//25
			 {"PI+N1 "				,"PH+N1 LH+N1 "					,"PH+N1 LH+N1 "				            ,"PD+N1 "						,""					,""},//26
			 {"PI+N1 "				,"PH+N1 "						,"PH+N1 "					            ,"PD+N1 "						,""					,""},//27
			 {"PI+N1 MI+N2 "		,"PH+N1 "						,"PH+N1 "			            		,"PD+N1 MD+N2 "					,""					,""},//28
			 {"PI+N1 MI+N2 "		,"PH+N1 LH+N1 "					,"PH+N1 LH+N1 "		            		,"PD+N1 MD+N2 "					,""					,""},//29
			 {"PI+N1 MI+N2 "		,"PH+N1 CS+N1 "					,"PH+N1 "			            		,"PD+N1 MD+N2 "					,""					,""},//30
			 {"PI+N1 "				,"PH+N1 "						,"PH+N1 "			            		,"PD+N1 "						,""					,""},//31
			 {"PI+N1 "				,"PH+N1 "						,"PH+N1 "		            			,"PD+N1 "						,""					,""},//32
			 {"PI+N1 MI+N2 "		,"PH+N1 "						,"PH+N1 VH+Z1 "		            		,"PD+N1 "						,""					,""},//33
			 {"PI+N1 MI+N2 "		,"PH+N1 MO+N2 "	    			,"PH+N1 "			            		,"PD+N1 "						,""					,""},//34
			 {"PI+N1 "				,"PH+N1 "						,"PH+N1 "			            		,"PD+N1 "						,""					,""},//35
			 {"PI+N1 MI+N2 "		,"PH+N1 CC+Y1 "					,"PH+N1 CC-Y1 "		            		,"PD+N1 "						,""					,""},//36
			 {"PI+N1 "				,"PH+N1 "						,"PH+N1 "				            	,"PD+N1 "						,""					,""},//37
			 {"PI+N1 "				,"PH+N1 "						,"PH+N1 "				            	,"PD+N1 MD+N2 "					,""					,""},//38
			 {"PI+N1 "				,"PH+N1 CC+Y1 "					,"PH+N1 CC-Y1 "			            	,"PD+N1 MD+N2 "					,""					,""},//39
			 {"PI+N1 "				,"PH+N1 "						,"PH+N1 CS+N1 "			            	,"PD+N1 "						,""					,""},//40
			 {"PI+N1 "				,"PH+N1 "						,"PH+N1 "		                		,"PD+N1 "						,""					,""},//41
			 {"PI+N1 MI+N2 "		,"PH+N1 "						,"PH+N1 MO+N2 "		                 	,"PD+N1 "						,""					,""},//42
			 {""                   	,"PH+N1 K2+N1 "					,"PH+N1 "			               		,""     						,""					,""},//43
			 {""					,""								,""						            	,""								,""					,""},//44
			 {""					,"PC+N2 "						,""			            				,""								,""					,""},//45
			 {""					,"PC+N2 "						,""						            	,""								,""					,""},//46
			 {""					,""								,""					            		,""								,""					,""},//47
			 {""					,""								,"PC+N2 "				            	,""								,""					,""},//48
			 {""					,""								,"PC+N2 "		            			,""								,""					,""},//49
			 {""					,""								,""						            	,""								,""					,""},//50
			 {""					,"PC+N3 "						,""				            			,""								,""					,""},//51
			 {""					,"PC+N3 "						,""					            		,""								,""					,""},//52
			 {""					,""								,""						            	,""								,""					,""},//53
			 {""					,""								,"PC+N3 "					            ,""								,""					,""},//54
			 {""					,""								,"PH+N4 PI+N4 PD+N4 PA+N3 "	            ,""								,""					,""},//55
			 {""					,""								,"PH+N4 PI+N4 PD+N4 MO+N5 "	            ,""								,""					,""},//56
			 {""					,""								,"PH+N4 PI+N4 PD+N4 MO+N5 "	            ,""								,""					,""},//57
			 {""					,""								,"PH+N4 PI+N4 PD+N4 "		            ,""								,""					,""},//58
			 {""					,""								,""							            ,""								,""					,""},//59
			 {""					,"CI+N4 "						,"PH+N4 CE+X4  CE-X9 "		            ,"CD+N4 "						,""					,""},//60
			 {""					,""								,"PH+N4 PI+N4 PD+N4 "		            ,""								,""					,""},//61
			 {""					,""								,"PH+N4 PI+N4 PD+N4 "		            ,""								,""					,""},//62
			 {""					,""								,"PH+N4 PI+N4 PD+N4 "		            ,""								,""					,""},//63
			 {""					,""								,"PH+N4 PI+N4 PD+N4 "		            ,""								,""					,""},//64
			 {""					,""								,"PH+N4 PI+N4 PD+N4 "		            ,""								,""					,""},//65
			 {""					,""								,"PH+N4 PI+N4 PD+N4 CM+N4 "	            ,""								,""					,""},//66
			 {""					,""								,"PH+N4 PI+N4 PD+N4 MD+I5 "	            ,""								,""					,""},//67
			 {""					,""								,"PH+N4 PI+N4 PD+N4 LH+N4 "	            ,""								,""					,""},//68
			 {""					,""								,"PH+N4 PI+N4 PD+N4 MD+N5 MI+N5 "       ,""					        	,""					,""},//69
			 {""					,""								,"PH+N4 PI+N4 PD+N4 MD+N5 MI+N5 "       ,""				        		,""					,""},//70
			 {""					,""								,"PH+N4 PI+N4 PD+N4 LH+N4 MI+N5 "       ,""				        		,""					,""},//71
			 {""					,""								,"PH+N4 PI+N4 PD+N4 MI+N5 MD+N5 "       ,""				        		,""					,""},//72
			 {""					,""								,""							            ,""								,""					,""},//73
			 {"PI+N0 "				,"PH+N0 PA+N-1 "		   		,"PH+N0 PA+N-1 "            			,"PH+N0 PA+N-1 "				,"PD+N0 "			,""},//74
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "			            		,"PH+N0 "						,"PD+N0 "			,""},//75
			 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PH+N0 MO+N1 "	                   		,"PH+N0 "						,"PD+N0 "			,""},//76
			 {"PI+N0 MI+N1 "		,"PH+N0 CS+N0 "					,"PH+N0 "			            		,"PH+N0 "						,"PD+N0 "			,""},//77
			 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PH+N0 "				            	,"PH+N0 CS+N0 "					,"PD+N0 MD+N1 "		,""},//78
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "	            				,"PH+N0 "						,"PD+N0 MD+N1 "		,""},//79
			 {"PI+N0 "				,"PH+N0 CC+Y0 "					,"PH+N0 VH+Z0 "		            		,"PH+N0 CC+Y0 "					,"PD+N0 MD+N1 "		,""},//80
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "			            		,"PH+N0 "						,"PD+N0 "			,""},//81
			 {"PI+N0 "				,"PH+N0 LH+N0 "					,"PH+N0 LH+N0 "			            	,"PH+N0 LH+N0 "					,"PD+N0 "			,""},//82
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "			            		,"PH+N0 "						,"PD+N0 "			,""},//83
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "			            		,"PH+N0 "						,"PD+N0 "			,""},//84
			 {"PI+N0 "				,"PH+N0 MO+N1 "					,"PH+N0 "			            		,"PH+N0 "						,"PD+N0 MD+N1 "		,""},//85
			 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PH+N0 "			            		,"PH+N0 "						,"PD+N0 MD+N1 "		,""},//86
			 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PA+N0 PD+N0 "			            	,"PA+N0 "						,""					,""},//87
			 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PD+N0 "			            		,""								,""					,""},//88
			 {"PI+N0 "				,"PH+N0 "						,"PD+N0 "   			            	,""								,""					,""},//89
			 {"PI+N0 "				,"PH+N0 "						,"PD+N0 "			            		,""								,""					,""},//90
			 {"PI+N0 "				,"PH+N0 LH+N0 "					,"PD+N0 MD+N1 "			            	,""								,""					,""},//91
			 {"PI+N0 MI+N1 "		,"PH+N0 LH+N0 "					,"PD+N0 MD+N1 "			            	,""								,""					,""},//92
			 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PD+N0 MD+N1 "		            		,""								,""					,""},//93
			 {"PI+N0 "				,"PH+N0 "						,"PD+N0 "					            ,""								,""					,""},//94
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 PA+N0 "				            ,"PH+N0 PA+N0 "					,"PH+N0 PA+N0 "		,"PH+N0 PI+N0 PA+N0 "},//95
			 {""					,"PA+N0 "						,"PA+N0 "				            	,"PA+N0 "						,"PA+N0 "			,"PH+N0 PI+N0 PD+N0 MD+N1 "},//96
			 {""					,""								,""							            ,""								,""					,"PH+N0 PI+N0 PD+N0 LH+N0 "},//97
			 {""					,""								,""						            	,""								,""					,"PH+N0 PI+N0 PD+N0 LH+N0 MI+N1 "},//98
			 {""					,""								,""							            ,""								,""					,"PH+N0 PI+N0 PD+N0 MI+N1 MD+N1 "},//99
			 {""					,""								,""							            ,""								,""					,""},//100
			 {""					,"PC+N6 "						,""							            ,"PC+N4 "						,""					,"PC+N2 "},//101
			 {""					,"PC+N6 "						,""							            ,"PC+N4 "						,""					,"PC+N2 "},//102
			 {""					,""								,""							            ,""								,""					,""},//103
			 {""		      		,"PH+N6 PA+N5 K2+N6 "		    ,"PH+N6 PA+N5 "                         ,""     						,""					,""},//104
			 {"PI+N6 "				,"PH+N6 "						,"PH+N6 "					            ,"PD+N6 "						,""					,""},//105
			 {"CI+N6 "				,"PH+N6 LV+N8 LV+N9 "			,"PH+N6 LV+N8 LV+N9 "		            ,"CD+N6 "						,""					,""},//106
			 {"PI+N6 "				,"PH+N6 CM+N6 "					,"PH+N6 "					            ,"PD+N6 "						,""					,""},//107
			 {"PI+N6 "				,"PH+N6 "						,"PH+N6 CM+N6 "				            ,"PD+N6 "						,""					,""},//108
			 {"CI+N6 "				,"PH+N6 LV+N8 LV+N9 "			,"PH+N6 LV+N8 LV+N9 "		            ,"CD+N6 "						,""					,""},//109
			 {"CI+N6 "				,"PH+N6 LV+N8 LV+N9 "			,"PH+N6 LV+N8 LV+N9 "		            ,"CD+N6 "						,""					,""},//110
			 {"PI+N6 "				,"PH+N6 "						,"PH+N6 "					            ,"PD+N6 "						,""					,""},//111
			 {"PI+N6 "				,"PH+N6 "						,"PH+N6 "					            ,"PD+N6 "						,""					,""},//112
			 {"CI+N6 "				,"CE+X7  CE-X12 "				,"CE+X7 CE-X12 "			            ,"CD+N6 "						,""					,""},//113
			 {"PI+N6 "				,"PH+N6 "						,"PH+N6 "					            ,"PD+N6 "						,""					,""},//114
			 {"PI+N6 "				,"PH+N6 "						,"PH+N6 MO+N7 "   	    	            ,"PD+N6 "						,""					,""},//115
			 {"PI+N6 "				,"PH+N6 "						,"PH+N6 MO+N7 "				            ,"PD+N6 "						,""					,""},//116
			 {"PI+N6 " 	        	,"PH+N6 "   					,"PH+N6 MO+N7 "        		            ,"PD+N6 "          				,""					,""},//117
			 {""					,""								,""							            ,""								,""					,""},//118
			 {""					,""								,""							            ,""								,""					,""},//119
			 {""					,""								,"PS+N6 "					            ,""								,""					,""},//120
			 {""					,""								,""							            ,""								,""					,""},//121
			 {""					,""								,""							            ,"PS+N5 "						,""					,""},//122
			 {""					,""								,""							            ,""								,""					,""},//123
			 {""					,""								,""							            ,""								,""					,""},//124
			 {""					,""								,""							            ,"PS+N5 "						,""					,""},//125
			 {""					,""								,""							            ,""								,""					,""},//126
			 {""					,""								,""							            ,""								,""					,""},//127
			 {""					,""								,"PS+N4 "					            ,""								,""					,""},//128
			 {""					,""								,""							            ,""								,""					,""},//129
			 {""					,""								,""							            ,"PS+N3" 						,""					,""},//130
			 {""					,""								,""							            ,""								,""					,""},//131
			 {""					,""								,""							            ,""								,""					,""},//132
			 {""					,""								,"PS+N2 "					            ,""								,""					,""},//133
			 {""					,""								,""							            ,""								,""					,""},//134
			 {""					,""								,""							            ,""								,""					,""},//135
			 {""					,""								,"PS+N0 "					            ,""								,""					,""},//136
			 {""					,""								,""							            ,""								,""					,""},//137
			 {"PI+N0 "				,"PH+N0 PA+N-1 "				,"PH+N0 PA+N-1 "			            ,"PH+N0 PA+N-1 "				,"PD+N0 "			,""},//138
			 {"PI+N0 "				,"PH+N0 CS+N0 " 				,"PH+N0 "					            ,"PH+N0 "						,"PD+N0 MD+N1 "		,""},//139
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 MO+N1 "				            ,"PH+N0 CS+N0 "	        		,"PD+N0 "			,""},//140
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 MO+N1 "	    		            ,"PH+N0 "					   	,"PD+N0 MD+N1 "		,""},//141
			 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "					            ,"PH+N0 "						,"PD+N0 "			,""},//142
             {"PI+N0 MI+N1 "		,"PH+N0 "						,"PH+N0 "					            ,"PH+N0 "						,"PD+N0 MD+N1 "   	,""},//143
             {"PI+N0 MI+N1 "	    ,"CS+N0 PH+N0 "   	        	,"PH+N0 PU+N0 PD+N0 PI+N0 MI+N1 MD+N1 " ,"CS+N0 PH+N0 "   	        	,"PD+N0 MD+N1 "     ,""},//144
             {"PI+N0 MI+N1 "    	,"CS+N0 PH+N0 "            		,"PH+N0 PD+N0 PI+N0 MI+N1 MD+N1 "	 	,"CS+N0 PH+N0 "		            ,"PD+N0 MD+N1 "     ,""},//145
             {"PI+N0 MI+N1 "    	,"CS+N0 PH+N0 "              	,"PH+N0 PD+N0 PI+N0 MI+N1 MD+N1 "	 	,"CS+N0 PH+N0 "	        	    ,"PD+N0 MD+N1 "    	,""},//146
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 MI+N1 MD+N1 LH+N0 "	,""			            		,""            		,""},//147
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 MI+N1 MD+N1 LH+N0 "	,""			            		,""            		,""},//148
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 MI+N1 MD+N1 "	 	,""			            		,""            		,""},//149
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 LM+N0 "	         	,""			            		,""            		,""},//150
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 LM+N0 "	         	,""			            		,""            		,""},//151
             {""    				,"PO+N0 "     					,"PH+N0 K1+N0 "                    	   	,""			            		,""            		,""},//152
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 MO+N1 "	          	,""			            		,""            		,""},//153
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 MO+N1 "	           	,""			            		,""            		,""},//154
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 MI+N1 MD+N1 "	    ,""			            		,""            		,""},//155
             {""    				,""     						,""                 	             	,""			            		,""            		,""},//156
             {""    				,""     						,""                 	             	,""			            		,""            		,""},//157
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 MI+N1 MD+N1 PA+N-1 ",""			            		,""            		,""},//158
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 CR+N0 "           	,""			            		,""            		,""},//159
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 MI+N1"            	,""			            		,""            		,""},//160
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 CR+N1 MD+N1 "      	,""			            		,""            		,""},//161
             {""    				,""     						,"PH+N0 PD+N0 PI+N0 MD+N1 "            	,""			            		,""            		,""},//162
             {""    				,""     						,""                                 	,""			            		,""            		,""},//163
             {""    				,""     						,""                                 	,""			            		,""            		,""},//164
             {"PI+N0 "    			,"PH+N0 PA+N0 "                 ,"PH+N0 PA+N0 "                     	,"PH+N0 PA+N0 "   	       		,"PD+N0 MD+N1 "   	,""},//165
             {"PI+N0 MI+N1 "    	,"PH+N0 "            	        ,"PH+N0 "                            	,"PH+N0 "   	        		,"PD+N0 MD+N1 "     ,""},//166
             {"PI+N0 MI+N1 "    	,"PH+N0 "             	        ,"PH+N0 MO+N1 "                       	,"PH+N0 CS+N0 "	           		,"PD+N0 "           ,""},//167
             {"PI+N0 "    			,"PH+N0 CS+N0 "           	    ,"PH+N0 MO+N1 "                        	,"PH+N0 "   	        		,"PD+N0 MD+N1 "     ,""},//168
             {"PI+N0 MI+N1 "    	,"PH+N0 "                  	    ,"PH+N0 "                            	,"PH+N0 "   	        		,"PD+N0 MD+N1 "    	,""},//169
             {"PI+N0 MI+N1 "    	,"PH+N0 CI+N0 "            	    ,"PH+N0 LV+N2 LV+N3 "                  	,"PH+N0 LV+N2 LV+N3 "   	    ,"CD+N0 MD+N1 "     ,""},//170
             {"PI+N0 MI+N1 "    	,"PH+N0 "               	    ,"PH+N0 LM+N0 "                        	,"PH+N0 LM+N0 "            	    ,"PD+N0 "      		,""},//171
             {"PI+N0 "    			,"PH+N0 "               	    ,"PH+N0 "                             	,"PH+N0 "                 	    ,"PD+N0 MD+N1 "     ,""},//172
             {"PI+N0 MI+N1 "    	,"PH+N0 CI+N0 "                 ,"PH+N0 VH+Z0 "                        	,"PH+N0 VH+Z0 "                 ,"PD+N0 "      		,""},//173
             {"PI+N0 MI+N1 "    	,"PH+N0 "               	    ,"PH+N0 "                             	,"PH+N0 "                 	    ,"PD+N0 MD+N1 "     ,""},//174
             {"PI+N0 MI+N1 "    	,"PH+N0 LH+N0 "                 ,"PH+N0 LH+N0 "                        	,"PH+N0 LH+N0 "            	    ,"PD+N0 MD+N1 "     ,""},//175
             {"PI+N0 "    			,"PH+N0 "               	    ,"PH+N0 "                           	,"PH+N0 "                       ,"PD+N0 "      		,""},//176
             {"PI+N0 MI+N1 "    	,"PH+N0 LH+N0 "                 ,"PH+N0 LH+N0 "                        	,"PH+N0 LH+N0 "                 ,"PD+N0 MD+N1 "    	,""},//177
             {"PI+N0 "    			,"PH+N0 "               	    ,"PH+N0 MO+N1 "                        	,"PH+N0 "                 	    ,"PD+N0 CS+N0 "     ,""},//178
             {"PI+N0 MI+N1 "    	,"PH+N0 CS+N0 "            	    ,"PH+N0 MO+N1 "                        	,"PH+N0 "                 	    ,"PD+N0 MD+N1 "     ,""},//179
             {"PI+N0 "    			,"PH+N0 "               	    ,"PH+N0 "                             	,"PH+N0 "                 	    ,"PD+N0 "      		,""},//180
             {""           			,""                        	    ,""                                  	,""                      	    ,""           		,""},//181
             {""           			,""                        	    ,""                                  	,""                      	    ,""           		,""},//182
             {""           			,""                        	    ,"PS+N2 "                             	,""                      	    ,""           		,""},//183
             {""           			,""                        	    ,""                                  	,""                      	    ,""           		,""},//184
             {""           			,""                        	    ,""                                  	,"PS+N2 "                  	    ,""           		,""},//185
             {""           			,""                        	    ,""                                  	,""                      	    ,""           		,""},//186
             {""           			,""                        	    ,"PS+N2 "                              	,""                       	    ,""           		,""},//187
             {""           			,""                        	    ,""                                  	,""                      	    ,""           		,""},//188
             {""           			,""                        	    ,""                                  	,""                      	    ,""           		,""},//189
             {"PI+N0 "    			,"PH+N0 PA+N-1 "           	    ,"PH+N0 PA+N-1 "                       	,"PH+N0 PA+N-1 "           	    ,"PD+N0 "      		,""},//190
             {"PI+N0 "    			,"PH+N0 CS+N0 "                 ,"PH+N0 "                             	,"PH+N0 MO+N2 "            	    ,"PD+N0 "      		,""},//191
             {"PI+N1 "          	,"PH+N1 PA+N0 "            	    ,"PH+N1 PA+N0 VH+Z1 "                  	,"PH+N1 PA+N0 VH+Z1 "      	    ,"PD+N1 "           ,""},//192
             {"PI+N1 "    			,"PH+N1 CS+N3 "                 ,"PH+N1 "                              	,"PH+N1 "            	        ,"PD+N1 "      		,""},//193
             {"PI+N2 "    			,"PH+N2 PA+N1 "           	    ,"PH+N2 PA+N1 MO+N3 "                  	,"PH+N2 PA+N1 "            	    ,"PD+N2 "           ,""},//194
             {"PI+N2 "    			,"PH+N2 CS+N2 "           	    ,"PH+N2 "                             	,"PH+N2 "                 	    ,"PD+N2 "      		,""},//195
             {"PI+N3 "    			,"PH+N3 PA+N2 "           	    ,"PH+N3 PA+N2 "                        	,"PH+N3 PA+N2 "            	    ,"PD+N3 "      		,""},//196
             {"PI+N3 "    			,"PH+N3 VH+Z3 "            	    ,"PH+N3 MO+N4 "                        	,"PH+N3 "                 	    ,"PD+N3 "      		,""},//197
             {"PI+N3 "    			,"PH+N3 CS+N3 "                 ,"PH+N3 CC+Y3 "                        	,"PH+N3 CC-Y3 "                 ,"PD+N3 "      		,""},//198
             {"PI+N3 "    			,"PH+N3 CS+N3 "                 ,"PH+N3 "                             	,"PH+N3 "                 	    ,"PD+N3 "      		,""},//199
             {"PI+N3 "    			,"PH+N3 "               	    ,"PH+N3 "                             	,"PH+N3 CS+N3 "            	    ,"PD+N3 "      		,""},//200
		};	
		//Mundo
		world.getTextureResources().add(R.drawable.level1_fondo);
		//Constantes
		lengthCaja = 0.2f;
		crashResource = R.raw.cristal;
		musicResource = R.raw.cristal_musica;
		this.level = level;
	}
	
	@Override
	protected List<ShapeOpengl> crearObjeto(String figura,float x,float y,float z){
        List<ShapeOpengl> shapes = new ArrayList<>();
        if (figura.equals("CC")){
            shapes.add(crearCajaCristal(x,y,z));
        }
        if (figura.equals("CD")){
            shapes.add(crearCajaSolida(x-lengthPlano/2,y,z));
        }
        if (figura.equals("CE")){
            shapes.add(crearCajaEspinada(x,y,z));
            shapes.add(crearConoMetalico(x-lengthPared*2,y+lengthPared,z));
            shapes.add(crearConoMetalico(x+lengthPared,y+lengthPared,z));
            shapes.get(shapes.size()-1).getAnimator().setAngleX(90);
        }
        if (figura.equals("CI")){
            shapes.add(crearCajaSolida(x+lengthPlano/2,y,z));
        }
        if (figura.equals("CM")){
            shapes.add(crearConoMetalico(x-lengthPared,y,z));
            shapes.add(crearConoMetalico(x+lengthPared,y,z));
        }
        if (figura.equals("CR")){
            shapes.add(crearCilindroRotable(x,y,z));
        }
        if (figura.equals("CS")){
            shapes.add(crearCajaSolida(x,y,z));
        }
        if (figura.equals("EC")){
            crearEsferaCristalina(x,y,z);
        }
        if (figura.equals("LH")){
            shapes.add(crearLaserHorizontal(x,y,z));
        }
        if (figura.equals("LM")){
            shapes.add(crearLaserMorado(x,y,z));
        }
        if (figura.equals("LV")){
            shapes.add(crearLaserVertical(x,y,z));
        }
        if (figura.equals("MD")){
            shapes.add(crearConoMetalico(x-lengthPlano,y,z));
        }
        if (figura.equals("MI")){
            shapes.add(crearConoMetalico(x+lengthPlano,y,z));
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
        if (figura.equals("PH")){
            shapes.add(crearPlanoHorizontal(x,y,z));
        }
		if (figura.equals("PI")){
			shapes.add(crearParedIzquierdaProfundidad(x,y,z));
		}
		if (figura.equals("PS")){
			shapes.add(crearPlanoSubida(x,y,z));
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
		if (figura.equals("VH")){
			shapes.add(crearVentiladorHorizontal(x,y,z));
			shapes.add(crearVentiladorHorizontal(x,y,z));
            shapes.get(shapes.size()-1).getAnimator().setAngleZ(90);
			shapes.add(crearVentiladorVertical(x,y,z));
            shapes.get(shapes.size()-1).setNoRotar(true);
		}
        continueShapeCreation(shapes,figura,x,y,z);
        return shapes;
	}
	
	private void crearEsferaCristalina(float cx,float cy,float cz){
		sphere = crearEsfera(cx,cy,cz);
		sphere.getTextureResources().add(R.drawable.level1_esfera);
		sphere.setRGBA(1f, 1f, 1f, 1f);
	}
	
	private Cube crearParedIzquierdaProfundidad(float cx, float cy, float cz){
		Cube cube = new Cube(cx+lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
		cube.getTextureResources().add(R.drawable.level1_pared);
		return cube;
	}
	
	private Cube crearParedDerechaProfundidad(float cx, float cy, float cz){
		Cube cube = new Cube(cx-lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
		cube.getTextureResources().add(R.drawable.level1_pared);
		return cube;
	}
	
	private Cube crearParedAnchura(float cx, float cy, float cz){
		Cube cube = new Cube(cx,cy+lengthPared,cz+lengthPlano+lengthPared,lengthPlano,lengthPared,lengthPared);
		cube.getTextureResources().add(R.drawable.level1_pared);
		return cube;
	}

    private Cone crearConoMetalico(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,4,0.1f,0.4f);
        cone.getTextureResources().add(R.drawable.level1_cono);
        cone.setSolid(true);
        return cone;
    }

    private Cube crearCajaSolida(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthCaja*3.5f,cz,lengthCaja,lengthCaja*3.5f,lengthCaja);
        cube.getTextureResources().add(R.drawable.level1_cristal_columna);
        cube.setRGBA(1f, 1f, 1f, 0.8f);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearCajaCristal(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPlano,cz,lengthPlano,lengthPlano,lengthCaja/8);
        cube.getTextureResources().add(R.drawable.level1_caja);
        cube.setRGBA(1f, 1f, 1f, 0.8f);
        cube.setSolid(true);
        return cube;
    }

    private Plane crearPlanoHorizontal(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level1_piso);
        return plane;
    }

    private Plane crearLaserHorizontal(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy+lengthPared,cz,lengthPlano,lengthPlano/16,0);
        plane.getTextureResources().add(R.drawable.cristal_laser);
        plane.getAnimator().setMaxZ(1);
        plane.getAnimator().setMinZ(-1);
        plane.getAnimator().setIncrZ(0.01);
        plane.setSolid(true);
        return plane;
    }

    private Plane crearLaserVertical(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy+lengthPared,cz,lengthPlano,lengthPlano/16,0);
        plane.getTextureResources().add(R.drawable.cristal_laser2);
        plane.getAnimator().setMaxY(0.5);
        plane.getAnimator().setMinY(-0.5);
        plane.getAnimator().setIncrY(0.01);
        plane.setSolid(true);
        return plane;
    }

    private Plane crearLaserMorado(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy+lengthPlano*2,cz,lengthPlano*2,lengthPlano/16,0);
        plane.getTextureResources().add(R.drawable.cristal_laser3);
        plane.getAnimator().setMaxX(0.4);
        plane.getAnimator().setMinX(-0.4);
        plane.getAnimator().setIncrX(0.005f);
        plane.getAnimator().setAngleZ(90);
        plane.setSolid(true);
        return plane;
    }

    ////////////////////////////////////////Ventilador//////////////////////////////////////////////
    private Cube crearVentiladorHorizontal(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPlano*2f,cz,lengthPlano/4,lengthPlano*2f,lengthPlano/8);
        cube.getTextureResources().add(R.drawable.level1_ventilador);
        cube.setRGBA(1f, 1f, 1f, 0.7f);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearVentiladorVertical(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPlano*2f,cz,lengthPlano/16,lengthPlano*2f,lengthPlano/16);
        cube.getTextureResources().add(R.drawable.level1_cono);
        cube.setRGBA(1f, 1f, 1f, 0.7f);
        cube.setSolid(true);
        return cube;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////

    private Cube crearPlanoCubo(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy-lengthPared*2,cz,lengthPlano,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level1_piso);
        return cube;
    }

    private Cube crearPlanoSubida(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy-lengthPared*2,cz,lengthPlano*1.25f,lengthPared,lengthPlano*1.25f);
        cube.getTextureResources().add(R.drawable.level1_piso);
        cube.getAnimator().setMaxY(0.5);
        cube.getAnimator().setMinY(-0.5);
        cube.getAnimator().setIncrY(0.01);
        return cube;
    }

    private Cylinder crearCilindroRotable(float cx, float cy, float cz){
        Cylinder cylinder = new Cylinder(cx,cy,cz,0.05f,0.3f,6);
        cylinder.getTextureResources().add(R.drawable.level1_cristal_columna);
        cylinder.getAnimator().setMaxAngleX(60);
        cylinder.getAnimator().setMinAngleX(-60);
        cylinder.getAnimator().setIncrAngleX(2);
        cylinder.setSolid(true);
        return cylinder;
    }

    ///////////////////////////////////Caja Espinada////////////////////////////////////////////////
    private Cube crearCajaEspinada(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared,cz,lengthPlano,lengthPlano/6,lengthPlano/6);
        cube.getTextureResources().add(R.drawable.level1_cristal_columna);
        cube.setRGBA(1f, 1f, 1f, 0.7f);
        cube.setSolid(true);
        return cube;
    }
}
