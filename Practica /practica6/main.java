package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=10;
        Studentic[] arr = new Studentic[10];
        for (int i = 0; i<n; i++){
            int num = in.nextInt();
            arr[i]=new Studentic(num);
        }

        for(int i=1;i<n;i++)
            for(int j=i;j>0 && arr[j-1].IDnumber>arr[j].IDnumber;j--){
                Studentic k= arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=k;
            }
        
        System.out.println(" ");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i].IDnumber);
        }
    }
    }

