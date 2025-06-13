package listaenteros;

import java.util.ArrayList;

public class ListaEnteros {
    private ArrayList<Integer> lista;

    public ListaEnteros() {
        lista = new ArrayList<>();
    }

    // Agrega un elemento al final de la lista
    public void agregar(int elemento) {
        lista.add(elemento);
    }

    // Elimina la primera aparición del elemento
    public boolean eliminar(int elemento) {
        return lista.remove((Integer) elemento);
    }

    // Verifica si la lista contiene el elemento
    public boolean contiene(int elemento) {
        return lista.contains(elemento);
    }

    // Obtiene el elemento en el índice dado
    public int obtener(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            return lista.get(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango.");
        }
    }

    // Devuelve la cantidad de elementos en la lista
    public int tamaño() {
        return lista.size();
    }

    // Muestra todos los elementos de la lista
    public void mostrar() {
        System.out.println(lista);
    }
}