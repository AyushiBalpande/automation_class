package encapculation;

public class class_01 {
	//actual password is ayu.1234
	//we use private for not allow to excess in another class
  private String password = "ayu.1234";
	private void function(String a ) {
		password = a;
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		class_01 j = new class_01();
		j.function("ayushi");

	}

}
