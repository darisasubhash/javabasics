package com.bridgelab.programs;

import java.util.Scanner;

public class SortingInAscendingOrder {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int array[]=new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=scan.nextInt();
        }
        for(int i=0;i<array.length-1;i++) {
            for(int j=0;j<array.length-i-1;j++) {
                if(array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int p:array) {
            System.out.println(p);
        }
    }
}
