package this_keyword;

public class One {

	int a = 88;
	String k = "ayushi";
	static short p = 99;
	
	public  void instance() {
	
		System.out.println("instance method");
	}
	
	public static void static_i() {
		//we can not use this keword in static method
	}
	public One() {
		//refer to instance ,method
	this.instance();
	System.out.println(this.k);
	System.out.println(this.p);
		System.out.println("this is an example of user define coustructor");
	}
	
	public static void main(String[] args) {
		 One ex = new  One();


	}

}
