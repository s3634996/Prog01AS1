package number;

import java.util.Random;

public class RandNumb {
    public static int randNumb(){
        Random rand = new Random(); // Declare random variable
        return rand.nextInt(46);
    }
}
