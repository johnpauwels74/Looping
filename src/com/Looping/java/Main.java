package com.Looping.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String hamburgerstring = "1. hamburger";
        String cheeseburgerstring = "2. cheeseburger";
        String baccheeseburgerstring = "3. bacon cheeseburger";
        String mushswissburgerstring = "4. mushroom swiss burger";
        int inputnumber = 0;

        while (inputnumber < 1 || inputnumber > 5) {
            System.out.println("Please enter the number of your selection:");
            System.out.println("" + hamburgerstring);
            System.out.println("" + cheeseburgerstring);
            System.out.println("" + baccheeseburgerstring);
            System.out.println("" + mushswissburgerstring);
            System.out.println("5. Exit");

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            inputnumber = Integer.parseInt(input);

            System.out.println("You have selected:");
            if (inputnumber == 1){
                System.out.println("" + hamburgerstring);
            }
            else if (inputnumber == 2){
                System.out.println("" + cheeseburgerstring);
            }
            else if (inputnumber == 3){
                System.out.println("" + baccheeseburgerstring);
            }
            else if (inputnumber == 4){
                System.out.println("" + mushswissburgerstring);
            }
            else if (inputnumber == 5){
                System.out.println("5. Exit");
            }
            else {
                System.out.println("Invalid entry. Try Again.");
            }
        }
    }
}
