import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = in.nextInt();
        System.out.print("Enter number of columns: ");
        int c = in.nextInt();
        if (r == 0 || c == 0) {
            System.out.println("Enter valid no. of rows or columns");
        } else {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}