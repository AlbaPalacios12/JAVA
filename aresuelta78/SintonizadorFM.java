/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aresuelta78;

/**
 *
 * @author JAVA
 */
class SintonizadorFM {

    double frecuencia;
    //constructor que permite asignar una frecuencia inicial

    SintonizadorFM(double frecuenciaInicial) {
        //la frecuencia inicial debe acercarse en el rango [80-108]
        if (frecuenciaInicial < 80) {
            frecuencia = 80; //MHz
        } else if (frecuenciaInicial > 108) {
            frecuencia = 108; //MHz
        } else {
            frecuencia = frecuenciaInicial;
        }
    }

    public SintonizadorFM() {

        this(80); //MHz. Frecuencia inicial por defecto
        //Tambien lo podemos inicializar directamente  --> frecuencia =80;
    }

    public double down() {
        frecuencia -= 0.5; //bajamos la frecuancia 0.5 Mhz
        comprobarRango(); //comprobamos si la nueva frecuencia está en el rango permitido
        return (frecuencia);
        
    }

    public double up() {
        frecuencia += 0.5;
        comprobarRango();
        return (frecuencia);
    }

    public void display() {
        System.out.println("Sintonizando: " + frecuencia + " MHz");
    }

    //metodo interno que comprueba que la frecuencia este dentro de rango.
    //si está fuera la ajusta
    private void comprobarRango() {
        if (frecuencia < 80) { // si al bajar la frecuencia es menor que el limite inferior
            frecuencia = 108; // asignamos el limite superior
        } else if (frecuencia > 108) { //si sobrepasamos el limite superior
            frecuencia = 80; //colocamos la frecuencia en el valor menor
        }

    }
}
