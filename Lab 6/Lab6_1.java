public class Lab6_1{
	public static void main(String[] args) {
		int evenSum=0;
		int oddSum=0;
		int []a = {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				evenSum = evenSum + a[i];
			}
			else{
				oddSum = oddSum + a[i];
			}
		}
		System.out.println("Sum of even numbers = "+evenSum);
		System.out.println("Sum of odd numbers = "+oddSum);
	}
}