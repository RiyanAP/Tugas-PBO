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

    public Citilink(int jumPenumpang, String kotaAsal, String kotaTujuan, String noPesawat, String noKursi, String bookingID, String nik, String nama, String jen_kelamin, String tglBerangkat, String tglKembali) {
        super(bookingID, nik, nama, jen_kelamin, tglBerangkat, tglKembali, kotaAsal);
        this.jumPenumpang = jumPenumpang;
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
    }

    public int getJumPenumpang() {
        return jumPenumpang;
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
    
    public int getHarga() {
        if(getKotaAsal().equalsIgnoreCase("Surabaya")){
            if(getKotaTujuan().equalsIgnoreCase("Bali") || getKotaTujuan().equalsIgnoreCase("Lombok")){
                harga = 700000;
            }
            else if (getKotaTujuan().equalsIgnoreCase("Jakarta") || getKotaTujuan().equalsIgnoreCase("Yogyakarta")){
                harga = 800000;
            }
            else if (getKotaTujuan().equalsIgnoreCase("Balikpapan") || getKotaTujuan().equalsIgnoreCase("Makassar")){
                harga = 850000;
            }
        }else if(getKotaAsal().equalsIgnoreCase("Jakarta")){
            if(getKotaTujuan().equalsIgnoreCase("Bali") || getKotaTujuan().equalsIgnoreCase("Lombok")){
                harga = 1000000;
            }
            else if (getKotaTujuan().equalsIgnoreCase("Surabaya") || getKotaTujuan().equalsIgnoreCase("Yogyakarta")){
                harga = 750000;
            }
            else if (getKotaTujuan().equalsIgnoreCase("Balikpapan") || getKotaTujuan().equalsIgnoreCase("Makassar")){
                harga = 900000;
            }
        }
        
        return harga;
    }
    
    public int getTotal() {
        total = getHarga() * getJumPenumpang();
        return total;
    }
    
    
    
}
