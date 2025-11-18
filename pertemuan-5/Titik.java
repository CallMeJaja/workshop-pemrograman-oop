class TitikMaster {
    int x, y;
}

class Titik {
    public static void main(String[] args) {
        TitikMaster p1 = new TitikMaster();
        p1.x = 5;
        p1.y = 7;
        TitikMaster p2 = new TitikMaster();
        p2.x = 10;
        p2.y = 15;
        System.out.println("Titik 1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("Titik 2: (" + p2.x + ", " + p2.y + ")");
    }
}