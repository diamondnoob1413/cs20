package skillbuilders;

public class DemoMethods {

	public static void main(String[] args) 
	{
		
		

	}

	//method 1:no parameters, no return value
	public static void displayMessage()
	{
		System.out.println("welcome to our class.");
	}
	
	//method 2: One parameter; no return value
	public static void greetStudent(String name)
	{
		System.out.println("hello,"+ name);
	}
	
	//Method 3: Two parameters, return integer
	public static int addNumbers(int a, int b)
	{
		int sum = a + b;
		return sum;
	}

	//method 4: one parameter, returns a decimal number
	public static double calculateArea(double radius)
	{
		double area = 3.14* radius *radius;
		return area;
	}
	
	//method 5: One parameter, returns a boolean
	public static boolean isPassing(int mark)
	{
		return mark >= 50;
	}
}
