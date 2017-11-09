package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        System.out.println("This is our number for today.");
        int[] lottery = Lottery.lottery();
        System.out.println();
        Arrays.sort(lottery);

        int[] user_input = new int[6];
        int value_int = 0;
        for (int i = 0; i < user_input.length ; i++) {
            Scanner sc = new Scanner(System.in);
            boolean Error=false;
            do {
                Error =false;
                System.out.print("Please enter number of your ticket (from 0 to 45): ");
                String IntInput = sc.next();
                try {
                    value_int = Integer.parseInt(IntInput);
                    if(value_int< 0 || value_int >45){
                        System.out.println("ABC");
                        Error = true;
                    }
                    else {
                        user_input[i] = value_int;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input. Please enter again.");
                    Error = true;
                }
            } while(Error);
        }
        System.out.println(user_input[5]);

        System.out.println("This is number on your ticket.");
        int[] ticket = Ticket.ticket();
        System.out.println();
        Arrays.sort(ticket);

        if(Arrays.equals(lottery, ticket))
            System.out.println("You are the winner.");
        else
            System.out.println("You do not win this time. Please try again.");
//        System.out.println();

//        System.out.println(userInput()); // Output will be a string
//        System.out.println("This is your information. You will be protected by the laws.");

        // Display basic user information
//        String[] final_info = UserInfo.userInfo();
//        System.out.println("\033[31;1mYour name is "+final_info[0]);
//        System.out.println("Your address is "+final_info[1]);
//        System.out.println("You are "+final_info[2]+ " years old.\033[0m");

        System.out.println("You are eligible to do the lottery. You will begin to choose number shortly.");


    }

    // Random an 6 digits numbers


    // Get user input and check if it is integer or not
    // buying process will have to be random
    // random from the ticket need to be the same from lottery regardless the order


}
