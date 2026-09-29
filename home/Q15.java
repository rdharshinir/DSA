
// Q15:
// Given two integer arrays of the same length, arr[] and index[], the task is to reorder the elements in arr[] such that after reordering, each element from arr[i] moves to the position index[i]. The new arrangement reflects the values being placed at their target indices, as described by index[] array.
// Example: 
// Input: arr[] = [10, 11, 12], index[] = [1, 0, 2]
// Output: 11 10 12
// Explanation: 10 moves to position 1, 11 to 0, and 12 stays at 2.
// Input: arr[] = [1, 2, 3, 4], index[] = [3, 2, 0, 1]
// Output: 3 4 2 1
// Explanation: 1 moves to 3, 2 to 2, 3 to 0, 4 to 1.
// Input: arr[] = [50, 40, 70, 60, 90], index[] = [3,  0,  4,  1,  2]
// Output: 40 60 90 50 70
import java.util.Scanner;

public class Q15 {

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ind = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            ind[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            while(ind[i] != i){
                int tar = ind[i];
                swap(arr, i, tar);
                swap(ind, i , tar);
            }
        }
        

    }
}
