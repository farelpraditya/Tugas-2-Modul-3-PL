# Nama: Farel Praditya Putra Widyasa
# Nim: 202410370110040
# Kelas: Pemrograman Lanjut C

# 🛵 Persewaan Motor 

![Java](https://img.shields.io/badge/Language-Java-blue.svg) ![Status](https://img.shields.io/badge/Status-Selesai-brightgreen.svg)

Sebuah program kalkulator sederhana untuk menghitung biaya sewa motor, dibuat untuk memenuhi **Tugas 2 Modul 3 Pemrograman Lanjut**. Program ini didesain menggunakan prinsip OOP dengan memisahkan data, logika, dan eksekusi.

---

## ✨ Fitur Utama

* ✅ Menyimpan data transaksi (Nama, Tipe Motor, Hari, Harga)
* ✅ Menghitung total harga sewa
* ✅ Menambahkan komponen pajak 10% secara otomatis
* ✅ Menampilkan rincian struk transaksi ke konsol

---

## 📂 Struktur Proyek

Proyek ini dibagi menjadi tiga kelas utama untuk memisahkan tanggung jawab (Pemisahan Urusan):

* **`RentalInfo.java` (Model):** Berperan sebagai cetakan (POJO) untuk menyimpan semua data sewa.
* **`MotorRental.java` (Service):** Berisi semua logika bisnis, seperti kalkulasi total harga dan pajak.
* **`Main.java` (Driver):** Titik masuk utama program. Bertugas membuat objek dan menjalankan aplikasi.

---

## 🚀 Cara Menjalankan

Ada dua cara untuk menjalankan program ini:

### 1. Melalui IntelliJ IDEA (Disarankan)
1.  Pastikan semua file (`RentalInfo.java`, `MotorRental.java`, `Main.java`) berada di dalam folder `src`.
2.  Buka file `Main.java`.
3.  Klik ikon ▶️ (Run) berwarna hijau di sebelah `public static void main(String[] args)`.
4.  Output akan muncul di *console window* di bagian bawah IDE.

### 2. Melalui Terminal (Manual)
1.  Buka terminal, navigasi ke folder `src` Anda.
    ```bash
    cd path/to/project/src
    ```
2.  Kompilasi semua file:
    ```bash
    javac *.java
    ```
3.  Jalankan kelas `Main`:
    ```bash
    java Main
    ```

---

## 🖥️ Contoh Output

Program akan mencetak output berikut ke konsol:

```bash
===== RENTAL INFORMATION =====
Customer Name: Farel
Motor Type: Yamaha NMAX
Rental Days: 3
Price per Day: Rp 120000.0
Total Price (+Tax): Rp 396000.0
===============================
