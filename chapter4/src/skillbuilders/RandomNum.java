/*

Program: RandomNum.java          Last Date of this Revision: September 21, sept

Purpose: An application that chooses a random number between the users given numbers.


 

*/


package skillbuilders;

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) 
	{
		//declare the min and max variables
		int min, max;
		
		//introduce the scanner class
		Scanner input = new Scanner(System.in);
		
		//ask for min number
		System.out.println("enter the min number");
		
		//record min number
		min = input.nextInt();
		
		//ask for max number
		System.out.println("enter the max number");
				
		//record max number
		max = input.nextInt();
		
		System.out.println("random number: "
				+(int)((max - min + 1) * Math.random()
				+min));
									//0.0 - 1.0
				
				
		
		//
		

	}

}


/*screen dump
enter the min number
1
enter the max number
67
random number: 62


enter the min number
13123
enter the max number
11221313
random number: 7167038









*/