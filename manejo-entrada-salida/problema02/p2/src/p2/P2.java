/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p2;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import java.util.Locale;
public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Problema02 :Generar un algoritmo que permite ingresar los gastos de
         * tres hijos de un padre de familia; calcular y mostrar el total de
         * gastos de los hijos del padre de familia.
         */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double child_1;
        double child_2;
        double child_3;
        double total;
        
        System.out.println("Ingresar los gastos del primer hijo");
        child_1 = entrada.nextDouble();
        System.out.println("Ingresar los gastos del segundo hijo");
        child_2 = entrada.nextDouble();
        System.out.println("Ingresar los gastos del tercer hijo");
        child_3 = entrada.nextDouble();
        
        total = child_1 + child_2 + child_3;
        
        System.out.printf("El total de los gastos de los tres hijos es de: %.2f ", total);
    }

}
