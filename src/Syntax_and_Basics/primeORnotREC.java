package Syntax_and_Basics;

public class primeORnotREC {
    public static void main(String args[])throws Exception{
        var ob = new readInt();
        var ob2 = new primeORnotREC();
        boolean x;
        int p = ob.readInteger("Enter a Number");

        x = ob2.primeORnot(p);
        System.out.println(x);

        if(x) System.out.println(p+" is a Prime Number...!");
        else System.out.println(p+" is Not A Prime Number...!");
    }

    boolean primeORnot(int p){
        var ob = new display();
        if(p == 2) return true;

        else if(p > 2){
            int n,i,j,L[];
            n = (int) Math.ceil(Math.sqrt(p));
            System.out.println("n = "+n);
            L = new int[n-1];

            j = 0;
            for(i=n; i>1; i--){
                if(primeORnot(i)){
                    L[j] = i;
                    j++;
                }
            }

            ob.list(L, n-1);

            for(i=0; i<j; i++){
                System.out.println("p, L[i], p/L[i]: "+p+", "+L[i]+", "+p/L[i]);
                if(p % L[i] == 0){
                    return false;
                }
            }

            return true;
        }

        else return false;
    }
}
