/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

/**
 *
 * @author user
 */
public class StartDev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Task1 task1 = new task1();
        task1.run();
    }

    private static class task1 extends Task1 {

        public task1() {
        }
    }
    
}
