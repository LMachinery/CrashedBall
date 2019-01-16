package com.ball.levels;

import com.ball.activities.R;
import com.ball.shapes.Cone;
import com.ball.shapes.Cube;
import com.ball.shapes.Cylinder;
import com.ball.shapes.Cylinder2;
import com.ball.shapes.Plane;
import com.ball.shapes.Sphere;
import com.ball.shapes.ShapeOpengl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 02/04/2015.
 */
public class Level8 extends Level {

    @Override
    protected void crearNivel(){
        String level[][] =
                {       {"PI+N0 ",                                                                                      "PH+N0 PA+N0 ",                                 "PH+N0 PA+N0 ",                     "PH+N0 PA+N0 ",                             "PD+N0 ",               ""},//1
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                   "PD+N0 MD+N1 ",         ""},//2
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 EC+N6 ",                     "PH+N0 ",                                   "PD+N0 MD+N1 ",         ""},//3
                        {"PI+N0 ",                                                                                      "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                   "PD+N0 MD+N1 ",         ""},//4
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 MO+N1 ",                     "PH+N0 ",                                   "PD+N0 ",               ""},//5
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ED+N0 ",                                 "PH+N0 ",                           "PH+N0 ",                                   "PD+N0 MD+N1 ",         ""},//6
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 ST+N0 ",                     "PH+N0 E2+N0 ",                             "PD+N0 MD+N1 ",         ""},//7
                        {"PI+N0 ",                                                                                      "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                   "PD+N0 MD+N1 ",         ""},//8
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                   "PD+N0 ",               ""},//9
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 E3+N0 ",                     "PH+N0 ",                                   "PD+N0 MD+N1 ",         ""},//10
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                   "PD+N0 MD+N1 ",         ""},//11
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ST+N0 ",                                 "PH+N0 MO+N1 ",                     "PH+N0 PS+N0 ",                             "PD+N0 ",               ""},//12
                        {"PI+N0 ",                                                                                      "PH+N0 ",                                       "PH+N0 MO+N1 ",                     "PH+N0 ",                                   "PD+N0 MD+N1 ",         ""},//13
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 PS+N0 ",                                 "PH+N0 PS+N0 ",                     "PH+N0 ES+N0 ",                             "PD+N0 MD+N1 ",         ""},//14
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                   "PD+N0 MD+N1 ",         ""},//15
                        {"PH+N0 PA+N1 ","PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 CR+N0 ",              "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                   "PH+N0 CR+N0 PA+N0 ",   "PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 "},//16
                        {"PA+N0 ","PA+N0 ","PA+N0 ","PA+N0 ","PA+N0 PI+N0 ",                                            "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                   "PD+N0 PA+N0 ",         "PA+N0 ","PA+N0 ","PA+N0 ","PA+N0 ","PA+N0 "},//17
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ES+N0 ",                                 "PH+N0 ES+N0 ",                     "PH+N0 ST+N0 ",                             "PD+N0 MD+N1 ",          ""},//18
                        {"PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 C2+N0 ",              "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                   "PH+N0 PA+N0 "      ,   "PH+N0 PA+N0 C2+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 "},//19
                        {"PA+N0 ","PA+N0 ","PA+N0 ","PA+N0 ","PA+N0 PI+N0 ",                                            "PH+N0 ST+N0 ",                                 "PH+N0 ",                           "PH+N0 ES+N0 ",                             "PD+N0 PA+N0 ",         "PA+N0 ","PA+N0 ","PA+N0 ","PA+N0 ","PA+N0 "},//20
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 PE+N0 PE+N4 ",                           "PH+N0 PR+N0 PE+N4 ",               "PH+N0 PE+N0 PE+N4 ",                       "PD+N0 MD+N1 ",          ""},//21
                        {"",                                                                                            "PH+N0 RI+N0 RI+N4 ",                           "PH+N0 ",                           "PH+N0 RD+N0 RD+N4 ",                       "",                      ""},//22
                        {"",                                                                                            "PH+N0 RI+N0 RI+N4 ",                           "PH+N0 MO+N1 ",                     "PH+N0 RD+N0 RD+N4 ",                       "",                      ""},//23
                        {"",                                                                                            "PH+N0 RI+N0 RI+N4 ES+N0 ",                     "PH+N0 CS+N0 ",                     "PH+N0 RD+N0 RD+N4 ",                       "",                      ""},//24
                        {"",                                                                                            "PH+N0 RI+N0 RI+N4 ",                           "PH+N0 ",                           "PH+N0 RD+N0 RD+N4 MO+N1 ",                "",                      ""},//25
                        {"",                                                                                            "PH+N0 RI+N0 RI+N4 LD+N0 ",                     "PH+N0 PL+N0 ",                     "PH+N0 PL+N0 RD+N0 RD+N4 ",                 "",                      ""},//26
                        {"",                                                                                            "PH+N0 RI+N0 RI+N4 PL+N0 ",                     "PH+N0 SC+N0 ",                     "PH+N0 CS+N0 RD+N0 RD+N4 ",                 "",                      ""},//27
                        {"",                                                                                            "PH+N0 RI+N0 RI+N4 PL+N0 ",                     "PH+N0 PL+N0 ",                     "PH+N0 RD+N0 RD+N4 ES+N0 ",                 "",                      ""},//28
                        {"",                                                                                            "PH+N0 RI+N0 RI+N4 ",                           "PH+N0 LD+N0 ",                     "PH+N0 RD+N0 RD+N4 ",                       "",                      ""},//29
                        {"",                                                                                            "PH+N0 RI+N0 RI+N4 ",                           "PH+N0 MO+N1 ",                     "PH+N0 RD+N0 RD+N4 ",                       "",                      ""},//30
                        {"",                                                                                            "PH+N0 RI+N0 RI+N4 ",                           "PH+N0 MO+N1 ",                     "PH+N0 RD+N0 RD+N4 ",                       "",                      ""},//31
                        {"",                                                                                            "PH+N0 PE+N0 PE+N4 RI+N0 RI+N4 ",               "PH+N0 PR+N0 PE+N4 PL+N0 ",         "PH+N0 PE+N0 PE+N4 RD+N0 RD+N4 ",           "",                      ""},//32
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                   "PD+N0 MD+N1 ",          ""},//33
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 MO+N1 ",                             "PD+N0 MD+N1 ",          ""},//34
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 CT+N0 ",                     "PH+N0 ",                                   "PD+N0 MD+N1 ",          ""},//35
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 LD+N0 ",                                 "PH+N0 ",                           "PH+N0 SC+N0 ",                             "PD+N0 MD+N1 ",          ""},//36
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 CT+N0 ",                     "PH+N0 ",                                   "PD+N0 MD+N1 ",          ""},//37
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 ES+N0 ",                     "PH+N0 ",                                   "PD+N0 MD+N1 ",          ""},//38
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 PS+N0 ",                                 "PH+N0 P2+N0 ",                     "PH+N0 ES+N0 ",                             "PD+N0 MD+N1 ",          ""},//39
                        {"PH+N0 PA+N1 ","PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 CR+N0 ",              "PH+N0 ",                                       "PH+N0 ",                           "PH+N0 ",                                   "PH+N0 CR+N0 PA+N0 ",   "PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 ","PH+N0 PA+N0 "},//40
                        {"PA+N0 ","PA+N0 ","PA+N0 ","PA+N0 ","PA+N0 PI+N0 ",                                            "PH+N0 ED+N0 ",                                 "PH+N0 ",                           "PH+N0 E2+N0 ",                             "PD+N0 PA+N0 ",         "PA+N0 ","PA+N0 ","PA+N0 ","PA+N0 ","PA+N0 "},//41
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 MO+N1 ",                     "PH+N0 ",                                   "PD+N0 MD+N1 ",         ""},//42
                        {"PI+N0 MI+N1 ",                                                                                "PH+N0 ",                                       "PH+N0 MO+N1 ",                     "PH+N0 ",                                   "PD+N0 MD+N1 ",         ""},//43
                        {"",                                                                                            "",                                             "",                                 "",                                         "",                     ""},//44
                        {"",                                                                                            "",                                             "",                                 "",                                         "",                     ""},//45
                        {"",                                                                                            "",                                             "PC+N0 ",                           "",                                         "",                     ""},//46
                        {"",                                                                                            "",                                             "",                                 "",                                         "",                     ""},//47
                        {"",                                                                                            "",                                             "",                                 "",                                         "",                     ""},//48
                        {"PI+N10 MI+N11 ",                                                                              "PH+N10 PA+N9 ",                                "PH+N10 PA+N9 ",                    "PH+N10 PA+N9 ",                            "PD+N10 MD+N11 ",       ""},//49
                        {"PI+N10 MI+N11 ",                                                                              "PH+N10 MO+N11 ",                               "PH+N10 ",                          "PH+N10 LD+N10 ",                           "PD+N10 MD+N11 ",       ""},//50
                        {"PI+N10 MI+N11 ",                                                                              "PH+N10 ",                                      "PH+N10 ES+N10 ",                   "PH+N10 ",                                  "PD+N10 MD+N11 ",       ""},//51
                        {"PI+N10 MI+N11 ",                                                                              "PH+N10 PS+N10 ",                               "PH+N10 MO+N11 ",                   "PH+N10 ",                                  "PD+N10 MD+N11 ",       ""},//52
                        {"PI+N10 MI+N11 ",                                                                              "PH+N10 CT+N20 ",                               "PH+N10 CT+N10 ",                   "PH+N10 LD+N10 ",                           "PD+N10 MD+N11 ",       ""},//53
                        {"",                                                                                            "",                                             "",                                 "",                                         "",                     ""},//54
                        {"",                                                                                            "",                                             "",                                 "",                                         "",                     ""},//55
                        {"",                                                                                            "",                                             "PC+N10 ",                          "",                                         "",                     ""},//56
                        {"",                                                                                            "",                                             "",                                 "",                                         "",                     ""},//57
                        {"",                                                                                            "",                                             "",                                 "",                                         "",                     ""},//58
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 PA+N19 ",                               "PH+N20 PA+N19 ",                   "PH+N20 PA+N19 ",                           "PD+N20 MD+N21 ",       ""},//59
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 MO+N21 ",                               "PH+N20 ",                          "PH+N20 ",                                  "PD+N20 MD+N21 ",       ""},//60
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 ",                                      "PH+N20 ES+N20 ",                   "PH+N20 LD+N20 ",                           "PD+N20 MD+N21 ",       ""},//61
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 PS+N20 ",                               "PH+N20 MO+N21 ",                   "PH+N20 ",                                  "PD+N20 MD+N21 ",       ""},//62
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 CT+N20 ",                               "PH+N20 CT+N20 ",                   "PH+N20 ",                                  "PD+N20 MD+N21 ",       ""},//63
                        {"",                                                                                            "",                                             "",                                 "",                                         "",                     ""},//64
                        {"",                                                                                            "",                                             "",                                 "",                                         "",                     ""},//65
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 PA+N19 ",                               "PH+N20 PA+N19 ",                   "PH+N20 PA+N19 ",                           "PD+N20 MD+N21 ",       ""},//66
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 E3+N20 ",                               "PH+N20 ",                          "PH+N20 ",                                  "PD+N20 ",              ""},//67
                        {"PI+N20 ",                                                                                     "PH+N20 ",                                      "PH+N20 MO+N21 ",                   "PH+N20 ",                                  "PD+N20 MD+N21 ",       ""},//68
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 ",                                      "PH+N20 MO+N21 ",                   "PH+N20 ",                                  "PD+N20 MD+N21 ",       ""},//68
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 E2+N20 ",                           "PD+N20 ",              ""},//67
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 ",                                      "PH+N20 ST+N20 ",                   "PH+N20 ",                                  "PD+N20 MD+N21 ",       ""},//67
                        {"PI+N20 ",                                                                                     "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 ",                                  "PD+N20 MD+N21 ",       ""},//67
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 ",                                      "PH+N20 ED+N20 ",                   "PH+N20 ",                                  "PD+N20 MD+N21 ",       ""},//69
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 ",                                  "PD+N20 ",              ""},//70
                        {"PI+N20 ",                                                                                     "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 ",                                  "PD+N20 MD+N21 ",       ""},//70
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 PS+N0 ",                                "PH+N20 PS+N0 ",                    "PH+N20 ES+N20 ",                           "PD+N20 MD+N21 ",       ""},//71
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 ",                                  "PD+N20 MD+N21 ",       ""},//72
                        {"PH+N20 PA+N21 ","PH+N20 PA+N20 ","PH+N20 PA+N20 CR+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ",   "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 ",                                  "PH+N20 CR+N20 PA+N20 ",  "PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 "},//73
                        {"PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 PI+N20 ",                                      "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 ",                                  "PD+N20 PA+N20 ",         "PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 "},//74
                        {"PH+N20 PA+N21 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ",          "PH+N20 ",                                      "PH+N20 CR+N20 ",                   "PH+N20 ",                                  "PH+N20 PA+N20 ",         "PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 CR+N20 ","PH+N20 PA+N20 "},//75
                        {"PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 PI+N20 ",                                      "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 ",                                  "PD+N20 PA+N20 ",         "PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 "},//76
                        {"PH+N20 PA+N21 CR+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ",   "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 CR+N20 ",                           "PH+N20 PA+N20 ",   "PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 "},//77
                        {"PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 PI+N20 ",                                      "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 ",                                  "PD+N20 PA+N20 ",         "PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 "},//78
                        {"PH+N20 PA+N21 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ",          "PH+N20 CR+N20 ",                               "PH+N20 ",                          "PH+N20 ",                                  "PH+N20 PA+N20 ",   "PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 CR+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 "},//79
                        {"PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 PI+N20 ",                                      "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 ",                                  "PD+N20 PA+N20 ",         "PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 "},//80
                        {"PH+N20 PA+N21 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 CR+N20 ",   "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 ",                                  "PH+N20 PA+N20 ",   "PH+N20 PA+N20 ","PH+N20 PA+N20 CR+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 ","PH+N20 PA+N20 "},//81
                        {"PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 PI+N20 ",                                      "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 ",                                  "PD+N20 PA+N20 ",         "PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 ","PA+N20 "},//82
                        {"PI+N20 ",                                                                                     "PH+N20 ",                                      "PH+N20 ",                          "PH+N20 ST+N20 ",                           "PD+N20 MD+N21 ",       ""},//83
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 PE+N20 PE+N24 ",                        "PH+N20 PR+N20 PE+N24 ",            "PH+N20 PE+N20 PE+N24 ",                    "PD+N20 MD+N21 ",       ""},//84
                        {"",                                                                                            "PH+N20 RI+N20 RI+N24 ",                        "PH+N20 ",                          "PH+N20 RD+N20 RD+N24 ",                    "",                      ""},//85
                        {"",                                                                                            "PH+N20 RI+N20 RI+N24 ",                        "PH+N20 MO+N21 ",                   "RI+N16 RD+N16 PE+N16 RD+N20 RD+N24 ",      "",                      ""},//86
                        {"",                                                                                            "PH+N20 RI+N20 RI+N24 PL+N20 ",                 "PH+N20 ",                          "PE+N16 PH+N20 RD+N20 RD+N24 ",             "",                      ""},//87
                        {"",                                                                                            "RI+N16 RD+N16 PE+N16 RI+N20 RI+N24 ",          "PH+N20 AB+N20 ",                   "PH+N20 RD+N20 RD+N24 ",                    "",                      ""},//88
                        {"",                                                                                            "PE+N16 PH+N20 RI+N20 RI+N24 ",                 "PH+N20 ",                          "PH+N20 RD+N20 RD+N24 ES+N20 ",             "",                      ""},//89
                        {"",                                                                                            "PH+N20 RI+N20 RI+N24 LD+N20 ",                 "PH+N20 MO+N21 ",                   "PH+N20 RD+N20 RD+N24 ",                    "",                      ""},//90
                        {"",                                                                                            "PH+N20 RI+N20 RI+N24 PL+N20 ",                 "PH+N20 PL+N20 ",                   "PH+N20 RD+N20 RD+N24 ",                    "",                      ""},//91
                        {"",                                                                                            "PH+N20 RI+N20 RI+N24 ",                        "PH+N20 ",                          "PH+N20 RD+N20 RD+N24 ",                    "",                      ""},//92
                        {"",                                                                                            "PH+N20 RI+N20 RI+N24 ES+N20 ",                 "PH+N20 ",                          "PH+N20 RD+N20 RD+N24 CS+N20 ",             "",                      ""},//93
                        {"",                                                                                            "RI+N16 RD+N16 PE+N16 RI+N20 RI+N24 ",          "RI+N16 RD+N16 PE+N16 ",            "PH+N20 RD+N20 RD+N24 ",                    "",                      ""},//94
                        {"",                                                                                            "PH+N20 PE+N16 RI+N20 RI+N24 ",                 "PH+N20 PE+N16 ",                   "PH+N20 RD+N20 RD+N24 ",                    "",                      ""},//95
                        {"",                                                                                            "PH+N20 RI+N20 RI+N24 ",                        "PH+N20 MO+N21 ",                   "PH+N20 RD+N20 RD+N24 ES+N20 ",             "",                      ""},//96
                        {"",                                                                                            "PH+N20 RI+N20 RI+N24 SC+N20 ",                 "PH+N20 AB+N20 ",                   "PH+N20 RD+N20 RD+N24 MO+N21 ",             "",                      ""},//97
                        {"",                                                                                            "RI+N16 RD+N16 PE+N16 RI+N20 RI+N24 ",          "PH+N20 PL+N20 ",                   "PH+N20 RD+N20 RD+N24 PL+N20 ",             "",                      ""},//98
                        {"",                                                                                            "PH+N20 PE+N16 RI+N20 RI+N24 ",                 "PH+N20 ES+N20 MO+N21 ",            "PH+N20 RD+N20 RD+N24 LD+N20 ",             "",                      ""},//99
                        {"",                                                                                            "PH+N20 RI+N20 RI+N24 ",                        "PH+N20 ",                          "PH+N20 RD+N20 RD+N24 ",                    "",                      ""},//100
                        {"PI+N20 MI+N21 ",                                                                              "PH+N20 PE+N20 PE+N24 ",                        "PH+N20 PR+N20 PE+N24 ",            "PH+N20 PE+N20 PE+N24 ",                    "PD+N20 MD+N21 ",        ""},//101
                };
        //Mundo
        world.getTextureResources().add(R.drawable.level7_fondo);
        //Constantes
        crashResource = R.raw.cristal;
        musicResource = R.raw.city_musica;
        this.level = level;
    }

