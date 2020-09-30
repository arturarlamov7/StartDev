
package startdev;

import java.util.Scanner;

public class Task7 {
    public void run(){
        System.out.println("----- Задача 7 ------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку:");
        String s = scanner.nextLine();        
        System.out.print("Введите букву: ");
        String letter = scanner.nextLine();
        int n = 0;
        
        if(letter.length() != 0) {
            n++;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'n' ) {
                    n++;
                }              
            }
        }
                
        System.out.println("Буква \""+letter+"\" встречается в тексте "+ n + " раз");  
        System.out.println("");
        System.out.println("----- конец задачи 7 ------");  
    }
}