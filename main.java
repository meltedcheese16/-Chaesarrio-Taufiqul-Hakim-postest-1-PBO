/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Acer-GK
 */
public class main {
    // Class untuk menyimpan data panen sayur
    static class PanenSayur {
        String namaSayur;
        int jumlah;
        String tanggal;
        String kualitas;
        String lokasi;

        PanenSayur(String namaSayur, int jumlah, String tanggal, String kualitas, String lokasi) {
            this.namaSayur = namaSayur;
            this.jumlah = jumlah;
            this.tanggal = tanggal;
            this.kualitas = kualitas;
            this.lokasi = lokasi;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<PanenSayur> daftarPanen = new ArrayList<>();
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== Sistem Pencatatan Hasil Panen Sayur ===");
            System.out.println("1. Tambah Komoditas");
            System.out.println("2. Lihat Daftar Komoditas");
            System.out.println("3. Update Daftar Komoditas");
            System.out.println("4. Hapus Daftar Komoditas");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilih) {
                case 1:
                    System.out.print("Nama sayur: ");
                    String nama = input.nextLine();
                    System.out.print("Jumlah (kg): ");
                    int jumlah = input.nextInt();
                    input.nextLine();
                    System.out.print("Tanggal panen (dd-mm-yyyy): ");
                    String tanggal = input.nextLine();
                    System.out.print("Kualitas/Grade (A/B/C): ");
                    String kualitas = input.nextLine();
                    System.out.print("Lokasi Pertanian: ");
                    String lokasi = input.nextLine();

                    daftarPanen.add(new PanenSayur(nama, jumlah, tanggal, kualitas, lokasi));
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n--- Daftar Panen Komoditas ---");
                    if (daftarPanen.isEmpty()) {
                        System.out.println("Belum ada data.");
                    } else {
                        for (int i = 0; i < daftarPanen.size(); i++) {
                            PanenSayur p = daftarPanen.get(i);
                            System.out.println((i + 1) + ". " +
                                    "Sayur: " + p.namaSayur +
                                    ", Jumlah: " + p.jumlah + " kg" +
                                    ", Tanggal: " + p.tanggal +
                                    ", Kualitas: " + p.kualitas +
                                    ", Lokasi: " + p.lokasi);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nPilih nomor data yang ingin diupdate:");
                    for (int i = 0; i < daftarPanen.size(); i++) {
                        PanenSayur p = daftarPanen.get(i);
                        System.out.println((i + 1) + ". " +
                                "Sayur: " + p.namaSayur +
                                ", Jumlah: " + p.jumlah + " kg" +
                                ", Tanggal: " + p.tanggal +
                                ", Kualitas: " + p.kualitas +
                                ", Lokasi: " + p.lokasi);
                    }
                    System.out.print("Nomor data: ");
                    int indexUpdate = input.nextInt() - 1;
                    input.nextLine();

                    if (indexUpdate >= 0 && indexUpdate < daftarPanen.size()) {
                        System.out.print("Nama sayur baru: ");
                        String namaBaru = input.nextLine();
                        System.out.print("Jumlah baru (kg): ");
                        int jumlahBaru = input.nextInt();
                        input.nextLine();
                        System.out.print("Tanggal baru (dd-mm-yyyy): ");
                        String tanggalBaru = input.nextLine();
                        System.out.print("Kualitas baru (A/B/C): ");
                        String kualitasBaru = input.nextLine();
                        System.out.print("Lokasi baru: ");
                        String lokasiBaru = input.nextLine();

                        daftarPanen.set(indexUpdate, new PanenSayur(namaBaru, jumlahBaru, tanggalBaru, kualitasBaru, lokasiBaru));
                        System.out.println("Data berhasil diupdate!");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                    break;

                case 4:
                    System.out.println("\nPilih nomor data yang ingin dihapus:");
                    for (int i = 0; i < daftarPanen.size(); i++) {
                        PanenSayur p = daftarPanen.get(i);
                        System.out.println((i + 1) + ". " +
                                "Sayur: " + p.namaSayur +
                                ", Jumlah: " + p.jumlah + " kg" +
                                ", Tanggal: " + p.tanggal +
                                ", Kualitas: " + p.kualitas +
                                ", Lokasi: " + p.lokasi);
                    }
                    System.out.print("Nomor data: ");
                    int indexHapus = input.nextInt() - 1;

                    if (indexHapus >= 0 && indexHapus < daftarPanen.size()) {
                        daftarPanen.remove(indexHapus);
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                    break;

                case 5:
                    jalan = false;
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }
}
