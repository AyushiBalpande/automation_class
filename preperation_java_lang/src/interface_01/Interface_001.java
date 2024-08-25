package interface_01;

public interface Interface_001 {

	//variable
	final int a = 44;
	static int b = 55;
	int c = 66;
	
	//methods (concret and abstract both 
	public static void class_1() {
		System.out.println("static method");
	System.out.println(b);
	System.out.println(a);
	System.out.println(c);
	}
	
	public void class_2();
	

    public abstract void class_3() ;
	
    public static void main(String[] args) {
	System.out.println(b);
	class_1();
	}
}
