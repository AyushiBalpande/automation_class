package nested_loop;

public class Half_pyramid_180 {

	public static void main(String[] args) {
	//row =6, col= 6
		for(int a=1;a<=6; a++) {
			for(int b =1; b<=6-a;b++) {
				System.out.print("  ");
			}
			for(int c=1;c<=a; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
