public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    // 1. Constructor por defecto
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.numeroPaginas = 0;
    }

    // 2. Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo; // this identifica al atributo de la clase
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // 3. Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas);
    }

    public static void main(String[] args) {
        // Uso del constructor por defecto
        Libro libro1 = new Libro();

        // Uso del constructor parametrizado
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);

        libro1.mostrarDetalles();
        libro2.mostrarDetalles();
    }
}
