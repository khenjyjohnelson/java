/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author khenj
 */
public class Lottery {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int userNum = numberScanner.nextInt();
        Random rnd = new Random();
        int winningNum = rnd.nextInt(10) + 1;
        System.out.println("Your Number: " + userNum);
        System.out.println("The winning number is: " + winningNum);
    }
}
