package Abstraction_002;

public class normal_class extends abstract_parent {

	public static void main(String[] args) {
		 normal_class n = new  normal_class();
		 n.practice();
		 n.practice_01();
		 n.practice_02();
		 n.practice_03();
		 n.name();
	}

	@Override
	public void practice() {
		System.out.println("must doing paractice");
	}

	@Override
	public void practice_01() {
		System.out.println("nothing to right");
	}

	@Override
	public void practice_02() {
		System.out.println("------");
	}

	@Override
	public void practice_03() {
		// TODO Auto-generated method stub
		
	}

}
