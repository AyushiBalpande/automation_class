package nested_loop;

public class Half_pyramid {

	public static void main(String[] args) {
//		row =5
//		col =5
		for(int p =1;p<=5;p++) {
			for(int q =1 ; q<=p;q++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------");
//		row =5
//				col = 5
		for(int t =1;t<=5;t++) {
			for(int u =1 ; u<=t;u++) {
				System.out.print(u+" " );
			}
			System.out.println();
		}
	}

}
