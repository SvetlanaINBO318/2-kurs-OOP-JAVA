package com.company;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Main extends JFrame {
    int t;
    int sc=1;
    ArrayList<Integer> cif =new ArrayList<Integer>();
    JButton b1 = new JButton(" угадать ");
    JTextField pole1 = new JTextField(10);
    JLabel j1=new JLabel("");
    JLabel j2=new JLabel("");

    Main(){
        super("угадайка");
        setLayout(new FlowLayout());
        setSize(270,140);
        add(pole1);
        add(b1);
        add(j1);
        add(j2);
        for(int i=1; i<11; i++) {
            cif.add(i);
        }
        Collections.shuffle(cif);
        t=cif.get(0);
        b1.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                        int ch =Integer.parseInt(pole1.getText());
                        if(ch==t) {
                            j1.setText("ЧИСЛО ОТГАДАНО");
                            j2.setText("мы загадали еще число");
                            sc=0;
                            Collections.shuffle(cif);
                            t=cif.get(0);

                        }
                        else {
                            if(sc<3) {
                                j1.setText("Попытка номер: "+sc);
                                if(ch<t) {
                                    j2.setText("Число больше");
                                }else if(ch>t) {
                                    j2.setText("Число меньше");
                                }

                            }
                            else {
                                j1.setText(" Увы, число не угадано \n Правильное число - "+t);
                                j2.setText("Загадано новое число");
                                sc=0;
                                Collections.shuffle(cif);
                                t=cif.get(0);
                            }


                        }
                        sc++;
                    }});
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}
