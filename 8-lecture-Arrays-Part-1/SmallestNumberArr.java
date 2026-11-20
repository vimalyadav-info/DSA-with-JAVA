

public class SmallestNumberArr {

    public static int smallestNum(int number[]) {

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {

            if (smallest > number[i]) {
                smallest = number[i];
            }
        }

        return smallest;
    }

    public static void main(String args[]) {

        int number[] = {9, 5, 3, 7, 1, 8, 2, 6, 4};

        System.out.println("Smallest value is = " + smallestNum(number));
    }
}
