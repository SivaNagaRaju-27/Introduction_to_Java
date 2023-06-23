package Syntax_and_Basics;

public class primeORnotREC {
    public static void main(String args[])throws Exception{
        var ob = new readInt();
        var ob2 = new primeORnotREC();

        int p = ob.readInteger("Enter a Number");

        if(ob2.primeORnot(p)) System.out.println(p+" is a Prime Number...!");
        else System.out.println(p+" is Not A Prime Number...!");
    }

    boolean primeORnot(int p){
        if(p == 2) return true;

        else if(p > 2){
            int n,i,j,L[];

            n = (int) Math.ceil(Math.sqrt(p));
            L = new int[n-1];

            j = 0;
            for(i=n; i>1; i--){
                if(primeORnot(i)){
                    L[j] = i;
                    j++;
                }
            }

            for(i=0; i<j; i++){
                if(p % L[i] == 0){
                    return false;
                }
            }
            return true;
        }

        else return false;
    }
}
