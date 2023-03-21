/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aresuelta79;

/**
 *
 * @author JAVA
 */
class Bombilla {

    public static boolean interruptorGeneral = true; //atributo estatico
    private boolean interruptor; //interruptor (estado) de la bombilla

    public Bombilla() {
        interruptor = false; //inicialmente la nueva bombilla esta apagada
    }

    public void enciende() {
        interruptor = true; //lo activamos
    }

    public void apaga() {
        interruptor = false; //desactivamos
    }

    public boolean estado() {
        return interruptorGeneral && interruptor;
    }

    public String muestraEstado() {
        return estado() ? "Encendida" : "Apagada";
    }
}
