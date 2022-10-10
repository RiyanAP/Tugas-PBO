/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasM4;

/**
 *
 * @author Riyan AdPt
 */
public class Citilink extends Tiket{
    private int jumPenumpang, harga;
    private String kotaTujuan, noPesawat, noKursi;

    public Citilink(int jumPenumpang, int harga, String kotaTujuan, String noPesawat, String noKursi, String bookingID, String nik, String nama, String jen_kelamin, String tglBerangkat, String tglKembali, String kotaAsal) {
        super(bookingID, nik, nama, jen_kelamin, tglBerangkat, tglKembali, kotaAsal);
        this.jumPenumpang = jumPenumpang;
        this.harga = harga;
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
    }

    public int getJumPenumpang() {
        return jumPenumpang;
    }

    public int getHarga() {
        return harga;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public String getNoPesawat() {
        return noPesawat;
    }

    public String getNoKursi() {
        return noKursi;
    }
    
    
    
}
