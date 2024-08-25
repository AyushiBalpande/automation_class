package non_access_modifer;

public  class for_method {
//abstract -- abstract class does not allow to create object
	//public abstract void joint();
	//static
	public static void method() {
		System.out.println("simple method which we usually use");
	}
	//final 
	public final void example() {
		System.out.println(" final non access modifer");
	}
	//native - it does not contain body
	//public native void solution();
	
	public static void main(String[] args) {
		for_method A = new for_method ();
	method();
	A.example();
//	A.solution();
	}

}
