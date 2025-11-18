class BoxMaster {
    int lebar;
}

public class Box {
    public static void main(String[] args) {
        BoxMaster a = new BoxMaster();
        BoxMaster b = new BoxMaster();

        a.lebar = 10;
        b.lebar = 20;
        System.out.println("Lebar a : " + a.lebar);
        System.out.println("Lebar b : " + b.lebar);
    }
}