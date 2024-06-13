package instance_variable_method;



public class practice {
	int r = 67;
	int y = 99;
	public void login()   {
	System.out.println();	
		float j = 78.89f;
		System.out.println(j);
	}
	public static void main(String[] args) {
		//creat object 
		practice a = new practice();
		System.out.println(a.r); 
		practice d = new practice();
		System.out.println(d.y);
		//instance method
		practice g = new practice();
		g.login();
	}	
	}


