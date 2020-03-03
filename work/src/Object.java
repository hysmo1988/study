public class Object {
    public static void main(String[] args) throws Exception {
        int_char();
        char_int();
        string_valueOf();
    }

    public static void int_char() {
        System.out.println("--" + new Object(){}.getClass().getEnclosingMethod().getName() + "--");
        // int -> char
        int i = 1;
        // 1というUnicode文字表現は存在しない
        System.out.println((char)i); 
        // 0x31はUnicode16進数表記の'1'の値 -> 1を出力
        System.out.println((char)0x31); 
        // 49はUnicode10進数表記の'1'の値 -> 1を出力
        System.out.println((char)49);
        // '0'のUnicode10進数表記48に1を加算すると49になる
        // '49'というchar文字を出力する -> 49を出力
        System.out.println((char)'0' + i);
        // '0'のUnicode10進数表記48に1を加算すると49になる
        // 49はUnicode10進数表記の'1'の値 -> 1を出力
        System.out.println((char)('0' + i));
    }

    public static void char_int() {
        System.out.println("--" + new Object(){}.getClass().getEnclosingMethod().getName() + "--");
        // char -> int
        char c = '1';
        System.out.println((int)c);
    }

    public static void string_valueOf() {
        System.out.println("--" + new Object(){}.getClass().getEnclosingMethod().getName() + "--");
        // [primitive] new xx.toString() -> new String()
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf('a'));
        char[] c = {'a','b','9'};
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf((double)10.5));
        System.out.println(String.valueOf((float)11.5));
        System.out.println(String.valueOf(10L));
        System.out.println(String.valueOf(11));
        // [Wrapper(Object)] null or obj.toString()
        System.out.println(String.valueOf(new Integer(12)));
    }
}