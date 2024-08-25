package interface_01;

public class normal_class implements Interface_001 {

	public static void main(String[] args) {
		normal_class tp = new normal_class();
		tp.class_2();
		tp.class_3();
		
	}
//we can not access static method
	@Override
	public void class_2() {
		System.out.println("called instance method from parent");
		
	}

	@Override
	public void class_3() {
		System.out.println("call abstract method");
	}

}