    @Override
    protected List<ShapeOpengl> crearObjeto(String figura,float x,float y,float z){
        List<ShapeOpengl> shapes = new ArrayList<>();
        if (figura.equals("AB")){
            shapes.add(crearTroncoVertical(x,y,z));
            shapes.add(crearArbolHojas(x,y+0.4f,z,radioEsfera*1.4f));
            shapes.add(crearArbolHojas(x,y+0.5f,z,radioEsfera*1.1f));
            shapes.add(crearArbolHojas(x,y+0.6f,z,radioEsfera*0.8f));
            shapes.add(crearArbolHojas(x,y+0.7f,z,radioEsfera*0.5f));
        }
        if (figura.equals("C2")){
            shapes.add(crearCuboCarro2(x, y, z, -1));
            shapes.add(crearCuboCarro(x, y, z,-1));
            shapes.add(creaPlanoCarro(x, y, z,-1));
            shapes.add(crearLlantaCarro(x, y, z, -1, -lengthPlano/2));
            shapes.add(crearLlantaCarro(x, y, z, -1, lengthPlano/2));
        }
        if (figura.equals("CR")){
            shapes.add(crearCuboCarro2(x, y, z,1));
            shapes.add(crearCuboCarro(x, y, z,1));
            shapes.add(creaPlanoCarro(x, y, z,1));
            shapes.add(crearLlantaCarro(x, y, z, 1, -lengthPlano/2));
            shapes.add(crearLlantaCarro(x, y, z, 1, lengthPlano/2));
        }
        if (figura.equals("CS")){
            shapes.add(crearCasco(x,y,z));
        }
        if (figura.equals("CT")){
            shapes.add(crearConoTransito(x,y,z));
            shapes.add(crearPlanoTransito(x,y,z));
        }
        if (figura.equals("EC")){
            crearEsferaCristalina(x,y,z);
        }
        if (figura.equals("E2")){
            shapes.add(crearEdificio2(x,y,z));
        }
        if (figura.equals("E3")){
            shapes.add(crearEdificio3(x,y,z));
        }
        if (figura.equals("ED")){
            shapes.add(crearEdificio(x,y,z));
        }
        if (figura.equals("ES")){
            shapes.add(crearEscombros(x,y,z));
        }
        if (figura.equals("LD")){
            shapes.add(crearLadrillo(x-lengthPlano/2,y,z,45));
            shapes.add(crearLadrillo(x+lengthPlano/2,y,z,135));
            shapes.add(crearLadrillo(x+3*lengthPlano/2,y,z,135));
            shapes.add(crearLadrillo(x-lengthPlano/2,y+lengthPared*2,z,150));
            shapes.add(crearLadrillo(x+lengthPlano/2,y+lengthPared*2,z,60));
            shapes.add(crearLadrillo(x-lengthPlano/2,y+lengthPared*4,z,80));
            shapes.add(crearLadrillo(x+lengthPlano/2,y+lengthPared*4,z,165));
            shapes.add(crearLadrillo(x,y+lengthPared*6,z,30));
        }
        if (figura.equals("MD")){
            shapes.add(crearConoMetalico(x-lengthPlano/2-lengthPared,y,z));
        }
        if (figura.equals("MI")){
            shapes.add(crearConoMetalico(x+lengthPlano/2+lengthPared,y,z));
        }
        if (figura.equals("MO")){
            shapes.add(crearMoneda(x, y, z));
        }
        if (figura.equals("P2")){
            shapes.add(crearCilindroPasador(x,y,z,lengthPlano-0.1f));
            shapes.add(crearPlanoPasador(x,y,z,lengthPlano-0.1f));
        }
        if (figura.equals("PA")){
            shapes.add(crearParedAnchura(x,y,z));
        }
        if (figura.equals("PC")){
            shapes.add(crearPlanoCubo(x,y,z));
            shapes.add(crearPaloPlanoCubo(x,y,z,-lengthPlano,-lengthPlano));
            shapes.add(crearPaloPlanoCubo(x,y,z,-lengthPlano,lengthPlano));
            shapes.add(crearPaloPlanoCubo(x,y,z,lengthPlano,-lengthPlano));
            shapes.add(crearPaloPlanoCubo(x,y,z,lengthPlano,lengthPlano));
        }
        if (figura.equals("PD")){
            shapes.add(crearParedDerechaProfundidad(x,y,z));
        }
        if (figura.equals("PE")){
            shapes.add(crearPared(x,y,z));
        }
        if (figura.equals("PI")){
            shapes.add(crearParedIzquierdaProfundidad(x, y, z));
        }
        if (figura.equals("PL")){
            shapes.add(crearPolvo(x,y,z));
            shapes.add(crearPolvo(x+0.05f,y+0.05f,z+0.05f*2));
            shapes.add(crearPolvo(x+0.025f,y+0.1f,z+0.025f*2));
            shapes.add(crearPolvo(x+0.2f,y+0.1f,z+0.2f*2));
            shapes.add(crearPolvo(x-0.2f,y+0.1f,z-0.2f*2));
            shapes.add(crearPolvo(x+0.1f,y+0.15f,z+0.1f*2));
            shapes.add(crearPolvo(x-0.1f,y+0.15f,z-0.1f*2));
            shapes.add(crearPolvo(x-0.025f,y+0.2f,z-0.025f*2));
        }
        if (figura.equals("PH")){
            shapes.add(crearPlanoHorizontal(x,y,z));
        }
        if (figura.equals("PR")){
            shapes.add(crearPlanoPuerta1(x+lengthPlano,y,z));
            shapes.add(crearPlanoPuerta2(x-lengthPlano,y,z));
        }
        if (figura.equals("PS")){
            shapes.add(crearCilindroPasador(x,y,z,-lengthPlano+0.1f));
            shapes.add(crearPlanoPasador(x,y,z,-lengthPlano+0.1f));
        }
        if (figura.equals("RI")){
            shapes.add(crearParedProfundidad(x-lengthPlano,y,z,180));
        }
        if (figura.equals("RD")){
            shapes.add(crearParedProfundidad(x+lengthPlano,y,z,0));
        }
        if (figura.equals("SC")){
            shapes.add(crearSenalTransito(x,y,z,R.drawable.level8_contruccion_senal));
            shapes.add(crearPaloSenalTransito(x,y,z));
        }
        if (figura.equals("ST")){
            shapes.add(crearSenalTransito(x,y,z,R.drawable.level8_auto_senal));
            shapes.add(crearPaloSenalTransito(x,y,z));
        }
        continueShapeCreation(shapes,figura,x,y,z);
        return shapes;
    }

