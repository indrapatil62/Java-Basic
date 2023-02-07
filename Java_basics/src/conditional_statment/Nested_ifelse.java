package conditional_statment;

public class Nested_ifelse {

	public static void main(String[] args) {
		int age= 32;
		if (age>0 && age<=12) {
			System.out.println("He is child");
		}
		
		else if(age>12 && age<=18) {
			System.out.println("He is Teenage");
		}
		
		// You can Nest in if and also else if their is no such condition for nesting
		else if(age>18 && age<=40) {
			if (age>18 && age<=30) {
				System.out.println("He is Youth");
			}
			else {
				System.out.println("He is Experienced Youth");
			}
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
