/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;

/**
 *
 * @author User
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7};
        for (int contador = 0; contador < arreglo.length; contador++) {
            if (arreglo[contador]%2==0) {
                for (int i = 1; i <= 12 ; i++) {
                    System.out.printf("%d X %d = %d\n", arreglo[contador], i, arreglo[contador] * i);
                }
                System.out.println();
            }
        }
    }
}
