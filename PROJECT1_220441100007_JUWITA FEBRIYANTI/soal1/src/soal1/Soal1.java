/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author User
 */

     class Manusia {
    // ATTRIBUT
    String nama;
    int umur;
    String alamat;
    
    // METHOD
     void berjalan (){
        System.out.println("Berjalan");
      }
     
      void berlari (){
        System.out.println("Berlari");
      }
      
    }
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia satu = new Manusia();
        Manusia dua = new Manusia ();
        
        satu.nama = "Juwita";
        satu.umur = 19;
        satu.alamat = "Medan";
        
        dua.nama = "Febriyanti";
        dua.umur = 18;
        dua.alamat = "Bandung";
        
        System.out.println("Nama : " + satu.nama);
        System.out.println("Umur : " + satu.umur);
        System.out.println("Alamat : " + satu.alamat);
        satu.berjalan();
        satu.berlari();
        
        System.out.println(" ");
        
        System.out.println("Nama : " + dua.nama);
        System.out.println("Umur : " + dua.umur);
        System.out.println("Alamat : " + dua.alamat);
        dua.berjalan();
        dua.berlari();
    }
    
}
