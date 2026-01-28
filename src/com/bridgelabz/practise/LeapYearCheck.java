package com.bridgelabz.practise;
import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n>=1582) {
            if((n%4==0 && n%100!=0) || (n%400==0)) {
                System.out.println("Given year is leap year");
            }
            else {
                System.out.println("Given year is not a leap year");
            }
        }
        else {
            System.out.println("Enter year greater than 1581");
        }
    }
}
