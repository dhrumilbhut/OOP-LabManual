import java.util.Scanner;
public class Lab6_8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 System.out.println("Enter elements of array 1: ");
		 int [][]a = new int[4][4];

		 for(int i=0;i<4;i++){
		 	for(int j=0;j<4;j++){
		 		a[i][j] = sc.nextInt();
		 	}
		 }

		

		 for(int i=0;i<4;i++){
		 	 int rowSum=0;
		 	for(int j=0;j<4;j++){
		 		rowSum+=a[i][j];
		 	}
		 	 System.out.println("Sum of row "+ i + "=" +rowSum);
		 }

		 for(int i=0;i<4;i++){
		 	 int colSum=0;
		 	for(int j=0;j<4;j++){
		 		colSum+=a[j][i];
		 	}
		 	 System.out.println("Sum of column "+ "=" +colSum);
		 }

		

	}
}