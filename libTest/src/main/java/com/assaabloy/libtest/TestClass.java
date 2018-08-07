package com.assaabloy.libtest;

import java.util.Scanner;

public class TestClass {

    Scanner scanner = new Scanner(System.in);

    void start(){
        printStars();
        printStartNice();
        printStartVeryNice();
        print(getlettersFromKeyboard());
    }

    void printStars(){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }

    void printStartNice(){
        print("*");
        print("**");
        print("***");
        print("****");
        print("*****");
    }

    void printStartVeryNice(){
        for(int i=0; i<5; i++){

            String starts = "*";
            for (int j=0; j<i; j++){
                starts = starts + "*";
            }

            print(starts);
        }
    }

    void print(String str){
        System.out.println(str);
    }

    String getlettersFromKeyboard(){
        String letter = scanner.next();
        return letter;
    }

}
