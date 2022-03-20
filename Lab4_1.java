import java.util.Scanner;

class Lab4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = sc.nextInt();
        System.out.println("Enter second number:");
        int second = sc.nextInt();

        for (int i = first; i < second; i++) {
            if (i % 2 == 0 && (i % 3 != 0)) {
                System.out.print(i + " ");
            }
            sc.close();
        }
    }
}