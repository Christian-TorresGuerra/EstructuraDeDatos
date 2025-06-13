/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladordepilaycola;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Opcion2Pila {
    public void ejecutar(){
         Pila p1 = new Pila();
         Scanner entrada = new Scanner(System.in);
         int opcion = 0;
         
         do {
            try {
                System.out.println("\n--- SUBMENÚ ---");
                System.out.println("1.- Abrir un nuevo archivo más");
                System.out.println("2.- Abrir un grupo de archivos");
                System.out.println("3.- Mostrar el archivo más reciente");
                System.out.println("4.- Mostrar el primer archivo en abrirse");
                System.out.println("5.- Conocer la cantidad de archivos abiertos");
                System.out.println("6.- cerrar el archivo correspondiente");
                System.out.println("7.- cerrar todos los archivos");
                System.out.println("8.- Volver al menú principal");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        p1.abrirArchivo();
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad de clientes que ingresaron: ");
                        int cantidaddearchivos = entrada.nextInt();
                        p1.abrirGrupoArchivos(cantidaddearchivos);
                        break;
                    case 3:
                        p1.mostrarArchivoReciente();
                        break;
                    case 4:
                        p1.mostrarPrimerArchivo();
                        break;
                    case 5:
                        p1.cantidadArchivos();
                        break;
                    case 6:
                        p1.cerrarArchivo();
                        break;
                    case 7:
                        p1.cerrarTodo();
                        break;
                    case 8:
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
        } while (opcion != 8);
    }
}
