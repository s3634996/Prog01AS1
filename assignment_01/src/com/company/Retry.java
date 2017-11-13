package com.company;

import java.util.Scanner;

public class Retry {
    protected static int ticket_ascend(int buying_ticket){
        boolean retype;
        do{
            retype = false;
            System.out.print("Do you want to buy new ticket? (Y or N) ");
            Scanner re = new Scanner(System.in);
            String user_input = re.next();
            if(user_input.equalsIgnoreCase("y")){
                buying_ticket += 1;
                retype = false;
            }
            else if(user_input.equalsIgnoreCase("n")){
                System.out.println("Thank you for buying our ticket. Best luck to you next time.");
                System.exit(0);
            }
            else{
                System.out.println("Invalid Input. Please enter again.");
                retype = true;
            }
        }while(retype);

        return buying_ticket;
    }
}
