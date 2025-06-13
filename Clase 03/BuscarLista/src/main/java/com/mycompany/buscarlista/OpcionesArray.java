
package com.mycompany.buscarlista;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OpcionesArray {
    public void ejecutar() {
        System.out.println("Este programa tiene la funcion de buscar un valor en una ArrayList");

        Scanner entrada = new Scanner(System.in);
        int opcion;
        ArrayLista ar1 = new ArrayLista();
        ar1.valorFabrica();

        do {
            System.out.println("\nLa opción 1 permite ver los valores de la lista. ");
            System.out.println("La opción 2 permite agregar un valor lista. ");
            System.out.println("La opcíon 3 permite buscar un valor en específico de la lista. ");
            System.out.println("La opción 4 permite borrar un valor de la lista. ");
            System.out.println("La opción 5 permite vaciar completamente la lista. ");
            System.out.println("Escriba 6 para cerrar el programa");

            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        ar1.verValores();
                        break;
                    case 2:
                        System.out.println("Ingresa el número que quieres agregar: ");
                        int nuevovalor = entrada.nextInt();
                        ar1.agregarValor(nuevovalor);
                        break;
                    case 3:
                        System.out.println("Ingresa el valor que quieres buscar: ");
                        int busqueda = entrada.nextInt();
                        ar1.buscarValor(busqueda);
                        break;
                    case 4:
                        System.out.println("Ingresa el valor que quieres eliminar de la lista: ");
                        int eliminar = entrada.nextInt();
                        ar1.eliminarvalor(eliminar);
                        break;
                    case 5:
                        ar1.vaciarList();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número entero.");
                entrada.next();
                opcion = 0;
            }
        } while (opcion != 6);
    }
}
