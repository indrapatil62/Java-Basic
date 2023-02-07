package conditional_statment;

public class Switch_eg2 {

	public static void main(String[] args) {
		String day="Monday";
		switch(day) 
		{
		// "Sunday","Saturday":System.out.println("Wake up time is 9 AM");
		//	break;
		//case "Monday","Tueday","Wednesday","Thurday","Friday":System.out.println("Wake up time is 7 AM");
		//	break;
		//default->System.out.println("Invalid Day");
		case "Sunday","Saturday"->System.out.println("Wake up time is 9 AM");
		case "Monday","Tueday","Wednesday","Thurday","Friday"->System.out.println("Wake up time is 7 AM");
		default->System.out.println("Invalid Day");
		// Multiple variable we can give in single switch is added in java 12
		//instead of :  we can use ->
		}
	}
}
