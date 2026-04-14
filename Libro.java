import java.util.Scanner;

public class Libro {
    // Atributos
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
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // 3. Método toString para mostrar detalles
    @Override
    public String toString() {
        return "DETALLES DEL LIBRO:\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Páginas: " + numeroPaginas;
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Registro de nuevo libro ---");

        // Ingreso de datos por consola
        System.out.print("Introduce el título: ");
        String t = teclado.nextLine();

        System.out.print("Introduce el autor: ");
        String a = teclado.nextLine();

        System.out.print("Introduce el número de páginas: ");
        int p = teclado.nextInt();

        // Creamos el objeto usando el constructor parametrizado con los datos ingresados
        Libro miLibro = new Libro(t, a, p);

        // Mostramos el resultado usando el toString
        System.out.println("\n" + miLibro.toString());

        teclado.close();
    }
}