import java.util.Scanner;

public class PenjualanTiketBioskop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hargaPerTiket = 50000;
        int jumlahTransaksi;

        System.out.print("Masukkan jumlah transaksi hari ini: ");
        jumlahTransaksi = scanner.nextInt();

        for (int i = 1; i <= jumlahTransaksi; i++) {
            System.out.print("Masukkan jumlah tiket yang dibeli untuk transaksi ke-" + i + ": ");
            int jumlahTiket = scanner.nextInt();
            
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan angka positif.");
                i--; 
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalHarga = jumlahTiket * hargaPerTiket * (1 - diskon);

            System.out.println("Total Penjualan untuk " + jumlahTiket + " tiket: Rp." + (int)totalHarga);
        }
    }
}
