
/**
 * Write a description of class Tarea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tarea
{
    // instance variables - replace the example below with your own
    private String nombreTarea;
    private boolean tareaCompletada;
    public Tarea (String nombreDadoALaTarea) {
        nombreTarea = nombreDadoALaTarea;
        tareaCompletada = false;
    }
    public boolean estaCompletada() {
        
        return tareaCompletada;
    }
    public String getNombreDeTarea() {
        return nombreTarea;
    }
    public void setCompletada(){
        tareaCompletada = true;
    }

}
