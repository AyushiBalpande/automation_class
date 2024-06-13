package variable;

public class Local_variable {
//	local variable can be asses only in scope of the variable
	int u = 9;
	
	public static void join() {
		int a = 5;
		System.out.println(a);
	}
public  void local() {
	int y= 8;
	System.out.println(y);
}

	public static void main(String[] args) {
		int b = 6;
		System.out.println(b);
		System.out.println("-----------");
		join();
		System.out.println("-----------");
		Local_variable k = new Local_variable();
		k.local();
		System.out.println("-----------");
		Local_variable j = new Local_variable();
		System.out.println(j.u);
	}

}
