package com.company;

public class Main {

    public static void main(String[]args) {
        int year = 2010;
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            System.out.println("Anul este bisect.");
        }
        else System.out.println("Anul nu este bisect.");
    }
}

