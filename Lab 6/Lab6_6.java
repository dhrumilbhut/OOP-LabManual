import java.util.Scanner;
public class Lab6_6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n :");
		int n = sc.nextInt();

		 System.out.println("Enter elements of array 1: ");
		 int [][]a = new int[n][n];

		 for(int i=0;i<a.length;i++){
		 	for(int j=0;j<a.length;j++){
		 		a[i][j] = sc.nextInt();
		 	}
		 }

		 System.out.println("Enter elements of array 2: ");
		 int [][]b = new int[n][n];


		 for(int i=0;i<b.length;i++){
		 	for(int j=0;j<b.length;j++){
		 		b[i][j] = sc.nextInt();
		 	}
		 }

		 int [][]c = new int[n][n];

		  for(int i=0;i<c.length;i++){
		 	for(int j=0;j<c.length;j++){
		 		for(int k=0;k<c.length;k++){
		 			c[i][j]=+ a[i][k] + b[k][j];
		 		}
		 	}
		 }

		 for(int i=0;i<c.length;i++){
		 	for(int j=0;j<c.length;j++){
		 		System.out.print(c[i][j]+" ");
		 	}
		 	System.out.println();
		 }

	}
}