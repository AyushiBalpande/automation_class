package array;

public class Two_d {
 
	public static void main(String[] args) {
int [][]price = new int [3][3];
price[0][0]= 5;
price[0][1]= 5;
price[0][2]= 5;

price[1][0]= 6;
price[1][1]= 6;
price[1][2]= 6;

price[2][0]= 9;
price[2][1]= 9;
price[2][2]= 9;
for(int a =0; a<3; a++) {
	for(int b= 0;b<3; b++) {
		System.out.print(price[a][b]+" ");
	}
	System.out.println();
}
System.out.println(price.length);
}
}