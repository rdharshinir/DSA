import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (sc.hasNextInt()) {
            int current = sc.nextInt();
            if (!sc.hasNextInt()) {
                int ele = current;
                
                Iterator<Integer> it = arr.iterator();
                while(it.hasNext()) {
                    if (it.next() == ele) {
                        it.remove();
                        break; 
                    }
                }
                
                break; 
            } else {
                arr.add(current);
            }
        }
        
        for(int i : arr){
            System.out.println(i);
        }
  

	}
}
