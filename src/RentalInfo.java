/**
 * Kelas POJO (Plain Old Java Object) yang berfungsi sebagai model data.
 * Kelas ini menyimpan semua informasi dasar terkait satu transaksi sewa.
 *
 * @param customerName Nama lengkap pelanggan yang menyewa.
 * @param motorType    Tipe atau model motor yang disewa (misal: "Yamaha NMAX").
 * @param rentalDays   Durasi total penyewaan dalam satuan hari.
 * @param pricePerDay  Biaya sewa motor per hari, sebelum pajak.
 * @author [Isi Nama Anda Di Sini]
 * @version 1.0
 */
public record RentalInfo(String customerName, String motorType, int rentalDays, double pricePerDay) {

    /**
     * Konstruktor untuk membuat objek RentalInfo baru.
     * Semua data diinisialisasi saat objek dibuat.
     *
     * @param customerName Nama pelanggan.
     * @param motorType    Tipe motor.
     * @param rentalDays   Lama sewa (hari).
     * @param pricePerDay  Harga sewa per hari.
     */
    public RentalInfo {
    }

    // --- Kumpulan Getter untuk mengambil data ---

    /**
     * Mendapatkan nama pelanggan.
     *
     * @return String nama pelanggan.
     */
    @Override
    public String customerName() {
        return customerName;
    }

    /**
     * Mendapatkan tipe motor.
     *
     * @return String tipe motor.
     */
    @Override
    public String motorType() {
        return motorType;
    }

    /**
     * Mendapatkan durasi sewa.
     *
     * @return int jumlah hari sewa.
     */
    @Override
    public int rentalDays() {
        return rentalDays;
    }

    /**
     * Mendapatkan harga sewa per hari.
     *
     * @return double harga sewa per hari.
     */
    @Override
    public double pricePerDay() {
        return pricePerDay;
    }
}