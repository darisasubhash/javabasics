package com.bridgelab.programs;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int n= scan.nextInt();
        int array[]=new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min) {
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
