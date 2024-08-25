package Super_keyword;

public class Child_past extends parent_var_method{

	public void xyz() {
	System.out.println(super.a);	
	super.instance();
	
	}
	
	public static void main(String[] args) {
		Child_past refer = new Child_past();
		refer.instance();
		refer.xyz();
	}

}
