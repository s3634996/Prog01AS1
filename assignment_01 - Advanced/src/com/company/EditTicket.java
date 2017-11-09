package com.company;

import java.util.Scanner;

public class EditTicket {
    protected static void setValue(int[] array, int val){
        boolean Error;
        int pos_int = 0;
        Scanner sc_pos = new Scanner(System.in);
        do {
            Error = false; // Set boolean error
            String pos = sc_pos.next(); // Position of edited number
            try{
                pos_int = Integer.parseInt(pos);
                if(pos_int < 1 || pos_int > 6){
                    System.out.println("\033[31;1mIt is not a correct position ticket number. Please enter again\033[0m");
                    Error = true;
                }
                else Error = false;
            }catch (NumberFormatException e){
                System.out.println("Invalid Input. Please enter again.");
                Error = true;
            }

        }while(Error);


    }
}
