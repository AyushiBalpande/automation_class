package constructor;

public class Parameterize {
public Parameterize(int a) {
	this(77.08f, 56, 88);
	System.out.println("constructor 1");
}
public Parameterize(int b, String c) {
	this(77);
	System.out.println("constructor 2");
}
public Parameterize(String d) {
	this(8, "example ");
	System.out.println("constructor 3");
}
public Parameterize(float f,int g ,double j) {
	this();
	System.out.println("constructor 4");	
}
public Parameterize(float i) {
	this("value of String");
	System.out.println("constructor 5");	
}
public Parameterize() {
	System.out.println("user define constructor");
}
	public static void main(String[] args) {
		Parameterize join = new Parameterize(88.09f);

	}

}
