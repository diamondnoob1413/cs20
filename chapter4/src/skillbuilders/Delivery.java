package skillbuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) 
	
	{
		
		
		//introduce the scanner class
				Scanner input = new Scanner(System.in);
				
		int length, width, height, number;
				
		//ask for length
				System.out.println("enter the length");
		//get length
				length = input.nextInt();
				
		//ask for width
				System.out.println("enter the width");
		//get width
				width = input.nextInt();
				
		//ask for height
				System.out.println("enter the height");
		//get height
				height = input.nextInt();
		//add all the numbers together
				number = height + width + length;
		//get the reject message or get the clear
				if (number > 10) {System.out.println("reject");	}
				if (number < 11) {System.out.println("your total is"); System.out.println(number);	}
				
				
				
				
				 
			
				
				
				
				
	

	}

}
