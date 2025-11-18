# Studi Kasus: Pemrograman Berorientasi Objek (Java)

## Mata Kuliah: Pemrograman Berorientasi Objek

### Materi: Class, Object, Method, Percabangan (if/else), Perulangan (while)

## Studi Kasus 1: Sistem Pembayaran Kasir Tunggal

### Deskripsi

Buatlah program untuk mensimulasikan mesin kasir sederhana. Kasir akan memindai (scan) 3 produk yang dibeli pelanggan dan menghitung total tagihannya.

### Aturan Bisnis:

- Program akan memproses 3 produk.
- Jika total belanja pelanggan lebih dari Rp 100.000, ia akan mendapatkan diskon sebesar 10% dari total belanja.

### Class yang Dibuat

1. Class Produk

   **Atribut:**

   - String nama
   - int harga

   **Constructor:**

   - Sebuah constructor untuk menerima dan mengatur nama dan harga.

2. Class Kasir

   **Atribut:**

   - double totalBelanja (Inisialisasi nilai awalnya adalah 0)

   **Method:**

   - void scan(Produk produk): Method ini menerima satu objek Produk. Di dalamnya, cetak nama dan harga produk tersebut, lalu tambahkan harga produk ke atribut totalBelanja.
   - void tampilkanTotal(): Method ini menghitung dan menampilkan rincian akhir.

### Logika Percabangan (if/else)

Logika ini ditempatkan di dalam method tampilkanTotal().

- Cetak totalBelanja awal.
- Gunakan if untuk mengecek: if (totalBelanja > 100000).
- Jika ya (true): Hitung nilai diskon (10% dari totalBelanja), cetak nilai diskon tersebut, dan cetak total akhir yang harus dibayar (total belanja dikurangi diskon).
- Jika tidak (false): Cetak pesan "Tidak mendapat diskon" dan total akhir yang harus dibayar (sama dengan totalBelanja).

### Tugas Mahasiswa (di method main)

- Buat 3 objek Produk yang berbeda.
  - Contoh: Produk p1 = new Produk("Buku Tulis", 25000);
  - Contoh: Produk p2 = new Produk("Mouse Gaming", 150000);
  - Contoh: Produk p3 = new Produk("Pensil", 5000);
- Buat 1 objek Kasir.
  - Contoh: Kasir kasir1 = new Kasir();
- Panggil method scan() milik kasir1 sebanyak 3 kali, masukkan p1, p2, dan p3 satu per satu.
- Terakhir, panggil method kasir1.tampilkanTotal().

## Studi Kasus 2: Simulasi Pertarungan Sederhana

### Deskripsi

Buatlah simulasi pertarungan 1 lawan 1 antara dua karakter (Pahlawan vs. Monster). Pertarungan berlangsung dalam ronde.

### Aturan Bisnis:

- Setiap ronde, Pahlawan menyerang Monster terlebih dahulu, kemudian Monster menyerang Pahlawan.
- Pertarungan akan berhenti ketika salah satu karakter memiliki HP (Health Point) 0 atau kurang.
- Program harus mengumumkan siapa pemenangnya.

### Class yang Dibuat

1. Class Karakter

   **Atribut:**

   - String nama
   - int healthPoint (HP)
   - int attackPower (Kekuatan Serang)

   **Constructor:**

   - Sebuah constructor untuk menerima dan mengatur nama, healthPoint, dan attackPower.

   **Method:**

   - void serang(Karakter target): Method ini mengurangi HP target sebesar attackPower milik penyerang. Sertakan cetakan (print) yang menjelaskan siapa menyerang siapa.
   - void terimaSerangan(int damage): Method internal untuk mengurangi healthPoint berdasarkan damage yang diterima. (Dipanggil dari dalam method serang).
   - boolean isAlive(): Method ini mengembalikan true jika healthPoint > 0, dan false jika tidak.
   - void tampilkanStatus(): Mencetak nama karakter dan sisa HP-nya.

### Logika Percabangan (if/else)

- Di dalam method isAlive(), gunakan if untuk return this.healthPoint > 0;.
- Di dalam main, setelah setiap serangan, gunakan if untuk mengecek !pahlawan.isAlive() atau !monster.isAlive(). Jika salah satu false, hentikan perulangan (break).
- Setelah perulangan berhenti, gunakan if-else untuk menentukan dan mencetak siapa pemenangnya.

