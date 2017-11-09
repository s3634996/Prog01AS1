package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        // Customer Ticket
        System.out.println("This will be your ticket for today.");
        int[] ticket = Ticket.ticket();
        Arrays.sort(ticket);

        // Display ticket
        System.out.println("This is your final ticket number");
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i]+" ");
            Thread.sleep(500);
        }
        System.out.println();

        // Lottery number
        System.out.println("This is our number for today.");
        int[] lottery = Lottery.lottery();
        System.out.println();
        Arrays.sort(lottery);

        // Comparing
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
