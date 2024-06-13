package variable;
//we need to use static keyword for print any block of code or excecution
public class Static_variable {
 static int b = 66;
  public static void point() {
	  System.out.println(b);
  }
  public void method() {
	  System.out.println(b);
  }
	public static void main(String[] args) {
		point();
		Static_variable n =new Static_variable();
		n.method();
	}

}
