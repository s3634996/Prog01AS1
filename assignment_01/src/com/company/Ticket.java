package com.company;

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
}
