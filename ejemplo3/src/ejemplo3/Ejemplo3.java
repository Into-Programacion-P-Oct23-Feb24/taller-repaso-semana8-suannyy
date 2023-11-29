/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3;

import java.util.Scanner;
import java.util.Locale;

public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int m;
        int suma = 0;
        System.out.println("ingrese el multiplicado");
        m = entrada.nextInt();
        System.out.println("ingrese el multiplicador");
        n = entrada.nextInt();
        while (n >= 1) {
            if (m % 2 == 1) {
                suma = suma + n;
            }
            m = m / 2;
            n = n * 2;
         
        }
        System.out.printf("%d\n", suma);

    }

}
