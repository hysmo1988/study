package app;

/**
 * 素数列挙
 */
public class PrimeNumber {

    public static void main(String[] args) {
        getPrimeNumber();
    }

    public static void getPrimeNumber() {
        int count = 0; // 除算の回数
        int ptr = 0; // 素数の個数
        int[] prime = new int[500];// 素数を格納

        prime[ptr++] = 2; // 2は素数
        prime[ptr++] = 3; // 3は素数

        for(int n = 5; n <= 1000; n+=2) { // 対象は奇数のみ(偶数は2で割り切れるため)
            boolean f = false;
            for(int i = 1; prime[i] * prime[i] <= n; i++) { // prime[i]の2乗がn以下であるか
                count += 2;
                if(n % prime[i] == 0) {
                    f = true;
                    break; // 割り切れると素数ではないため繰り返し処理を抜ける
                }
            }
            if(!f) {
                prime[ptr++] = n; // 素数をとして配列に設定
                count++;
            }
        }
        for(int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
        System.out.println("div+multi:" + count);
    }
}