public class Loop8 {
    public static void main(String[] args) {
        int n = 5;
        long f = 1;
        for (int i = 2; i <= n; i++)
            f *= i;
        System.out.println(n + "! = " + f);
    }
}