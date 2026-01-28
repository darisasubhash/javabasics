package com.bridgelabz.practise;

public class DemonstratingStatic {
    static int value;

    static {
        value = 50;
        System.out.println("In Static block");
    }

    static void value() {
        System.out.println("In Static method");
        System.out.println("Value in static = " + value);
    }

    public static void main(String[] args) {

        System.out.println("In Main method");

        System.out.println("Value in main = " + value);

        value();
    }
}
