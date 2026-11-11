public class pattenPratice{
    
// * * * * *
// *       *
// *       *
// *       *
// *       *
// * * * * *

public static void holloRectangle(int row, int col){
    for(int i =1; i<=row; i++){
        for(int j=1; j<=col; j++){
            if(i==1 || i==row || j==1 || j==col){
                System.out.print(" *");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
    //print halfTriangle.
   // * 
   // * * 
   // * * * 
   // * * * *
    public static void halfTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
    }
}
//print inverted halfPramid with number.
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
    
    public static void halfPramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+ " ");
            }
                System.out.println();
        }
    }

//print FLOYD'S Triangle.
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
    
    public static void floydTriangle(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" " );
                counter++;
}
            System.out.println();
        }
    }
    
//print 0 - 1 Triangle.
// 1  
// 0 1  
// 1  0 1  
// 0 1  0 1  
// 1  0 1  0 1  
    
    public static void zeroOneTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1  ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
// Print Butterfly pattern.
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
    
    public static void butterfly(int n){
//first Half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//Second Half
    for(int i =n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    
//print solid RHOMBUS.
//         * * * * * 
//       * * * * * 
//     * * * * * 
//   * * * * * 
// * * * *     
    public static void solidRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
                
        }
    }

//print hollow Rhombus
//     * * * * * 
//    *       * 
//   *       * 
//  *       * 
// * * * * * 
    public static void hollowRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
                }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
                System.out.println();
        }
    }

//print diamond
//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 
// * * * * * * * * * 
//   * * * * * * * 
//     * * * * * 
//       * * * 
//         *     
    
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
            }
        //second half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//  print
// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5 
     public static void numPattern(int n){
         for(int i=1; i<=n; i++){
             for(int j=1; j<=i; j++){
                 System.out.print(i + " ");
             }
             System.out.println();
         }
     }   
    
// print 
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5    
    
    public static void num2Pattern(int n){
         for(int i=1; i<=n; i++){
             for(int j=1; j<=i; j++){
                 System.out.print(j + " ");
             }
             System.out.println();
         }
     } 
    
// print 
// 0 
// 1 0 
// 2 1 0 
// 3 2 1 0 
// 4 3 2 1 0 
    
    public static void ZeroOnePattern(int n){
         for(int i=1; i<=n; i++){
             for(int j=1; j<=i; j++){
                 System.out.print((i-j) + " ");
             }
             System.out.println();
         }
     } 
    
//     pirnt
// 1 
// 2 3 
// 3 4 5 
// 4 5 6 7 
// 5 6 7 8 9 
    
    public static void patter01(int n){
        int counter =1;
       for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((i + j) - 1 + " " );
            }
           System.out.println();
         }
     }
        
 
    
    
    public static void main(String[] args) {
        // holloRectangle(4, 4);
        // halfTriangle(4);
        // halfPramid(5);
        // floydTriangle(5);
        // zeroOneTriangle(5);  
        // butterfly(5);
        // solidRhombus(5);
        // hollowRhombus(5);
        // diamond(5);
        // numPattern(5);
        // num2Pattern(5);
        // ZeroOnePattern(5);
        patter01(5);
    
    }
}