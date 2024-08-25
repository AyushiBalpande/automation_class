package Abstraction_002;

public class normal_abstract_3 extends abstract_2 {

	public static void main(String[] args) {
		 normal_abstract_3 h = new  normal_abstract_3();
		 h.name();
		 h.placed();
		 h.stu();
		 h.student();
	}

	@Override
	public void placed() {
	System.out.println("those who prepared");
		
	}

	@Override
	public void name() {
		System.out.println("name of the placed candidate");
	}

}
