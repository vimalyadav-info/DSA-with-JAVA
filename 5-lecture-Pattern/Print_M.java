// *               * 
// * *           * * 
// *   *       *   * 
// *     *   *     * 
// *       *       * 
// *               * 
// *               * 
// *               * 
import java.util.Scanner;

public class Print_M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                if (col == 0 || col == num - 1 ||
                    (row == col && row <= num / 2) ||
                    (row + col == num - 1 && row <= num / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
