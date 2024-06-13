package constructor;
//we use  this keyword for the priventing or stop the repetative work 
//for creating object for exceuting the user define and paramiterize 
//constructor. this keyword is like a self pridefined in java.
//we always written this keyword in a staring of an constructor
//like 
//this();

public class This_keyword {
public This_keyword () {
	this ( 8, "value");
	System.out.println("first example");
}
public This_keyword (int a, String g) {
	System.out.println("second example");
}
	public static void main(String[] args) {
		This_keyword keyword = new This_keyword ();
		
	}

}
