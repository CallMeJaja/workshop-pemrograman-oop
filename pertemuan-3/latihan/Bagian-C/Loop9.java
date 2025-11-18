public class Loop9 {
    public static void main(String[] args) {
        int p = 17;
        boolean prima = p > 1;
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                prima = false;
                break;
            }
        }
        System.out.println(p + (prima ? " adalah prima" : " bukan prima"));
    }
}