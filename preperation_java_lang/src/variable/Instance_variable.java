package variable;

public class Instance_variable {
int a = 10 ;
public void instance() {
	System.out.println(a);
}
public static void var() {
	 Instance_variable object = new  Instance_variable ();
	 System.out.println(object.a);
}
	public static void main(String[] args) {
		Instance_variable h = new Instance_variable();
		System.out.println(h.a);
		h.var();
	h.instance();
	}

}
