// time complexity O(n)
public class _KadanesALgo{
    public static void maxSumArrays(int numbers[]){
        int ms = Integer.MIN_VALUE;//ms means maximum sum
        int cs = 0;// cs means current sum
        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our max Subarray sum is:" + ms);
    }
    public static void main(String args[]){
        int numbers[]= {-2,-3,4,-1,-2,1,5,-3};
        maxSumArrays(numbers);
    }
}