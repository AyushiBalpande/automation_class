package scanner_class;

import java.util.Scanner;

public class Block_of_code {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in)	;
//Enter first value
System.out.println("value of a is = ");
int a = sc.nextInt();
//Enter second value
System.out.println("value of b is = ");
int b = sc.nextInt();
//enter operator
System.out.println("operator ");
char c = sc.next().charAt(0);
switch (c) {
case '+' :
	System.out.println("addition of a & b is : "+(a+b));
	break;
case '-' :
	System.out.println("  substaction of a & b is : "+(a-b));
	break;
case '*' :
	System.out.println(" multipication of a & b is : "+(a*b));
	break;
case '%' :
	System.out.println("remender of a & b is : "+(a%b));
	break;
case 0 :
	System.out.println("value of c is = 0");
	break;
default :
	System.out.println("none of the values are true");
	break;
}
		
		
		
		
		
		
}
	}