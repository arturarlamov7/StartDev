
package startdev;

import java.util.Scanner;

public class Task7 {
    public void run(){
        System.out.println("----- Задача 7 ------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String s = scanner.nextLine();        
        System.out.println("Введите букву: ");
        String letter = scanner.nextLine();
        int n = 0;
        
        
        for (int i = 0; n < letter.length(); ++n) {
            System.out.println("Буква \""+letter+"\" встречается в тексте "+ n + " раз");

        }
                
            
        System.out.println("");
        System.out.println("----- конец задачи 6 ------");  
    }
}