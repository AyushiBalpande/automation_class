package nested_loop;

public class Floyd_triangle {

	public static void main(String[] args) {
		//row= 4,col=4
		int p=1;
		for(int r=1; r<=4;r++) {
			for(int t=1;t<=r; t++) {
				System.out.print(p
						+" ");
				p++;
			}
			System.out.println();
		}

	}

}
