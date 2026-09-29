// Problem Statement
// Create a 1-D array to store a set of exam scores. Write a program to perform the following operations:
// 1.	Display the scores in rows of four scores per row. 
// 2.	Calculate and display the average score. 
// 3.	Find and display the lowest score. 
// 4.	Find and display the highest score. 
// 5.	Calculate the deviation of each score from the average and display the score along with its deviation. 
// 6.	Calculate and display the standard deviation. 
// 7.	Count and display how many scores are within one standard deviation of the average. 
import java.util.Scanner;
public class Day01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String line = sc.nextLine().strip();
        // Scanner linescanner = new Scanner(line); 
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total_score = 0;
        for( int a0 = 0; a0 < n ; a0++){
            arr[a0] = sc.nextInt();
            total_score += arr[a0];
        }
        
        int min = arr[0];
        int max = arr[0];
        for( int i = 0; i < arr.length; i++){
            if((i+1) % 4 ==0){
                System.out.println();
            }
            System.out.print(arr[i]+" ");
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int average = total_score / arr.length;
        System.out.println(min);
        System.out.println(max);
        int tot_deviation = 0;
        //Deviation
        for(int num : arr){
            tot_deviation += (num - average) ;
            System.out.println(num +"Deviation"+ (num - average ));
            

        }
        // standard deviation 
        int std = tot_deviation / n ;
        System.out.println("Standard Deviation :" + std);

        for( int num : arr){
            if ( (average -std) <= num   && num <= (average + std)){
                System.out.println("Scores within one standard deviation"+num);
            }
        }
    }
}