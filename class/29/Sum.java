import java.util.*;
import java.lang.*;
import java.io.*;

class Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// input 256 + 72
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] words = s.trim().split("\\s+");
		int num1 = Integer.parseInt(words[0]);
		int num2 = Integer.parseInt(words[2]);
		
		if(words[1].equals("+")){
		    System.out.println(num1+num2);
		}
		else if( words[1].equals("-")){
		    System.out.println(num1 - num2);
		    
		}
		else if(words[1].equals("*")){
		    System.out.println(num1 * num2);
		}
        else if(words[1].equals("/")){
            System.out.println("Q=" + num1 / num2 + "R=" + num1 % num2);
        }
        else{
            System.out.println("Invalid ");
        }

	}
}
