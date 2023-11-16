/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, nim, prodi, alamat;
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Masukkan Nama Anda : ");
        nama = sc.nextLine();

        System.out.println("Masukkan Nim Anda : ");
        nim = sc.nextLine();

        System.out.println("Masukkan Prodi Anda : ");
        prodi = sc.nextLine();

        System.out.println("Masukkan Alamat Anda : ");
        alamat = sc.nextLine();
        
        System.out.println("------------------------");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Prodi   : " + prodi);
        System.out.println("Alamat  : " + alamat);
        System.out.println("------------------------");
    }
    
}
