package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 順列生成
 */
public class Permutation {

    /**
     * 順列のリストを返す
     * 
     * @param <T>
     * @param data 生成元配列
     * @return 順列リスト
     */
    public static <T> List<List<T>> get(T[] data) {
		return permutation(data);
	}

    /**
     * 順列のリストを出力する
     * 
     * @param <T>
     * @param data 生成元配列
     */
    public static <T> void print(T[] data) {
        int number = 0;
        for (List<T> comb : permutation(data)) {
            System.out.println("#" + ++number + " " + Arrays.asList(comb));
        }
	}
    
    /**
     * 順列リストを作成する
     * @param <T>
     * @param data 生成元配列
     * @return 順列リスト
     */
    private static <T> List<List<T>> permutation(T[] data) {
        List<List<T>> result = new ArrayList<List<T>>();
		// 候補の配列
		List<T> candidate = new ArrayList<>(Arrays.asList(data));
		// 順列の配列
		List<T> perm = new ArrayList<>();
		permutation(candidate, perm, result);
        return result;
    }
	
    /**
     * 再帰呼び出し
     * @param <T>
     * @param candidate 候補の配列
     * @param perm 順列の配列
     * @param result 順列のリスト
     */    
    private static <T> void permutation(List<T> candidate, List<T> perm, List<List<T>> result) {
		if(candidate.size() == 0) {
			result.add(perm);
		}
		for(int i = 0; i < candidate.size(); i++) {
			List<T> p = new ArrayList<>(perm);
			List<T> c = new ArrayList<>(candidate);
			p.add(c.get(i));
			c.remove(i);
			permutation(c, p, result);
		}
	}
}