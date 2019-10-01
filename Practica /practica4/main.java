package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame{
        int mil=0;
        int mad=0;
        String win1="AC Milan";
        String win2="Real Madrid";
        JButton b1 = new JButton(" AC Milan");
        JButton b2 = new JButton(" Real Madrid");
        public Main() {
            super(" ");
            setLayout(new FlowLayout());
            setSize(200,200);
            add(b1);
            add(b2);
            JLabel j1=new JLabel("Result: 0 X 0");
            add(j1);
            JLabel j2=new JLabel("Last Scorer:");
            add(j2);
            JLabel j3=new JLabel("Winner:");
            add(j3);

            b1.addActionListener(
                    new ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                            mil++;
                            j1.setText("Result: "+mil+" X "+mad);
                            j2.setText("Last Scorer: "+win1);
                            if(mil>mad) {
                                j3.setText("Winner: "+win1);
                            }
                            if(mil==mad) {
                                j3.setText("No winner");
                            }
                        }
                    });
            b2.addActionListener(
                    new ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                            mad++;
                            j1.setText("Result: "+mil+" X "+mad);
                            j2.setText("Last Scorer: "+win2);
                            if(mad>mil) {
                                j3.setText("Winner: "+win2);
                            }
                            if(mil==mad) {
                                j3.setText(" No winner");
                            }
                        }
                    });
            setVisible(true);
        }
    public static void main(String[] args) {
        new Main();
    }
}
