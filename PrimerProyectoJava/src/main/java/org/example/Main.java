package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static final String NOMBRE = "Manuel";
    static  final String APELLIDO = "Rivas";

    public static void main(String[] args) {

        saludar(NOMBRE, APELLIDO);
    }

    public static void saludar(String nombre1, String nombre2){

        System.out.println("Hola " + nombre1 + " " + nombre2);

    };
}