public class Estudiante {
    //Varuables (atributos)
    String nombre;
    int edad;
    String carrera;

    //Constructor
        public Estudiante(String nombreEstudiante, int edadEstudiante, String carreraEstudiante) {
            this.nombre = nombreEstudiante;
            this.edad = edadEstudiante;
            this.carrera = carreraEstudiante;
        }

        //Metodo que muestra los datos del estudiante
        public void mostrarInformación() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Carrera: " + carrera);
        }

        //Metodo que devuelve el nombre en Mayusculas (funcion de retorno)
        public String obtenerNombreMayusculas() {
            return nombre.toUpperCase();
        }
    }

