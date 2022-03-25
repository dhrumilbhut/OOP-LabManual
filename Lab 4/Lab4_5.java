import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int ans = 0;
        while (n > 0) {
            int temp = n % 10;
            n = n / 10;
            ans = ans * 10 + temp;
        }
        System.out.println(ans);
        sc.close();
    }
}
