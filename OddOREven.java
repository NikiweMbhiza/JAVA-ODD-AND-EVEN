/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oddoreven;

/**
 *
 * @author Dell-User
 */
import java.util.Scanner;
public class OddOREven {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        String result = checkOddEven(num);
        System.out.println("The number " + num + " is " + result + ".");
        
        scanner.close();
    }
     public static String checkOddEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
