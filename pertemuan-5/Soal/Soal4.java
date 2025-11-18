class Film {
    String judul;
    int tahun;

    Film(String judul, int tahun) {
        this.judul = judul;
        this.tahun = tahun;
    }
}

class Soal4 {
    public static void main(String[] args) {
        Film film1 = new Film("Sore Istri Masa Depan", 2025);
        Film film2 = new Film("20th Century Girl", 2022);

        System.out.println("Film 1 \t: " + film1.judul);
        System.out.println("Tahun \t: " + film1.tahun);
        System.out.println("\nFilm 2 \t: " + film2.judul);
        System.out.println("Tahun \t: " + film2.tahun);
    }
}