import java.util.Arrays;

public class Main {
    int [] tablaEnteros = new int[0]; //atributo no estatica del main
    public static void main(String[] args) {
        Main main = new Main(); //creamos un objeto de la clase Main con el constructor
        //por defecto se crea un array vacio
        for (int i = 0; i < 10; i++) {
            m.insertarFinal (i+1);
        }
        System.out.println ("tabla: " + Arrays.toString(m.tablaEnteros));
    }
    void insertarFinal (int nuevo) { // metodo no estatica de main
        tablaEnteros = Arrays.copyOf(tablaEnteros, tablaEnteros.length+1);
        tablaEnteros[tablaEnteros.length-1] = nuevo;

    }
    
}
