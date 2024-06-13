package switch_statement;

public class Switch_combination {

	public static void main(String[] args) {
       int no_days = 9;
       String day;	
       switch (no_days) {
	case 1: 
	day = "monday" ;
		System.out.println(day);
		break;
	case 2: 
		day = "tuesday" ;
			System.out.println(day);
			break;
	case 3: 
		day = "wednesday" ;
			System.out.println(day);
			break;
	case 4: 
		day = "thursday" ;
			System.out.println(day);
			break;
	case 5: 
		day = "friday" ;
			System.out.println(day);
			break;
	case 6: 
		day = "saturday" ;
			System.out.println(day);
			break;
	case 7: 
		day = "sunday" ;
			System.out.println(day);
			break;
	
	default:
		System.out.println("above days are invaild");
		break;
	
	}
System.out.println("_____________________");
int a =5;
int b = 5;
int c = a+b;
switch (c) {
case 25 :
	System.out.println("value of c is = 25");
	break;
case 10 :
	System.out.println("value of c is = 10");
	break;
case 15 :
	System.out.println("value of c is = 15");
	break;
case 20 :
	System.out.println("value of c is = 20");
	break;
case 0 :
	System.out.println("value of c is = 0");
	break;
default :
	System.out.println("none of the values are true");
	break;
}
System.out.println("_____________________");
int p = 8;	
switch (p) {
case 1:
	System.out.println("is eqaul to 8");
	break;
case 8 :
	System.out.println("is equal to 8");
	default:
		System.out.println("non");
		break;
}
	
	
	}

}
