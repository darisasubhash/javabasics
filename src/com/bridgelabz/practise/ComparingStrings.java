package com.bridgelabz.practise;
import java.util.Scanner;
public class ComparingStrings {
    public static void main(String[] args) {

        System.out.println("Enter first string");
        Scanner scan=new Scanner(System.in);
        String s1 =scan.nextLine();
        System.out.println("Enter the second string");
        String s2=scan.nextLine();
        if(s1.equals(s2)) {
            System.out.println("Both Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}
