public class Estudiante {
    String nombre;
    int edad;
    String curso;


    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "Pendiente";
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

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Curso: " + curso);
    }
}