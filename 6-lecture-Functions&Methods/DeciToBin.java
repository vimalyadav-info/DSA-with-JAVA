
// Binary to Decimal using function.

public class DeciToBin{
    public static void decTobin(int Num){
        int pow = 0;
        int binNum = 0;
        int myNum = Num;
        while(Num > 0){
            int lastDigit =Num%2;
            binNum =binNum + (lastDigit *(int)Math.pow(10,pow));
            pow++;
            Num = Num / 2;
        }
        System.out.println("Binary of " +myNum+ " = " +binNum);
    }
    public static void main(String args[]){
        decTobin(11);
    }
}