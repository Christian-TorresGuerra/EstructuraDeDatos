package listaenteros;

public class ListaMain {
    public static void main(String[] args) {
        ListaEnteros miLista = new ListaEnteros();
        
        miLista.agregar(10);
        miLista.agregar(20);
        miLista.agregar(30);
        
        
        miLista.mostrar(); // [10, 20, 30]

        miLista.eliminar(20);
        miLista.mostrar(); // [10, 30]

        System.out.println("Contiene 30? " + miLista.contiene(30)); // true
        System.out.println("Elemento en índice 1: " + miLista.obtener(1)); // 30
        System.out.println("Tamaño: " + miLista.tamaño()); // 2
    }
}