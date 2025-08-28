public class Libro {
    String titulo;
    String autor;
    Integer codigo;
    boolean disponible;

    public Libro(String titulo, String autor, Integer codigo, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponible = disponible;
    }

    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Código: " + codigo);
        System.out.println("Disponible: " + disponible);
    }

    public void marcarPrestado() {
        disponible = false;
        System.out.println("El libro está prestado");
    }

    public void marcarDisponible() {
        disponible = true;
        System.out.println("El libro está disponible");
    }
}
