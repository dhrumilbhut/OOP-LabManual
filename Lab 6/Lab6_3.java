import java.util.Scanner;
public class Lab6_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter elements of array :");
		int []a = new int[n];

		for(int i=0; i<n;i++){
			a[i]=sc.nextInt();
		}
				
		System.out.println("Enter element to search:");
		int search = sc.nextInt();

		boolean temp=false;
		int i=0;

		for( i=0; i<n;i++){
			if(a[i]==search){
				temp=true;
				break;
			}
		}

		if(temp==false){
			System.out.println("Not found!!");
		}
		else{
			System.out.println("Index"+i);
		}
	}
}