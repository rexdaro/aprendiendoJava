package org.example;
import java.sql.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        imprimir(esPerfecto());

    }

    static void imprimir (boolean x) {
        if (x){
            System.out.println("su numero si es un numero perfecto");
        } else {
            System.out.println("su numero no es un numero perfecto");
        }

    }

    static boolean esPerfecto () {

        int num = pedirNumero();
        return  num == calcularPerfecto(num);
    }

    static int pedirNumero () {

        Scanner input = new Scanner(System.in);

        System.out.print("Escriba un numero: ");

        return Integer.parseInt(input.nextLine());
    }

    static int calcularPerfecto (int num) {

        int sumatoriaDeDivisores = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                sumatoriaDeDivisores += i;
            }
        }


        return sumatoriaDeDivisores;
    }


}