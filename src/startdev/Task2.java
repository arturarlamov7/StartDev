/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author artur
 */
class Task2 {
    public void run() { 
        int UnknownNumber, UserNumber, TrysCount = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Загадано число от 1 до 5");

        UnknownNumber = (int)Math.floor(Math.random() * 5);

        do {
		TrysCount++;

		System.out.print("Введите ваше число: ");

		UserNumber = input.nextInt();
				
		if (UserNumber > UnknownNumber)
		System.out.println("Ты проиграл!");
            
		else if (UserNumber < UnknownNumber)            	
		System.out.println("Ты проиграл!");	 		 		

		else 
		System.out.println("Ты выйграл!");

        } while (UserNumber != UnknownNumber);

        System.out.println("Количество попыток: " + TrysCount);

    }
}