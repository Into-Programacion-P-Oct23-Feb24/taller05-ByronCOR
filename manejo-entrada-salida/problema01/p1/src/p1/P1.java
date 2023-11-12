/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Problema01:Generar un programa que permita calcular y presentar el
         * área de un triángulo. Los datos deben ser pedidos al usuario.
         */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double area;

        System.out.println("Ingresar cuanto mide la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingresar cuanto mide la altura del triangulo");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("La area del triangulo es: %.2f  ", area);
    }

}
