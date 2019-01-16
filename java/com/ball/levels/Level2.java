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

public class Level2 extends Level{
	private float lengthCaja;
	
	@Override
	protected void crearNivel(){
		String level[][] = 
			{{"PI+N0 "				,"PH+N0 PA+N0 "					,"PH+N0 PA+N0 "				,"PH+N0 PA+N0 "					,"PD+N0 "			            ,""},//1
     		 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "		    		,"PH+N0 "						,"PD+N0 "			            ,""},//2
     		 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "					,"PH+N0 EC+N6 "					,"PD+N0 MD+N1 "		            ,""},//3
     		 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PH+N0 "					,"PH+N0 "						,"PD+N0 MD+N1 "		            ,""},//4
     		 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "					,"PH+N0 "						,"PD+N0 "			            ,""},//5
     		 {"PI+N0 "				,"PH+N0 AN+N0 "					,"PH+N0 AN+N0 "				,"PH+N0 "   					,"PD+N0 MD+N1 "		            ,""},//6
     		 {"PI+N0 MI+N1 "		,"PH+N0 AN+N0 "					,"PH+N0 "					,"PH+N0 "						,"PD+N0 MD+N1 "		            ,""},//7
     		 {"PI+N0 MI+N1 "		,"PH+N0 "						,"PH+N0 MO+N1 "	    		,"PH+N0 AD+N0 "					,"PD+N0 "			            ,""},//8
     		 {"PI+N0 "				,"PH+N0 "						,"PH+N0 "					,"PH+N0 "						,"PD+N0 "			            ,""},//9
     		 {"PI+N0 "				,"PH+N0 MO+N1 "					,"PH+N0 MN+N0 "				,"PH+N0 "	    				,"PD+N0 "			            ,""},//10
     		 {"PI+N0 MI+N1 "		,"PH+N0 AN+N0 "					,"PH+N0 "					,"PH+N0 "						,"PD+N0 MD+N1 "		            ,""},//11
     		 {"PI+N0 MI+N1 "		,"PH+N0 AN+N0 "					,"PH+N0 "					,"PH+N0 AD+N0 "					,"PD+N0 "			            ,""},//12
     		 {"PI+N0 "				,"PH+N0 "						,"PH+N0 MO+N1 "				,"PH+N0 "						,"PD+N0 MD+N1 "		            ,""},//13
     		 {""					,"PI+N0 PA+N0 "					,"PH+N0 "					,"PH+N0 "						,"PD+N0 "			            ,""},//14
     		 {""					,"PI+N0 "						,"PH+N0 CE+X0 "				,"PH+N0 CE+X0 "					,"PD+N0 "			            ,""},//15
     		 {""					,"PI+N0 MI+N1 "					,"PH+N0 "					,"PH+N0 "						,"PD+N0 MD+N1 "		            ,""},//16
     		 {""					,"PI+N0 MI+N1 "					,"PH+N0 "					,"PH+N0 "						,"PD+N0 "			            ,""},//17
     		 {""					,""								,""							,""								,""					            ,""},//18
     		 {""					,""								,""							,""								,""					            ,""},//19
     		 {"PI+N2 "				,"PH+N2 PA+N1 "					,"PH+N2 CJ+N2 PA+N1 "		,"PD+N2 "						,""					            ,""},//20
     		 {"PI+N2 MI+N3 "		,"PH+N2 "						,"PH+N2 "					,"PD+N2 MD+N3 "					,""					            ,""},//21
     		 {"PI+N2 "				,"PH+N2 CJ+N2 "					,"PH+N2 "					,"PD+N2 "						,""					            ,""},//22
     		 {"PI+N2 "				,"PH+N2 "						,"PH+N2 CM+N2 "				,"PD+N2 MD+N3 "					,""					            ,""},//23
     		 {"PI+N2 MI+N3 "		,"PH+N2 AI+N2 "					,"PH+N2 "					,"PD+N2 MD+N3 "					,""					            ,""},//24
     		 {"PI+N2 MI+N3 "		,"PH+N2 "						,"PH+N2 "					,"PD+N2 "						,""					            ,""},//25
     		 {"PI+N2 "				,"PH+N2 "						,"PH+N2 "					,"PD+N2 "						,""					            ,""},//26
     		 {"PI+N2 MI+N3 "		,"PH+N2 AI+N2 AD+N2 "			,"PH+N2 CL+X2 "				,"PD+N2 MD+N3 "					,""					            ,""},//27
     		 {"PI+N2 "				,"PH+N2 "						,"PH+N2 "					,"PD+N2 "						,""					            ,""},//28
     		 {"PI+N2 "				,"PH+N2 "						,"PH+N2 "					,"PD+N2 "						,""					            ,""},//29
     		 {"PI+N2 "				,"PH+N2 MN+N2 "					,"PH+N2 MN+N2 "				,"PD+N2 "						,""					            ,""},//30
     		 {"PI+N2 "				,"PH+N2 CE+X2 "					,"PH+N2 CE+X2 "				,"PD+N2 MD+N3 "					,""					            ,""},//31
     		 {"PI+N2 MI+N3 "		,"PH+N2 CJ+N2 "					,"PH+N2 "					,"PD+N2 "						,""					            ,""},//32
     		 {"PI+N2 "				,"PH+N2 CJ+N2 "					,"PH+N2 CM+N2 "				,"PD+N2 MD+N3 "					,""					            ,""},//33
     		 {"PI+N2 MI+N3 "		,"PH+N2 "						,"PH+N2 CM+N2 "				,"PD+N2 MD+N3 "					,""					            ,""},//34
     		 {"PI+N2 MI+N3 "		,"PH+N2 "						,"PH+N2 "					,"PD+N2 "						,""					            ,""},//35
     		 {"PI+N2 MI+N3 "		,"PH+N2 CE+X2 "					,"PH+N2 CE+X2 "				,"PD+N2 "						,""					            ,""},//36
     		 {"PI+N2 "				,"PH+N2 "						,"PH+N2 "					,"PD+N2 "						,""					            ,""},//37
     		 {"PI+N2 "				,"PH+N2 MO+N3 "					,"PH+N2 "	    			,"PD+N2 "						,""					            ,""},//38
     		 {"PI+N2 "				,"PH+N2 CL+X2 "					,"PH+N2 CL+X2 "				,"PD+N2 "						,""					            ,""},//39
     		 {"PI+N2 "				,"PH+N2 "						,"PH+N2 MN+N2 "				,"PD+N2 MD+N3 "					,""					            ,""},//40
     		 {"PI+N2 "				,"PH+N2 "						,"PH+N2 "					,"PD+N2 "						,""					            ,""},//41
     		 {"PI+N2 "				,"PH+N2 "						,"PH+N2 "					,"PD+N2 MD+N3 "					,""					            ,""},//42
     		 {"PI+N2 MI+N3 "		,"PH+N2 CJ+N2 "					,"PH+N2 AI+N2 AD+N2 "		,"PD+N2 "						,""					            ,""},//43
     		 {"PI+N2 "				,"PH+N2 "						,"PH+N2 "					,"PD+N2 MD+N3 "					,""					            ,""},//44
     		 {"PI+N2 MI+N3 "		,"PH+N2 "						,"PH+N2 "					,"PD+N2 MD+N3 "					,""					            ,""},//45
     		 {"PI+N2 "				,"PH+N2 AN+N2 "					,"PH+N2 "					,"PD+N2 "						,""					            ,""},//46
     		 {""    	        	,"PH+N2 K2+N2 "					,"PH+N2 "           		,""         					,""					            ,""},//47
     		 {""					,""								,""							,""								,""					            ,""},//48
     		 {""					,""								,""							,""								,""					            ,""},//49
       		 {""					,""								,"PC+N2 "					,""								,""					            ,""},//50
       		 {""					,""								,"PC+N2 "					,""								,""					            ,""},//51
       		 {""					,""								,""							,""								,""					            ,""},//52
       		 {""					,""								,"" 						,""								,""					            ,""},//53
       		 {""					,""								,"" 						,""								,""					            ,""},//54
       		 {""					,""								,"PC+N2 "					,""								,""					            ,""},//55
       		 {""					,""								,"PC+N2 "					,""								,""					            ,""},//56
       		 {""					,""								,""							,""								,""					            ,""},//57
      		 {""					,""								,"" 						,""								,""					            ,""},//58
      		 {""					,""								,"" 						,""								,""					            ,""},//59
      		 {""					,""								,"PC+N4 "					,""								,""					            ,""},//60
      		 {""					,""								,"PC+N4 "   				,""								,""					            ,""},//61
      		 {""					,""								,"MO+N6 "					,""								,""					            ,""},//62
     		 {""					,""								,"" 						,""								,""					            ,""},//63
     		 {""					,""								,"" 						,""								,""					            ,""},//64
     		 {""					,""								,"PC+N6 "					,""								,""					            ,""},//65
     		 {""					,""								,"PC+N6 "					,""								,""					            ,""},//66
     		 {""					,""								,""							,""								,""					            ,""},//67
    		 {""					,""								,"" 						,""								,""					            ,""},//68
    		 {""					,""								,"" 						,""								,""					            ,""},//69
    		 {""					,""								,"PC+N8 "					,""								,""					            ,""},//70
    		 {""					,""								,"PC+N8 "					,""								,""					            ,""},//71
    		 {""					,""								,"PC+N8 "					,""								,""					            ,""},//72
    		 {""					,""								,""							,""								,""					            ,""},//73
    		 {""					,""								,""							,""								,""					            ,""},//74
    		 {""					,""								,"PI+N2 "					,"PH+N2 CE+X2 "					,"PH+N2 CE+X2 "		            ,"PD+N2 MD+N3 "},//75
    		 {""					,""								,"PI+N2 "					,"PH+N2 "						,"PH+N2 "			            ,"PD+N2 "},//76
    		 {""					,""								,"PI+N2 MI+N3 "				,"PH+N2 "						,"PH+N2 MO+N3 "		            ,"PD+N2 "},//77
    		 {""					,""								,"PI+N2 "					,"PH+N2 AI+N2 "					,"PH+N2 "			            ,"PD+N2 MD+N3 "},//78
    		 {""					,""								,"PI+N2 MI+N3 "				,"PH+N2 CT+N0 "					,"PH+N2 CT+N0 "		            ,"PD+N2 "},//79
    		 {""					,""								,"PI+N2 "					,"PH+N2 CT+N0 "					,"PH+N2 CT+N0 "		            ,"PD+N2 MD+N3 "},//80
    		 {""					,""								,"PI+N2 MI+N3 "				,"PH+N2 "						,"PH+N2 "			            ,"PD+N2 "},//81
    		 {""					,""								,"PI+N2 "					,"PH+N2 "						,"PH+N2 "			            ,"PD+N2 MD+N3 "},//82
    		 {""					,""								,"PI+N2 "					,"PH+N2 CT+N0 "					,"PH+N2 CT+N0 "		            ,"PD+N2 MD+N3 "},//83
    		 {""					,""								,"PI+N2 "					,"PH+N2 CT+N0 "					,"PH+N2 CT+N0 "		            ,"PD+N2 "},//84
    		 {""					,""								,"PI+N2 "					,"PH+N2 CT+N0 "					,"PH+N2 CT+N0 "		            ,"PD+N2 MD+N3 "},//85
    		 {""					,""								,"PI+N2 "					,"PH+N2 "						,"PH+N2 "			            ,"PD+N2 "},//86
    		 {""					,""								,"PI+N2 "					,"PH+N2 AI+N2 AD+N2 "			,"PH+N2 CE+X2 "		            ,"PD+N2 "},//87
    		 {""					,""								,"PI+N2 MI+N3 "				,"PH+N2 "						,"PH+N2 "			            ,"PD+N2 MD+N3 "},//88
    		 {""					,""								,"PI+N2 MI+N3 "				,"PH+N2 "		    			,"PH+N2 CL+X2 MO+N3 "           ,"PD+N2 "},//89
    		 {""					,""								,"PI+N2 "					,"PH+N2 CT+N0 "					,"PH+N2 CT+N0 "		            ,"PD+N2 "},//90
    		 {""					,""								,"PI+N2 "					,"PH+N2 CT+N0 "					,"PH+N2 CT+N0 "		            ,"PD+N2 MD+N3 "},//91
    		 {""					,""								,"PI+N2 MI+N3 "				,"PH+N2 CT+N0 "					,"PH+N2 CT+N0 "		            ,"PD+N2 "},//92
    		 {""					,""								,"PI+N2 "					,"PH+N2 CT+N0 "					,"PH+N2 CT+N0 "		            ,"PD+N2 "},//93
    		 {""					,""								,"PI+N2 MI+N3 "				,"PH+N2 CT+N0 "					,"PH+N2 CT+N0 "		            ,"PD+N2 "},//94
    		 {""					,""								,"PI+N2 "					,"PH+N2 "						,"PH+N2 MN+N2 "		            ,"PD+N2 "},//95
    		 {""					,""								,"PI+N2 MI+N3 "				,"PH+N2 AI+N2 AD+N2 "			,"PH+N2 "			            ,"PD+N2 MD+N3 "},//96
    		 {""					,""								,""            		        ,"PH+N2 AN+N0 K2+N2 "			,"PH+N2 MO+N3"                  ,""},//97
    		 {""					,""								,""							,""								,""					            ,""},//98
    		 {""					,""								,""							,"PI+N2 "						,""					            ,""},//99
    		 {""					,""								,""							,"PI+N2 "						,""					            ,""},//100
    		 {""					,""								,""							,""								,""					            ,""},//101
    		 {""					,""								,"PI+N2 "					,""								,""					            ,""},//102
    		 {""					,""								,"PI+N2 "					,""								,""					            ,""},//103
             {""					,""								,""	        				,""								,""					            ,""},//104
             {""					,""								,""	        				,""								,""					            ,""},//105
             {""					,""								,""	        				,""								,""					            ,""},//106
             {""					,"P4+N2 "           			,"PR+N2 PA+N1 "        	   	,"PR+N2 PA+N1 "              	,"P3+N2 MD+N2 "                 ,""},//107
             {""					,"P4+N1 MI+N1 "					,"PR+N1 "	        		,"PR+N1 "		    			,"P3+N1 "			            ,""},//108
             {""					,"P4+N0 "						,"PR+N0 "	      			,"PR+N0 "		    			,"P3+N0 MD+N0 "	                ,""},//109
             {""					,"P4+N-1 MI+N-1 "				,"PR+N-1 CA+N-1 "	        ,"PR+N-1 "		    			,"P3+N-1 MD+N-1 "	            ,""},//110
             {""					,"P4+N-2 "						,"PR+N-2 "	        		,"PR+N-2 "		    			,"P3+N-2 "			            ,""},//111
             {""					,"P4+N-3 MI+N-3 "				,"PR+N-3 "      	   		,"PR+N-3 "		    			,"P3+N-3 MD+N-3 "	            ,""},//112
             {""					,"P4+N-4 MI+N-4 "				,"PR+N-4 "	        		,"PR+N-4 "		    			,"P3+N-4 "			            ,""},//113
             {""					,"P4+N-5 "						,"PR+N-5 "	        		,"PR+N-5 CA+N-5 "	 			,"P3+N-5 MD+N-5 "	            ,""},//114
             {""					,"P4+N-6 MI+N-6 "				,"PR+N-6 "	        		,"PR+N-6 "		    			,"P3+N-6 "			            ,""},//115
             {""					,"P4+N-7 "						,"PR+N-7 "	        		,"PR+N-7 "		    			,"P3+N-7 MD+N-7 "			    ,""},//116
             {""					,"P4+N-8 MI+N-8 "				,"PR+N-8 "	        		,"PR+N-8 "		    			,"P3+N-8 "			            ,""},//117
             {""					,"P4+N-9 "						,"PR+N-9 CA+N-9 "	   		,"PR+N-9 "		    			,"P3+N-9 MD+N-9 "	            ,""},//118
             {""					,"P4+N-10 MI+N-10 "				,"PR+N-10 "	        		,"PR+N-10 "		    			,"P3+N-10 "			            ,""},//119
             {""					,""     						,""     	        		,""     		    			,""     			            ,""},//120
             {""					,""     						,""     	        		,""     		    			,""     			            ,""},//121
             {""					,"PI+N-10 "     	   			,"PH+N-10 PA+N-11 "     	,"PH+N-10 PA+N-11 "     	 	,"PD+N-10 MD+N-9 "    	        ,""},//122
             {""					,"PI+N-10 MI+N-9 "      		,"PH+N-10 CT-N10 "     	   	,"PH+N-10 "     	 			,"PD+N-10 "     	            ,""},//123
             {""					,"PI+N-10 "     	    		,"PH+N-10 "     	     	,"PH+N-10 "           		   	,"PD+N-10 MD+N-9 "              ,""},//124
             {""					,"PI+N-10 MI+N-9 "       		,"PH+N-10 "     	   		,"PH+N-10 MN+N-10 "            	,"PD+N-10 "                     ,""},//125
             {""					,"PI+N-10 MI+N-9 "         		,"PH+N-10 "     	     	,"PH+N-10 "           		   	,"PD+N-10 MD+N-9 "              ,""},//126
             {""					,""          	    			,""          	     		,""                    		   	,""          		            ,""},//127
             {""					,""          	    			,""          	     		,""                    		   	,""          		            ,""},//128
             {""					,"PI+N-8 MI+N-7 "     			,"PH+N-8 PA+N-9 CJ+N-8 "    ,"PH+N-8 PA+N-9 "     		   	,"PD+N-8 MD+N-7 "               ,""},//129
             {""					,"PI+N-8 MI+N-7 "     	    	,"PH+N-8 "             		,"PH+N-8 CJ+N-8 "    			,"PD+N-8 MD+N-7 "               ,""},//130
             {""					,""          	    			,""          	     		,""                    		   	,""          		            ,""},//131
             {""					,""          	    			,""          	     		,""                    		   	,""          		            ,""},//132
             {""					,"PI+N-6 MI+N-5 "     	    	,"PH+N-6 PA+N-7 MN+N-6 "    ,"PH+N-6 PA+N-7 "     			,"PD+N-6 MD+N-5 "               ,""},//133
             {""					,"PI+N-6 MI+N-5 "     	    	,"PH+N-6 "             		,"PH+N-6 AI+N-6 "     			,"PD+N-6 MD+N-5 "               ,""},//134
             {""					,""          	    			,""          	     		,""                    		   	,""          		            ,""},//135
             {""					,""          	    			,""          	     		,""                    		   	,""          		            ,""},//136
             {""					,"PI+N-4 MI+N-3 "     	    	,"PH+N-4 PA+N-5 "          	,"PH+N-4 PA+N-5 MN+N-4 "     	,"PD+N-4 MD+N-3 "               ,""},//137
             {""					,"PI+N-4 MI+N-3 "     	    	,"PH+N-4 AI+N-4 "        	,"PH+N-4 "            			,"PD+N-4 MD+N-3 "               ,""},//138
             {""					,""          	    			,""          	     		,""                    		   	,""          		            ,""},//139
             {""					,""          	    			,""          	     		,""                    		   	,""          		            ,""},//140
             {""					,"PI+N-2 MI+N-1 "     	    	,"PH+N-2 PA+N-3 "      		,"PH+N-2 PA+N-3 AI+N-2 "  	   	,"PD+N-2 MD+N-1 "               ,""},//141
             {""					,"PI+N-2 MI+N-1 "     	    	,"PH+N-2 MO+N-1 "      		,"PH+N-2 "            			,"PD+N-2 MD+N-1 "               ,""},//142
             {""					,""          	    			,""          	     		,""                    		   	,""          		            ,""},//143
             {""					,""          	    			,""          	     		,""                    		   	,""          		            ,""},//144
             {""					,"PI+N0 MI+N1 "     	    	,"PH+N0 PA+N-1 "      		,"PH+N0 PA+N-1 "     			,"PD+N0 MD+N1 "                 ,""},//145
             {""					,"PI+N0 MI+N1 "     	    	,"PH+N0 AI+N0 "       		,"PH+N0 "            			,"PD+N0 MD+N1 "                 ,""},//146
             {""					,""          	    			,""          	     		,""                    		   	,""          		            ,""},//147
             {""					,""          	    			,""          	     		,""                    		   	,""          		            ,""},//148
             {""					,"PI+N2 MI+N3 "     	    	,"PH+N2 PA+N1 "      		,"PH+N2 PA+N1 "     			,"PD+N2 MD+N3 "                 ,""},//149
             {""					,"PO+N2 "            	    	,"PH+N2 K2+N2 "       		,"PH+N2 "                       ,""                             ,""},//150
             {""					,""     	    	            ,""                    		,""                 			,""                             ,""},//151
             {""					,""     	    	            ,""                    		,""                 			,""                             ,""},//152
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 PA+N2 "      		,"PH+N3 PA+N2 "     	       	,"PD+N3 "                       ,""},//153
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 AI+N3 "        		,"PH+N3 "            	       	,"PD+N3 "                       ,""},//154
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 CJ+N3 CJ+N5 "       ,"PH+N3 PU+N3 "                 ,"PD+N3 MD+N4 "                 ,""},//155
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 "               	,"PH+N3 "                       ,"PD+N3 MD+N4 "                 ,""},//156
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 AI+N3 "            	,"PH+N3 "                       ,"PD+N3 MD+N4 "                 ,""},//157
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 "               	,"PH+N3 "                       ,"PD+N3 MD+N4 "                 ,""},//158
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 CJ+N3 "            	,"PH+N3 "                       ,"PD+N3 MD+N4 "                 ,""},//159
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 "               	,"PH+N3 AI+N3 "                 ,"PD+N3 MD+N4 "                 ,""},//160
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 "               	,"PH+N3 "                       ,"PD+N3 MD+N4 "                 ,""},//161
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 RD-Z6 "            	,"PH+N3 RD+Z7 "                 ,"PD+N3 MD+N4 "                 ,""},//162
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 "               	,"PH+N3 "                       ,"PD+N3 MD+N4 "                 ,""},//163
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 MO+N4 "           	,"PH+N3 PE+N3 "                 ,"PD+N3 MD+N4 "                 ,""},//164
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 "               	,"PH+N3 "                       ,"PD+N3 MD+N4 "                 ,""},//165
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 AI+N3 "           	,"PH+N3 RD+Z7 "                 ,"PD+N3 MD+N4 "                 ,""},//166
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 CJ+N3 "             ,"PH+N3 "                       ,"PD+N3 MD+N4 "                 ,""},//167
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 "               	,"PH+N3 RD-Z6 "                 ,"PD+N3 MD+N4 "                 ,""},//168
             {""					,""                  	    	,""                        	,""                             ,""                             ,""},//169
             {""					,""                  	    	,""                        	,""                             ,""                             ,""},//170
             {""					,""                  	    	,"PC+N3 MO+N5 "             ,""                             ,""                             ,""},//171
             {""					,""                  	    	,""                         ,""                             ,""                             ,""},//172
             {""					,""                  	    	,"PC+N4 "                   ,""                             ,""                             ,""},//173
             {""					,""                  	    	,""                         ,""                             ,""                             ,""},//174
             {""					,""                  	    	,"PC+N5 "                   ,""                             ,""                             ,""},//175
             {""					,""                  	    	,""                         ,""                             ,""                             ,""},//176
             {""					,""                  	    	,"PC+N6 "                   ,""                             ,""                             ,""},//177
             {""					,""                  	    	,"PC+N6 PE+N5 "             ,""                             ,""                             ,""},//178
             {""					,""                  	    	,"PC+N6 CJ+N5 "             ,""                             ,""                             ,""},//179
             {""					,""                  	    	,"PC+N6 "                   ,""                             ,""                             ,""},//180
             {""					,""                  	    	,"PC+N6 "                   ,""                             ,""                             ,""},//181
             {""					,""                  	    	,"PC+N6 "                   ,""                             ,""                             ,""},//182
             {""					,""                  	    	,"MO+N7 "                   ,""                             ,""                             ,""},//183
             {""					,""                  	    	,""                         ,""                             ,""                             ,""},//184
             {""					,""                  	    	,"PC+N5 CJ+N4 "             ,""                             ,""                             ,""},//185
             {""					,""                  	    	,"PC+N5 PE+N4 "             ,""                             ,""                             ,""},//186
             {""					,""                  	    	,"PC+N5 "                   ,""                             ,""                             ,""},//187
             {""					,""                  	    	,""                         ,""                             ,""                             ,""},//188
             {""					,""                  	    	,""                         ,""                             ,""                             ,""},//189
             {""					,""                  	    	,"PC+N3 "                   ,""                             ,""                             ,""},//190
             {""					,""                  	    	,"PC+N4 "                   ,""                             ,""                             ,""},//191
             {""					,""                  	    	,""                         ,""                             ,""                             ,""},//192
             {""					,""                  	    	,""                         ,""                             ,""                             ,""},//193
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 PA+N3 "            	,"PH+N3 PA+N3 "                 ,"PD+N3 MD+N4 "                 ,""},//194
             {""					,"PI+N3 "            	    	,"PH+N3 CJ+N3 "           	,"PH+N3 "                       ,"PD+N3 MD+N4 "                 ,""},//195
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 MO+N4 "           	,"PH+N3 "                       ,"PD+N3 "                       ,""},//196
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 RD-Z6 "            	,"PH+N3 RD-Z7 "                 ,"PD+N3 MD+N4 "                 ,""},//197
             {""					,"PI+N3 "            	    	,"PH+N3 AI+N3 "           	,"PH+N3 "                       ,"PD+N3 "                       ,""},//198
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 "               	,"PH+N3 MO+N4 "                 ,"PD+N3 MD+N4 "                 ,""},//199
             {""					,"PI+N3 MI+N4 "     	    	,"PH+N3 PE+N3 "           	,"PH+N3 "                       ,"PD+N3 "                       ,""},//200
		};
		//Mundo
		world.getTextureResources().add(R.drawable.level2_fondo);
		//Constantes
		lengthCaja = 0.2f;
		crashResource = R.raw.nieve;
		musicResource = R.raw.nieve_musica;
		this.level = level;
        resourceCintaCheckPoint = R.drawable.level2_check_point;
        resourcePaloCheckPoint = R.drawable.level2_caja;
	}

