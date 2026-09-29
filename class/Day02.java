
// Problem: Placement Cutoff Count
// A placement test is conducted for N candidates. Each candidate receives a score. A company has set a minimum cutoff score of C.
// Your task is to count how many candidates scored at least C.
// Note: A score exactly equal to C is also considered qualified.
// Input Format
// •	The first line contains two integers N and C. 
// •	The second line contains N integers representing the candidates' scores. 
// Output Format
// Print a single integer representing the number of candidates who scored at least C.
import java.util.Scanner;
public class Day02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score = sc.nextInt();
        int[] arr = new int[n];
        for(int a0 =0; a0 < n ; a0++){
            arr[a0] = sc.nextInt();
        }
        int count = 0;
        for(int num : arr){
            if(num >= score){
                count++;
            }
        }
        System.out.println(count);

    }
}
