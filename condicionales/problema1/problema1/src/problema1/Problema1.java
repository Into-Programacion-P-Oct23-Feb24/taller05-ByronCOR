/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Problema 1
         Solución que permita calcular y mostrar el valor a cancelar de una
         planilla de luz.Se debe ingresar el valor de costo por kilovatio/hora
         y el número de kilovatios consumidos en el mes. Si el usuario tiene 
         edad mayor a 65 años, se debe descontar el 10%.*/
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double costo_kh;
        double consumo_k;
        double val_total;
        int edad;

        System.out.println("Ingrese el costo por Kilovatio/hora.");
        costo_kh = entrada.nextDouble();
        System.out.println("Ingrese el número de kilovatios consumidos en el mes.");
        consumo_k = entrada.nextDouble();
        System.out.println("Ingrese su edad.");
        edad = entrada.nextInt();

        val_total = costo_kh * consumo_k;

        if (edad > 65) {
            val_total = val_total-((val_total*10)/100);
        }
        System.out.printf("El valor a cancelar es de: %.2f ,en la planilla de luz.", val_total);
    }

}
