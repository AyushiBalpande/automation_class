package methods;
//instance_methods
//we need to create object

public class Instance_methods {
	public void instance() {
		int a = 10;
		String b = "Importance";
		String h = "Rules Of life";
		String c = a+" " +b + " " +h; 
		System.out.println(c);
	}

	public static void main(String[] args) {
		Instance_methods h = new Instance_methods();
		
		h.instance();

	}

}
