 import java.util.*;

public class RegistroEstudiantes {
    //Aqui se almacenarán los estudiantes
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private Scanner entrada = new Scanner(System.in);
    
    public void registrarEstudiante() {
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("ID: ");
        String id = entrada.nextLine();
        System.out.print("Grado: ");
        String grado = entrada.nextLine();
        System.out.print("Grupo: ");
        String grupo = entrada.nextLine();

        Estudiante nuevo = new Estudiante(nombre, id, grado, grupo);
        listaEstudiantes.add(nuevo);
        System.out.println("Estudiante registrado con éxito.");
    }
    
    //Método para ver la lista de estudiantes
    public void verListaEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\n📘 Lista de Estudiantes:");
            for (Estudiante e : listaEstudiantes) {
                System.out.println("Nombre: " + e.getNombre() + ", ID: " + e.getId()
                        + ", Grado: " + e.getGrado() + ", Grupo: " + e.getGrupo());
            }
        }
    }
}