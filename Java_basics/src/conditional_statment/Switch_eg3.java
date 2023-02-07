package conditional_statment;

public class Switch_eg3 {

	public static void main(String[] args) {
		String day="Monday";
		String res=switch(day) // using switch as an expression
		{
		case "Sunday","Saturday"->"Wake up time is 9 AM";
		case "Monday","Tueday","Wednesday","Thurday","Friday"->"Wake up time is 7 AM";
		default->"Invalid Day";
		}; // need to give the colunm when we use switch as expression
		System.out.println(res);
	}
}
