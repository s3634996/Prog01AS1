package com.company;

import java.util.Scanner;

public class EditTicket {
    protected static int pos(){

        boolean equal_Error; // Used for Y or N checking
        boolean sc_Error; // Used for position integer checking

        int pos_int = 0;

        Scanner ch = new Scanner(System.in); // Used for Y or N input

        do{
            sc_Error = false;
            System.out.print("Do you want to change your ticket number? ");
            // Receive input either Y or N from user
            String change = ch.next();

            // Check user input for Y or N
            if(change.equalsIgnoreCase("y")){
                Scanner sc_ch = new Scanner(System.in); // Used for position input
                do{
                    equal_Error = false;

                    System.out.print("Which position do you want to change? (from 1 to 6) ");
                    // Receive position input from user
                    String sc_pos = sc_ch.next();
                    // Try to convert input into integer
                    try {
                        pos_int = Integer.parseInt(sc_pos);
                        if(pos_int < 1 || pos_int > 6){
                            System.out.println("\033[31;1mNumber out of allowed range. Please enter your "+OrdinalConvert.convert(pos_int-1)+" number again.\033[0m");
                            equal_Error = true;
                        }
                        else{
                            equal_Error = false;
                        }
                    } catch (NumberFormatException e){
                        System.out.println("\033[31;1mInvalid Input. Please enter again.\033[0m");
                        equal_Error = true;
                    }
                }while (equal_Error);
                sc_Error = false;
            }
            else if(change.equalsIgnoreCase("n")){
                sc_Error = false;
                break;
            }
            else{
                System.out.println("\033[31;1mInvalid Input. Please enter again.(Y or N) \033[0m");
                sc_Error = true;
            }
        }while (sc_Error);

        return pos_int;
    }

    protected static void update_val(){

    }
}
