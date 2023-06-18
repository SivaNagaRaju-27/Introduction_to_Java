package Syntax_and_Basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class read {
    int readInt(String str) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int x;
        
        System.out.print(str + ": ");
        x = Integer.parseInt(br.readLine());
        return x;
    }

    double readDouble(String str) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        double x;
        
        System.out.print(str + ": ");
        x = Double.parseDouble(br.readLine());
        return x;
    }

    int readRandom() throws Exception {
        Random rd = new Random();
        return rd.nextInt(100);
    }
}
