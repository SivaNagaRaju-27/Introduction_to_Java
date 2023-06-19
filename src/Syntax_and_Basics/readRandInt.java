package Syntax_and_Basics;

import java.util.Random;

public class readRandInt {
    public int readRandom() throws Exception {
        Random rd = new Random();
        return rd.nextInt(100);
    }
}
