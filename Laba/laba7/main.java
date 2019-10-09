package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <String>();
        list.add("ручка");
        list.add("карандаш");
        list.add("замазка");
        int index = list.indexOf("замазка");
        System.out.println (list.get(index) + " лежит  в отсеке номер " + (1+index));
        if (list.contains("ручка")) System.out.println ("В пенале есть ручка");
        System.out.println ("Первый элемент пенала '" + list.get(0) + "'");
        System.out.println ("Кол-во отсеков в пенале: '" + Integer.valueOf (list.size()) + "'");
    }
}
