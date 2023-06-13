/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utsb_230523;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class MenuNasabah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kode Nasabah: ");
        String kodeNasabah = input.nextLine();

        System.out.print("Masukkan Nama Nasabah: ");
        String namaNasabah = input.nextLine();

        System.out.print("Masukkan Jumlah Pinjaman: ");
        double jumlahPinjaman = input.nextDouble();

        System.out.print("Masukkan Lama Pinjaman (Tahun): ");
        int lamaPinjaman = input.nextInt();


        

        Nasabah nasabah = new Nasabah(kodeNasabah, namaNasabah, jumlahPinjaman, lamaPinjaman);

        System.out.println("\n===== Menu Nasabah =====");
        System.out.println("1. Tampilkan Informasi Nasabah");
        System.out.println("2. Hitung Angsuran");
        System.out.print("Pilih menu (1/2): ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                tampilkanInformasiNasabah(nasabah);
                break;
            case 2:
                hitungAngsuran(nasabah);
                break;
            default:
                System.out.println("Menu yang Anda pilih tidak valid.");
        }
    }

    public static void tampilkanInformasiNasabah(Nasabah nasabah) {
        System.out.println("\n===== menu =====");
        System.out.println("Kode Nasabah: " + nasabah.getKodeNasabah());
        System.out.println("Nama Nasabah: " + nasabah.getNamaNasabah());
        System.out.println("Jumlah Pinjaman: " + nasabah.getJumlahPinjaman());
        System.out.println("Lama Pinjaman (Tahun): " + nasabah.getLamaPinjaman());
    }

    public static void hitungAngsuran(Nasabah nasabah) {
        System.out.println("\n===== Perhitungan Angsuran =====");
        System.out.println("Angsuran per Bulan: " + nasabah.hitungAngsuran());
    }
}
    

