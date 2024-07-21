package Fibonacci;

public class Fibonacci {

    static int counter1 = 0;
    static int counter2 = 0;
    static int counter3 = 0;

    static Integer[] memo = new Integer[100];

    // 2^n
    public static long fib(int n){
        counter1++;
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    //2n-1 ==> 2n ==> n
    public static int Fib(int n){

        counter2++;
        if(memo[n] != null){
            return memo[n];
        }

        if(n==0 || n==1){
            return n;
        }
        memo[n] = Fib(n-1) + Fib(n-2);

        return memo[n];
    }

    //n-1 ==> n
    public static int fIB(int n){
        int [] fibList = new int[n+1];
        fibList[0] = 0;
        fibList[1] = 1;

        for(int index = 2; index <= n; index++){
            counter3++;
            fibList[index] = fibList[index-1] + fibList[index-2];
        }

        return fibList[n];
    }

    public static void main(String[] arg){
        int n = 40;
        System.out.println("Fib of " + n + " is = " );
        System.out.println("\n2^n ==> " + fib(n) + ", Counter = " + counter1);
        System.out.println("2n-1 ==> " + Fib(n) + ", Counter = " + counter2);
        System.out.println("n-1 ==> " + fIB(n) + ", Counter = " + counter3);

    }
}
