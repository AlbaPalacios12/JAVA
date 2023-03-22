public class Mecanico {
    String nombre;
    String telefono;
    enum Especialidad{ FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR } // enumerado
    Especialidad especialidad;
    
    public Mecanico(String nombre, String telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = Especialidad.valueOf(especialidad); //pasa de String a enumerado
    }
}
