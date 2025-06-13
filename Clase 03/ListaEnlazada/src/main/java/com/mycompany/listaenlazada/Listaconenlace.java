
package com.mycompany.listaenlazada;

import java.util.LinkedList;
import java.util.List;

public class Listaconenlace {

    private List<Integer> numerosEnteros = new LinkedList<>();  // CAMBIO

    public List<Integer> getList() {
        return numerosEnteros;
    }    

    public void valorFabrica() {
        numerosEnteros.add(10);
        numerosEnteros.add(20);
        numerosEnteros.add(30);
    }

    public void verValores() {
        System.out.println("Los valores actuales de la lista son: ");
        for (int i = 0; i < numerosEnteros.size(); i++) {
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
    
    public void agregarvaloralinicio(int valoralinicio){
        numerosEnteros.add(0, valoralinicio);
        System.out.println("El valor " + valoralinicio + " ha sido agregado con éxito");
    }
    
    public void obtenerIndex(int index) {
        int indice = numerosEnteros.indexOf(index);
        if (indice != -1) {
            System.out.println("El índice del valor " + index + " es " + indice);
        } else {
            System.out.println("El valor " + index + " no se encuentra en la lista.");
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
        
    public void eliminarIndex(int indic3liminar){
        if (indic3liminar >= 0 && indic3liminar< numerosEnteros.size()) {
            System.out.println("El valor de: " + numerosEnteros.get(indic3liminar) + " ha sido eliminado...");
            numerosEnteros.remove(indic3liminar);
        } else {
            System.out.println("Valor de índice no encontrado...");
        }
    }
    
    public void vaciarList() {
        numerosEnteros.clear();
        System.out.println("La lista ha sido vaciada con éxito");
    }
}

