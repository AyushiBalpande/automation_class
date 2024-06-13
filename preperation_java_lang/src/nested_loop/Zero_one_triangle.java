package nested_loop;

public class Zero_one_triangle {

	public static void main(String[] args) {
//		row= 4,col=4
for(int n =1;n<=4; n++) {
	for(int m=1; m<=n;m++) {
		int p= n+m; 
		if(p%2==0) {
			System.out.print("1 ");
			
		}else {
			System.out.print("0 ");
		}
	}
	System.out.println();
}
	}

}
