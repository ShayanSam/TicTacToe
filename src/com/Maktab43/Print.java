package com.Maktab43;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print {

    Scanner input = new Scanner(System.in);
    private String selectPlayer;
    private int userInputA;
    private int userInputB;
    private final String X = "X";
    private final String O = "O";
    private String numberOfCR1 = "-";private String numberOfCR2 = "-";private String numberOfCR3 = "-";
    private String numberOfCR4 = "-";private String numberOfCR5 = "-";private String numberOfCR6 = "-";
    private String numberOfCR7 = "-";private String numberOfCR8 = "-";private String numberOfCR9 = "-";
    List<Integer> indexNumbers = new ArrayList<>();

    public void printMain() {
        System.out.println();
        System.out.println("*************************************************************************************");
        System.out.println(numberOfCR1 + "+" + numberOfCR2 + "+" + numberOfCR3 + "          " + "-1-" + " " + "-2-" + " " + "-3-");
        System.out.println(numberOfCR4 + "+" + numberOfCR5 + "+" + numberOfCR6 + "          " + "-4-" + " " + "-5-" + " " + "-6-");
        System.out.println(numberOfCR7 + "+" + numberOfCR8 + "+" + numberOfCR9 + "          " + "-7-" + " " + "-8-" + " " + "-9-");
        System.out.println("*************************************************************************************");
        System.out.println();
    }

    public void selectPlayer() {
        System.out.println("select player: X or O ");
        while (true) {
            selectPlayer = input.nextLine().toUpperCase();
            if (selectPlayer.equals("X") | selectPlayer.equals("O"))
                break;
            else
                System.out.println("Invalid input!");

        }

    }


    public void getUserChoicesA(){
        System.out.println("-------------------------------------");
        System.out.println("Pick a number for X: ");
        while (true) {
            userInputA = input.nextInt();
            if(userInputA<=0 | userInputA >9 | indexNumbers.contains(userInputA) )
                System.out.println("Invalid/Used number!");
            else
                break;
        }
    }
    public void getUserChoicesB(){
        System.out.println("-------------------------------------");
        System.out.println("Pick a number For O: ");
        while (true) {
            userInputB = input.nextInt();
            if(userInputB<=0 | userInputB >9 | indexNumbers.contains(userInputB) )
                System.out.println("Invalid/Used number!");
            else
                break;

        }

    }
    public void initUserChoicesX(int choice){
        switch (choice) {
            case 1:
                numberOfCR1 = X;
                break;
            case 2:
                numberOfCR2 = X;
                break;
            case 3:
                numberOfCR3 = X;
                break;
            case 4:
                numberOfCR4 = X;
                break;
            case 5:
                numberOfCR5 = X;
                break;
            case 6:
                numberOfCR6 = X;
                break;
            case 7:
                numberOfCR7 = X;
                break;
            case 8:
                numberOfCR8 = X;
                break;
            case 9:
                numberOfCR9 = X;
                break;

        }

    }
    public void initUserChoicesO(int choice){
        switch (choice) {
            case 1:
                numberOfCR1 = O;
                break;
            case 2:
                numberOfCR2 = O;
                break;
            case 3:
                numberOfCR3 = O;
                break;
            case 4:
                numberOfCR4 = O;
                break;
            case 5:
                numberOfCR5 = O;
                break;
            case 6:
                numberOfCR6 = O;
                break;
            case 7:
                numberOfCR7 = O;
                break;
            case 8:
                numberOfCR8 = O;
                break;
            case 9:
                numberOfCR9 = O;
                break;
        }

    }


    public String getSelectPlayer() {
        return selectPlayer;
    }

    public int getUserInputA() {
        return userInputA;
    }
    public int getUserInputB() {
        return userInputB;
    }


    public String getX() {
        return X;
    }

    public String getNumberOfCR1() {
        return numberOfCR1;
    }

    public String getNumberOfCR2() {
        return numberOfCR2;
    }

    public String getNumberOfCR3() {
        return numberOfCR3;
    }

    public String getNumberOfCR4() {
        return numberOfCR4;
    }

    public String getNumberOfCR5() {
        return numberOfCR5;
    }

    public String getNumberOfCR6() {
        return numberOfCR6;
    }

    public String getNumberOfCR7() {
        return numberOfCR7;
    }

    public String getNumberOfCR8() {
        return numberOfCR8;
    }

    public String getNumberOfCR9() {
        return numberOfCR9;
    }

    public String getO() {
        return O;
    }
}
