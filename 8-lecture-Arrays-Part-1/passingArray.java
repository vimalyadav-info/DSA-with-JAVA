
public class passingArray {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks [i]=marks[i]+2;
        }
    }
    public static void main(String args[]){
        int marks[] = {94,92,78,70,87,93};//update by 2+, >>>96 94 80 72 89 95 
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]+ " ");
        }
            System.out.println();
    }
}
