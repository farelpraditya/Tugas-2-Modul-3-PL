/**
 * Kelas yang menangani logika bisnis dan proses untuk persewaan motor.
 * Bertanggung jawab untuk menghitung total biaya dan menampilkan informasi.
 *
 * @author [Isi Nama Anda Di Sini]
 * @version 1.0
 */
public class MotorRental {

    /**
     * Objek yang menyimpan data detail sewa.
     * Kelas ini menggunakan 'composition' (memiliki 'RentalInfo').
     */
    private final RentalInfo rentalInfo;

    /**
     * Konstanta untuk tarif pajak (10% = 0.1).
     * Menggunakan 'static final' agar nilainya tetap dan dapat diakses
     * di seluruh kelas.
     */
    private static final double TAX_RATE = 0.1;

    /**
     * Konstruktor untuk kelas MotorRental.
     * Membutuhkan objek RentalInfo agar bisa melakukan perhitungan.
     *
     * @param rentalInfo Objek data yang berisi semua info sewa.
     */
    public MotorRental(RentalInfo rentalInfo) {
        this.rentalInfo = rentalInfo;
    }

    /**
     * Metode internal (private) untuk menghitung jumlah pajak.
     *
     * @param totalPrice Harga total sebelum pajak.
     * @return double jumlah pajak (10% dari total).
     */
    private double calculateTax(double totalPrice) {
        return totalPrice * TAX_RATE;
    }

    /**
     * Menghitung total harga sewa yang harus dibayar.
     * Total harga adalah (Lama Hari * Harga per Hari) + Pajak 10%.
     *
     * @return double harga final yang harus dibayar.
     */
    public double calculateTotalPrice() {
        double total = rentalInfo.rentalDays() * rentalInfo.pricePerDay();
        double tax = calculateTax(total);
        return total + tax;
    }

    /**
     * Menampilkan struk atau rincian informasi sewa ke konsol.
     * Informasi diambil dari objek rentalInfo dan metode calculateTotalPrice().
     */
    public void displayRentalInfo() {
        System.out.println("===== RENTAL INFORMATION =====");
        System.out.println("Customer Name: " + rentalInfo.customerName());
        System.out.println("Motor Type: " + rentalInfo.motorType());
        System.out.println("Rental Days: " + rentalInfo.rentalDays());
        System.out.println("Price per Day: Rp " + rentalInfo.pricePerDay());
        System.out.println("Total Price (+Tax): Rp " + calculateTotalPrice());
        System.out.println("===============================");
    }
}