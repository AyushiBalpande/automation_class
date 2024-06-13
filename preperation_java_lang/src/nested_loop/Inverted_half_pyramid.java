package nested_loop;

public class Inverted_half_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//row =5
//col=5
		for (int a = 5; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("_-----------------------------------_---------");

		// half pyramid 180 r= 5, c = 5
		for (int o = 1; o <= 5; o++) {
			for (int y = 1; y <= 5 - o; y++) {
				System.out.print("  ");
			}
			for (int u = 1; u <= o; u++) {
				System.out.print("* ");
			}
			System.out.println();
		}
//zero one  r = 5 , c = 5 
		for (int s = 1; s <= 5; s++) {
			for (int h = 1; h <= s; h++) {
				int g = s + h;
				if (g % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		// floyds triangle
		int p = 1;
		for (int n = 1; n <= 5; n++) {
			for (int m = 1; m <= n; m++) {
				System.out.print(m + " ");
				p++;
			}
			System.out.println();
		}
	}

}
