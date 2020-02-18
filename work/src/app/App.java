package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        // バブルソート
        int[] array = new int[]{5,9,3,1,2,8,4,7,6};
        new BubbleSort().bs(array);

        
    }
}