/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasM2;

/**
 *
 * @author Riyan AdPt
 */
public class Karyawan {
    String nik;
    String bagian;
    int kehadiran;
    int gaji_per_hari;
    int totalGaji;

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setBagian(String bag) {
        bagian = bag;
    }

    public void setKehadiran(int hadir) {
        kehadiran = hadir;
    }

    public void setGaji_per_hari(int gaji_sehari) {
        gaji_per_hari = gaji_sehari;
    }

    public String getNik() {
        return this.nik;
    }

    public String getBagian() {
        return this.bagian;
    }

    public int getKehadiran() {
        return this.kehadiran;
    }

    public int getGaji_per_hari() {
        return this.gaji_per_hari;
    }

    public int getTotalGaji() {
        totalGaji = kehadiran * gaji_per_hari;
        return totalGaji;
    }

    
    
    
}
