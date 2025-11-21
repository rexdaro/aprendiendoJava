package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static final int CANT_PASADAS = 3;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("ingrese el ancho del terreno: ");
        int ancho = Integer.parseInt(input.nextLine());
        System.out.print("ingrese el largo del terreno: ");
        int largo = Integer.parseInt(input.nextLine());
        System.out.print("ingrese el precio del metro cuadrado del terreno: ");
        int precioM2 = Integer.parseInt(input.nextLine());



        int areaDeTerreno = ancho * largo;
        int cantidadDeAlambre = ((ancho * 2) + (largo * 2)) * CANT_PASADAS;
        int precioTerreno = precioM2 * areaDeTerreno;

        System.out.println(precioTerreno + "usd");
        System.out.println(cantidadDeAlambre + "m");

    }
}