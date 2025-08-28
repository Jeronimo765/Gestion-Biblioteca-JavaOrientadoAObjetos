public class Usuario {
    String nombre;
    int idUsuario;
    Libro[] librosPrestados; 
    int contadorPrestados;

    public Usuario(String nombre, int idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = new Libro[3]; 
        this.contadorPrestados = 0;
    }

    public void mostrarDatos() {
        System.out.println("Usuario: " + nombre + " (ID: " + idUsuario + ")");
        System.out.println("Libros prestados:");
        for (int i = 0; i < contadorPrestados; i++) {
            System.out.println(" - " + librosPrestados[i].titulo);
        }
    }

    public void agregarPrestamo(Libro libro) {
        if (contadorPrestados < 3) {
            librosPrestados[contadorPrestados] = libro;
            contadorPrestados++;
        } else {
            System.out.println("El usuario ya tiene 3 libros prestados.");
        }
    }

    public void devolverLibro(Libro libro) {
        for (int i = 0; i < contadorPrestados; i++) {
            if (librosPrestados[i].codigo == libro.codigo) {
                for (int j = i; j < contadorPrestados - 1; j++) {
                    librosPrestados[j] = librosPrestados[j+1];
                }
                librosPrestados[contadorPrestados - 1] = null;
                contadorPrestados--;
                break;
            }
        }
    }
}
