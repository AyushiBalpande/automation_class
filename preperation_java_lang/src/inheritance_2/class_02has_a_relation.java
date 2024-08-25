package inheritance_2;

public class class_02has_a_relation {
public static void perform() {
	System.out.println("hello miss");
}
	public static void main(String[] args) {
		Class_01 child = new Class_01 ();
		child.main(args);
		child.parent();
		
		
		int a = 9;
		System.out.println(a);
		perform();
	}

}
