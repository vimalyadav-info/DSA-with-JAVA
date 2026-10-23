
// ****
// ***
// **
// *
public class printStarPatternReserve {
    public static void main(String[] args) {
        int n =4;
        for(int line = 1; line<=n; line++){
            for(int star = 1; star <= (n-line+1); star++){ 
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

// Second method

// import java.util.Scanner;
// // ####
// // ###
// // ##
// // #
// public class printStarPatternReserve2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a Number: ");
//         int num = sc.nextInt();

//         for (int row = 1; row <= num; row++) {
//             for (int col = 1; col <= num; col++){
//             if(row + col <= num +1){
//                 System.out.print("# ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }
// }