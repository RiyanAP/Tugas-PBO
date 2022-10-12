
package TugasM4;
import java.io.*;

public class MainClass {

   
    public static void main(String[] args) {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String lagi, tkl = "";
        int total = 0;
        
        try{
            do{
         System.out.println("--Pemesanan Tiket--");
                System.out.print("Masukkan jumlah penumpang : ");
                int jml = Integer.parseInt(inp.readLine());
                System.out.print("Kota Asal : ");
                String asal = inp.readLine();
                System.out.println("Pilih rute tujuan");
                System.out.println("Bali, Lombok, Surabaya, Yogyakarta, Balikpapan, Makassar, Jakarta");
                System.out.print("Tujuan : ");
                String tujuan = inp.readLine();
                System.out.print("Isi tanggal berangkat : ");
                String tbr = inp.readLine();
                System.out.print("Pesan pulang pergi (y/n) : ");
                String pp = inp.readLine();
                if (pp.equalsIgnoreCase("Y")) {
                    System.out.print("Tanggal Kembali: ");
                    tkl = inp.readLine();
                    }
                System.out.println("-- Pilih Maskapai --");
                System.out.println("\n1. Lion Air \n2. Citilink");
                System.out.print("Pilih maskapai : ");
                int tipe = Integer.parseInt(inp.readLine());
                        
                switch (tipe){
                    case 1:
                        LionAir pesawat1[] = new LionAir[jml];
                        System.out.println("-- Selamat Datang di Maskapai Lion Air --");
                        for(int p = 0; p<pesawat1.length;p++){
                            System.out.println("Silahkan isi data penumpang");
                            System.out.print("Booking ID : ");
                            String bookingID = inp.readLine();
                            System.out.print("NIK : ");
                            String nik = inp.readLine();
                            System.out.print("Nama : ");
                            String nm = inp.readLine();
                            System.out.print("Jenis Kelamin (P/L) : ");
                            String jkel = inp.readLine();
                            System.out.print("No Pesawat : ");
                            String np = inp.readLine();
                            System.out.print("No Kursi : ");
                            String nk = inp.readLine();
                            pesawat1[p] = new LionAir(jml, asal, tujuan, np, nk, bookingID, nik, nm, jkel, tbr, tkl);
                            System.out.println("");
                        }
                        for (int p=0; p<pesawat1.length; ++p) {
                            System.out.println("-- Preview Tiket Lion Air --");
                            System.out.println("============================");
                            System.out.println("Booking ID : " + pesawat1[p].getBookingID());
                            System.out.println("NIK : " + pesawat1[p].getNik());
                            System.out.println("Nama : " + pesawat1[p].getNama());
                            System.out.println("Kota Asal : " + pesawat1[p].getKotaAsal());
                            System.out.println("Kota Tujuan : " + pesawat1[p].getKotaTujuan());
                            System.out.println("Tanggal Berangkat : " + pesawat1[p].getTglBerangkat());
                            System.out.println("Tanggal Kembali : " + pesawat1[p].getTglKembali());
                            System.out.println("Nomor Pesawat : " + pesawat1[p].getNoPesawat());
                            System.out.println("Nomor Kursi : " + pesawat1[p].getNoKursi());
                            System.out.println("Harga Tiket : " + pesawat1[p].getHarga());
                            System.out.println("============================");
                            total = pesawat1[p].getTotal();
                        }
                        System.out.println("Total : " + total);
                    break;                       
                    case 2:
                        Citilink pesawat2[]= new Citilink[jml]; 
                        System.out.println("-- Selamat Datang di Maskapai Lion Air --");
                        for(int p = 0; p<pesawat2.length;p++){
                            System.out.println("Silahkan isi data penumpang");
                            System.out.print("Booking ID : ");
                            String bookingID = inp.readLine();
                            System.out.print("NIK : ");
                            String nik = inp.readLine();
                            System.out.print("Nama : ");
                            String nm = inp.readLine();
                            System.out.print("Jenis Kelamin (P/L) : ");
                            String jkel = inp.readLine();
                            System.out.print("No Pesawat : ");
                            String np = inp.readLine();
                            System.out.print("No Kursi : ");
                            String nk = inp.readLine();
                            pesawat2[p] = new Citilink(jml, asal, tujuan, np, nk, bookingID, nik, nm, jkel, tbr, tkl);
                            System.out.println("");
                        }
                        for (int p=0; p<pesawat2.length; ++p) {
                            System.out.println("-- Preview Tiket Lion Air --");
                            System.out.println("============================");
                            System.out.println("Booking ID : " + pesawat2[p].getBookingID());
                            System.out.println("NIK : " + pesawat2[p].getNik());
                            System.out.println("Nama : " + pesawat2[p].getNama());
                            System.out.println("Kota Asal : " + pesawat2[p].getKotaAsal());
                            System.out.println("Kota Tujuan : " + pesawat2[p].getKotaTujuan());
                            System.out.println("Tanggal Berangkat : " + pesawat2[p].getTglBerangkat());
                            System.out.println("Tanggal Kembali : " + pesawat2[p].getTglKembali());
                            System.out.println("Nomor Pesawat : " + pesawat2[p].getNoPesawat());
                            System.out.println("Nomor Kursi : " + pesawat2[p].getNoKursi());
                            System.out.println("Harga Tiket : " + pesawat2[p].getHarga());
                            System.out.println("============================");
                            total = pesawat2[p].getTotal();
                        }
                        System.out.println("Total : " + total);
                    break;
                }
                System.out.print("\nPesan Lagi (Y/N): ");
                lagi = inp.readLine();
            }while(lagi.equalsIgnoreCase("y"));
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
        

