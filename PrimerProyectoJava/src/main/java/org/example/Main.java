package org.example;
import java.sql.Array;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {

    class Auto {
        String marca;
        String modelo;
        int anio;

        Auto(String marca, String modelo, int anio){
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
        }

        void mostrarInfo (){
            System.out.println(marca);
            System.out.println(modelo);
            System.out.println(anio);
        }
    }

    Auto corolla = new Auto("Toyota", "Corolla GLX", 2010);

    corolla.mostrarInfo();

        System.out.println("programita xd");


    }





}