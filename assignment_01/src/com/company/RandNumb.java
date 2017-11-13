package com.company;

import java.util.Random;

public class RandNumb {
    protected static int randNumb(){
        Random rand = new Random(); // Declare random variable
        return rand.nextInt(46);
    }
}
