import java.util.Scanner;

public class Lab4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        while (true) {
            System.out.println("Enter a number, 0 to exit");
            int n = sc.nextInt();
            if (n > 0 && n % 2 == 0) {
                evenSum = evenSum + n;
            }
            if (n > 0 && n % 2 != 0) {
                oddSum = oddSum + n;
            }
            if (n == 0) {
                break;
            }
        }
        System.out.println("Sum of even numbers =" + evenSum);
        System.out.println("Sum of odd numbers =" + oddSum);
        sc.close();
    }
}
