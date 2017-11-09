package com.company;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class EditTicket {
    protected static void setValue(int[] array){
        boolean Error;

        // position checking
        int pos_int = 0;
        Scanner sc_pos = new Scanner(System.in);
        do {
            Error = false; // Set boolean error
            System.out.print("Which position of your ticket you want to change? ");
            String pos = sc_pos.next(); // Position of edited number
            try{
                pos_int = Integer.parseInt(pos);
                if(pos_int < 1 || pos_int > 6){
                    System.out.println( "\033[31;1mIt is not a correct position ticket number. " +
                                        "Please enter again.\033[0m");
                    Error = true;
                }
//                else Error = false;
            }catch (NumberFormatException e){
                System.out.println("\033[31;1mInvalid Input. Please enter again.\033[0m");
                Error = true;
            }

        }while(Error);

        // Value checking
        int val_int = 0;
        Scanner sc_val = new Scanner(System.in);

    }
}
