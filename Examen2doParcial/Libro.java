public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false; // por defecto los libros ya están disponibles a menos que los pidan
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isPrestado() { return prestado; }

    public void prestar() { this.prestado = true; }
    public void devolver() { this.prestado = false; }
}