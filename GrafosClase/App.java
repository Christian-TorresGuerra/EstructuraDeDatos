import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Grafo grafo = new Grafo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Grafo dirigido: Agregar conexiones entre todos");
        System.out.println("¿Cuántas aristas deseas ingresar?");
        
        int n = sc.nextInt();
        sc.nextLine(); // Limpia el \n que queda después de nextInt

        for (int i = 0; i < n; i++) {
            System.out.println("Origen: ");
            String origen = sc.nextLine();
            System.out.println("Destino: ");
            String destino = sc.nextLine();

            grafo.agregarArista(origen, destino);
        }
        grafo.mostrar();


        sc.close(); // Siempre es buena práctica cerrar el Scanner
    }
}