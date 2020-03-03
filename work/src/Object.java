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
        System.out.println((char)'0' + i);
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