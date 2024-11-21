/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author khenj
 */
public class lat2 {
    
    public static void main(String[] args) {
        int p, l, luas;
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan pj: ");
        p = input.nextInt();

        System.out.println("masukkan lb: ");
        l = input.nextInt();

        luas = p*l;
        System.out.println("luas = " + luas);
    }
    
}
