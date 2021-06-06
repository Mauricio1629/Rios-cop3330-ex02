/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex02;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String input = myApp.readName();
        int length = myApp.getLength(input);
        String outputString = myApp.generateOutputString(input, length);
        myApp.printOutput(outputString);
    }

    public String readName() {
        System.out.print("What is the input string? ");
        return in.nextLine();
    }

    public int getLength(String input) {
        return input.length();
    }

    public String generateOutputString(String input, int length) {
        return input+" has "+length+" characters.";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }




}
