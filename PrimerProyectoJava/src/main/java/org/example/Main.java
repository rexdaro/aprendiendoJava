package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int[] numeros = {12, 5, 7, 20, 9, 18, 3};
        int multiplosDe3 = 0;
        int numerosMayoresA10 = 0;
        int sumaTotal = 0;
        double promedio;

        for (int i = 0; i < numeros.length; i++) {
            sumaTotal += numeros[i];

            if (numeros[i] > 10){
                numerosMayoresA10++;
            }

            if (numeros[i] > 0 && ((numeros[i] % 3) == 0)){
                multiplosDe3++;
            }
        }

        promedio = (double) sumaTotal / numeros.length;

        System.out.println("el promedio es: " + promedio);
        System.out.println("hay: " + numerosMayoresA10 + " numeros mayores a 10.");
        System.out.println("hay: " + multiplosDe3 + " numeros multiplos de 3.");
    }


}