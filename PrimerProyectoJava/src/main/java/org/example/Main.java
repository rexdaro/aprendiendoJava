package org.example;
import java.sql.Array;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double DESCUENTO_ESPECIAL  =  0.10;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = Integer.parseInt(input.nextLine());

        double descuentoAplicado = calcularDescuentoEspecial(precio);

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + (precio - descuentoAplicado));

    }


    static double calcularDescuentoEspecial(double  precio){
        return precio * DESCUENTO_ESPECIAL;
    }
}