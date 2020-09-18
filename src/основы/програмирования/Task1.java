/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package основы.програмирования;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task1 {
    public void run() {
        int a;
        int d = 32;
        double c;
        double b = 1.8;
        System.out.println("Введите число градусов по Цельсию: ");
        a = new Scanner(System.in).nextInt();
        c = a * b + d;
        System.out.println("По фаренгейту это будет: " + c);
    }  
}
