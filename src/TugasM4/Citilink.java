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
    private int jumPenumpang, harga, total;
    private String kotaTujuan, noPesawat, noKursi;

    public Citilink(int jumPenumpang, int harga, int total, String kotaTujuan, String noPesawat, String noKursi, String bookingID, String nik, String nama, String jen_kelamin, String tglBerangkat, String tglKembali, String kotaAsal) {
        super(bookingID, nik, nama, jen_kelamin, tglBerangkat, tglKembali, kotaAsal);
        this.jumPenumpang = jumPenumpang;
        this.harga = harga;
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
        this.total = total;
    }

    public int getJumPenumpang() {
        return jumPenumpang;
    }

    public int getHarga() {
        if(kotaAsal.equalsIgnoreCase("Surabaya")){
            if(kotaTujuan.equalsIgnoreCase("Bali") && kotaTujuan.equalsIgnoreCase("Lombok")){
                harga = 700000;
            }
            else if (kotaTujuan.equalsIgnoreCase("Jakarta") && kotaTujuan.equalsIgnoreCase("Yogyakarta")){
                harga = 800000;
            }
            else if (kotaTujuan.equalsIgnoreCase("Balikpapan") && kotaTujuan.equalsIgnoreCase("Makassar")){
                harga = 850000;
            }
        }else if(kotaAsal.equalsIgnoreCase("Jakarta")){
            if(kotaTujuan.equalsIgnoreCase("Bali") && kotaTujuan.equalsIgnoreCase("Lombok")){
                harga = 1000000;
            }
            else if (kotaTujuan.equalsIgnoreCase("Surabaya") && kotaTujuan.equalsIgnoreCase("Yogyakarta")){
                harga = 750000;
            }
            else if (kotaTujuan.equalsIgnoreCase("Balikpapan") && kotaTujuan.equalsIgnoreCase("Makassar")){
                harga = 900000;
            }
        }
        
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
    
    public int getTotal() {
        total = getHarga() * getJumPenumpang();
        return total;
    }
    
    
    
}
