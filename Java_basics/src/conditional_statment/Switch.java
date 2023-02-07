package conditional_statment;

public class Switch {
   // when you have multiple conditions
	// expression can be variable or constant (float value cannot be used in expression)(byte,int,char,constant)
	// Label is based on Expression(constant type of label)
	public static void main(String[] args) {
		int day=3;
		switch(day) 
		{
		case 0:System.out.println("Sunday");
		break;
		case 1:System.out.println("Monday");
			break;
		case 2:System.out.println("Tueday");
			break;
		case 3:System.out.println("Wednesday");
		break;										// to stop the compilation after getting o/p
		//case 3*1:System.out.println("Wednesday");     Also it is possible
	    //	break;
		case 4:System.out.println("Thurday");
			break;
		case 5:System.out.println("Friday");
			break;
		case 6:System.out.println("Saturday");
			break;	
		default:System.out.println("Invalid Day");
		}

	}

}
