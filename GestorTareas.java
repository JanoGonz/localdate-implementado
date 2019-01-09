import java.util.*;

public class GestorTareas{

    //Coleccion que almacena todas las tareas
    private ArrayList<Tarea> tareas;

    /**
     * 01. Constructor de la clase
     */
    public GestorTareas() {
        tareas = new ArrayList<Tarea>();
    } 

    /**
     * 02. Agrega una tarea a la lista de tareas pendientes
     */
    public void agregarTarea(String textoTarea) {
        tareas.add(new Tarea(textoTarea));
    }

    /**
     * 03. Devuelve todas las tareas en una sola linea; si no 
     * hay tareas devuelve la cadena vacia
     */
    public String getTareas() {
        String tareasPendientes = "";
        int contador = 1;
        if(!tareas.isEmpty()){
            tareasPendientes = "[";
            for (Tarea nombresTarea: tareas) {
                tareasPendientes += nombresTarea.getNombreDeTarea();
                if (contador < tareas.size()) {
                    tareasPendientes += ", ";
                }
                contador++;
            }
            tareasPendientes += "]";
        }

        return tareasPendientes;
    }    

    /**
     * 04. Imprime todas las tareas en una sola linea; si no 
     * hay tareas imprime una linea en blanco
     */
    public void mostrarTareas(){
        System.out.println(getTareas());
    }

    /**
     * 05. Devuelve el número de tareas
     */
    public int getNumeroTareasPendientes() {
        return tareas.size();
    }

    /** 
     * 06. Muestra por pantalla la tarea mas antigua
     * Si el gestor no tiene tareas, no hace nada. 
     */
    public void muestraTareaMasVieja() {
        if(!tareas.isEmpty()){
            System.out.println(tareas.get(0));
        }
    }

    /**
     * 07. Devuelve la tarea mas antigua; si no hay tareas 
     * devuelve la cadena vacia
     */
    public String getTareaMasVieja() {
        String tarea = "";

        if (tareas.size() > 0) {
            tarea = tareas.get(0).getNombreDeTarea();
        }
        return tarea;
    }

    /**
     * 08. Elimina la tarea mas antigua
     * Si el gestor no tiene tareas, no hace nada. 
     */
    public void eliminaTareaMasVieja() {
        if (tareas.size() != 0) {
            tareas.remove(0);
        }
    }

    /**
     * 09. Devuelve todas las tareas una en cada linea; si no 
     * hay tareas devuelve la cadena vacia
     */   
    public String getListaTareas() {
        String listaTareas = "";
        for (Tarea tareaActual : tareas) {
            listaTareas = listaTareas + tareaActual.getNombreDeTarea() + "\n";
        }
        return listaTareas;
    }

    /**
     * 10. Imprime todas las tareas una en cada linea; si no 
     * hay tareas imprime una linea en blanco. El metodo no devuelve nada.
     */  
    public void imprimeListaTareas() {
        System.out.println(getListaTareas());
    }

    /**
     * 11. Devuelve un String con todas las tareas una en cada línea 
     * precedida de su posicion (empezando en 1), un punto y un espacio
     * (por ejemplo: "1. Hacer la cama"). Si no hay tareas devuelve la cadena vacía
     */
    public String getListaTareasNumerada() {
        String listaADevolver = "";
        int contador = 0;
        for (Tarea tareaActual : tareas) {
            contador = contador + 1;
            listaADevolver = listaADevolver + contador + ". " + tareaActual.getNombreDeTarea() + "\n";
        }        

        return listaADevolver;
    }

    /**
     * 12. Muestra todas las tareas una en cada línea 
     * precedida de su posicion (empezando en 1), un punto y un espacio
     * (por ejemplo: "1. Hacer la cama"). Si no hay tareas
     * muestra unicamente una linea en blanco. El metodo no devuelve nada.
     */    
    public void imprimeListaTareasNumerada() {
        System.out.println(getListaTareasNumerada());
    }  

    /**
     * 13. Devuelve un String con todas las tareas que 
     * ocupan una posicion impar, una en cada linea y solo el texto de la tarea y sin numero 
     * delante; si no hay tareas devuelve la cadena vacía
     */
    public String getTareasPosicionImpar()  {
        String listaADevolver = "";
        int contador = 0;
        for (Tarea tareaActual : tareas) {
            contador = contador + 1;
            if (contador % 2 != 0) {
                listaADevolver = listaADevolver + tareaActual.getNombreDeTarea() + "\n";                
            }
        }        
        return listaADevolver;           
    }

    /**
     * 14. Imprime por pantalla todas las tareas que 
     * ocupan una posicion impar, una en cada linea y solo el texto de la tarea y sin numero 
     * delante; si no hay tareas imprime una linea en blanco. El metodo no devuelve nada.
     */ 
    public void imprimeTareasPosicionImpar() {
        System.out.println(getTareasPosicionImpar());
    }

