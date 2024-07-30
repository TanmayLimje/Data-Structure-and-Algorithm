package XOR;

import java.util.Scanner;

public class Main {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;
        int max = 0;

        for(int i = 0; i <= k; i++){
            result = 0;
            for(int j = 0 ; j < n; j++){
                result = result + (i ^ arr[j]);
            }
            max = Math.max(result,max);
        }

        System.out.println("max " + max);
    }
}
