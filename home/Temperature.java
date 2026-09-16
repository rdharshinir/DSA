// Problem Statement
// A weather station records the temperature every hour. For each hour, print the lowest temperature recorded from the first hour up to the current hour.

// Input Format
// N
// T1 T2 ... TN

// Output Format
// Print the running minimum.

// Constraints
// 1 ≤ N ≤ 100000
// -10^9 ≤ Ti ≤ 10^9

// Test Cases
// #	Input	                         Output
// 1	5 
//         30 28 31 25 27	       30 28 28 25 25
// 2	5 
//         5 4 3 2 1	                       5 4 3 2 1
// 3	5 
//         1 2 3 4 5	                       1 1 1 1 1
// 4	5 
//         -2 -5 -1 -10 0	               -2 -5 -5 -10 -10
// 5	1 
//        -20	                               -20

package home;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a0 = 0; a0 < t ; a0++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i = 0; i < n ; i++){
                arr[i]  = sc.nextInt();
            }
            int max = arr[0];
            for(int i : arr){
                max = Math.max(max, i);
                System.out.println(max);
            }

        }
        sc.close();
    }
}