### Logika Perulangan (while)

Gunakan while (true) di dalam main untuk menjalankan ronde pertarungan. Loop ini akan dihentikan secara paksa menggunakan break ketika kondisi percabangan (salah satu karakter mati) terpenuhi.

### Tugas Mahasiswa (di method main)

- Buat 2 objek Karakter:
  - Contoh: Karakter pahlawan = new Karakter("Arjuna", 100, 15);
  - Contoh: Karakter monster = new Karakter("Rahwana", 80, 12);
- Buat sebuah variabel int ronde = 1;.
- Mulai while(true) loop pertarungan.
- Di dalam loop:
  - Cetak "--- Ronde [nomor ronde] ---".
  - Panggil pahlawan.serang(monster).
  - Panggil monster.serang(pahlawan).
  - Panggil pahlawan.tampilkanStatus() dan monster.tampilkanStatus().
  - Cek kondisi isAlive() untuk kedua karakter. Jika salah satu mati, cetak pemenangnya dan panggil break.
  - Inkrementasi (tambah) variabel ronde.

## Studi Kasus 3: Sistem Pengolahan Nilai Mahasiswa

### Deskripsi

Buatlah sistem untuk menghitung nilai akhir dan menentukan Indeks Nilai (A, B, C, D, E) untuk beberapa mahasiswa.

### Aturan Bisnis:

- Nilai Akhir dihitung dari 3 komponen:
  - Tugas: 30%
  - UTS: 30%
  - UAS: 40%
- Indeks Nilai (Grade) ditentukan berdasarkan Nilai Akhir:
  - > = 80 : 'A'
  - > = 70 : 'B'
  - > = 60 : 'C'
  - > = 50 : 'D'
  - < 50 : 'E'

### Class yang Dibuat

1. Class Mahasiswa

   **Atribut:**

   - String nim
   - String nama
   - int nilaiTugas
   - int nilaiUts
   - int nilaiUas

   **Constructor:**

   - Sebuah constructor untuk menerima dan mengatur semua atribut di atas.

   **Method:**

   - double hitungNilaiAkhir(): Method ini menghitung dan mengembalikan nilai akhir (dalam double) berdasarkan bobot yang ditentukan.
   - char getIndeksNilai(): Method ini memanggil hitungNilaiAkhir() terlebih dahulu, lalu menggunakan hasilnya untuk menentukan dan mengembalikan Indeks Nilai (char).
   - void tampilkanInfoLengkap(): Method ini mencetak NIM, Nama, Nilai Akhir (panggil hitungNilaiAkhir()), dan Indeks Nilai (panggil getIndeksNilai()).

### Logika Percabangan (if/else if/else)

Logika ini ditempatkan di dalam method getIndeksNilai().

- Dapatkan nilai akhir dari hitungNilaiAkhir().
- Gunakan struktur if-else if-else bertingkat untuk menentukan char (A/B/C/D/E) berdasarkan rentang nilai.
  - if (nilaiAkhir >= 80) return 'A';
  - else if (nilaiAkhir >= 70) return 'B';
  - ... dan seterusnya.

### Logika Perulangan

Tidak diperlukan untuk studi kasus ini.

### Tugas Mahasiswa (di method main)

- Buat 3 objek Mahasiswa secara terpisah dengan data yang berbeda-beda.
  - Contoh: Mahasiswa mhs1 = new Mahasiswa("001", "Budi", 80, 70, 90);
  - Contoh: Mahasiswa mhs2 = new Mahasiswa("002", "Ani", 60, 85, 75);
  - Contoh: Mahasiswa mhs3 = new Mahasiswa("003", "Citra", 50, 65, 40);
- Panggil method tampilkanInfoLengkap() untuk setiap objek mahasiswa tersebut.
  - System.out.println("--- Data Mahasiswa 1 ---");
  - mhs1.tampilkanInfoLengkap();
  - System.out.println("--- Data Mahasiswa 2 ---");
  - mhs2.tampilkanInfoLengkap();
  - ... dan seterusnya untuk mhs3.
