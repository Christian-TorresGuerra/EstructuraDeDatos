
package com.mycompany.simuladordepilaycola;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Opcion1Cola {
    public void ejecutar(){
         Cola c1 = new Cola();
         Scanner entrada = new Scanner(System.in);
         int opcion = 0;
         
         do {
            try {
                System.out.println("\n--- SUBMENÚ ---");
                System.out.println("1.- Ingresar un cliente");
                System.out.println("2.- Ingresar un grupo de clientes");
                System.out.println("3.- Mostrar al primero en llegar");
                System.out.println("4.- Mostrar al cliente más reciente");
                System.out.println("5.- atender al cliente correspondiente");
                System.out.println("6.- atender a todos");
                System.out.println("7.- Volver al menú principal");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        c1.nuevocliente();
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad de clientes que ingresaron: ");
                        int cantidaddearchivos = entrada.nextInt();
                        c1.grupodeClientes(cantidaddearchivos);
                        break;
                    case 3:
                        c1.primeroenllegar();
                        break;
                    case 4:
                        c1.clientemasreciente();
                        break;
                    case 5:
                        c1.atenderCliente();
                        break;
                    case 6:
                        c1.atenderaTodos();
                        break;
                    case 7:
                        System.out.println("regresando al menu principal...");
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
        } while (opcion != 7);
    }
}
