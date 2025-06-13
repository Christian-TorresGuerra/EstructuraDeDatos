
package com.mycompany.simuladordepilaycola;


import java.util.Stack;

public class Pila {
    /*Este me costo más asi que esta mejor organizado para no perderme*/

    // 1. Atributos privados (ocultos)
    private final Stack<String> archivos = new Stack<>();
    private int contadorArchivos = 0;

    // 2. Método público para agregar un archivo
    public void abrirArchivo() {
        contadorArchivos++;
        String nombre = "archivo" + contadorArchivos + ".txt";
        archivos.push(nombre);
        System.out.println("Se abrió " + nombre);
    }

    // 3. Método público para agregar varios archivos
    public void abrirGrupoArchivos(int cantidad) {
        if (cantidad > 0) {
            for (int i = 0; i < cantidad; i++) {
                abrirArchivo(); // Reutiliza lógica encapsulada
            }
        } else {
            System.out.println("Cantidad inválida");
        }
    }

    // 4. Ver archivo más reciente (sin eliminar)
    public void mostrarArchivoReciente() {
        if (!archivos.isEmpty()) {
            System.out.println("Archivo más reciente: " + archivos.peek());
        } else {
            System.out.println("La pila está vacía");
        }
    }

    // 5. Ver el primer archivo que se abrió
    public void mostrarPrimerArchivo() {
        if (!archivos.isEmpty()) {
            System.out.println("Primer archivo: " + archivos.firstElement()); // o archivos.get(0)
        } else {
            System.out.println("La pila está vacía");
        }
    }

    // 6. Cerrar un archivo (el más reciente)
    public void cerrarArchivo() {
        if (!archivos.isEmpty()) {
            System.out.println("Cerrando " + archivos.pop());
        } else {
            System.out.println("No hay archivos por cerrar");
        }
    }

    // 7. Cerrar todos los archivos
    public void cerrarTodo() {
        while (!archivos.isEmpty()) {
            cerrarArchivo(); // Reutiliza método encapsulado
        }
    }

    // 8. Método público para saber cuántos archivos hay
    public void cantidadArchivos() {
        System.out.println("Cantidad de archivos abiertos es de: " + archivos.size());
    }

}
