package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInfo {
    // Get user information
    protected static String[] userInfo(){
        Scanner sc = new Scanner(System.in);
        List<String> info = new ArrayList<String>();

        System.out.print("What's your name? ");
        String name = sc.nextLine();
        info.add(name);

        System.out.print("What's your address? ");
        String address = sc.nextLine();
        info.add(address);

        System.out.print("How old are you? ");
        String age = sc.next();

        int value_int = 0;
        while(true){
            try{
                value_int = Integer.parseInt(age);
                if(value_int >= 18) {
                    String s_age = Integer.toString(value_int);
                    info.add(s_age);

                    // Convert into an String array
                    String[] infoArray = new String[info.size()];
                    infoArray = info.toArray(infoArray);
                    return infoArray;
                }
                else{
                    System.out.println("You are not old enough to do lottery.");
                    System.exit(0);
                }
            }catch(NumberFormatException e){
                System.out.println("Invalid input. Please try again!");
            }
        }
    }
}