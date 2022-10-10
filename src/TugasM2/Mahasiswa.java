/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasM2;

/**
 *
 * @author Riyan AdPt
 */
public class Mahasiswa {
    String nim;
    String prodi;
    int spp;
    int angkatan;
    int semester;
    int bayar_spp_semester;

    public void setNim(String no_induk) {
        nim = no_induk;
    }

    public void setProdi(String p) {
        prodi = p;
    }


    public void setAngkatan(int angktn) {
        angkatan = angktn;
    }

    public void setSemester(int smt) {
        semester = smt;
    }
    
       public void setSpp(int biaya_spp) {
        spp = biaya_spp;
    }


    public String getNim() {
        return this.nim;
    }

    public String getProdi() {
        return this.prodi;
    }


    public int getAngkatan() {
        return this.angkatan;
    }

    public int getSemester() {
        return this.semester;
    }
    
    public int getSpp() {
        if (angkatan > 17){
            spp = 15000000;
        }else{
            spp = 12000000;
        }
        return this.spp;
    }
    
    
    public int getBayarSPP(){
        bayar_spp_semester = spp * semester;
        return bayar_spp_semester;
    }
    
    
}
