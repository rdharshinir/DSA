import java.util.*;
import java.lang.*;
import java.io.*;

class Pairsum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i< n ; i++){
		    arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int left = 0;
		int right = n - 1;
		int mindis = Integer.MAX_VALUE;
		int sum = 0;
		int diff = 0;
		int px = 0;
		int py = 0;
		while ( left < right){
		    sum = arr[left] + arr[right];
		    diff = Math.abs(target - sum);
		    
		    if(sum > target){
		        right--;
		    }
		    else{
		        left++;
		    }
		    if(diff < mindis){
		        mindis = diff;
		        px = arr[left] ; 
		        py = arr[right];
		    }
		}
		System.out.println(px+ " " +py);

	}
}
