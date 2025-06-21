import java.util.*;

public class Grafo {
    private Map<String, List<String>> adyacencias;

    public Grafo(){
        adyacencias = new HashMap();
    }

    public void agregarVertice (String vertice){
        adyacencias.putIfAbsent(vertice, new ArrayList<>());
    }

    public void agregarArista(String origen, String destino){
        if (!adyacencias.containsKey(origen)){
            agregarVertice(origen);
        }
        if(!adyacencias.containsKey(destino)){
            agregarVertice(destino);
        }
        adyacencias.get(origen).add(destino); //Solo una direccion (grafo dirigido)
    }

    public void mostrar (){
        System.out.println("grafo dirigido: ");
        for (String vertice: adyacencias.keySet()){
            System.out.println("_ " + vertice + " -> " + adyacencias.get(vertice));
        }

    }
    
}
