/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import java.util.Locale;

public class P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Problema03: Generar un que permita calcular y mostrar el valor 
        de la planilla de teléfono de un casa. Se debe ingresar el costo por 
        minutos, el número de minutos consumidos en el mes.*/
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double total;
        double costo_min;
        int num_min;
        
        System.out.println("Ingresar el costo por minutos del teléfono:");
        costo_min = entrada.nextDouble();
        System.out.println("Ingresar número de minutos consumidos en el mes:");
        num_min = entrada.nextInt();
        
        total = costo_min * num_min;
        
        System.out.printf("El costo total de la planilla de "
                + "teléfono de la casa es: %.2f ",total);  
    }

}
