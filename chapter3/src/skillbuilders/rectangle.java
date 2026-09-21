package skillbuilders;

import java.util.Scanner;

public class rectangle 
{

	public static void main(String[] args) 
	{
		//declare variables
		int length;
		int width;
		int area;
		int perimeter;
		
		//create a scanner object
		Scanner input = new Scanner(System.in);
		
		//get the width
		System.out.println("enter a width ");
		
		
		//get the length
		
		//ask the user to enter the width
		System.out.print("enter the width:");
		
		//get the width value from the user
		width = input.nextInt();
		
		//ask the user to enter the length
		System.out.print("enter the length");
		
		//get the length value from the user
		length = input.nextInt();
		
		//display the width and length on the console
		System.out.println("the width is: " + width);
		System.out.print("the length is: " + length);
		
		 
	}

}
