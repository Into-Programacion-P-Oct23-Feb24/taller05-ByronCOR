/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Problema 2 Solución que imprima el costo de un pedido de un artículo
         * del cual se tiene la descripción, la cantidad que se requiere y el
         * precio unitario. Si la cantidad pedida excede de 50 unidades, se hace
         * un descuento de 15%:.
         */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String descrip;
        double precio_uni;
        double cost_total;
        int cant_pedida;

        System.out.println("Ingresar la descripción del artículo");
        descrip = entrada.nextLine();
        System.out.println("Ingrese el precio unitario del producto");
        precio_uni = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de unidades que requiere");
        cant_pedida = entrada.nextInt();

        cost_total = precio_uni * cant_pedida;

        if (cant_pedida > 50) {
            cost_total = cost_total - ((cost_total * 15) / 100);
        }
        System.out.printf("DESCRIPCIÓN:\n%s\nSu costo total de articulos"
                + " requeridos es de:%.2f", descrip, cost_total);
    }
}
