package com.bridgelab.programs;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String argString []) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int array[]=new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=scan.nextInt();
        }
        for(int i=array.length-1;i>=0;i--) {
            System.out.println(array[i]);
        }
    }
}
