//find smallest number in a given array.
//{1,2,3,4,5,6,7,8,9}

public class smallesttNumberArr{
    public static int smallestNum(int number[]){
        int smallest = Integer.MAX_VALUE;  //+infinity
        for(int i=0; i<number.length; i++){
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        return smallest;
    }
    
    public static void main (String args[]){
        int number[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("smallest value is = "+ smallestNum(number));
    }
}
