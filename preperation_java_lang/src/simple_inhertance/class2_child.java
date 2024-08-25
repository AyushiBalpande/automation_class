package simple_inhertance;

public class class2_child extends class1 {

	public static void main(String[] args) {
		class2_child ex11 = new class2_child();
		ex11.joint();
		System.out.println(ex11.b);
		ex11.abc();
		
	}

	public static void joint() {
		
		System.out.println("ex of simple inhertance");
	}
	
}
