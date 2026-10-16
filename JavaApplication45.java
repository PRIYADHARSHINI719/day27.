/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication45;

/**
 *
 * @author PRIYADHARSHINI
 */
import java.util.Scanner;
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static int CheckPassword(String str, int n) {
    if (n < 4 || Character.isDigit(str.charAt(0))) return 0;
    boolean digit = false, upper = false;
    for (int i = 0; i < n; i++) {
        char c = str.charAt(i);
        if (c == ' ' || c == '/') return 0;
        if (Character.isDigit(c)) digit = true;
        if (Character.isUpperCase(c)) upper = true;
    }
    return (digit && upper) ? 1 : 0;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String str = sc.nextLine();
        System.out.println(CheckPassword(str, str.length()));
        sc.close();
    }
    }
    

