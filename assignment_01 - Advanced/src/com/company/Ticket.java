package com.company;

import java.util.Scanner;

public class Ticket {
    protected static int[] ticket() throws InterruptedException{
        int[] ticket = new int[6];
        for (int i = 0; i < ticket.length ; i++) {
            ticket[i] = RandNumb.randNumb();
            System.out.print(ticket[i] + " ");
            Thread.sleep(500);
        }
        return ticket;
    }
    protected static int[] advanced_ticket(){
        int[] advanced_ticket = new int[6];
        for (int i = 0; i < advanced_ticket.length ; i++) {
            Scanner sc = new Scanner(System.in);
            String user_input = sc.next();
            int value_int = 0;
            try {
                value_int = Integer.parseInt(user_input);

            }
            catch (NumberFormatException e){
                System.out.println("Invalid Input. Please enter again.");
            }
        }


        return advanced_ticket;
    }
}
