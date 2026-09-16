// Problem:
// After reading each element, print the maximum value seen so far.

// Input:
// 2 5 1 8 3

// output:
// 2 5 5 8 8

import java.util.ArrayList;
import java.util.Scanner;

public class Maxelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().strip();
        Scanner linesScanner = new Scanner(line);
        ArrayList<Integer> arr = new ArrayList<>();
        while (linesScanner.hasNextInt()) {
            arr.add(linesScanner.nextInt());
        }

        int max = arr.get(0);
        for( int n : arr){
            max = Math.max(max, n);
            System.out.println(max);
        }
        sc.close();
        linesScanner.close();
    }
}
