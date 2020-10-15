/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : PBO
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : PERINTAH MASUKAN DATA
 */
public class KambingGlobal {
    
    //Variabel JumlahKambing Menjadi Variabel Instance
    
    int jumlahkambing = 88;
    
    //Method untuk Menampilkan Jumlah Kambing
    public void getjumlahkambing() {
        System.out.println(" Jumlah Kambing: " + jumlahkambing);
    }
    
    public void tambahkambing() {
        jumlahkambing = jumlahkambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah:" + jumlahkambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan Jumlah Kambing Yang Ada Saat Program Pertama X Berjalan
        kambingSusu.getjumlahkambing();
        
        //Menambah Satu Kambing
        kambingSusu.tambahkambing();
        
        //Menampilkan Jumlah Kambing Yang Ada
        kambingSusu.getjumlahkambing();
    }
    
}
