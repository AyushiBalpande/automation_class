package wapper_class;

public class convert_datatype_wapper_ {

	public static void main(String[] args) {
		byte u = 8;
		long a = 99;
		int i = 9904;
		Byte uu = Byte.valueOf( u);
		System.out.println(uu);
		System.out.println("-------------------");
		
		Long aa = Long.valueOf(a);
		System.out.println(aa);
		System.out.println("--------------");
		
		Integer Ii = Integer.valueOf(i);
		System.out.println(Ii);
		System.out.println("-----------------");
		
		//we  can not convert non primative to wrapper class
		String lol = "wrapper class";
		String LoL = String.valueOf(false);
		System.out.println(LoL);
	}

}
