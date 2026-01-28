package com.bridgelab.programs;

import java.util.Scanner;

public class PrintArrayElements {
    public static void main(String argString []) {

        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int array[]=new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
