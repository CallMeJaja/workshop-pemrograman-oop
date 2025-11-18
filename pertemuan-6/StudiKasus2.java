class Karakter {
    String nama;
    int healthPoint;
    int attackPower;

    Karakter(String nama, int healthPoint, int attackPower) {
        this.nama = nama;
        this.healthPoint = healthPoint;
        this.attackPower = attackPower;
    }

    void serang(Karakter target) {
        target.terimaSerangan(attackPower);
    }

    void terimaSerangan(int damage) {
        healthPoint -= damage;
    }

    boolean isAlive() {
        return healthPoint > 0;
    }

    void tampilkanStatus() {
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Health Point \t: " + healthPoint);
        System.out.println("Attack Power \t: " + attackPower + "\n");
    }
}

class StudiKasus2 {
    public static void main(String[] args) {
        Karakter pahlawan = new Karakter("Arjuna", 100, 15);
        Karakter monster = new Karakter("Rahwana", 80, 12);

        int ronde = 1;

        while (pahlawan.isAlive() && monster.isAlive()) {
            System.out.println("=== Ronde " + ronde + " ===\n");

            pahlawan.serang(monster);
            System.out.println(pahlawan.nama + " menyerang " + monster.nama);
            monster.tampilkanStatus();

            if (!monster.isAlive()) {
                System.out.println(monster.nama + " telah dikalahkan!");
                break;
            }

            monster.serang(pahlawan);
            System.out.println(monster.nama + " menyerang " + pahlawan.nama);
            pahlawan.tampilkanStatus();

            if (!pahlawan.isAlive()) {
                System.out.println(pahlawan.nama + " telah dikalahkan!");
                break;
            }

            ronde++;
        }
    }
}