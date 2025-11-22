package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el monto a pagar: ");
        int montoAPagar = Integer.parseInt(input.nextLine());

        int billetes100 = 0;
        int billetes50 = 0;
        int billetes20 = 0;
        int billetes10 = 0;
        int billetes5 = 0;
        int billetes2 = 0;
        int billetes1 = 0;


        while (montoAPagar > 0){
            if (100 <= montoAPagar) {
                montoAPagar -= 100;
                billetes100++;
            } else if (50 <= montoAPagar)  {
                montoAPagar -= 50;
                billetes50++;
            } else if (20 <= montoAPagar)  {
                montoAPagar -= 20;
                billetes20++;
            } else if (10 <= montoAPagar)  {
                montoAPagar -= 10;
                billetes10++;
            } else if (5 <= montoAPagar)  {
                montoAPagar -= 5;
                billetes5++;
            } else if (2 <= montoAPagar)  {
                montoAPagar -= 2;
                billetes2++;
            } else if (1 <= montoAPagar)  {
                montoAPagar -= 1;
                billetes1++;
            }

        }

        System.out.println(billetes100 + " Billetes de 100$");
        System.out.println(billetes50 + " Billetes de 50$");
        System.out.println(billetes20 + " Billetes de 20$");
        System.out.println(billetes10 + " Billetes de 10$");
        System.out.println(billetes5 + " Billetes de 5$");
        System.out.println(billetes2 + " Billetes de 2$");
        System.out.println(billetes1 + " Billetes de 1$");



    }
}