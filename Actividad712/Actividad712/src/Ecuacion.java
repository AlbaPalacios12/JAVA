
public class Ecuacion {
    double a;
    double b;
    double c;
    
 
    public Ecuacion(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public boolean discriminantePositivo() { // en el main hacer un sout del discriminante positivo
        double discriminante = (Math.pow(b, 2) - (4 * a * c));
        if (discriminante >= 0) {
            return true;
        }
        return false;
    }

  public void resolverEcuacion() {
    double discriminante = (Math.pow(b, 2) - (4 * a * c));
    if (discriminante >= 0) {
 
        double soluciones[];
 
        // Una solucion
        if(discriminante == 0){
 
            soluciones = new double[1];
 
            soluciones[0] = ((-b) - (4 * a * c)) / (2 * a);
 
        // Dos soluciones
        }else{
 
            soluciones = new double[2];
 
            soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
 
            soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
 
        }
 
        System.out.println(soluciones[0]);
        System.out.println(soluciones[1]); 
        
    } else {
        // Sin solucion
        System.out.println("No existe solucion");
    }
     
}
}
