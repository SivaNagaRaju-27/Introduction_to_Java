package Syntax_and_Basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class readInt {
    public int readInteger(String str) throws Exception{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int x;
        
        System.out.print(str + ": ");
        x = Integer.parseInt(br.readLine());
        return x;
    }
}
