import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}

 class RegistroEstudiantesApp {

    private static List<Estudiante> estudiantes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("=== Menú ===");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Actualizar estudiante");
            System.out.println("4. Borrar estudiante");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    listarEstudiantes();
                    break;
                case 3:
                    actualizarEstudiante();
                    break;
                case 4:
                    borrarEstudiante();
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

    private static void agregarEstudiante() {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        int edad = obtenerEdadValida();

        Estudiante nuevoEstudiante = new Estudiante(nombre, edad);
        estudiantes.add(nuevoEstudiante);

        System.out.println("Estudiante agregado correctamente.");
    }

    private static void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes para mostrar.");
        } else {
            System.out.println("=== Estudiantes ===");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println((i + 1) + ". " + estudiantes.get(i));
            }
        }
    }

    private static void actualizarEstudiante() {
        listarEstudiantes();

        if (!estudiantes.isEmpty()) {
            System.out.print("Ingrese el número del estudiante que desea actualizar: ");
            int indice = scanner.nextInt();
            scanner.nextLine();

            if (indice >= 1 && indice <= estudiantes.size()) {
                System.out.print("Ingrese el nuevo nombre del estudiante: ");
                String nuevoNombre = scanner.nextLine();

                int nuevaEdad = obtenerEdadValida();

                Estudiante estudianteActualizado = new Estudiante(nuevoNombre, nuevaEdad);
                estudiantes.set(indice - 1, estudianteActualizado);

                System.out.println("Estudiante actualizado correctamente.");
            } else {
                System.out.println("Número de estudiante no válido.");
            }
        }
    }

    private static void borrarEstudiante() {
        listarEstudiantes();

        if (!estudiantes.isEmpty()) {
            System.out.print("Ingrese el número del estudiante que desea borrar: ");
            int indice = scanner.nextInt();
            scanner.nextLine();

            if (indice >= 1 && indice <= estudiantes.size()) {
                estudiantes.remove(indice - 1);
                System.out.println("Estudiante borrado correctamente.");
            } else {
                System.out.println("Número de estudiante no válido.");
            }
        }
    }

    private static int obtenerEdadValida() {
        int edad = 0;
        boolean entradaInvalida = true;

        do {
            try {
                System.out.print("Ingrese la edad del estudiante: ");
                edad = scanner.nextInt();
                scanner.nextLine();

                if (edad >= 0 && edad <= 150) {
                    entradaInvalida = false;
                } else {
                    System.out.println("La edad debe estar entre 0 y 150. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un valor numérico válido para la edad. Intente nuevamente.");
                scanner.nextLine();
            }
        } while (entradaInvalida);

        return edad;
    }
}
