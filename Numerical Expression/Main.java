package expression;

import java.util.Scanner;

public class Main {
    public static void main(String [] arg){

        Scanner sc = new Scanner(System.in);
        String exp  = "2+3*4/3-2";

        Solution sol = new Solution(exp);
        System.out.println("ans " + sol.solve());
    }

}
