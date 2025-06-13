
package com.mycompany.listaenlazada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OpcionesListaenlazada {
    public void ejecutar() {
        System.out.println("Este programa tiene la funcion de buscar un valor en una Lista enlazada");

        Scanner entrada = new Scanner(System.in);
        int opcion;
        Listaconenlace lce1 = new Listaconenlace();
        lce1.valorFabrica();

        do {
            System.out.println("\nLa opción 1 permite ver los valores de la lista. ");
            System.out.println("La opción 2 permite agregar un valor lista. ");
            System.out.println("La opción 3 permite agregar un valor al inicio de la lista. ");
            System.out.println("La opcíon 4 permite conocer el índice del valor en la lista ");
            System.out.println("La opcíon 5 permite buscar un valor en específico de la lista. ");
            System.out.println("La opción 6 permite borrar un valor de la lista. ");
            System.out.println("La opcíon 7 permite eliminar un valor de la lista por su índice ");
            System.out.println("La opción 8 permite vaciar completamente la lista. ");
            System.out.println("Escriba 9 para cerrar el programa");

            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        lce1.verValores();
                        break;
                    case 2:
                        System.out.println("Ingresa el número que quieres agregar: ");
                        int nuevovalor = entrada.nextInt();
                        lce1.agregarValor(nuevovalor);
                        break;
                    case 3:
                        System.out.println("Ingresa el valor que quieres agregar al inicio: ");
                        int valorinicial = entrada.nextInt();
                        lce1.agregarvaloralinicio(valorinicial);
                        break;
                    case 4:
                        System.out.println("Ingresa el número del que quieres conocer su índice: ");
                        int index = entrada.nextInt();
                        lce1.obtenerIndex(index);
                        break;                       
                    case 5:
                        System.out.println("Ingresa el valor que quieres buscar: ");
                        int busqueda = entrada.nextInt();
                        lce1.buscarValor(busqueda);
                        break;
                    case 6:
                        System.out.println("Ingresa el valor que quieres eliminar de la lista por valor: ");
                        int eliminar = entrada.nextInt();
                        lce1.eliminarvalor(eliminar);
                        break;
                    case 7:
                        System.out.println("Ingresa el valor que quieres eliminar de la lista por su índice: ");
                        int eliminarindex = entrada.nextInt();
                        lce1.eliminarIndex(eliminarindex);
                        break;
                    case 8:
                        lce1.vaciarList();
                        break;
                    case 9:
                        System.out.println("Hasta luego...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número entero.");
                entrada.next();
                opcion = 9;
            }
        } while (opcion != 9);
    }
}
