public class If4 {
    public static void main(String[] args) {
        String user = "admin", pass = "1234";
        if (user.equals("admin")) {
            if (pass.equals("1234")) {
                System.out.println("Login Berhasil");
            } else {
                System.out.println("Password Salah");
            }
        } else {
            System.out.println("User Tidak Dikenal");
        }
    }
}
