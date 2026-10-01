import java.util.*;
import java.lang.*;
import java.io.*;


interface Shape{
    public void Area();
    public void Volume();
    public void Perimeter();
}
class Rectangle implements Shape{
    int l,b, h;
    Rectangle(int l , int b, int h){
        this.l = l ;
        this.b = b;
        this.h = h ;
    }
    public void Area(){
        System.out.println("Area of the Rectangel"+ l* b);
    }
    public void Volume(){
        System.out.println("Volume of the Rectangle" + l * b * h);
    }
    public void Perimeter(){
        System.out.println("Perimeter of the Rectangle"+ 2 * ( l + b));
    }
} 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Rectangle obj = new Rectangle(3, 4, 5);
		obj.Area();

	}
}
