/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p5;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import java.util.Locale;

public class P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Problema05: Se debe generar un algoritmo que permite calcular y 
        mostrar el valor total a pagar mensual de servicios digitales de una
        persona. Los servicios digitales son: netflix, youtube premium, dropbox,
        spotify. Si la persona es menor a 30 años se descuenta el 20% del total
        mensual.*/
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int edad;
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        double total;
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese el precio mensual del servicio de Netflix");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el precio mensual del servicio de Youtube premium");
        youtube = entrada.nextDouble();
        System.out.println("Ingrese el precio mensual del servicio de Dropbox");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el precio mensual del servicio de Spotify");
        spotify = entrada.nextDouble();
        
        total = netflix + youtube + dropbox + spotify;
        
        if(edad < 30){
        total = total - ((total * 30) / 100);
        }
        
        System.out.printf("el valor total a pagar mensual de servicios"
                + " digitales es de %.2f ", total);
    }

}
