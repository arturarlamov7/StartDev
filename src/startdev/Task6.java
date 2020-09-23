/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;

/**
 *
 * @author artur
 */
public class Task6 {
    public void run() {
        System.out.println("----- Задача 6 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int[][] Array = new int[10][];
        int inc = 0;
        Array[0] = new int[5];
        Array[1] = new int[6];
        Array[2] = new int[7];
        Array[3] = new int[8];
        Array[4] = new int[9];
        Random random = new Random();
        
        for(int i = 0; i<Array.length; i++) {
            for(int j = 0; j<Array[i].length; j++) {
	    System.out.print(Array[i][j] + " ");
	}
	System.out.println();
}        

        System.out.println("----- конец задачи 6 ------");          
    }
    
}
