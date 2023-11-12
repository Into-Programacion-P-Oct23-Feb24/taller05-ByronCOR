/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 */
import java.util.Scanner;
import java.util.Locale;

public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Problema 3: Elaborar una solución que permita leer los datos de un 
        automóvil (marca, origen y costo) imprima el impuesto por pagar y el 
        precio de venta (incluido el impuesto). Si el origen es Alemania el 
        impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia,
        15%, y si es de USA, 8%*/
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca_car;
        String origen_car;
        double costo_car;
        double impuesto;
        double val_total;

        System.out.println("Ingrese la marca del autómovil");
        marca_car = entrada.nextLine();
        System.out.println("Ingrese  el pais de origen:\n"
                +"*Ejem:USA,Alemania,Japón,Italia,ect....");
        origen_car = entrada.nextLine();
        System.out.println("Ingrese el precio del autómovil");
        costo_car = entrada.nextDouble();
        
        val_total = costo_car;
        impuesto = 0;

        if (origen_car.equals("Alemania")) {
            impuesto = (costo_car * 20) / 100;
            val_total = impuesto + costo_car;
        } else {
            if (origen_car.equals("Japón")) {
                impuesto = (costo_car * 30) / 100;
                val_total = impuesto + costo_car;
            } else {
                if (origen_car.equals("Italia")) {
                    impuesto = (costo_car * 15) / 100;
                    val_total = impuesto + costo_car;
                } else {
                    if (origen_car.equals("USA")) {
                        impuesto = (costo_car * 8) / 100;
                        val_total = impuesto + costo_car;
                    }
                }
            }
        }

        System.out.printf("Marca :%s\nOrigen:%s\nImpuesto:%.2f\n"
                + "Precio de venta:%.2f",marca_car,origen_car,impuesto,val_total);
    }

}
