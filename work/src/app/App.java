package app;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // バブルソート
        System.out.println("---BubbleSort---");
        int[] array = new int[]{5,9,3,1,2,8,4,7,6};
        new BubbleSort().bs(array);

        // 2分探索
        System.out.println("---BinSearch---");
        int[] binsArray = new int[]{15,27,39,77,92,108,121};
        int binsKey = 39;
        Arrays.sort(binsArray);
        System.out.println(Arrays.toString(binsArray));
        new BinSearch().search(binsArray, binsKey);

        // 順列
        System.out.println("---Permutation---");
        String[] sPerm = {"A", "B", "C"};
        Integer[] iPerm = {1, 2, 3};
		Permutation.get(sPerm);
		Permutation.get(iPerm);
		Permutation.print(sPerm);
		Permutation.print(iPerm);
    }
}