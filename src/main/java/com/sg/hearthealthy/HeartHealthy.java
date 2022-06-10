/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sg.hearthealthy;

import java.util.Scanner;

/**
 *
 * @author stwal
 */
public class HeartHealthy {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What is your age?");
        String age = myScanner.nextLine();
        
        int intAge = Integer.parseInt(age);
        
        int maxHR = 220 - intAge;
        int lowerHrRange = maxHR / 2;
        double upperHrRange = Math.floor(maxHR * .85);
        
        
       System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute");
       System.out.println("Your target HR Zone is " + lowerHrRange + " - " + upperHrRange + " beats per minute");  
    }
}
