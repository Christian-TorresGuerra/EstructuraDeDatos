import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
ArbolBinarioClase arbol = new ArbolBinarioClase();
        Scanner sc = new Scanner(System.in);

        System.out.println("Árbol Binario: insertar 7 valores (ej. 50 30 40 50 60 70)");

        for (int i=0; i < 10; i++){
            System.out.println("Valor " + (i + 1) + ": ");
            int valor = sc.nextInt();
            arbol.insertar(valor);
        }

        System.out.println("\n=== Recorridos del árbol ===");
        arbol.inorden();
        arbol.preorden();
        arbol.postorden();

        sc.close();

    }
}