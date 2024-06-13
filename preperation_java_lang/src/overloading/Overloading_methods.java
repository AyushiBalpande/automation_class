package overloading;
//it is ablity  of object and methodto make multiples forms 
//method overloading - we can declear one method in one class but takes multple forms
//parameter count and type should be dfferent
public class Overloading_methods {
	public void book() {
		
	}
public void book(int a) {
	System.out.println(a);
}
public void book(double i) {
	
}
public void book(String d) {
	
}
public void book(int j , String h,long k) {
	
}
	public static void main(String[] args) {
		Overloading_methods ol = new Overloading_methods();
		ol.book(88);
	}

}
