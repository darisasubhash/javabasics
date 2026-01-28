package com.bridgelab.programs;

import java.util.Scanner;

public class LargestElement {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int n= scan.nextInt();
        int array[]=new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max) {
                max=array[i];
            }
        }
        System.out.println(max);
    }

}
