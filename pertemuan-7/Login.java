class Data {
    public static String username;
    protected static String password;
}

public class Login extends Data {
    public static void main(String[] args) {
        Data.username = "eza";
        Data.password = "123";

        System.out.println("Username : " + Data.username);
        System.out.println("Password : " + Data.password);
    }
}
