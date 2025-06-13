
package com.mycompany.simuladordepilaycola;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void ejecutar(){
         Scanner entrada = new Scanner(System.in);
         int opcion = 0;
         
         do {
            try {
                System.out.println("\n--- MENÚ ---");
                System.out.println("1.- Ejemplo de una cola");
                System.out.println("2.- Abrir un grupo de archivos");
                System.out.println("3.- Cerrar el programa");

                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        Opcion1Cola c1 = new Opcion1Cola();
                        c1.ejecutar(); 
                        break;
                    case 2:
                        Opcion2Pila p1 = new Opcion2Pila();
                        p1.ejecutar();
                        break;
                    case 3:
                        System.out.println("Hasta la próxima...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un número válido.");
                entrada.nextLine(); // Limpiar buffer
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                entrada.nextLine(); // Limpiar por si queda basura
            }
        } while (opcion != 3);
         
    }
}
