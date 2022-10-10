/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasM2;

import java.io.*;
public class MainClass {

    public static void main(String[] args) {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        
        Undika undika = new Undika();
        Mahasiswa mhs = new Mahasiswa();
        Karyawan kar = new Karyawan();
        try {
            
            do{
                System.out.println("--Universitas Dinamika--");
                System.out.println("1. Cek SPP Mahasiswa");
                System.out.println("2. Cek Gaji Karyawan");
                System.out.println("3. Keluar Aplikasi");
                System.out.println("Pilih menu : ");
                int pilih = Integer.parseInt(inp.readLine());
                
                switch(pilih){
                    case 1:
                        System.out.println("--INPUT DATA MAHASISWA--");
                        System.out.print("NIM : ");
                        mhs.setNim(inp.readLine());
                        System.out.print("Nama : ");
                        undika.setNama(inp.readLine());
                        System.out.print("Alamat : ");
                        undika.setAlamat(inp.readLine());
                        System.out.print("Prodi : ");
                        mhs.setProdi(inp.readLine());
                        System.out.print("Angkatan : ");
                        mhs.setAngkatan(Integer.parseInt(inp.readLine()));
                        System.out.print("Semester : ");
                        mhs.setSemester(Integer.parseInt(inp.readLine()));
                        System.out.println("--DATA SPP MAHASISWA--");
                        System.out.println("NIM                            : " + mhs.getNim());
                        System.out.println("Nama mahasiswa                 : " + undika.getNama());
                        System.out.println("Alamat mahasiswa               : " + undika.getAlamat());
                        System.out.println("Prodi                          : " + mhs.getProdi());
                        System.out.println("Angkatan                       : " + mhs.getAngkatan());
                        System.out.println("Semester                       : " + mhs.getSemester());
                        System.out.println("Biaya SPP/semester             : " + mhs.getSpp());
                        System.out.println("Total SPP yang perlu dibayar   : " + mhs.getBayarSPP());
                        System.out.println("");
                        
                        break;
                    case 2:
                        System.out.println("--INPUT DATA KARYAWAN--");
                        System.out.print("NIK : ");
                        kar.setNik(inp.readLine());
                        System.out.print("Nama : ");
                        undika.setNama(inp.readLine());
                        System.out.print("Alamat : ");
                        undika.setAlamat(inp.readLine());
                        System.out.print("Bagian : ");
                        kar.setBagian(inp.readLine());
                        System.out.print("Kehadiran : ");
                        kar.setKehadiran(Integer.parseInt(inp.readLine()));
                        System.out.print("Gaji per hari : ");
                        kar.setGaji_per_hari(Integer.parseInt(inp.readLine()));
                        System.out.println("--DATA GAJI KARYAWAN--");
                        System.out.println("NIK                        : " + kar.getNik());
                        System.out.println("Nama karyawan              : " + undika.getNama());
                        System.out.println("Alamat karyawan            : " + undika.getAlamat());
                        System.out.println("Bagian                     : " + kar.getBagian());
                        System.out.println("Kehadiran                  : " + kar.getBagian());
                        System.out.println("Gaji per hari              : " + kar.getGaji_per_hari());
                        System.out.println("Gaji total yang di dapat   : " + kar.getTotalGaji());
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }while(true);
 
            
        }catch(Exception e){
            System.out.println("Inputan salah/bukan angka");
        }
    }
    
    
}