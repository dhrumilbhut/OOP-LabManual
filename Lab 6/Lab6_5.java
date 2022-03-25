import java.util.Scanner;
public class Lab6_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter elements of 3x3 array: ");
		 int [][]a = new int[3][3];
		 for(int i=0;i<3;i++){
		 	for(int j=0;j<3;j++){
		 		a[i][j] = sc.nextInt();
		 	}
		 }

		  for(int i=0;i<3;i++){
		 	for(int j=0;j<3;j++){
		 		System.out.print(a[i][j]+" ");
		 	}
		 	System.out.println();
		 }

	}
}