    private void crearEsferaCristalina(float cx,float cy,float cz){
        sphere = new Sphere(cx,cy+radioEsfera*5,cz,12,24,radioEsfera);
        sphere.getTextureResources().add(R.drawable.level8_esfera);
        sphere.setRGBA(1f, 1f, 1f, 0.6f);
    }

    private Plane crearPlanoHorizontal(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy,cz,lengthPlano,0,lengthPlano);
        plane.getTextureResources().add(R.drawable.level8_piso);
        return plane;
    }

    private Cube crearEdificio(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPlano*1.5f,cz,lengthPlano,lengthPlano*1.5f,lengthPlano);
        cube.getTextureResources().add(R.drawable.level8_edificio);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearEdificio2(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPlano*1.5f,cz,lengthPlano,lengthPlano*1.5f,lengthPlano);
        cube.getTextureResources().add(R.drawable.level8_edificio2);
        cube.setSolid(true);
        cube.setRGBA(1f, 1f, 1f, 0.8f);
        return cube;
    }

    private Cube crearEdificio3(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPlano*1.5f,cz,lengthPlano,lengthPlano*1.5f,lengthPlano);
        cube.getTextureResources().add(R.drawable.level8_edificio3);
        cube.setSolid(true);
        return cube;
    }

    private Cube crearParedDerechaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx-lengthPlano+lengthPared,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level8_pared);
        return cube;
    }

    private Cube crearParedIzquierdaProfundidad(float cx, float cy, float cz){
        Cube cube = new Cube(cx+lengthPlano-lengthPared,cy+lengthPared,cz,lengthPared,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level8_pared);
        return cube;
    }

    private Cube crearParedAnchura(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy+lengthPared,cz+lengthPlano+lengthPared,lengthPlano,lengthPared,lengthPared);
        cube.getTextureResources().add(R.drawable.level8_pared);
        return cube;
    }

    /////////////////////////////////////Señal///////////////////////////////////////////////////////

    private Plane crearSenalTransito(float cx, float cy, float cz, int textura){
        Plane planePare = new Plane(cx,cy+0.6f,cz+0.02f,0.2f,0.2f,0);
        planePare.getTextureResources().add(textura);
        planePare.setSolid(true);
        planePare.getAnimator().setAngleZ(45);
        return planePare;
    }

    private Plane crearPaloSenalTransito(float cx, float cy, float cz){
        Plane planePare = new Plane(cx,cy+0.2f,cz,0.02f,0.2f,0);
        planePare.getTextureResources().add(R.drawable.level8_pared);
        planePare.setSolid(true);
        return planePare;
    }

    //////////////////////////////////////Pasador///////////////////////////////////////////////////

    private Cylinder crearCilindroPasador(float cx, float cy, float cz, float incrX){
        Cylinder cylinderPasador = new Cylinder(cx+incrX,cy+0.2f,cz,0.1f,0.2f,8);
        cylinderPasador.getTextureResources().add(R.drawable.level8_pasador);
        cylinderPasador.setSolid(true);
        return cylinderPasador;
    }

    private Plane crearPlanoPasador(float cx, float cy, float cz, float incrX){
        Plane planePasador = new Plane(cx,cy+0.2f,cz,lengthPlano,0.05f,0);
        planePasador.getTextureResources().add(R.drawable.level8_pasador);
        planePasador.setSolid(true);
        if (incrX > 0){
            planePasador.getAnimator().setMinAngleZ(-45);
            planePasador.getAnimator().setMaxAngleZ(0);
            planePasador.getAnimator().setIncrAngleZ(-1);
        }
        else{
            planePasador.getAnimator().setMaxAngleZ(45);
            planePasador.getAnimator().setMinAngleZ(0);
            planePasador.getAnimator().setIncrAngleZ(1);
        }
        planePasador.setcRX(incrX);
        return planePasador;
    }

    ////////////////////////////////////Carro///////////////////////////////////////////////////////

    private Cube crearCuboCarro(float cx, float cy, float cz, float signo){
        Cube cube = new Cube(cx-signo*(lengthPlano-lengthPlano/1.4f),cy+lengthPlano/2.5f+2*lengthPlano/2.5f+0.1f,cz,lengthPlano/1.4f,lengthPlano/2.5f,lengthPlano/2);
        if (signo > 0){
            cube.getTextureResources().add(R.drawable.level8_carro);
        }
        else{
            cube.getTextureResources().add(R.drawable.level8_carro3);
        }
        cube.setSolid(true);
        cube.getAnimator().setIncrX(0.03f*signo);
        cube.getAnimator().setMaxX(4f-cx);
        cube.getAnimator().setMinX(-4f-cx);

        cube.getAnimator().setBidirectionalX(false);

        return cube;
    }

    private Plane creaPlanoCarro(float cx, float cy, float cz, float signo){
        Plane plane = new Plane(cx-signo*(lengthPlano-lengthPlano/1.4f),cy+lengthPlano/2.5f+2*lengthPlano/2.5f+0.1f,cz,lengthPlano/1.4f,lengthPlano/2.5f,0);
        if (signo > 0){
            plane.getTextureResources().add(R.drawable.level8_carro2);
        }
        else{
            plane.getTextureResources().add(R.drawable.level8_carro4);
        }
        plane.setSolid(true);
        plane.getAnimator().setIncrX(0.03f*signo);
        plane.getAnimator().setMaxX(4f-cx);
        plane.getAnimator().setMinX(-4f-cx);
        plane.getAnimator().setBidirectionalX(false);
        plane.getAnimator().setZ(lengthPlano/2+0.025f);
        plane.getAnimator().setMaxZ(lengthPlano/2+0.025f);

        return plane;
    }


    private Cube crearCuboCarro2(float cx, float cy, float cz, float signo){
        Cube cube = new Cube(cx,cy+lengthPlano/2.5f+0.1f,cz,lengthPlano,lengthPlano/2.5f,lengthPlano/2);
        if (signo > 0){
            cube.getTextureResources().add(R.drawable.level8_carro);
        }
        else{
            cube.getTextureResources().add(R.drawable.level8_carro3);
        }
        cube.setSolid(true);
        cube.getAnimator().setIncrX(0.03f*signo);
        cube.getAnimator().setMaxX(4f-cx);
        cube.getAnimator().setMinX(-4f-cx);
        cube.getAnimator().setBidirectionalX(false);

        return cube;
    }

    private Cylinder2 crearLlantaCarro(float cx, float cy, float cz, float signo, float tx){
        Cylinder2 cilindro2 = new Cylinder2(cx+tx,cy+0.15f,cz,0.15f,0.05f,12);
        cilindro2.getTextureResources().add(R.drawable.level8_llanta);
        cilindro2.setSolid(true);

        cilindro2.getAnimator().setIncrX(0.03f * signo);
        cilindro2.getAnimator().setMaxX(4f-cx);
        cilindro2.getAnimator().setMinX(-4f-cx);
        cilindro2.getAnimator().setBidirectionalX(false);

        cilindro2.getAnimator().setZ(lengthPlano/2+0.025F);
        cilindro2.getAnimator().setMaxZ(lengthPlano/2+0.025F);

        cilindro2.getAnimator().setAngleX(90);
        cilindro2.getAnimator().setIncrAngleZ(-3*signo);
        cilindro2.getAnimator().setBidirectionalAngleZ(false);
        cilindro2.setOrderRotation(new ArrayList<String>());
        cilindro2.getOrderRotation().add("X");
        cilindro2.getOrderRotation().add("Y");
        cilindro2.getOrderRotation().add("Z");
        return cilindro2;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Cone crearEscombros(float cx, float cy, float cz){
        Cone coneEscombros = new Cone(cx,cy,cz,6,lengthPlano,lengthPlano);
        coneEscombros.getTextureResources().add(R.drawable.level8_escombros);
        coneEscombros.setSolid(true);
        return coneEscombros;
    }

    private Cone crearConoMetalico(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,4,0.1f,0.4f);
        cone.getTextureResources().add(R.drawable.level4_piso);
        cone.setSolid(true);
        return cone;
    }

    ////////////////////////////////////////Puertas/////////////////////////////////////////////////

    private Cube crearPlanoPuerta1(float cx, float cy, float cz){
        Cube cubePuerta = new Cube(cx-lengthPlano/2,cy+0.4f,cz-lengthPlano,lengthPlano/2,0.4f,lengthPared/4);
        cubePuerta.getTextureResources().add(R.drawable.level8_puerta);
        cubePuerta.setSolid(true);
        cubePuerta.setcRX(lengthPlano/2);
        cubePuerta.getAnimator().setMaxAngleY(90);
        cubePuerta.getAnimator().setMinAngleY(0);
        cubePuerta.getAnimator().setIncrAngleY(2);
        return cubePuerta;
    }

    private Cube crearPlanoPuerta2(float cx, float cy, float cz){
        Cube cubePuerta = new Cube(cx+lengthPlano/2,cy+0.4f,cz-lengthPlano,lengthPlano/2,0.4f,lengthPared/4);
        cubePuerta.getTextureResources().add(R.drawable.level8_puerta);
        cubePuerta.setSolid(true);
        cubePuerta.setcRX(-lengthPlano/2);
        cubePuerta.getAnimator().setMaxAngleY(0);
        cubePuerta.getAnimator().setMinAngleY(-90);
        cubePuerta.getAnimator().setIncrAngleY(-2);
        cubePuerta.mirrorXTextureCoordinates();
        return cubePuerta;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private Plane crearPared(float cx, float cy, float cz){
        Plane plane = new Plane(cx,cy+0.4f,cz-lengthPlano,lengthPlano,0.4f,0);
        plane.getTextureResources().add(R.drawable.level6_pared);
        return plane;
    }

    private Plane crearParedProfundidad(float cx, float cy, float cz, float angulo){
        Plane plane = new Plane(cx,cy+0.4f,cz,0,0.4f,lengthPlano);
        plane.getTextureResources().add(R.drawable.level6_pared);
        plane.getAnimator().setAngleY(angulo);
        return plane;
    }

    private Sphere crearCasco(float cx, float cy, float cz){
        Sphere sphere = new Sphere(cx,cy,cz,4,8,radioEsfera*1.2f);
        sphere.getTextureResources().add(R.drawable.level8_casco);
        sphere.setSolid(true);
        return sphere;
    }

    private Cube crearLadrillo(float cx, float cy, float cz, float anguloY){
        Cube cube = new Cube(cx,cy+lengthPared,cz,lengthPlano/2,lengthPared,lengthPared);
        cube.getTextureResources().add(R.drawable.level8_ladrillo);
        cube.setSolid(true);
        cube.getAnimator().setAngleY(anguloY);
        return cube;
    }

    private Plane crearPolvo(float cx, float cy, float cz){
        Plane planePolvo = new Plane(cx,cy,cz,0.02f,0.02f,0);
        planePolvo.getTextureResources().add(R.drawable.level8_polvo);
        planePolvo.getAnimator().setMinY(-2f);
        planePolvo.getAnimator().setMaxY(2f);
        planePolvo.getAnimator().setIncrY(-0.03F);
        planePolvo.getAnimator().setY(2f);
        planePolvo.getAnimator().setBidirectionalY(false);
        planePolvo.setSolid(true);
        return planePolvo;
    }

    ////////////////////////////////////Cone de transito////////////////////////////////////////////

    private Cone crearConoTransito(float cx, float cy, float cz){
        Cone cone = new Cone(cx,cy,cz,8,0.1f,0.4f);
        cone.getTextureResources().add(R.drawable.level8_cono);
        cone.setSolid(true);
        return cone;
    }

    private Cylinder2 crearPlanoTransito(float cx, float cy, float cz){
        Cylinder2 cilindro2 = new Cylinder2(cx,cy+0.005f,cz,0.15f,0.01f,8);
        cilindro2.getTextureResources().add(R.drawable.level8_plano_cono);
        cilindro2.setSolid(true);
        return cilindro2;
    }

    ////////////////////////////////////Plane cubo//////////////////////////////////////////////////

    private Cube crearPlanoCubo(float cx, float cy, float cz){
        Cube cube = new Cube(cx,cy,cz,lengthPlano,lengthPared,lengthPlano);
        cube.getTextureResources().add(R.drawable.level8_pared);
        cube.getAnimator().setMaxY(2.5f);
        cube.getAnimator().setMinY(-2.5f);
        cube.getAnimator().setIncrY(0.01f);
        return cube;
    }

    private Plane crearPaloPlanoCubo(float cx, float cy, float cz, float tx, float tz){
        Plane planePare = new Plane(cx,cy+2f-lengthPared,cz,0.02f,2f,0);
        planePare.getTextureResources().add(R.drawable.level8_pared);
        planePare.getAnimator().setMaxY(2.5f);
        planePare.getAnimator().setMinY(-2.5f);
        planePare.getAnimator().setIncrY(0.01f);
        planePare.getAnimator().setX(tx);
        planePare.getAnimator().setMaxX(tx);
        planePare.getAnimator().setMinX(tx);
        planePare.getAnimator().setZ(tz);
        planePare.getAnimator().setMaxZ(tz);
        planePare.getAnimator().setMinZ(tz);
        return planePare;
    }

    ////////////////////////////////////////Arbol2//////////////////////////////////////////////////

    private Cylinder crearTroncoVertical(float cx, float cy, float cz){
        Cylinder tronco = new Cylinder(cx,cy+0.2f,cz,0.05f,0.4f,16);
        tronco.getTextureResources().add(R.drawable.level3_tronco);
        tronco.setSolid(true);
        return tronco;
    }

    private Sphere crearArbolHojas(float cx, float cy, float cz, float radio){
        Sphere sphere = new Sphere(cx,cy,cz,6,8,radio);
        sphere.getTextureResources().add(R.drawable.level3_hojas);
        sphere.getAnimator().setAlpha(610);
        sphere.setSolid(true);
        return sphere;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
}
