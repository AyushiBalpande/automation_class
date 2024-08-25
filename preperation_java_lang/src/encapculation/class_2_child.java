package encapculation;

public class class_2_child  {

	private int a = 2002;
	private void privacy(int u) {
		a = u;
		System.out.println(a);
	}
	public static void main(String[] args) {
	
		class_2_child c = new class_2_child();
		c.privacy(2610);
		System.out.println(c.a);
	}

}
