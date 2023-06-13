/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utsb_230523;

/**
 *
 * @author user
 */
public class Nasabah {
    
    private String kodeNasabah;
    private String namaNasabah;
    private double jumlahPinjaman;
    private int lamaPinjaman;
    private static final double BUNGA = 12.0;

    public Nasabah(String kodeNasabah, String namaNasabah, double jumlahPinjaman, int lamaPinjaman) {
        this.kodeNasabah = kodeNasabah;
        this.namaNasabah = namaNasabah;
        this.jumlahPinjaman = jumlahPinjaman;
        this.lamaPinjaman = lamaPinjaman;
    }

    public double hitungAngsuran() {
        double bungaBulanan = BUNGA / 100 / 12;
        double angsuran = (jumlahPinjaman / lamaPinjaman) + (jumlahPinjaman * bungaBulanan);
        return angsuran;
    }

    public String getKodeNasabah() {
        return kodeNasabah;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public int getLamaPinjaman() {
        return lamaPinjaman;
    }
}
