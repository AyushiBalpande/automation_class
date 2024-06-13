package nested_loop;

public class Solid_rectangle {
//row = 4
	//com=5
	public static void main(String[] args) {
		for(int a = 1; a<=4;a++) {
			for(int b =1; b<=5; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		//row=4
		//com=5
//		for(int s= 1 ;s<=4; s++) {
//			for(int d =1; d<=5; d++) {
//				//if( s==1 ||s ==4 ||d==1||d==5) {
//					System.out.print("*");
//			//}else {
//				System.out.print(" ");
//			}
//		}
//			System.out.println();
//		}
		System.out.println("-------------------------");
		//half pyramid
//		row =5
//		col=5
		for(int p = 1; p<=5; p++) {
			for(int k =1; k<=p; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		//inverted half pyramid
//		row =6, col=6
				for(int q = 6; q>=1; q-- ) {
					for (int w = 1 ; w<=q; w++) {
						System.out.print("* ");
					}
					System.out.println();
				}
					
	}
}


