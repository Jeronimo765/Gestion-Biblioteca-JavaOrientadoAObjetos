public class MainBiblioteca {
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();

        
        Libro libro1 = new Libro("El Quijote", "Cervantes", 101, true);
        Libro libro2 = new Libro("Cien años de soledad", "García Márquez", 102, true);
        Libro libro3 = new Libro("La Odisea", "Homero", 103, true);

        
        biblioteca.registrarLibro(libro1);
        biblioteca.registrarLibro(libro2);
        biblioteca.registrarLibro(libro3);

        
        Usuario usuario1 = new Usuario("Jeronimo", 1);
        Usuario usuario2 = new Usuario("Michelle", 2);

        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        
        System.out.println("\n Estado inicial ");
        biblioteca.mostrarLibrosDisponibles();
        biblioteca.mostrarUsuarios();

        
        System.out.println("\n Préstamos ");
        biblioteca.prestarLibro(libro1, usuario1);
        biblioteca.prestarLibro(libro2, usuario2);

        System.out.println("\n Historial ");
        biblioteca.mostrarHistorialPrestamos();

      
        System.out.println("\n Devoluciones ");
        biblioteca.devolverLibro(libro1, usuario1, 2);

        biblioteca.devolverLibro(libro2, usuario2, 0);

        
        System.out.println("\n Estado final ");
        biblioteca.mostrarLibrosDisponibles();
        biblioteca.mostrarUsuarios();
    }
}
