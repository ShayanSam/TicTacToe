package com.Maktab43;

import java.util.Scanner;

public class TicTacToe {
    Scanner input = new Scanner(System.in);
    private String nameOfPlayerX;
    private String nameOfPlayerO;
    Print pObj = new Print();

    private boolean xWinner = false;
    private boolean oWinner = false;
    private int count;


    public void ticTacTocGame() {
        pObj.printMain();
        setNameForX();
        setNameForO();
        pObj.selectPlayer();
        if (pObj.getSelectPlayer().equals(pObj.getX())) {
            while (count <= 9) {
                pObj.getUserChoicesA();
                pObj.initUserChoicesX(pObj.getUserInputA());
                pObj.printMain();
                pObj.indexNumbers.add(pObj.getUserInputA());
                count++;
                if(getNameOfwinner())
                    break;

                pObj.getUserChoicesB();
                pObj.initUserChoicesO(pObj.getUserInputB());
                pObj.printMain();
                count++;
                if(getNameOfwinner())
                    break;
            }
            System.out.println("Finished");

        }
        else if (pObj.getSelectPlayer().equals(pObj.getO())){
            while (count <= 8) {
                pObj.getUserChoicesB();
                pObj.initUserChoicesO(pObj.getUserInputB());
                pObj.printMain();
                pObj.indexNumbers.add(pObj.getUserInputB());
                count++;
                if(getNameOfwinner())
                    break;

                pObj.getUserChoicesA();
                pObj.initUserChoicesX(pObj.getUserInputA());
                pObj.printMain();
                count++;
                if(getNameOfwinner())
                    break;
            }
            System.out.println("Finished");

        }
        }


    public void checkForWinnerX() {
        if (pObj.getNumberOfCR1().equals(pObj.getX()) && pObj.getNumberOfCR2().equals(pObj.getX()) && pObj.getNumberOfCR3().equals(pObj.getX()))
            xWinner = true;
        else if (pObj.getNumberOfCR1().equals(pObj.getX()) && pObj.getNumberOfCR4().equals(pObj.getX()) && pObj.getNumberOfCR7().equals(pObj.getX()))
            xWinner = true;
        else if (pObj.getNumberOfCR7().equals(pObj.getX()) && pObj.getNumberOfCR8().equals(pObj.getX()) && pObj.getNumberOfCR9().equals(pObj.getX()))
            xWinner = true;
        else if (pObj.getNumberOfCR3().equals(pObj.getX()) && pObj.getNumberOfCR6().equals(pObj.getX()) && pObj.getNumberOfCR9().equals(pObj.getX()))
            xWinner = true;
        else if (pObj.getNumberOfCR1().equals(pObj.getX()) && pObj.getNumberOfCR5().equals(pObj.getX()) && pObj.getNumberOfCR9().equals(pObj.getX()))
            xWinner = true;
        else if (pObj.getNumberOfCR3().equals(pObj.getX()) && pObj.getNumberOfCR5().equals(pObj.getX()) && pObj.getNumberOfCR7().equals(pObj.getX()))
            xWinner = true;
        else if (pObj.getNumberOfCR2().equals(pObj.getX()) && pObj.getNumberOfCR5().equals(pObj.getX()) && pObj.getNumberOfCR8().equals(pObj.getX()))
            xWinner = true;
        else if (pObj.getNumberOfCR4().equals(pObj.getX()) && pObj.getNumberOfCR5().equals(pObj.getX()) && pObj.getNumberOfCR6().equals(pObj.getX()))
            xWinner = true;

    }

    public void checkForWinnerO() {
        if (pObj.getNumberOfCR1().equals(pObj.getO()) && pObj.getNumberOfCR2().equals(pObj.getO()) && pObj.getNumberOfCR3().equals(pObj.getO()))
            oWinner = true;
        else if (pObj.getNumberOfCR1().equals(pObj.getO()) && pObj.getNumberOfCR4().equals(pObj.getO()) && pObj.getNumberOfCR7().equals(pObj.getO()))
            oWinner = true;
        else if (pObj.getNumberOfCR7().equals(pObj.getO()) && pObj.getNumberOfCR8().equals(pObj.getO()) && pObj.getNumberOfCR9().equals(pObj.getO()))
            oWinner = true;
        else if (pObj.getNumberOfCR3().equals(pObj.getO()) && pObj.getNumberOfCR6().equals(pObj.getO()) && pObj.getNumberOfCR9().equals(pObj.getO()))
            oWinner = true;
        else if (pObj.getNumberOfCR1().equals(pObj.getO()) && pObj.getNumberOfCR5().equals(pObj.getO()) && pObj.getNumberOfCR9().equals(pObj.getO()))
            oWinner = true;
        else if (pObj.getNumberOfCR3().equals(pObj.getO()) && pObj.getNumberOfCR5().equals(pObj.getO()) && pObj.getNumberOfCR7().equals(pObj.getO()))
            oWinner = true;
        else if (pObj.getNumberOfCR2().equals(pObj.getO()) && pObj.getNumberOfCR5().equals(pObj.getO()) && pObj.getNumberOfCR8().equals(pObj.getO()))
            oWinner = true;
        else if (pObj.getNumberOfCR4().equals(pObj.getO()) && pObj.getNumberOfCR5().equals(pObj.getO()) && pObj.getNumberOfCR6().equals(pObj.getO()))
            oWinner = true;


    }
    public void setNameForX(){
        System.out.println("Enter name for player X: ");
        while (true) {
            nameOfPlayerX = input.nextLine();
            if(nameOfPlayerX.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$"))
                break;
            else
                System.out.println("Invalid name!");
        }
    }
    public void setNameForO(){
        System.out.println("Enter name for player O: ");
        while(true) {
            nameOfPlayerO = input.nextLine();
            if(nameOfPlayerO.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$"))
                break;
            else
            System.out.println("Invalid name!");

        }
    }

    public String getNameOfPlayerX() {
        return nameOfPlayerX;
    }

    public String getNameOfPlayerO() {
        return nameOfPlayerO;
    }

    public boolean findWinner() {
        checkForWinnerO();
        checkForWinnerX();
        return xWinner | oWinner;
    }

    public boolean getNameOfwinner() {
        if (findWinner() && xWinner) {
            System.out.println(getNameOfPlayerX()+" "+"won!");
            return true;
        }
        if (findWinner() && oWinner) {
            System.out.println(getNameOfPlayerO()+" "+"won!");
            return true;
        }
        if (!findWinner() && count==9) {
            System.out.println("Draw!");
            return true;
        }
        return false;
        }

        public static void startTicTacToe(){
        Scanner input = new Scanner(System.in);
        while (true) {
            TicTacToe T = new TicTacToe();
            T.ticTacTocGame();
            System.out.println("Enter any key to continue or press N to quit");
            String userAnswer = input.nextLine().toUpperCase();
            if(userAnswer.equals("N"))
                break; }
        }

    }










