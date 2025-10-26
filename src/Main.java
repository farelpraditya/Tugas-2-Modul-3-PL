/**
 * Kelas utama (Driver class) yang berfungsi sebagai titik masuk (entry point)
 * untuk menjalankan aplikasi persewaan motor.
 *
 * @author [Isi Nama Anda Di Sini]
 * @version 1.0
 */
public class Main {

    /**
     * Metode utama (main) yang akan dieksekusi pertama kali oleh Java.
     *
     * @param args Argumen baris perintah (tidak digunakan di program ini).
     */
    public static void main(String[] args) {
        RentalInfo info = new RentalInfo("Farel", "Yamaha NMAX", 3, 120000);

        MotorRental rental = new MotorRental(info);

        rental.displayRentalInfo();
    }
}