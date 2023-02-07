package conditional_statment;

public class Else_ifLadder {

	public static void main(String[] args) {
		int age= 1;
		if (age>0 && age<=12) {
			System.out.println("He is child");
		}
		
		else if(age>12 && age<=18) {
			System.out.println("He is Teenage");
		}
		
		else if(age>18 && age<=40) {
			System.out.println("He is youth");
		}
		
		else if(age>40 && age<=60) {
			System.out.println("He is Adult");
		}
		
		else if (60<age) {
			System.out.println("He is Senior citizen");
		}
		else {
			System.out.println("Invalid Age Entered");
		}

	}

}
