/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad711;

import java.time.LocalDateTime;

/**
 *
 * @author 34625
 */
class Marcapagina {

    int numPaginas;
    int paginaActual;
    LocalDateTime ultimaPaginaLeida;

    public Marcapagina(int numPaginas, int paginaActual) {
        this.numPaginas = numPaginas;
        this.paginaActual = paginaActual;
        this.ultimaPaginaLeida = null;
    }

    // incrementa el numero de paginas
    public void incrementarPaginas() {
        
        if (paginaActual > numPaginas) {
           this.paginaActual = 1;
        }else{
            this.paginaActual++;
        }
        ultimaPaginaLeida= LocalDateTime.now();
        System.out.println("Ahora su pagina actual es: " + paginaActual);
        
        
    }

    // informacion de la ultima pagina leida
    public void ultimaPaginaLeida() { // se podria poner con un return pero no me acuerdo
        ultimaPaginaLeida = LocalDateTime.now();
        System.out.println(ultimaPaginaLeida);
       
    }

    // volver a empezar a leer el mismo libro
    public void empezarLeer() {
        paginaActual = 1;
        System.out.println("La pagina actual corresponde con el numero: " + paginaActual);
        ultimaPaginaLeida= LocalDateTime.now();
        
    }
}

