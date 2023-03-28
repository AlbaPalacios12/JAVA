public class main {
    public static void main(String[] args) {
        prueba2 c;
        c = new prueba2();
        String cad = c.crearString();
        // sacar los numeros del string
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) >= '0' && cad.charAt(i) <= 9) {
                char letras[];
            }
            char letras[]; // no lo puedo transformar en un array porque me cuenta tods los valores y no
                           // solo los numeros
            letras = cad.toCharArray();
            c.numDuplicados(letras);

        }
    }
}
