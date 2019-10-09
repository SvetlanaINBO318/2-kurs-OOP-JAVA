package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> zifra =new ArrayList<Integer>();
        for(int i=1; i<11; i++) {
            zifra.add(i);
        }
        Collections.shuffle(zifra);
        ArrayList<Integer> player1 =new ArrayList<Integer>();
        ArrayList<Integer> player2 =new ArrayList<Integer>();
        for(int i=0; i<5; i++) {
            player1.add(zifra.get(i));
            player2.add(zifra.get(i+5));
        }
        System.out.println("Карты 1 игрока " + player1);
        System.out.println("Карты 2 игрока " + player2);
        int hod=0;
        while ((player1.size()!=0)&&(player2.size()!=0)&&(hod<106)) {
            if((player1.get(0)>player2.get(0))||((player1.get(0)==1)&&(player2.get(0)==10))) {
                player1.add(player2.get(0));
                player1.add(player1.get(0));
                player1.remove(0);
                player2.remove(0);

            }
            else {
                player2.add(player1.get(0));
                player2.add(player2.get(0));
                player2.remove(0);
                player1.remove(0);
            }
            hod++;
        }
        if(player1.size()==0) 
            System.out.println("Победа 2 игрока на "+hod+" ход");
        else if(player2.size()==0) 
            System.out.println("Победа 1 игрока на  "+hod+"ход");
        else 
            System.out.println("Ботва");
    }
}
