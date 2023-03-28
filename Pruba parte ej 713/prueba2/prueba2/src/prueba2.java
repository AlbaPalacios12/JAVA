
import java.util.Arrays;

public class prueba2 {
    // creamos un metodo para crear un string de 3 caracteres
    String crearString() { // metodo
        // creamos un array de tamaño 3
        String cad;
        int[] colores = new int[5];
        int[] numeros = new int[3];
        // asignar valores de un array a otros
        for (int i = 0; i < numeros.length; i++) {
            // colores[i] = (int) (Math.random() * colores.length);
            // numeros[i] = colores[i];

        }
        // asignamos valores aleatorios
        // sacamos el string del for
        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = (int) (Math.random() * colores.length);
            // cambiamos el array a string

        }
        return cad = Arrays.toString(numeros);
    }

    // nuevo metodo para buscar numeros repetidos en el String
    <T> boolean numDuplicados(T... numeros) {
        // para cada elemento de la array, compruebe si se encuentra después en la array
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] != null && numeros[i].equals(numeros[j])) {
                    return true;
                }
            }
        }

        // no se encuentra duplicado
        return false;

    }
}
