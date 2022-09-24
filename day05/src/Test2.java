public class Test2 {
    public static void main(String[] args) {
        System.out.println(cpare(10, 20));

    }

    public static <T extends Comparable<T>> T cpare(T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}
