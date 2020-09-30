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
        int Arr[][] = new int[10][];
        Random rand = new Random();
      
        for (int x = 0; x < Arr.length; x++) {
            Arr[x] = new int[(rand.nextInt(9-5+1) + 5)];
        }
        
        for(int i = 0; i < Arr.length; i++) {
            for(int j = 0; j < Arr[i].length; j++){
                Arr[i][j] = rand.nextInt(20-0+1)-0;
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("----- конец задачи 6 ------");          
    }   
}