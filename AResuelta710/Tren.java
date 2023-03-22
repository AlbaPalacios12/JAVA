public class Tren {

    Locomotora locomotora;
    Vagon vagones[];
    Maquinista responsable;
    private int numVagones; // numero de vagones

    public Tren(Locomotora locomotora, Maquinista responsable) {
        this.locomotora = locomotora;
        this.responsable = responsable;
        vagones = new Vagon[5]; // tabla de tamaño 5, pero no se crea ningun objeto de tipo vagon
        numVagones = 0;// numero de vagones enganchados al tren
    }

    // como la clase Vagon no es visible por las clases externas, sera la clase Tren
    // la que se encargue de construir el objeto a partir de los datos que nos
    // pasen.
    public void enganchaVagon(int cargaMax, int cargaActual, String mercancia) {
        if (numVagones <= 5) {
            System.out.println("Al tren no pueden engancharse mas de 5 vagones");
        } else {
            Vagon v = new Vagon(numVagones, cargaMax, cargaActual, mercancia);
            vagones[numVagones] = v; // el vagon padaso ocupa el ultimo lugar
            numVagones++; //ahora tenemos un nuevo vagon
        }
    }
}