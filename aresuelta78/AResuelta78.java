/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aresuelta78;

/**
 *
 * @author JAVA
 */
public class AResuelta78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
SintonizadorFM a,b;
a= new SintonizadorFM (107);
a.up();a.up(); a.up(); a.up(); //subimos un total de 2MHz
a.display(); //debe mostrar 80.5
b= new SintonizadorFM(80.5);
b.down(); b.down (); b.down(); //bajamos 1.5 MHz
b.display(); // mostrara 107.5 MHz
a= new SintonizadorFM(200); // frecuencia fuera de rango. Se debe ajustar
a.display(); //debe mostrar 108.0 MHz

       
    }
    
}
