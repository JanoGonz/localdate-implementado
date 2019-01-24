import java.time.*;
import java.time.format.*;
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
    private int prioridad;
    private boolean dateExist;
    private LocalDate a;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public Tarea (String nombreDadoALaTarea) {
        nombreTarea = nombreDadoALaTarea;
        tareaCompletada = false;
        prioridad = 5;
    }
    public Tarea (String nombreDadoALaTarea, int prioridad) {
        nombreTarea = nombreDadoALaTarea;
        this.prioridad = prioridad;
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
    public int getPrioridad(){
        return prioridad;
    }
    public void setPrioridad(int numPrioridad){
        prioridad = numPrioridad;
    }
    public void setNombre(String nombre){
        nombreTarea = nombre;
    }
    public String getFechaVenc() {
        String fechaVenc = a.format(formato);
        LocalDate fechaDevuelta = LocalDate.parse(fechaVenc, formato);
        return fechaVenc;
    }
    public void setFechaVenc(int dia, int mes, int anyo) {
        a = LocalDate.of(anyo, mes, dia);
        dateExist = true;
    }
    public boolean fechaExists() {
        return dateExist;
    }
        public void setFechaNow() {
        a = LocalDate.now();
        dateExist = true;
    }
}
