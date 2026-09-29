import java.util.Scanner;

public class Cumulative_Sales {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n ; i++){
		    nums[i] = sc.nextInt();
		}
        int currsum = 0;
        for(int x : nums){
            currsum += x;
            System.out.println(currsum);
        }
    }
}
