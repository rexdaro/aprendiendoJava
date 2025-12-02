package org.example;
import java.sql.Array;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del articulo: ");
        int precio = Integer.parseInt(input.nextLine());

        char categoria = ' ';

        while (!(categoria == 'A' || categoria == 'B' || categoria == 'C')) {
            System.out.print("Ingrese la categoria del articulo [A ,B ,C]: ");
            categoria = Character.toUpperCase(input.nextLine().charAt(0));
        }

        switch (categoria){
            case 'A':
                System.out.println("Descuento aplicado: 10%");
                System.out.println("Precio final: " + (precio - ((double) precio * 0.1)));
                break;
            case 'B':
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio final: " + (precio - ((double) precio * 0.15)));
                break;
            case 'C':
                System.out.println("Descuento aplicado: 20%");
                System.out.println("Precio final: " + (precio - ((double) precio * 0.2)));
                break;
            default:
                break;
        }
    }



}