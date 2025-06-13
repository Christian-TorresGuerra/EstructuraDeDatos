
package com.mycompany.menusinfunciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menusinfunciones {

    public static void main(String[] args) {
        System.out.println("Este programa tiene la funcion de buscar un valor en una ArrayList");

        Scanner entrada = new Scanner(System.in);
        int opcion;


        do {
            System.out.println("\nLa opción 1 permite sumar");
            System.out.println("La opción 2 permite restar");
            System.out.println("La opción 3 permite multiplicar");
            System.out.println("La opción 4 permite dividir");
            System.out.println("La opción 5 permite elevar a 2");
            System.out.println("La opción 6 permite obtener raiz");
            System.out.println("La opcion 7 cierra el porgrama");
            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Sumando...");
                        break;
                    case 2:
                        System.out.println("Restando...");
                        break;
                    case 3:
                        System.out.println("Multiplicando...");
                        break;
                    case 4:
                        System.out.println("Dividiendo...");
                        break;
                    case 5:
                        System.out.println("Elevando...");
                        break;
                    case 6:
                        System.out.println("Obteniendo raiz...");
                        break;
                        
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número entero.");
                entrada.next();
                opcion = 0;
            }
        } while (opcion != 7);
    }
}
