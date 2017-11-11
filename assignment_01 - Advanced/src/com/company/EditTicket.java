package com.company;

import java.util.Scanner;

public class EditTicket {
    protected static int pos(){

        boolean equal_Error;
        boolean sc_Error;

        Scanner ch = new Scanner(System.in);

        System.out.print("Do you want to change your ticket number? ");

        do{
            sc_Error = false;
            String change = ch.next();

            if(change.equalsIgnoreCase("y")){
                int pos_int = 0;
                Scanner sc_ch = new Scanner(System.in);
                do{
                    equal_Error = false;

                    System.out.print("Which position do you want to change? (from 1 to 6) ");
                    String sc_pos = sc_ch.next();

                    try {
                        pos_int = Integer.parseInt(sc_pos);
                        if(pos_int < 1 || pos_int > 6){
                            System.out.println("\033[31;1mNumber out of allowed range. Please enter your "+OrdinalConvert.convert(pos_int-1)+" number again.\033[0m");
                            equal_Error = true;
                        }
                        else{
                            equal_Error = false;
                            return pos_int;
                        }
                    } catch (NumberFormatException e){
                        System.out.print("\033[31;1mInvalid Input. Please enter again.(Y or N) \033[0m");
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
                System.out.printf("\033[31;1mInvalid Input. Please enter again.\033[0m");
                sc_Error = true;
            }
        }while (sc_Error);
    }
}
