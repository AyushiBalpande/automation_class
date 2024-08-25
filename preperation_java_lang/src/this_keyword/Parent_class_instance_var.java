package this_keyword;

public class Parent_class_instance_var {

	int a = 77;
	String j = "choti";
	char k = '&';
	String l = "ayushi";
	// refer instance method
	public void instance_p() {
		System.out.println("use to refer parent class instance method");
	}
	public void parent() {
		
		System.out.println(this.a);
		System.out.println( this.j +" " + this.k +" "
				+ "" + this.l);
		System.out.println("same");
	}
	
	// constuction
	public Parent_class_instance_var() {
		int parent = 445;
	System.out.println("user define constructor");	
	System.out.println(this.a);
	
	}
	
	public static void main(String[] args) {
		Parent_class_instance_var refer = new Parent_class_instance_var();
		refer.parent();
		refer.instance_p();
	}

}
