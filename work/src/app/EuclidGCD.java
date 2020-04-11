package app;

/**
 * ユークリッドの互除法
 */
public class EuclidGCD {

    public static void main(String[] args) {
        System.out.println(gcd(12, 18));
        System.out.println(lcm(12, 18));
    }
    /**
     * 整数値x,yの最大公約数を求めて返却
     * @param x
     * @param y
     * @return 最大公約数
     */
    public static int gcd(int x, int y) {
        // System.out.println("x = " + x + " y = " + y);
		return y == 0 ? x : gcd(y, x % y);
    }
    /**
     * 整数値x,yの最小公倍数を求めて返却
     * @param x
     * @param y
     * @return 最小公倍数
     */
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }
}