/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author oquintansocampo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clase1 obj1 = new Clase1();
        obj1.imprimir(24.3, 5);
    }
}

    class Clase1 {

        private double valor = 9.8;
        private int x = 7;

        public void imprimir(double valor, int x) {
            System.out.print(valor +" "+this.x);
        }
    }
        
    
