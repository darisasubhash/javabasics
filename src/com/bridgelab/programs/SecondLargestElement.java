package com.bridgelab.programs;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int n=scan.nextInt();
        int array[]=new int [n];
        for (int i = 0; i < array.length; i++) {
            array[i]=scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]>first) {
                second=first;
                first=array[i];
            }
        }
        System.out.println(second);
    }
}
