package app;

import java.util.Arrays;

/**
 * バブルソート<br>
 * 隣り合う２つの数字を比較して入れ替えていく:O(n^2)
 */
public class BubbleSort {

    public void bs(int[] array) {
        long startTime = System.currentTimeMillis();
        for(int i=0;i<array.length;i++) {
            array = sort(array, i);
            System.out.println((i+1) + Arrays.toString(array));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");
    }

    private int[] sort(final int[] cp, final int min) {
        // 右端を始点にする
        for(int i=cp.length-1;i>min;i--) {
            // 左右の値を比較し、右の数字が小さければ入れ替える
            if(cp[i-1]>cp[i]) {
                final int x = cp[i-1];
                final int y = cp[i];
                cp[i-1] = y;
                cp[i] = x;
            }
        }
        return cp;
    }
}