package Basics;

public class Arithmatic_op {
	
	int a,b,Addition,Subtract,Multiply,Divide,Mod;
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int Addition = (a + b);
		int Subtract = (a - b);
		int Multiply = (a * b);
		int Divide   = (a / b);
		int Mod      = (a % b);
		
		System.out.println("Addition of a and b = "+Addition);
		System.out.println("Subtraction of a and b is "+Subtract);
		System.out.println("Multiplication of a and b is "+Multiply);
		System.out.println("Division of a and b is "+Divide);
		System.out.println("Modulus of a and b is "+Mod);
	}

}
