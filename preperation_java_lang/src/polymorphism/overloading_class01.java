package polymorphism;
//creat diff form in same class called overlodig
public class overloading_class01 {

	
	public void function() {
		System.out.println("empty");
	}
public void function(int a) {
		System.out.println("datatype int");
	}
public void function(int n ,long u) {
	System.out.println("datatype int and short");
}
public void function(String a ) {
	System.out.println("datatype string");
}
	public static void main(String[] args) {
		 overloading_class01 n = new  overloading_class01();
		 n.function();
		 n.function(0);
		 n.function(null);
		 n.function(0, 0);

	}

}
