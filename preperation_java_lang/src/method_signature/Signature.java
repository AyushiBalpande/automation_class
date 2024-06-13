package method_signature;

public class Signature {
	public static void data(float y) {
		System.out.println(88.09f);
		
	}
	public void data(float o,float r ) {
		System.out.println(9.08f);
		System.out.println(88.77f);
	}
	public static void main(String[] args) {

		//		right like method signature 
//		method signature --data(float ) & data(float) 
		Signature h = new Signature();
h.data(0,88.77f);
		
		data(88.09f);
	}

}
