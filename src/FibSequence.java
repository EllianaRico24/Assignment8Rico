public class FibSequence {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int f1 = 0;
        int f2 = 1;

        for (int i = 1; i <= n; i ++) {
            int a = f1 + f2;
            f1 = f2;
            f2 = a;
        }
        System.out.println(f1);
    }
}
