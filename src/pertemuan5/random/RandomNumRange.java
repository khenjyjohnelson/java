/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.random;

import java.util.Random;

/**
 *
 * @author khenj
 */
public class RandomNumRange {
    public static void main(String[] args) {
        Random num = new Random();
        
        int randomnum = num.nextInt(20);
        
        System.out.println("Random Number: " + randomnum);
    }
}
