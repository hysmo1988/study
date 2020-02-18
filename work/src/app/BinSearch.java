package app;

/**
 * 二分探索
 */
public class BinSearch {
    /**
     * 配列aの先頭n個の要素からkeyと一致する要素を2分探索
     * @param a ソート済みの配列
     * @param n
     * @param key 
     * @return
     */
    static int binSearch(int[] a, int n, int key) {
        int pl = 0; // 探索範囲先頭のインデックス
        int pr = n - 1; // 探索範囲末尾のインデックス
        do {
            int pc = (pl + pr) / 2; // 中央要素のインデックス
            if (a[pc] == key) return pc; // 探索成功
            else if (a[pc] < key) pl = pc + 1; // 探索範囲を後半に絞り込む
            else pr = pc - 1; // 探索範囲を前半に絞り込む
        } while(pl <= pr);
        return -1; // 探索失敗
    }

    public void search(int[] array, int key) {
        long startTime = System.currentTimeMillis();
        // 配列arrayから値がkeyの要素を探索
        int idx = binSearch(array, array.length, key);
        if(idx==-1) System.out.println("noExit");
        else System.out.println("result=" + idx);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");
    }
}