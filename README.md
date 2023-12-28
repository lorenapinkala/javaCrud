# javaCrud

## Estructura general de la aplicación

La aplicación consta de dos clases principales:

- **Clase Estudiante:** Representa un estudiante con atributos nombre y edad. Tiene un método `toString()` que proporciona una representación en cadena del estudiante.
- **Clase RegistroEstudiantesApp:** Contiene la lógica principal de la aplicación.

## Menú principal

La aplicación comienza con un menú que presenta las siguientes opciones:

1. **Agregar estudiante:** Permite al usuario ingresar el nombre y la edad de un estudiante para agregarlo a la lista.
2. **Listar estudiantes:** Muestra la lista de estudiantes existentes.
3. **Actualizar estudiante:** Permite al usuario seleccionar un estudiante existente y actualizar su información.
4. **Borrar estudiante:** Permite al usuario seleccionar un estudiante existente y eliminarlo de la lista.
5. **Salir:** Finaliza la aplicación.

## Funciones principales

Las funciones principales de la aplicación son las siguientes:

- **agregarEstudiante():** Solicita al usuario ingresar el nombre y la edad del estudiante. Utiliza la función `obtenerEdadValida()` para asegurar que la edad ingresada sea válida. Crea un nuevo objeto Estudiante y lo agrega a la lista de estudiantes.
- **listarEstudiantes():** Muestra la lista de estudiantes existentes.
- **actualizarEstudiante():** Muestra la lista de estudiantes existentes. Permite al usuario seleccionar un estudiante y actualizar su nombre y edad. Utiliza la función `obtenerEdadValida()` para asegurar que la nueva edad ingresada sea válida.
- **borrarEstudiante():** Muestra la lista de estudiantes existentes. Permite al usuario seleccionar un estudiante y lo elimina de la lista.
- **obtenerEdadValida():** Utilizada para obtener una edad válida del usuario. Utiliza un bucle do-while para solicitar la entrada hasta que se ingrese un valor numérico válido en el rango de 0 a 150. Maneja excepciones para garantizar que la entrada sea un número.

## Validación de datos

La aplicación valida que el nombre del estudiante no esté vacío. La función `obtenerEdadValida()` garantiza que la edad ingresada sea un número válido y esté en el rango especificado.
