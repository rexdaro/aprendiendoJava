package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int estrellas;

        do {
            System.out.print("Ingrese la cantidad de la base de estrellas que contendra el arbol de navidad: ");
            estrellas = Integer.parseInt(input.nextLine());
        } while (estrellas % 2 == 0 || estrellas < 3);






    }
}