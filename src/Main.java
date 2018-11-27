public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] test = {0,4,3,6,7,2,1,8,5};
        Quicksort.quicksort(test,0,test.length-1);
        for(int i=0;i<test.length;i++) {
            System.out.println(test[i]);
        }
    }
}
