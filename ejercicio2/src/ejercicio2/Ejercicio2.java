/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero;
        int contador = 1;

        System.out.println("ingrese numero(debe ser positivo)");
        numero = entrada.nextInt();

        if (numero > 0 && numero % 2 == 0) {
            while (contador <= numero) {
                contador = contador + 1;
            }
        } else {
            if (numero > 0 && numero % 2 == 1) {
                System.out.println("error: numero ingresado es positivo pero "
                        + "impar");
            } else {
                if (numero > 0 && numero % 2 == 0) {
                    System.out.println("error: numero ingresado es par pero"
                            + "negativo");
                } else {
                    if (numero > 0 && numero % 2 == 0) {
                        System.out.println("error: numero ingresado es impar y"
                                + "negativo");
                    }

                }
            }
        }
    }
}
