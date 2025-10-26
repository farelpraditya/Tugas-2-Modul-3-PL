/**
 * Kelas POJO (Plain Old Java Object) yang berfungsi sebagai model data.
 * Kelas ini menyimpan semua informasi dasar terkait satu transaksi sewa.
 *
 * @author [Isi Nama Anda Di Sini]
 * @version 1.0
 */
public class RentalInfo {

    /**
     * Nama lengkap pelanggan yang menyewa.
     */
    private final String customerName;

    /**
     * Tipe atau model motor yang disewa (misal: "Yamaha NMAX").
     */
    private final String motorType;

    /**
     * Durasi total penyewaan dalam satuan hari.
     */
    private final int rentalDays;

    /**
     * Biaya sewa motor per hari, sebelum pajak.
     */
    private final double pricePerDay;

    /**
     * Konstruktor untuk membuat objek RentalInfo baru.
     * Semua data diinisialisasi saat objek dibuat.
     *
     * @param customerName Nama pelanggan.
     * @param motorType    Tipe motor.
     * @param rentalDays   Lama sewa (hari).
     * @param pricePerDay  Harga sewa per hari.
     */
    public RentalInfo(String customerName, String motorType, int rentalDays, double pricePerDay) {
        this.customerName = customerName;
        this.motorType = motorType;
        this.rentalDays = rentalDays;
        this.pricePerDay = pricePerDay;
    }

    // --- Kumpulan Getter untuk mengambil data ---

    /**
     * Mendapatkan nama pelanggan.
     *
     * @return String nama pelanggan.
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Mendapatkan tipe motor.
     *
     * @return String tipe motor.
     */
    public String getMotorType() {
        return motorType;
    }

    /**
     * Mendapatkan durasi sewa.
     *
     * @return int jumlah hari sewa.
     */
    public int getRentalDays() {
        return rentalDays;
    }

    /**
     * Mendapatkan harga sewa per hari.
     *
     * @return double harga sewa per hari.
     */
    public double getPricePerDay() {
        return pricePerDay;
    }
}