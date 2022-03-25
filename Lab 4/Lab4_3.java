import java.util.Scanner;

public class Lab4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean prime = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                prime = false;

        }
        if (prime == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
