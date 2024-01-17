import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int r = in.nextInt();
        System.out.print("Enter no of columns: ");
        int c = in.nextInt();
        if (r == 0 || c == 0) {
            System.out.println("Enter a valid no of rows and columns");
        } else {
            int t = 1;
            for (int i = 0; i < r; i++, t++) {
                for (int j = 0; j < t; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}