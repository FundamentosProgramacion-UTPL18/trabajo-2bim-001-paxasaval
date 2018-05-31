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
public class Ejercicio3 {
    public static void main(String[] args) {
        double[] calificacionprogr={18,19,13,16,17,10};
        double[] calificacionbd= {10,12,13,20,17,20};
        double[] promedios=new double[6];
        double suma;
        double promedio;
        for (int contador=0;contador<calificacionbd.length;contador++){
            suma=calificacionprogr[contador]+calificacionbd[contador];
            promedio=suma/2;
            promedios[contador]=promedio;
        }
        String cadena=String.format("%s\n%-12s\t%s\t%s\t%s\n","Reporte de Calificaciones","","Programacion","Base de datos","Promedios");
        System.out.printf("%s",cadena);
        for (int i=0;i<promedios.length;i++){
            
            System.out.printf("Estudiante %d\t%-12.2f\t%-13.2f\t%.2f\n",i+1,calificacionprogr[i],calificacionbd[i],promedios[i]);
        }
    }
    
}
