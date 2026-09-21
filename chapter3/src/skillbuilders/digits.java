package skillbuilders;

import java.util.Scanner;

public class digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare variables
	int number , onePlace , tensPlace; 
	
	//create scanner object
	Scanner userinput = new Scanner(System.in);
	
	//ask he user to enter two digit number
	System.out.println("enter two digit number");
	
	//record what the user entered
	number = userinput.nextInt();
	
	//ones place
	onePlace = number % 10;
	
	//tens place
	tensPlace = number / 10;
	
	//display the ones and tens digits
	System.out.println("the tens digit is "
						+tensPlace
						+" and the one-digit is "
						+onePlace);
	
	}}
	

	

	
	
	

		


