package datatype;

public class Primative_nonprimative {

	//static method 
	public static void datatype() {
//		interer
		byte you = 33;
		short iam = 5;
		System.out.println(iam);
		int b = 88;
		long height = 9;
		System.out.println("height is = " +height);
		int c =90;
		System.out.println(b+c);
		System.out.println(b<c);
		System.out.println(iam+" " +you);
//		floating
		float i = 80.09f;
		System.out.println(i);
		double out = 90;
		System.out.println(out);
//		non numeric
		char o = 'u';
		System.out.println(o);
		boolean p = b>c;
		System.out.println(p);
		System.out.println("------------------------");
	}
	// instance method
	public void type() {
		int c = 84;
		int e =77;
	System.out.println(e);
		System.out.println(c);
		String n = "tom";
		System.out.println(n);
		System.out.println("------------------------");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primative_nonprimative  java = new Primative_nonprimative  ();
	datatype();
		java.type();
		java.type();
		datatype();
int a = 55;
System.out.println(a);

	}

}
