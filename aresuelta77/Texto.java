/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aresuelta77;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author JAVA
 */
class Texto {

    private String cad; //para la cadena de caracteres
    LocalDate creacion;
    LocalDateTime ultimaModificacion;
    private final int LONGITUD_MAX;
    static final String VOCALES = "aeiouáéíóúü"; //cadena constante y estatica

    public Texto(int longitudMax) {
        cad = ""; // referencia un objeto Strring sin valor, por lo que no se puede usar
        //cad=nulo, no refrencia nada y no se pueden usar sus metodos
        this.LONGITUD_MAX = longitudMax;
        creacion = LocalDate.now();
        ultimaModificacion = null;
    }

    //añade un caracter al final del texto, siempre que quede sitio
    public void addFinal(char c) {
        if (LONGITUD_MAX > cad.length()) {
            cad = cad + c; //pone el caracter al final
            ultimaModificacion = LocalDateTime.now();
        }
    }

    //añade una cadena al final del texto siempre que quede sitio
    public void addFinal(String c) {
        if (LONGITUD_MAX >= cad.length() + c.length()) {
            cad = cad + c;
            ultimaModificacion = LocalDateTime.now();

        }

    }

    //añade un caracter al comienzo del texto, cuando quede sitio
    public void addPrincipio(char c) {
        if (LONGITUD_MAX > cad.length()) {
            cad = c + cad;
            ultimaModificacion:
            LocalDateTime.now();
        }
    }

    //añade una cadena al comienzo del texto, cuando haya sitio
    public void addPrincipio(String c) {
        if (LONGITUD_MAX >= cad.length() + c.length()) {
            cad = c + cad;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void mostrar() {
        System.out.println("Texto creado el " + creacion);
        System.out.println("Ultima modificacion: " + ultimaModificacion);
        System.out.println(cad);
    }

    //devuelve el numero de vovales que hay en el texto
    public int numVocales() {
        int voc = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (esVocal(cad.charAt(i))) {
                voc++;
            }
        }
        return (voc);
    }

    // comprueba si el caracter pasado es una vocal: mayuscula/minuscula/acentuada
    private boolean esVocal(char c) {
        boolean vocal = false;
        c = Character.toLowerCase(c);
        if (VOCALES.indexOf(c) != -1) { //buscamos el caracter en minuscula en las posibles vocales
            vocal = true;
        }
        return (vocal);

    }


}
