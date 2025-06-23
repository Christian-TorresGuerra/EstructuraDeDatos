import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes deseas ingresar?: ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine();

        Estudiante[] estudiantes = new Estudiante[cantidadEstudiantes];

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("\nEstudiante #" + (i + 1));
            System.out.print("Ingresa el nombre del estudiante: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa la edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingresa la carrera: ");
            String carrera = scanner.nextLine();

            estudiantes[i] = new Estudiante(nombre, edad, carrera);
        }

        // Mostrar información de todos los estudiantes
        System.out.println("\nInformación de los estudiantes:");
        for (Estudiante alumno : estudiantes) {
            alumno.mostrarInformación();
            System.out.println("Nombre en mayúsculas: " + alumno.obtenerNombreMayusculas());
            System.out.println("-----------------------------");
        }
    }
}
