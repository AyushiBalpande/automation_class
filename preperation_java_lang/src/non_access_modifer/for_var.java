package non_access_modifer;

public class for_var {

	final static int a = 8;
	public static void final_f (int b) {
//		a = b;   (it can not allow to define var to another )
		System.out.println(b);
	}
	
	volatile int h = 3;
	//
	public void jont() {
		System.out.println(h);
	}
	public static void main(String[] args) {
		for_var in = new for_var();
		in.jont();
	}

}
