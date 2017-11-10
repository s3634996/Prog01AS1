package com.company;

import java.util.Scanner;

public class EditTicket {
    protected static int setPos(){
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
        return pos_int;
    }

    protected static int setVal(int[] array){
        int pos_int = setPos();
        // Value checking
        boolean Error;
        int val_int = 0;
        Scanner sc_val = new Scanner(System.in);
        do{
            Error = false;
            System.out.println("Please enter value for your changing number (from 0 to 45): ");
            String val = sc_val.next();
            try{
                val_int = Integer.parseInt(val);
                if(val_int< 0 || val_int >45){
                    System.out.println("\033[31;1mNumber out of allowed range. Please enter your "+OrdinalConvert.convert(pos_int-1)+" number again.\033[0m");
                    Error = true;
                }
//                else
//                    array[pos_int] = val_int;

            }catch (NumberFormatException e){
                System.out.println("\033[31;1mInvalid Input. Please enter again.\033[0m");
                Error = true;
            }
        }while (Error);

        return array[pos_int] = val_int;
    }
}
