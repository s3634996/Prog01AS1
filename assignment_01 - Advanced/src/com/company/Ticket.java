package com.company;

import java.util.Scanner;

public class Ticket {
    protected static int[] ticket(){
//        int[] ticket = new int[6];
//        for (int i = 0; i < ticket.length ; i++) {
//            ticket[i] = RandNumb.randNumb();
//            System.out.print(ticket[i] + " ");
//            Thread.sleep(500);
//        }
        int[] ticket = new int[6];
        int value_int = 0;
        for (int i = 0; i < ticket.length ; i++) {
            Scanner sc = new Scanner(System.in);
            boolean Error;
            do {
                Error =false;
                System.out.print("Please enter "+ OrdinalConvert.convert(i) +" number for your ticket (from 0 to 45): ");
                String IntInput = sc.next();
                try {
                    value_int = Integer.parseInt(IntInput);
                    if(value_int< 0 || value_int >45){
                        System.out.println("Number out of allowed range. Please enter your "+OrdinalConvert.convert(i)+" number again.");
                        Error = true;
                    }
                    else {
                        ticket[i] = value_int;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input. Please enter again.");
                    Error = true;
                }
            } while(Error);
        }
        return ticket;
    }
}
