package com.company;

import number.OrdinalConvert;
import user.input.Retry;
import user.input.Ticket;
import user.input.UserInfo;

import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        // Customer Info
        // Display basic user information
        String[] final_info = UserInfo.userInfo();
        System.out.println("\033[31;1mYour name is "+final_info[0]);
        System.out.println("Your address is "+final_info[1]);
        System.out.println("You are "+final_info[2]+ " years old.\033[0m");
        System.out.println("You are eligible to do the lottery. You will begin to choose number shortly.");

        int buying_ticket = 1;
        boolean retry;
        do{
            retry = true;
            // Customer ticket
            System.out.println("This will be your "+ OrdinalConvert.convert(buying_ticket-1)+" ticket for today.");
            int[] ticket = Ticket.ticket();


            // Display ticket
            System.out.println("This is your final ticket number");
            for (int i = 0; i < ticket.length; i++) {
                System.out.print(ticket[i]+" ");
                Thread.sleep(500);
            }
            System.out.println();
            Arrays.sort(ticket);


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


            // Whether user wants to buy ticket
            // Increase buying_ticket by 1 if user enter Y
            // By enter N, program will exit with code 0
            buying_ticket = Retry.ticket_ascend(buying_ticket);

        }while (retry);

    }

}
