package org.example;
import java.sql.Array;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 1;
        int acc = 0;

        while (num != 0){
            System.out.print("Ingrese un número (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());

            if (num % 2 == 0) {
                acc += num;
            }

        }

        System.out.println("la sumatoria de los numeros pares es: " + acc);

    }


}