
public class linersearchInStr {
    public static int linearSearch(String fruit[], String key) {
        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String Fruit[] = {"mango", "apple", "banana", "cherry", "date", "fig", "grape"};
        String key = "banana";
        int index = linearSearch(Fruit, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("key at the index : " + index);
        }
    }
}
