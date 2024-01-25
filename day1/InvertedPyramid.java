import java.util.Scanner;
public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int j = 0; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
