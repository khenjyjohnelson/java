/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5.math;

import java.util.Scanner;

public class Matematika {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan radius: ");
        double radius = sc.nextDouble();
        double pi = 3.14;
        double luas = pow(radius, 2) * pi;
        
        System.out.println("The result is: " + luas);
    }
    
}
