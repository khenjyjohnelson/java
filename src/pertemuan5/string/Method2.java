/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.string;

/**
 *
 * @author khenj
 */
public class Method2 {
    public static void main(String[] args) {
        String phoneNum = "404-543-2345";
        
        int idx1 = phoneNum.indexOf('-');
        
        System.out.println("index of first dash: " + idx1);
        
        int idx2 = phoneNum.indexOf('-', 4);
        
        System.out.println("second dash idx: " + idx2);
    }
}
