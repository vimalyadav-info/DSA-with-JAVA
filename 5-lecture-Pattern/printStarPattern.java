


// *
// **
// ***
// ****
public class printStarPattern {

    public static void main(String[] args) {

        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) { // inner loop star <= n; if(star <= line){ }
                System.out.print("*");

            }
            System.out.println();
        }
       
            
        }
    }

