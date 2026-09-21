// Problem Statement
// A college stores a student's ID as a string. Reverse the ID without changing the characters.
// Input Format
// A single string S
// Output Format
// Print the reversed string.

import java.util.Scanner;

public class Day04{
    private void swap(int[] arr, char a , char b ){
        char t = a ;
        b = a;
        b = t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // StringBuffer res = new StringBuffer();
        // for( char ch : s.toCharArray()){
        //     res = ch + res; 
        // }
        // System.out.println(res);
        int right = s.length() - 1;
        int left = 0;
        int[] arr = s.tocharArray();
        while (left < right){
            swap(arr, left, right);
        }
        System.out.println(arr);

    }
}