    /**
     * 15. Devuelve true si hay al menos una tarea que contenga el texto indicado
     * como parametro y false en caso contrario. Hay que hacerlo con bucle for-each.
     */   
    public boolean hayTareaConElTexto(String textoABuscar) {
        boolean hayTexto = false;
        for(Tarea tareaActual : tareas){
            if(tareaActual.getNombreDeTarea().toLowerCase().contains(textoABuscar.toLowerCase())){
                hayTexto = true;
            }
        }
        return hayTexto;        
    }

    /**
     * 16. Elimina la tarea en la posicion indicada como parámetro (conforme 
     * a la lista de tareas que se imprime por pantalla). Devuelve true 
     * si la tarea existe y se elimina y false en caso contrario
     */
    public boolean eliminaTareaEnPosicion(int posicion) {
        boolean hayTarea = false;
        if (posicion > 0 && posicion <= tareas.size()){
            hayTarea = true;
            tareas.remove(posicion -1);
        }
        return hayTarea;
    }

    /**
     * 17. Devuelve un String conteniendo la primera tarea que contenga el texto indicado como 
     * parametro. En caso de que no haya ninguna coincidencia devuelve la cadena vacía. Hay que
     * hacerlo con un bucle for-each.
     */  
    public String getPrimeraTareaConElTexto(String textoABuscar) {
        String contenidoTarea = "";
        for(Tarea tareaActual : tareas){
            if(tareaActual.getNombreDeTarea().toLowerCase().contains(textoABuscar.toLowerCase()) 
            && contenidoTarea.equals("")){
                contenidoTarea = tareaActual.getNombreDeTarea();
            }
        }
        return contenidoTarea;
    }

    /**
     * 18. Imprime por pantalla la primera tarea que contenga el texto indicado como 
     * parametro. En caso de que no haya ninguna coincidencia imprime una linea en blanco. El
     * metodo no devuelve nada. Hay que hacerlo con un bucle for-each.
     */    
    public void imprimePrimeraTareaConElTexto(String textoABuscar) {
        System.out.println(getPrimeraTareaConElTexto(textoABuscar));
    }

    /**
     * 19. Devuelve un String conteniendo todas las tareas que contienen el texto indicado
     * como parametro, una en cada linea. El String devuelto contiene una ultima linea adicional
     * que indica el numero de tareas encontradas o el texto "No se encontraron coincidencias"
     * si no hay ninguna que contenga el texto buscado
     */  
    public String getTareasConElTexto(String textoABuscar) {
        String tareaSinTexto = "";
        int contador = 0;
        for(Tarea tareasConTexto : tareas) {
            if(tareasConTexto.getNombreDeTarea().toLowerCase().contains(textoABuscar.toLowerCase())) {
                contador++;
                tareaSinTexto = tareaSinTexto + tareasConTexto.getNombreDeTarea() + "\n";
            }
        }
        if(tareaSinTexto.equals("")) {
            tareaSinTexto = "No se encontraron coincidencias";
        }
        else {
            tareaSinTexto = tareaSinTexto + contador;
        }
        return tareaSinTexto;
    }

    /**
     * 20. Muestra por pantalla todas las tareas que contienen el texto indicado
     * como parametro, una en cada linea. Se imprime una ultima linea adicional
     * que indica el numero de tareas encontradas o el texto "No se encontraron coincidencias"
     * si no hay ninguna que contenga el texto buscado
     */  
    public void imprimeTareasConElTexto(String textoABuscar) {
        System.out.println(getTareasConElTexto(textoABuscar));
    }

    
    /**
     * 21. Devuelve todas las tareas cada una en una linea; si no 
     * hay tareas devuelve la cadena vacia (usando un bucle while)
     */ 
    public String getTodasLasTareasWhile() {
        String listaTareas = "";
        int contador = 0;
        while (contador < tareas.size()){
            String tareaActual = tareas.get(contador).getNombreDeTarea();
            listaTareas = listaTareas + tareaActual + "\n";
            contador = contador + 1;
        }

        return listaTareas;
    }

    /**
     * 22. Imprime por pantalla todas las tareas una en cada línea utilizando el metodo anterior.
     * si no hay tareas muestra unicamente una linea en blanco. El metodo no devuelve nada.
     */
    public void imprimeTodasLasTareasWhile() {
        System.out.println(getTodasLasTareasWhile());
    }

    /**
     * 23. Devuelve un String oonteniendo las primeras n tareas (siendo n el parametro del metodo), una en cada linea. En
     * caso de que no haya suficientes se devuelven solo las que haya. En caso de no haber tareas
     * se devuelve la cadena vacía.
     */ 
    public String getPrimerasTareas(int numeroTareas) {
        String contenidoTareas = "";
        int contador = 0;
        while(contador < numeroTareas && contador < tareas.size()){
            contenidoTareas = contenidoTareas + tareas.get(contador).getNombreDeTarea() + "\n";
            contador = contador + 1;
        }
        return contenidoTareas;
    }

