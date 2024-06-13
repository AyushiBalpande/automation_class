package array;
//we need to use for each or for loop for excecution
public class Single_d {

	public static void main(String[] args) {
		// by declation allocating memory for each loop
int [] practic = new int[4];
practic[0]= 9;
practic[1]= 5;
practic[2]= 7;
practic[3]=88;
//for each loop
for(int a : practic) {
	System.out.println(a);
	System.out.println("----------");
//	memory allocation like 4*4=16
}
System.out.println("--------------");
int []array = new int [3];
array[0]=1;
array[1]=2;
array[2]=3;

for(int a = 1; a<=4; a++) {
	System.out.println(a);
}
System.out.println("----------");
int []loop = {1,2,3,4,5};
for(int a= 1; a<5;a++) {
	System.out.println(a);
}
System.out.println("----------");
//without allocating memory for loop
 int []java = {5,6,7,8,8,7};
 //for loop
 for(int u=0; u<6;u++) {
	 System.out.println(u);
	 System.out.println("----------");
 }
System.out.println(practic.length);
System.out.println(practic[3]);

	}

}
