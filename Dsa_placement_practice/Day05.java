// Print All Pairs
// Problem Statement
// Given N elements, print every possible ordered pair (Ai, Aj) where i < j.
// Input Format
// N
// A1 A2 ... AN
// Output Format
// Print each pair on a separate line.

import java.util.Scanner;

public class Day05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int a0 =0 ; a0< n ; a0 ++){
            arr[a0] = sc.nextInt();
        }
        for(int i = 0; i < n ; i++){
            for(int j = i+1; j < n ; j++){
                System.out.print(arr[i]+arr[j]);
            }
        }

    }
}