
package com.mycompany.simuladordepilaycola;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {

    private Queue<String> clientes = new LinkedList<>();

    public Queue<String> getCola() {
        return new LinkedList<>(clientes);
    }

    public void nuevocliente() {
        int almacencola = clientes.size();
        clientes.add("cliente" + almacencola);
        System.out.println("Un nuevo cliente ha llegado");
    }

    public void grupodeClientes(int numeroClientes) {
        if (numeroClientes <= 0) {
            System.out.println("El número de clientes es inválido");
        } else {
            int inicio = clientes.size();
            for (int i = 0; i < numeroClientes; i++) {
                clientes.add("cliente" + (inicio + i));
            }
            System.out.println("Han llegado "+numeroClientes + " clientes nuevos");
        }
    }
    
    public void primeroenllegar() {
        if (!clientes.isEmpty()) {
            String primerCliente = clientes.peek();
            System.out.println("El primer cliente en llegar es: " + primerCliente);
        } else {
            System.out.println("No hay clientes en la cola");
        }
    }
    
    public void clientemasreciente() {
        String masReciente = ((LinkedList<String>) clientes).getLast();
        System.out.println("El cliente más reciente es: " + masReciente);
    }

    public void atenderCliente() {
        if (!clientes.isEmpty()) {
            String clienteAtendido = clientes.poll();
            System.out.println("El " + clienteAtendido + " ha sido atendido");
        } else {
            System.out.println("No hay clientes para atender");
        }
    }
    
    /*public void cerrartodo() {
        if (!archivos.isEmpty()) {
            
            for (int i = 0; i < archivos.size(); i++) {
                String archivoCerrado = archivos.poll();
                System.out.println("El " + archivoCerrado + " ha sido cerrado");
            }
        } else {
            System.out.println("No hay archivos abiertos para cerrar");
        }
    } */
    /*
        El bloque anterior no funciona debido a que hay errores en la lógica graves
        el principal es que mientras i sube, el tamaño de la cola baja, haciendo una porporcion de 2
        en 2 lo qu eprovoca una pérdida de elementos impresos en la cola e incluso que se los salte
    
        el siguiente es una alternativa funcional
    */
    
    //___________________________________________
    
    /*public void cerrartodo() {
        if (!archivos.isEmpty()) {
            for (; !archivos.isEmpty();) {
                String archivoCerrado = archivos.poll();
                System.out.println("El " + archivoCerrado + " ha sido cerrado");
            }
        } else {
            System.out.println("No hay archivos abiertos para cerrar");
        }
    }*/
    
    /* Ese ejemplo es funcional de for, ya que no emplea ningun índice que aumente, de modo que funcione
        unicamente haciendo el ciclo mientras la cola no este vacía y dentro de este for se va eliminando
        elemento por elemento de la cola, por lo que a pesar de no haber una iteración interna del for
        en algún punto si podrá terminar, sin embargo, se comporta igual que un while, asi que....
    */
    public void atenderaTodos() {
        if (!clientes.isEmpty()) {
            while (!clientes.isEmpty()) {
                String clientAtendido = clientes.poll();
                System.out.println("El " + clientAtendido + " ha sido atendido");
            }
        } else {
            System.out.println("No hay clientes por atender");
        }
    }
}
