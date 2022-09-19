package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String computer_play = "";
        String person_play;
        int computerInt;

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("let's play Rock, Paper, Scissors!\n Rock = R \n Paper = P \n Scissors = S");


        computerInt = rnd.nextInt(1,4);
        if (computerInt==1)
            computer_play = "R";
        else if (computerInt==2)
            computer_play = "P";
        else if (computerInt==3)
            computer_play = "S";

        System.out.println("Enter your play: ");
        person_play = sc.next();
        person_play = person_play.toUpperCase();

        System.out.println("Computer play is: "+ computer_play);


        if (person_play.equals(computer_play)){
            System.out.println("tie");
        }
        else if (person_play.equals("P")){
            if (computer_play.equals("R")){
                System.out.println("you win");
            }
            else if (computer_play.equals("S")){
                System.out.println("you lose");
            }
        }
        else if (person_play.equals("S")){
            if (computer_play.equals("P")) {
                System.out.println("you win");
            }
            else if (computer_play.equals("R")) {
                System.out.println("you lose");
            }
        }
        else if (person_play.equals("R")){
            if (computer_play.equals("P")){
                System.out.println("you lose ");
            }
            else if (computer_play.equals("S")){
                System.out.println("you win");
            }
        }
        else
            System.out.println("invalid user input");
        System.out.println();

        int b = 4;


    }
}