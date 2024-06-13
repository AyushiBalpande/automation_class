package constructor;
//with diff. creating object
 // default constructor not visible by user
public class Declaration_of_constructor {
//user defined 
	public Declaration_of_constructor() {
		System.out.println("user define constructor");
	}

	// parametrize constructor
	public Declaration_of_constructor(int e , String j ) {
		System.out.println("it is a type of parameterize constructor");
		System.out.println("the value of e = "+ e);
		System.out.println("the value of j = "+ j);
		System.out.println("------------");
	
	}
	public static void main(String[] args) {
		Declaration_of_constructor p = new Declaration_of_constructor(6, "example");
		Declaration_of_constructor user = new Declaration_of_constructor();
	
//	we use  this keyword for the priventing or stop the repetative work 
//	for creating object for exceuting the user define and paramiterize 
//	constructor. this keyword is like a self pridefined in java.
//	we always written this keyword in a staring of an constructor
//	like 
//	this();
	
			
	}		
}

