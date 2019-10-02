package com.company;
import java.util.Scanner;

public class Main {

    public static int factorial(int a) {
        int k=1;
        for(int i=1;i<=a;i++) k=i*k;
        return k;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        System.out.println(factorial(a));
    }
}
