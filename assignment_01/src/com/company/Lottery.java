package com.company;

public class Lottery {
    protected static int[] lottery() throws InterruptedException{
        int[] lottery = new int[6];
        for (int i = 0; i < lottery.length ; i++) {
            lottery[i] = RandNumb.randNumb();
            System.out.print(lottery[i] + " ");
            Thread.sleep(500);
        }
        return lottery;
    }
}