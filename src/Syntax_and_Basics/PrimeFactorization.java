package Syntax_and_Basics;

public class PrimeFactorization {
    public static void main(String args[])throws Exception{
        var ob = new readInt();
        var ob2 = new primeORnotREC();
        var ob3 = new PrimeFactorization();
        var show = new display();

        int L[][];
        int p = ob.readInteger("Enter a Number");
        if(!ob2.primeORnot(p)){
            L = ob3.FactorsOfNumber(p);
            show.list(L[0], L[0].length, "PrimesUnder("+p+")");
            show.list(L[1], L[1].length, "Factors("+p+")");
        }else{
            System.out.println(p+" is a Prime Number...!");
        }
    }

    int[][] FactorsOfNumber(int n){
        var ob = new primeORnotREC();
        int facts[],primes[],temp[];
        int pf[][] = new int[2][];
        int i,j,x,y;

        j = 0;
        temp = new int[n-1];
        for(i=n-1; i>1; i--){
            if(ob.primeORnot(i)){
                temp[j] = i;
                j++;
            }
        }

        x = j;
        primes = new int[x];
        for(i=0; i<x; i++){
            primes[i] = temp[i];
        }

        j=0;
        for(i=0; i<x; i++){
            if(n%primes[i] == 0){
                temp[j] = primes[i];
                j++;
            }
        }

        y = j;
        facts = new int[y];
        for(i=0; i<y; i++){
            facts[i] = temp[i];
        }

        pf[0] = primes;
        pf[1] = facts;

        return pf;
    }
}
