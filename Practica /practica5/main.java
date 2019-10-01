package com.company;
import java.util.Scanner;

public class Main {
    public static void zad11() {
        Scanner in = new Scanner(System.in);
        //  System.out.print("Input a number: ");
        int num1 = 1;
        int num2 = 1;
        int k = 0;
        num1 = in.nextInt();
        while (num1 != 0 && num2 != 0) {
            num2 = in.nextInt();
            if (num1 == 1) k++;
            if (num2 == 1) k++;
            num1 = in.nextInt();
        }
        System.out.print(k);
    }

    public static void zad12() {
        Scanner in = new Scanner(System.in);
        //  System.out.print("Input a number: ");
        int num1 = 1;
        num1 = in.nextInt();
        while (num1 != 0) {
            if (num1 % 2 != 0) System.out.print(num1 + " ");
            num1 = in.nextInt();
        }
    }

    public static void zad13() {
        Scanner in = new Scanner(System.in);
        //  System.out.print("Input a number: ");
        int num1 = 1;
        int k = 0;
        num1 = in.nextInt();
        while (num1 != 0) {
            k++;
            if (k % 2 != 0) System.out.print(num1 + " ");
            num1 = in.nextInt();
        }
    }

    public static int zad14(int num1) {
        if (num1 < 10) {
            return num1;
        }
        else {
            System.out.print(num1 % 10 + " ");
            return zad14(num1 / 10);
        }
    }
    public static String zad15(int num1) {
        if (num1 < 10)
            return Integer.toString(num1);
        else
            return zad15(num1 / 10) + " " + num1 % 10;
    }
    public static void main(String[] args) {
        // zad11();
        // zad12();
        // zad13();
        // System.out.println(zad14(123));
         //System.out.println(zad15(123));
    }
    }
