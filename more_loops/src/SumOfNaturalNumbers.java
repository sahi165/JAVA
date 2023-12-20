import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Enter n value: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first " + n + " natural numbers is " + sum);
    }
}