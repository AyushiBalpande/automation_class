package this_keyword;

public class For_instance_veriable {

	String a = "manual";
	int u = 99;
	
	public void instance() {
		System.out.println(this.a);
		System.out.println(this.u);
	}
	public static void main(String[] args) {
	 
		For_instance_veriable refer = new For_instance_veriable();
		refer.instance();
	}

}
