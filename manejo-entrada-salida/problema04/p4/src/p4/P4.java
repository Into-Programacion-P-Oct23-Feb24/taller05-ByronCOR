/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p4;

/**
 *
 * @author Usuario
 */
import java.util.Locale;
import java.util.Scanner;

public class P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Problema04: Generar un algoritmo que permita calcular y mostrar el 
        costo de una computadora de escritorio. La misma es comprada por 
        partes; CPU, teclado, pantalla, ratón.*/
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double cpu;
        double teclado;
        double pantalla;
        double raton;
        double total;
        
        System.out.println("Ingresar el precio del CPU: ");
        cpu = entrada.nextDouble();
        System.out.println("Ingresar el precio del Teclado: ");
        teclado = entrada.nextDouble();
        System.out.println("Ingresar el precio de la Pantalla: ");
        pantalla = entrada.nextDouble();
        System.out.println("Ingresar el precio del Ratón: ");
        raton = entrada.nextDouble();
        
        total = cpu + teclado + pantalla + raton;
        
        System.out.printf("El costo de la computadora de escritorio "
                + "es de: %.2f ",total);
    }

}
