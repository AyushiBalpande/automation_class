package polymorphism;

public class child_class extends parent_class{

	public void poly() {
		System.out.println("poly method of child class");
	}
	
	public static void polytech() {
		System.out.println("polytech method of child class staic");
	}
	
	public static void main(String[] args) {
		//create child class object  is a relation
		child_class h = new  child_class();
			 h.poly();
			
		//create parent class object with respect to 3rd principle of inheritance
			 parent_class j = new child_class();
			 j.poly();
			 j.polytech();
	
	//has a relationa
			 parent_class kk = new parent_class();
			 kk.poly();
			 kk.polytech();
	
	}

}
