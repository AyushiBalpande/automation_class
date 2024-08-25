package Super_keyword;

public class parent_var_method {
	
	String a = " automation";
	static int k = 90;
	
	public void instance() {
		System.out.println(a + " = "+k);
	}

	public static void main(String[] args) {
	
		parent_var_method refer = new parent_var_method();
		refer.instance();
	
	}

}
