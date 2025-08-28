public class Biblioteca {
    Libro[] listaLibros = new Libro[100];
    Usuario[] listaUsuarios = new Usuario[100];
    String[] registroPrestamos = new String[100];
    int totalLibros = 0;
    int totalUsuarios = 0;
    int totalPrestamos = 0;

    public Biblioteca() {
        listaLibros = new Libro[100];
        listaUsuarios = new Usuario[100];
        registroPrestamos = new String[100];
    }

    public void registrarLibro(Libro libro) {
        listaLibros[totalLibros] = libro;
        totalLibros++;
    }

    public void registrarUsuario(Usuario usuario) {
        listaUsuarios[totalUsuarios] = usuario;
        totalUsuarios++;
    }

    public void prestarLibro(Libro libro, Usuario usuario) {
        if (libro.disponible && usuario.contadorPrestados < 3) {
            libro.marcarPrestado();
            usuario.agregarPrestamo(libro);

            java.util.Date fecha = new java.util.Date(); 
            registroPrestamos[totalPrestamos] = "Libro: " + libro.titulo + " prestado a " + usuario.nombre + " el "
                    + fecha;
            totalPrestamos++;

            System.out.println("Préstamo realizado con éxito.");
        } else {
            System.out.println("No se pudo prestar el libro.");
        }
    }

    public void devolverLibro(Libro libro, Usuario usuario, int diasRetraso) {
        libro.marcarDisponible();
        usuario.devolverLibro(libro);

        if (diasRetraso > 0) {
            int multa = diasRetraso * 500;
            System.out.println("Libro devuelto con retraso. Multa: $" + multa);
        } else {
            System.out.println("Libro devuelto a tiempo.");
        }
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles:");
        for (int i = 0; i < totalLibros; i++) {
            if (listaLibros[i].disponible) {
                System.out.println("- " + listaLibros[i].titulo);
            }
        }
    }

    public void mostrarUsuarios() {
        System.out.println("Usuarios registrados:");
        for (int i = 0; i < totalUsuarios; i++) {
            listaUsuarios[i].mostrarDatos();
        }
    }

    public void mostrarHistorialPrestamos() {
        System.out.println("Historial de préstamos:");
        for (int i = 0; i < totalPrestamos; i++) {
            System.out.println(registroPrestamos[i]);
        }
    }
}
