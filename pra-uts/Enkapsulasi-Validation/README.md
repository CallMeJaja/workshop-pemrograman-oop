# Latihan Level 3: Enkapsulasi & Validation

## Deskripsi

Latihan ini akan membiasakan dengan access modifier, getter/setter, serta penerapan validasi pada setter dan method.

## Daftar Soal

### Soal 5: Enkapsulasi pada Rekening

Buat class `Rekening` dengan:

- Atribut private: `noRekening` (String), `namaPemilik` (String), `saldo` (int)
- Constructor untuk inisialisasi
- Getter untuk semua atribut
- Setter untuk `saldo` dengan validasi: saldo tidak boleh negatif
- Method `setor(int jumlah)` untuk menambah saldo
- Method `tarik(int jumlah)` untuk mengurangi saldo (cek saldo cukup)
- Method `tampilkanInfo()`

Buat objek dan simulasi transaksi setor dan tarik.

---

### Soal 6: Validasi Grade pada Siswa

Buat class `Siswa` dengan:

- Atribut private: `nama` (String), `nilai` (int), `grade` (char)
- Constructor untuk `nama` dan `nilai`
- Method `hitungGrade()` yang mengisi atribut `grade`:
  - nilai ≥ 85: 'A'
  - nilai ≥ 70: 'B'
  - nilai ≥ 60: 'C'
  - nilai < 60: 'D'
- Getter untuk semua atribut
- Method `tampilkanHasil()`

Buat 3 objek siswa dengan nilai berbeda.

---

_Latihan ini membantu memahami cara menjaga data tetap valid dan mengimplementasikan enkapsulasi dalam class._