    /**
     * 24. Imprime por pantalla las primeras n tareas (siendo n el parametro del metodo), una en cada linea. En
     * caso de que no haya suficientes se imprimen solo las que haya. En caso de no haber tareas
     * se imprime una linea en blanco. El metodo no devuelve nada y debe usar el método anterior
     */  
    public void imprimePrimerasTareas(int numeroTareas) {
        System.out.println(getPrimerasTareas(numeroTareas));
    }    

    /**
     * 25. Devuelve true si hay al menos una tarea que contenga el texto indicado
     * como parámetro y false en caso contrario. El metodo se debe ejecutar de la
     * forma mas rapida posible
     */ 
    public boolean hayTareaConElTextoEficiente(String textoABuscar)  {
        boolean hayTareaConTexto = false;
        int contador = 0;
        while (!hayTareaConTexto && contador < tareas.size()) {
            String tareaActual = tareas.get(contador).getNombreDeTarea();
            if (tareaActual.contains(textoABuscar)) {
                hayTareaConTexto = true;
            }
            contador += 1;
        }
        return hayTareaConTexto;
    }
    
    /**
     * 26. Elimina la primera tarea que contiene el texto indicado por parámetro. Devuelve true
     * si elimino una tarea o false en caso contrario. Hay que hacerlo lo mas eficiente posible
     */
    public boolean eliminaPrimeraTareaCoincidente(String textoABuscar) {
        boolean tareaEliminada = false;
        int contador = 0;
        while (!tareaEliminada && contador < tareas.size()) {
            String tareaActual = tareas.get(contador).getNombreDeTarea();
            if (tareaActual.contains(textoABuscar)) {
                tareaEliminada = true;
                tareas.remove(contador);
            }
            contador += 1;
        }
        return tareaEliminada;        
    }     

    
    
   
    /**
     * 27. Elimina todas las tareas que contienen un texto pasado como parametro. Devuelve
     * el numero de tareas eliminadas. Hay que hacerlo con un bucle while
     */
    public int eliminaTareasConElTexto(String texto) {
        int contador = 0;
        int tareasBorradas = 0;
        while (contador < tareas.size()) {
            if (tareas.get(contador).getNombreDeTarea().contains(texto)){
                tareas.remove(contador);
                tareasBorradas += 1;
                contador--;
            }
            contador++;
        }
        return tareasBorradas;
    }
    
    
    /**
     * 28. Elimina todas las tareas que contienen un texto pasado como parametro. Devuelve
     * el numero de tareas eliminadas. Hay que hacerlo con un bucle for-each
     */
    public int eliminaTareasConElTextoFor(String texto) {
        int tareasBorradas = 0;
        for (int i=0; i<tareas.size(); i++) {
            if (tareas.get(i).getNombreDeTarea().contains(texto)){
                tareas.remove(i);
                tareasBorradas += 1;
                i--;
            }
        }
        return tareasBorradas;
    }
    
    
    
    /**
     * 29. Marca como completada la tarea que ocupa la posicion indicada como parametro y devuelve
     * true si pudo realizar la operacion o false en caso contrario (se entiende que una tarea
     * que ya esta completada no se puede volver a marcar como completada). Importantisimo:
     * no se puede cambiar bajo ningún concepto el texto de la tarea (la descripcion de la 
     * tarea)
     */
    public boolean marcaComoCompletada(int posicionTarea) {
        boolean estaCompletada = false;
        posicionTarea = posicionTarea -1;
        if( posicionTarea >= 0 && posicionTarea < tareas.size()){
            if(!tareas.get(posicionTarea).estaCompletada()){
                estaCompletada = true;
                tareas.get(posicionTarea).setCompletada();
            }
        }
        return estaCompletada;
    }
    
    
    /**
     * 30. Devuelve todas las tareas, una en cada linea, indicando si esta pendiente con el texto "[ ]" o si no
     * esta pendiente con el texto "[x]" delante del texto de la tarea y luego un espacio
     * (por ejemplo "1. [x] Hacer la cama"); si no hay tareas devuelve la cadena vacia
     */  
    public String getListaTareasCompletadasYNoCompletadas() {
        String listaTareasCompletadas = "";
        int contador = 1;
        String simbolo = " ";
        for (Tarea tarea : tareas) {
            if (tarea.estaCompletada()) {
                simbolo = "[x] ";
            } else {
                simbolo = "[ ] ";
            }
            listaTareasCompletadas += contador + ". "+ simbolo + tarea.getNombreDeTarea() + "\n";
            contador++;
        }
        return listaTareasCompletadas;
    }
    
    
    /**
     * 31. Imprime por pantalla todas las tareas, una en cada linea, indicando si esta pendiente con el texto "[ ]" o si no
     * esta pendiente con el texto "[x]" delante del texto de la tarea y luego un espacio
     * (por ejemplo "1. [x] Hacer la cama"); si no hay tareas imrpime una línea en blanco. El metodo no
     * dvuelve nada.
     */  
    public void imprimeListaTareasCompletadasYNoCompletadas()  {
        System.out.println(getListaTareasCompletadasYNoCompletadas());
    }  
     
    
    
    
}
