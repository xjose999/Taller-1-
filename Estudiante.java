import java.util.Scanner;

public class Estudiante {

    String nombre;
    int edad;
    String curso;


    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "Pendiente de asignación";
    }


    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "No asignado";
    }


    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }


    @Override
    public String toString() {
        return "FICHA DEL ESTUDIANTE:\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + " años\n" +
                "Curso: " + curso;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Registro Académico ---");

        System.out.print("Nombre del estudiante: ");
        String nom = sc.nextLine();

        System.out.print("Edad: ");
        int ed = sc.nextInt();
        sc.nextLine();

        System.out.print("Curso (o presiona Enter para dejar pendiente): ");
        String cur = sc.nextLine();

        Estudiante est;


        if (cur.isEmpty()) {

            est = new Estudiante(nom, ed);
        } else {

            est = new Estudiante(nom, ed, cur);
        }

        System.out.println("\n" + est.toString());

        sc.close();
    }
}