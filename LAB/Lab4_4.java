import java.util.Scanner;

public class Lab4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0 / i;
        }
        System.out.println(sum);
        sc.close();
    }
}
