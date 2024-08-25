package this_keyword;

public class Child_instance_var extends Parent_class_instance_var {

	short p = 80;
	char o = '*';
	
	
	public void child() {
		
		//instance var. of parent class in child class
		
System.out.println(this.j);
System.out.println(this.l);

// instance var. of child class

System.out.println(this.p);
System.out.println(this.o);

// refer instance method from parent class
 this.instance_p();
 
 // refer constructor var and method
// System.out.println(this.parent());
	}
	
	public static void main(String[] args) {
	
		Child_instance_var refer = new Child_instance_var();
		refer.child();
		

	}

}
