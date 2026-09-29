// First and Last Occurrence
// Problem Statement
// Given an array and a target value X, find the first and last position where X occurs.
// Positions are 0-based.
// If the target does not occur, print -1 -1.
// Input Format
// N X
// A1 A2 ... AN
// Output Format
// first_position last_position

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Day03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<Integer> first = new ArrayList<>();
        int[] arr = new int[n];
        int i =0;
        for(int a0 = 0; a0< n ; a0++){
            int a = sc.nextInt();
            if( a == x){
                first.add(i);
            }
            i++;
            arr[0] = sc.nextInt();
        }
        
        System.out.println(Collections.min(first));
        System.out.println(Collections.max(first));

        int left = 0;
        int right = n - 1;
        int fs = -1;
        int ls = -1;
        while ( left < -1 &&  right > -1){
            if(arr[left] == x){
                fs = left;
            }
            else{
                left++;
            }
            if(arr[right] == x){
                ls = right ; 
            }
            else{
                right--;
            }
            if(fs != - 1 && ls != -1){
                break;
            }
        }
    }
}