package com.company;

import java.util.Random;

// New change to check git

public class RandNumb {
    protected static int randNumb(){
        Random rand = new Random(); // Declare random variable
        return rand.nextInt(46);
    }
}
