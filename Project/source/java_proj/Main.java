package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class Main extends JFrame {
    public static class Main1 extends JPanel {
        BufferedImage table = null, kettle = null, coffeepot = null, milk = null, whisk = null,enter = null, back = null;
        BufferedImage esp = null, dop = null, bb = null, fw = null, cpc = null,am = null, lt = null,mlk = null, wtr = null;
        BufferedImage mf = null,lb = null,mct = null,cvr = null;
        ArrayList coffee = new ArrayList();
        int wh = 0,cf = 0;
        public Main1() {
            addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    Rectangle kettle_bounds = new Rectangle(626, 243, kettle.getWidth(), kettle.getHeight());
                    Rectangle cpot_bounds = new Rectangle(510, 193, coffeepot.getWidth(), coffeepot.getHeight());
                    Rectangle whisk_bounds = new Rectangle(159, 205, whisk.getWidth(), whisk.getHeight());
                    Rectangle milk_bounds = new Rectangle(204, 230, milk.getWidth(), milk.getHeight());
                    Rectangle back_bounds = new Rectangle(10, 10, back.getWidth(), back.getHeight());
                    Rectangle enter_bounds = new Rectangle(100, 10, enter.getWidth(), enter.getHeight());
                    Point clicked = e.getPoint();
                    if (kettle_bounds.contains(clicked)) {
                        if (coffee.size() < 4)
                            coffee.add("water");
                    } else if (cpot_bounds.contains(clicked)) {
                        if (coffee.size() < 4)
                            coffee.add("espresso");
                    } else if (milk_bounds.contains(clicked)) {
                        if (coffee.size() < 6) {
                            if (wh == 1) {
                                coffee.add("foam");
                                wh = 0;
                            } else coffee.add("milk");
                        }
                    } else if (whisk_bounds.contains(clicked)) {
                        wh = 1;
                    }
                    if (back_bounds.contains(clicked)) {
                        coffee.clear();
                        System.out.println("CLEARED");
                        cf = 0;
                        repaint();
                        wh = 0;
                    }
                    if (enter_bounds.contains(clicked)) {
                        if(coffee.size()==0) {
                            return;
                        }
                        if (coffee.size() == 1) {
                            if (coffee.get(0) == "water") {
                                System.out.println("GLASS OF WATER");
                                cf = 1;
                            } else if (coffee.get(0) == "espresso") {
                                System.out.println("ESPRESSO");
                                cf = 2;
                            } else if (coffee.get(0) == "milk") {
                                System.out.println("GLASS OF MILK");
                                cf = 3;
                            } else if (coffee.get(0) == "foam") {
                                System.out.println("MILK FOAM");
                                cf = 4;
                            }
                        } else if (coffee.size() == 2) {
                            if (coffee.get(0) == "espresso") {
                                if (coffee.get(1) == "espresso") {
                                    System.out.println("DOPPIO");
                                    cf = 5;
                                } else if (coffee.get(1) == "milk") {
                                    System.out.println("BONBON");
                                    cf = 6;
                                } else if (coffee.get(1) == "foam") {
                                    System.out.println("MACHIATO");
                                    cf = 7;
                                }
                            } else if (coffee.get(0) == "milk") {
                                if (coffee.get(1) == "espresso") {
                                    System.out.println("BONBON");
                                    cf = 6;
                                } else if (coffee.get(1) == "MILK") {
                                    System.out.println("A LOT OF MILK");
                                    cf = 3;
                                }
                            } else if (coffee.get(0) == "water" && coffee.get(1) == "water") {
                                System.out.println("A LOT OF WATER");
                                cf=1;
                            } else System.out.println("NO");
                        } else if (coffee.size() == 3) {
                            if (coffee.get(0) == "espresso") {
                                if (coffee.get(1) == "water" && coffee.get(2) == "water") {
                                    System.out.println("AMERICANO");
                                    cf = 8;
                                }
                                if (coffee.get(1) == "milk" && coffee.get(2) == "milk") {
                                    System.out.println("FLAT WHITE");
                                    cf = 9;
                                }
                                if (coffee.get(1) == "milk" && coffee.get(2) == "foam") {
                                    System.out.println("CAPPUCCINO");
                                    cf = 10;
                                }
                            } else if (coffee.get(0) == "water") {
                                if (coffee.get(1) == "water" && coffee.get(2) == "espresso") {
                                    System.out.println("LONG BLACK");
                                    cf=11;
                                } else if (coffee.get(1) == "water" && coffee.get(2) == "water") {
                                    System.out.println("A LOAD OF WATER");
                                    cf=1;
                                }
                            } else if (coffee.get(0) == "milk" && coffee.get(1) == "milk" && coffee.get(2) == "milk") {
                                System.out.println("A LOAD OF MILK");
                                cf=3;
                            } else System.out.println("I DON'T KNOW WHAT IT IS BUT I DON'T LIKE IT");
                        } else if (coffee.get(0) == "espresso" && coffee.get(1) == "milk" && coffee.get(2) == "milk" && coffee.get(3) == "milk" && coffee.get(4) == "foam") {
                            System.out.println("LATTE");
                            cf=12;
                        } else System.out.println("NO");
                        repaint();
                    }
                }
            });
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            this.setBackground(Color.WHITE);
            try {
                table = ImageIO.read(getClass().getResource("table.png"));
                kettle = ImageIO.read(getClass().getResource("kettle.png"));
                coffeepot = ImageIO.read(getClass().getResource("coffeepot.png"));
                milk = ImageIO.read(getClass().getResource("milk.png"));
                whisk = ImageIO.read(getClass().getResource("whisk.png"));
                enter = ImageIO.read(getClass().getResource("enter.png"));
                back = ImageIO.read(getClass().getResource("back.png"));
                esp = ImageIO.read(getClass().getResource("espresso.png"));
                dop = ImageIO.read(getClass().getResource("doppio.png"));
                bb = ImageIO.read(getClass().getResource("bonbon.png"));
                fw = ImageIO.read(getClass().getResource("flatwhite.png"));
                cpc = ImageIO.read(getClass().getResource("cappuccino.png"));
                am = ImageIO.read(getClass().getResource("americano.png"));
                lt = ImageIO.read(getClass().getResource("latte.png"));
                mct = ImageIO.read(getClass().getResource("machiato.png"));
                lb = ImageIO.read(getClass().getResource("longblack.png"));
                mlk = ImageIO.read(getClass().getResource("allmilk.png"));
                wtr = ImageIO.read(getClass().getResource("allwater.png"));
                mf = ImageIO.read(getClass().getResource("allmilkfoam.png"));
                cvr = ImageIO.read(getClass().getResource("cover.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
                g.drawImage(table, 90, 250, null);
                g.drawImage(kettle, 626, 243, null);
                g.drawImage(coffeepot, 510, 193, null);
                g.drawImage(whisk, 159, 205, null);
                g.drawImage(milk, 204, 230, null);
            g.drawImage(back, 10, 10, null);
            g.drawImage(enter, 100, 10, null);
            g.setFont(new Font("Monospaced",Font.PLAIN,32));
            if(cf==0) {
                g.drawImage(cvr, 416, 272, null);
                g.drawString("                  ",400,50);
            }
            else if(cf==1) {
                g.drawImage(wtr, 416, 305, null);
                g.drawString("WATER",400,50);
            }
            else if (cf==2) {
                g.drawImage(esp, 416, 305, null);
                g.drawString("ESPRESSO",375,50);
            }
            else if (cf==3) {
                g.drawImage(mlk, 416, 305, null);
                g.drawString("MILK",400,50);
            }
            else if(cf==4) {
                g.drawImage(mf, 416, 305, null);
                g.drawString("MILK FOAM",350,50);
            }
            else if (cf==5) {
                g.drawImage(dop, 416, 305, null);
                g.drawString("DOPPIO",400,50);
            }
            else if(cf==6){
                g.drawString("BONBON",400,50);
                g.drawImage(bb, 416, 305, null);
            }
            else if (cf==7) {
                g.drawString("MACHIATO",375,50);
                g.drawImage(mct, 416, 305, null);
            }
            else if(cf==8){
                g.drawString("AMERICANO",375,50);
                g.drawImage(am, 416, 305, null);
            }
            else if(cf==9) {
                g.drawString("FLAT WHITE",350,50);
                g.drawImage(fw, 416, 305, null);
            }
            else if(cf==10) {
                g.drawString("CAPPUCCINO",350,50);
                g.drawImage(cpc, 416, 305, null);
            }
            else if(cf==11){
                g.drawString("LONG BLACK",350,50);
                g.drawImage(lb, 416, 305, null);
            }
            else if(cf==12) {
                g.drawString("LATTE",400,50);
                g.drawImage(lt, 416, 272, null);
            }
        }
    }
        public static void main(String[] args) {
            JFrame f = new JFrame("coffee like java");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Main1 m = new Main1();
            f.add(m);
            f.setSize(900,700);
            f.setResizable(false);
            f.setVisible(true);
        }


}
