package org.example;
import java.sql.Array;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int [] numeros = new int[8];

        pedirNumeros(numeros);

        double promedio = calcularPromedio(numeros);

        System.out.println("El promedio de los numeros ingresados es: " + promedio);

        mostrarNumerosMayoresAPromedio(promedio, numeros);

    }

    static void pedirNumeros(int[] num){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            num[i] = Integer.parseInt(input.nextLine());
        }

    }

    static double calcularPromedio(int[] num){

        double promedio;
        int acumulador = 0;

        for (int i = 0; i < num.length; i++) {
            acumulador += num[i];
        }

        promedio = (double) acumulador / num.length;

        return promedio;
    }

    static void mostrarNumerosMayoresAPromedio(double promedio, int [] num){

        System.out.println("Los numeros mayores al promedio son: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] > promedio){

                System.out.println(num[i]);

            }
        }

    }



}