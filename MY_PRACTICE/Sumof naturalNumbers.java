public class sum {
    public static int sumofN(int number) {
        int m = 0;
        for (int i = 1; i <= number; i++) {
            m = m + i;
        }
        return m;
    }
    public static void main(String args[]) {
        System.out.println(sumofN(5));
    }
}