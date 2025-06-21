public class ArbolBinarioClase {
    // Es una variable privada llamada raiz de la clase nodo
    private Nodo raiz;

    // Metodo donde se va insertar el valor de raiz dentro de nuestra logica de arbo
    // binario
    public void insertar(int valor) {
        raiz = instarRecursivo(raiz, valor);

    }

    // Metodo de logica de nuestro arbol binario
    private Nodo instarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);

        }
        if (valor < nodo.valor) {
            nodo.izquierda = instarRecursivo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = instarRecursivo(nodo.derecha, valor);
        }
        return nodo;

    }

    // Logica de funcionamiento de busqueda inorden dentro de arbol binario
    public void inorden() {
        System.out.println("Recorrido inorden");
        inordenRec(raiz);
        System.out.println();

    }

    private void inordenRec(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.valor + "");
            inordenRec(nodo.derecha);
            inordenRec(nodo.izquierda);

        }
    }

    // Logica de funcionamiento de busqueda preorden dentro de arbol binario
    public void preorden() {
        System.out.println("recorrido preorden");
        preordenRec(raiz);
        System.out.println();
    }

    private void preordenRec(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.valor + "");
            preordenRec(nodo.izquierda);
            preordenRec(nodo.derecha);
        }
    }

    public void postorden() {
        System.out.println("Recorrido postorden");
        postordenRec(raiz);
        System.out.println();
    }

    private void postordenRec(Nodo nodo) {
        if (nodo != null) {
            postordenRec(nodo.izquierda);
            postordenRec(nodo.derecha);
            System.out.println(nodo.valor + "");

        }

    }

}