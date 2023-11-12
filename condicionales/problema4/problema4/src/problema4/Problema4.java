/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

/**
 */
import java.util.Scanner;
import java.util.Locale;

public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Problema 4: En una hosteria de la ciudad de Loja se hace un descuento
        del 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda 
        más de 10 días y del 20% si se hospeda más de 15 días. Elaborar un 
        solución que pida como datos de entrada el número de días y el precio 
        diario de la habitación y luego calcule e imprima el subtotal por pagar,
        el descuento y el total por pagar.*/
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int num_day;
        double val_habi;
        double subtotal;
        double desc;
        double total;

        System.out.println("Ingrese el número de días de hospedaje:");
        num_day = entrada.nextInt();
        System.out.println("Ingrese el precio diario de la habitación:");
        val_habi = entrada.nextDouble();

        subtotal = num_day * val_habi;
        desc = 0;
        total = subtotal;

        if (num_day > 5) {
            desc = (subtotal * 10) / 100;
            total = subtotal - desc;
        } else {
            if (num_day > 10) {
                desc = (subtotal * 15) / 100;
                total = subtotal - desc;
            } else {
                if (num_day > 15) {
                    desc = (subtotal * 20) / 100;
                    total = subtotal - desc;
                }
            }
        }
        System.out.printf("El subtotal es:%.2f\nEl descuento es"
                + ":%.2f\nEl total por pagar es:%.2f", subtotal, desc, total);

    }

}
