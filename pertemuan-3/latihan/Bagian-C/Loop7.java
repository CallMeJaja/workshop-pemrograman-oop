public class Loop7 {
    public static void main(String[] args) {
        int x = 12345;
        int count = 0;
        while (x != 0) {
            x /= 10;
            count++;
        }
        System.out.println("Digit: " + count);
    }
}