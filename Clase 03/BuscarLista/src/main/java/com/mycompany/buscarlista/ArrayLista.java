package com.mycompany.buscarlista;

import java.util.List;
import java.util.ArrayList;

public class ArrayLista {

    private List<Integer> numerosEnteros = new ArrayList<>();
    
    public List<Integer> getList() {
        return numerosEnteros;
    }

    public void vaciarList() {
        numerosEnteros.clear();
        System.out.println("La lista ha sido vaciada con éxito");
    }
    
    public void valorFabrica() {
        numerosEnteros.add(10);
        numerosEnteros.add(20);
        numerosEnteros.add(30);
    }
    
    public void verValores(){
        System.out.println("Los valores actuales de la lista son: ");
        for(int i = 0; i<numerosEnteros.size(); i++){
            System.out.println(numerosEnteros.get(i));
        }
    }

    public void agregarValor(int numero) {
        if (numerosEnteros.contains(numero)) {
            System.out.println("El valor " + numero + " ya se encuentra en la lista");
        } else {
            numerosEnteros.add(numero);
            System.out.println("El número " + numero + " ha sido agregado con éxito");
        }
    }
    
    
    public void buscarValor(int busqueda) {
        if (numerosEnteros.contains(busqueda)) {
            System.out.println("El número " + busqueda + " se encuentra en la lista");
        } else {
           System.out.println("El número " + busqueda + " no se encuentra en la lista");
        }

    }
    
    public void eliminarvalor(int eliminar) {
        if (numerosEnteros.contains(eliminar)) {
            numerosEnteros.remove(Integer.valueOf(eliminar));
            System.out.println("El número " + eliminar + " ha sido eliminado con éxito");
        } else {
            System.out.println("El número " + eliminar + " no se encuentra en la lista");
        }
    }   
}
