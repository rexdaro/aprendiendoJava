package org.example;
import java.sql.Array;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();




        System.out.println("El costo de envío es: " + calcularCostoEnvio(peso, zona));
        System.out.println("El costo de envío es: " + calcularTotalCompra(peso, precio, zona));


    }

    static double calcularCostoEnvio(double peso, String zona){
        if (zona.equals("Nacional")) {
            return 5 * peso;
        } else {
            return 10 * peso;
        }
    };

    static double calcularTotalCompra(double peso, double precio, String zona) {

        double envio = calcularCostoEnvio(peso, zona);


        return precio + envio;
    };


}