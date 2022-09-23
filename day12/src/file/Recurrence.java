package file;

/*
* 需求:求5的阶乘
* */
public class Recurrence {
    public static void main(String[] args) {
        System.out.println(recuc(50));
    }

    public static long recuc(long n) {
        if (1 == n) {
            return 1;
        }
        long reul = n * recuc(n - 1);
        return reul;
    }
}