    @Override
    protected List<ShapeOpengl> crearObjeto(String figura,float x,float y,float z){
        List<ShapeOpengl> shapes = new ArrayList<>();
        if (figura.equals("AD")){
            shapes.add(crearArbolNieve(x-lengthPlano/2,y,z));
        }
        if (figura.equals("AI")){
            shapes.add(crearArbolNieve(x+lengthPlano/2,y,z));
        }
        if (figura.equals("AN")){
            shapes.add(crearArbolNieve(x,y,z));
        }
        if (figura.equals("CA")){
            shapes.add(crearCasaTronco(x,y,z));
            shapes.add(crearConoTecho(x,y+lengthCaja,z));
        }
        if (figura.equals("CE")){
            shapes.add(crearCajaEspinada(x,y,z));
            shapes.get(shapes.size()-1).getAnimator().setMaxZ(0.5f);
            shapes.get(shapes.size()-1).getAnimator().setMinZ(-0.5f);
            shapes.get(shapes.size()-1).getAnimator().setIncrZ(0.01f);
            shapes.add(crearConoMetalico(x-lengthPared*2,y+lengthPared,z));
            shapes.get(shapes.size()-1).getAnimator().setMaxZ(0.5f);
            shapes.get(shapes.size()-1).getAnimator().setMinZ(-0.5f);
            shapes.get(shapes.size()-1).getAnimator().setIncrZ(0.01f);
            shapes.add(crearConoMetalico(x,y+lengthPared,z));
            shapes.get(shapes.size()-1).getAnimator().setMaxZ(0.5f);
            shapes.get(shapes.size()-1).getAnimator().setMinZ(-0.5f);
            shapes.get(shapes.size()-1).getAnimator().setIncrZ(0.01f);
            shapes.get(shapes.size()-1).getAnimator().setAngleX(180);
            shapes.add(crearConoMetalico(x+lengthPared,y+lengthPared,z));
            shapes.get(shapes.size()-1).getAnimator().setMaxZ(0.5f);
            shapes.get(shapes.size()-1).getAnimator().setMinZ(-0.5f);
            shapes.get(shapes.size()-1).getAnimator().setIncrZ(0.01f);
            shapes.get(shapes.size()-1).getAnimator().setAngleX(90);
        }
        if (figura.equals("CJ")){
            shapes.add(crearCaja(x,y,z));
        }
        if (figura.equals("CK")){
            shapes.add(crearCheckPoint(x,y+lengthPared,z));
        }
        if (figura.equals("CL")){
            shapes.add(crearPuerta(x,y,z));
            shapes.add(crearColumna(x-lengthPlano/2-lengthPlano/4,y,z));
            shapes.get(shapes.size()-1).setNoRotar(true);
            shapes.add(crearColumna(x+lengthPlano/2+lengthPlano/4,y,z));
            shapes.get(shapes.size()-1).setNoRotar(true);
        }
        if (figura.equals("CM")){
            shapes.add(crearConoMetalico(x,y,z));
        }
        if (figura.equals("CT")){
            //Cone  con traslacion
            shapes.add(crearConoMetalico(x-lengthPlano/2,y,z-lengthPlano/2));
            shapes.get(shapes.size()-1).getAnimator().setMaxY(0.3f);
            shapes.get(shapes.size()-1).getAnimator().setMinY(-0.3f);
            shapes.get(shapes.size()-1).getAnimator().setIncrY(0.01f);
            shapes.add(crearConoMetalico(x+lengthPlano/2,y,z-lengthPlano/2));
            shapes.get(shapes.size()-1).getAnimator().setMaxY(0.3f);
            shapes.get(shapes.size()-1).getAnimator().setMinY(-0.3f);
            shapes.get(shapes.size()-1).getAnimator().setIncrY(0.01f);
            shapes.add(crearConoMetalico(x-lengthPlano/2,y,z+lengthPlano/2));
            shapes.get(shapes.size()-1).getAnimator().setMaxY(0.3f);
            shapes.get(shapes.size()-1).getAnimator().setMinY(-0.3f);
            shapes.get(shapes.size()-1).getAnimator().setIncrY(0.01f);
            shapes.add(crearConoMetalico(x+lengthPlano/2,y,z+lengthPlano/2));
            shapes.get(shapes.size()-1).getAnimator().setMaxY(0.3f);
            shapes.get(shapes.size()-1).getAnimator().setMinY(-0.3f);
            shapes.get(shapes.size()-1).getAnimator().setIncrY(0.01f);
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
        if (figura.equals("MN")){
            shapes.add(crearEsferaNieveCuerpo(x,y,z,0.2f));
            shapes.add(crearEsferaNieveCara(x,y+0.35f,z,0.1f));
            shapes.add(crearSombrero1(x,y+0.53f,z));
            shapes.add(crearSombrero2(x,y+0.53f,z));
        }
        if (figura.equals("MO")){
            shapes.add(crearMoneda(x, y, z));
        }
        if (figura.equals("P3")){
            shapes.add(crearParedProfundidadRotada(x-lengthPlano,y-lengthPared*1.2f,z));
        }
        if (figura.equals("P4")){
            shapes.add(crearParedProfundidadRotada(x+lengthPlano,y-lengthPared*1.2f,z));
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
            shapes.add(crearCajaPosteEspinado(x-lengthPlano,y,z));
            shapes.add(crearCajaPosteEspinado(x+lengthPlano,y,z));
            //Conos Izquierdos
            shapes.add(crearCono90(x-lengthPlano,y+lengthPlano/2,z,-90));
            shapes.add(crearCono90(x-lengthPlano,y,z,-90));

            shapes.add(crearCono90(x-lengthPlano,y-lengthPlano/2,z-lengthPlano/2,-90));
            shapes.add(crearCono90(x-lengthPlano,y,z-lengthPlano/2,-90));

            shapes.add(crearCono90(x-lengthPlano,y-lengthPlano/2,z+lengthPlano/2,-90));
            shapes.add(crearCono90(x-lengthPlano,y+lengthPlano/2,z+lengthPlano/2,-90));

            //Conos derechos
            shapes.add(crearCono90(x+lengthPlano,y-lengthPlano/2,z,90));
            shapes.add(crearCono90(x+lengthPlano,y,z,90));
            shapes.add(crearCono90(x+lengthPlano,y+lengthPlano/2,z,90));

            shapes.add(crearCono90(x+lengthPlano,y,z-lengthPlano/2,90));

            shapes.add(crearCono90(x+lengthPlano,y-lengthPlano/2,z+lengthPlano/2,90));

            shapes.add(crearCono90(x+lengthPlano,y+lengthPlano/2,z+lengthPlano/2,90));
        }
        if (figura.equals("PH")){
            shapes.add(crearPlanoHorizontal(x,y,z));
        }
        if (figura.equals("PI")){
            shapes.add(crearParedIzquierdaProfundidad(x,y,z));
        }
        if (figura.equals("PO")){
            shapes.add(crearPoste(x,y,z));
        }
        if (figura.equals("PR")){
            shapes.add(crearPlanoCuboRotado(x,y,z));
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
            shapes.add(crearPlanoHorizontal2(x,y,z));
        }
        if (figura.equals("RD")){
            shapes.add(crearRueda(x, y, z, 0.8f));
            shapes.add(crearCajaRueda(x, y, z, 0));
            shapes.add(crearCajaRueda(x, y, z, 90));
        }
        continueShapeCreation(shapes,figura,x,y,z);
        return shapes;
    }

    private void crearEsferaCristalina(float cx,float cy,float cz){
        sphere = new Sphere(cx,cy+radioEsfera*5,cz,12,24,radioEsfera);
        sphere.getTextureResources().add(R.drawable.level2_esfera);
    }

    private Cube crearParedIzquierdaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx+lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level2_pared);
        return cube;
    }

    private Cube crearParedDerechaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx-lengthPlano,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level2_pared);
        return cube;
    }

    private Cube crearParedAnchura(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared,cz+lengthPlano+lengthPared,lengthPlano,lengthPared,lengthPared);
        cube.getTextureResources().add(R.drawable.level2_pared);
        return cube;
    }

    private Cone crearConoMetalico(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,4,0.1f,0.4f);
        cone.getTextureResources().add(R.drawable.level2_cono);
        cone.setSolid(true);
        return cone;
    }

    private Cone crearArbolNieve(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,8,0.3f,0.8f);
        cone.getTextureResources().add(R.drawable.level2_arbol);
        cone.setSolid(true);
        return cone;
    }

    private Cube crearCaja(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthCaja,cz,lengthCaja,lengthCaja,lengthCaja);
        cube.getTextureResources().add(R.drawable.level2_caja);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearPlanoCubo(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy-lengthPared*2,cz,lengthPlano,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level2_piso2);
        return cube;
    }

    ////////////////////////////////////Puerta/////////////////////////////////////////////

    private Cube crearColumna(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthCaja*4,cz,lengthPared/2,lengthCaja*4,lengthPared);
        cube.getTextureResources().add(R.drawable.level2_caja);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearPuerta(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthCaja*3,cz,lengthPared*3,lengthCaja*3,lengthPared);
        cube.getTextureResources().add(R.drawable.level2_caja);
        cube.setSolid(true);
        return cube;
    }
    ////////////////////////////////////////////////////////////////////////////////////////

    private Plane crearPlanoHorizontal(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level2_piso);
        plane.createMirroredTextureCoordinates(lengthPlano);
        return plane;
    }

    private Plane crearPlanoHorizontal2(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level2_piso2);
        return plane;
    }

    ///////////////////////////////////Caja Espinada////////////////////////////////////////////////
    private Cube crearCajaEspinada(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared,cz,lengthPlano,lengthPlano/8,lengthPlano/8);
        cube.getTextureResources().add(R.drawable.level2_caja);
        cube.setSolid(true);
        return cube;
    }

    ///////////////////////////////////Muneco de nieve///////////////////////////////////////////////

    private Sphere crearEsferaNieveCuerpo(float cx, float cy, float cz, float r){
        Sphere sphere = new Sphere(cx,cy+r,cz,8,16,r);
        sphere.getTextureResources().add(R.drawable.level2_muneco_cuerpo);
        sphere.setSolid(true);
        return sphere;
    }

    private Sphere crearEsferaNieveCara(float cx, float cy, float cz, float r){
        Sphere sphere = new Sphere(cx,cy+r,cz,8,16,r);
        sphere.getTextureResources().add(R.drawable.level2_muneco_cara);
        sphere.setSolid(true);
        return sphere;
    }

    private Cylinder crearSombrero1(float cx, float cy, float cz){
        Cylinder cylinder = new Cylinder(cx,cy+0.08f,cz,0.05f,0.08f,8);
        cylinder.getTextureResources().add(R.drawable.level2_sombrero);
        cylinder.setSolid(true);
        return cylinder;
    }

    private Cylinder crearSombrero2(float cx, float cy, float cz){
        Cylinder cylinder = new Cylinder(cx,cy+0.005f,cz,0.1f,0.005f,8);
        cylinder.getTextureResources().add(R.drawable.level2_sombrero);
        cylinder.setSolid(true);
        return cylinder;
    }

	/////////////////////////////////Objetos rotados////////////////////////////////////////////////

    private Cube crearPlanoCuboRotado(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy-lengthPared*2,cz,lengthPlano,lengthPared/2,longitudInclinada);
        cube.getTextureResources().add(R.drawable.level2_piso);
        cube.getAnimator().setMaxAngleX(anguloInclinacion);
        cube.getAnimator().setMinAngleX(anguloInclinacion);
        cube.getAnimator().setIncrAngleX(1);
        cube.setCapazVariarAnguloGravedad(true);
        return cube;
    }

    private Cube crearParedProfundidadRotada(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared,cz,lengthPared,lengthPared,longitudInclinada);
        cube.getTextureResources().add(R.drawable.level2_pared);
        cube.getAnimator().setMaxAngleX(anguloInclinacion);
        cube.getAnimator().setMinAngleX(anguloInclinacion);
        cube.getAnimator().setIncrAngleX(1);
        cube.setCapazVariarAnguloGravedad(true);
        return cube;
    }

    //////////////////////////////////////Casa de nieve/////////////////////////////////////////////

    private Cube crearCasaTronco(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,lengthCaja*2f,lengthCaja,lengthCaja*2f);
        cube.getTextureResources().add(R.drawable.level2_pared);
        cube.setSolid(true);
        cube.getAnimator().setMaxAngleX(anguloInclinacion);
        cube.getAnimator().setMinAngleX(anguloInclinacion);
        cube.getAnimator().setIncrAngleX(1);
        return cube;
    }

    private Cone crearConoTecho(float cx, float cy, float cz){
        Cone coneTecho = new Cone(cx,cy,cz,4,lengthCaja*4f,0.4f);
        coneTecho.getTextureResources().add(R.drawable.level2_cono);
        coneTecho.setSolid(true);
        coneTecho.setcRY(-lengthCaja);
        coneTecho.getAnimator().setMaxAngleX(anguloInclinacion);
        coneTecho.getAnimator().setMinAngleX(anguloInclinacion);
        coneTecho.getAnimator().setIncrAngleX(1);
        return coneTecho;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////Objetos de checkpoint//////////////////////////////////////////

    private Plane crearCheckPoint(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy+lengthPared*2,cz,lengthPlano,lengthPlano/8,0);
        plane.getTextureResources().add(R.drawable.level2_check_point);
        plane.setRGBA(1f, 1.0f, 1.0f, 0.6f);
        plane.setCheckPoint(true);
        return plane;
    }

    private Cube crearPoste(float cx, float cy, float cz){
        Cube cube = new Cube(cx+lengthPlano,cy+lengthPared*2,cz,lengthPlano/8,lengthPared*2,lengthPlano/8);
        cube.getTextureResources().add(R.drawable.level2_caja);
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////Ruedas///////////////////////////////////////////////

    private Cylinder crearRueda(float cx, float cy, float cz, float escale){
        Cylinder3 cilindroRueda = new Cylinder3(cx,cy,cz,0.3f*escale,0.03f*escale,12);
        cilindroRueda.getTextureResources().add(R.drawable.level3_tronco);
        cilindroRueda.getAnimator().setAngleX(90);
        cilindroRueda.setSolid(true);
        cilindroRueda.getAnimator().setBidirectionalAngleY(false);
        cilindroRueda.setOrderRotation(new ArrayList<String>());
        cilindroRueda.getOrderRotation().add("X");
        cilindroRueda.getOrderRotation().add("Y");
        cilindroRueda.getOrderRotation().add("Z");
        cilindroRueda.setSolid(true);
        return cilindroRueda;
    }

    private Cube crearCajaRueda(float cx, float cy, float cz, float angulo){
        Cube cube = new Cube(cx,cy,cz,lengthPlano/8,lengthPared*6,lengthPlano/8);
        cube.getTextureResources().add(R.drawable.level3_tronco);
        cube.getAnimator().setAngleZ(angulo);
        cube.setSolid(true);
        cube.getAnimator().setMaxRed(455);
        cube.getAnimator().setMinRed(255);
        cube.getAnimator().setIncrRed(3);
        cube.getAnimator().setMaxGreen(455);
        cube.getAnimator().setMinGreen(255);
        cube.getAnimator().setIncrGreen(3);
        cube.getAnimator().setMaxBlue(455);
        cube.getAnimator().setMinBlue(255);
        cube.getAnimator().setIncrBlue(3);
        return cube;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////Poste espinado//////////////////////////////////////////////

    private Cube crearCajaPosteEspinado(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPlano,cz,lengthPlano/8,lengthPlano,lengthPlano);
        cube.getTextureResources().add(R.drawable.level3_tronco);
        cube.setSolid(true);
        cube.getAnimator().setMaxRed(455);
        cube.getAnimator().setMinRed(255);
        cube.getAnimator().setIncrRed(3);
        cube.getAnimator().setMaxGreen(455);
        cube.getAnimator().setMinGreen(255);
        cube.getAnimator().setIncrGreen(3);
        cube.getAnimator().setMaxBlue(455);
        cube.getAnimator().setMinBlue(255);
        cube.getAnimator().setIncrBlue(3);
        return cube;
    }

    private Cone crearCono90(float cx, float cy, float cz, float angulo){
        Cone cone = new Cone(cx,cy+lengthPlano,cz,4,0.1f,0.4f);
        cone.getTextureResources().add(R.drawable.level2_cono);
        cone.setSolid(true);
        cone.getAnimator().setMaxScale(1f);
        cone.getAnimator().setMinScale(0.3f);
        cone.getAnimator().setIncrScale(0.01f);
        cone.getAnimator().setAngleZ(angulo);
        return cone;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
}
