/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author khenj
 */
public class contoh1 {
    public static void contohMet() {
        System.out.println("contoh metode");
    }
    
    public static void main(String[] args) {
        contohMet();
        
        
        Met m = new Met();
        m.tampilNama();
        m.nama = "Budi";
        
        m.umurNama(50, "sandi");
        m.umur();
        m.umurNama(m.umur, m.nama);
    }
}
