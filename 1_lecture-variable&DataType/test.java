import java.util.Scanner;
/*  What will be the type of result in the following Java code?
    (Hint : Look at the largest data type among these) 
*/
public class test {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 byte b = 10;
 char c = 'A';
 short s = 1000;
 int i = 100000;
 float f = 10.5f;
 double d = 20.99;
 
  double result = (f * b) + (i % c) - (d * s);
  System.out.println("Result: " + result);


}   

}

//error: compilation failed
// int $ = 24;