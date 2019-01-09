

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GestorTareasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GestorTareasTest
{
    /**
     * Default constructor for test class GestorTareasTest
     */
    public GestorTareasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testGetTareas() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getTareas());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals("[hacer la cama, comprar el pan]" , gestorTa1.getTareas());
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals("[hacer la cama, comprar el pan, comprar entradas festival, estudiar programacion]" , gestorTa1.getTareas());
    }    

    @Test
    public void testGetListaTareas() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getListaTareas());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals("hacer la cama\ncomprar el pan\n" , gestorTa1.getListaTareas());
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals("hacer la cama\ncomprar el pan\ncomprar entradas festival\nestudiar programacion\n" , gestorTa1.getListaTareas());
    }
    
    @Test
    public void testGetListaTareasNumerada() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getListaTareasNumerada());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals("1. hacer la cama\n2. comprar el pan\n" , gestorTa1.getListaTareasNumerada());
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals("1. hacer la cama\n2. comprar el pan\n3. comprar entradas festival\n4. estudiar programacion\n" , gestorTa1.getListaTareasNumerada());
    }

    @Test
    public void testEliminaTareaEnPosicion()
    {
        GestorTareas gestorTa1 = new GestorTareas();
        gestorTa1.agregarTarea("aaa");
        gestorTa1.agregarTarea("bbb");
        gestorTa1.agregarTarea("ccc");
        assertEquals("aaa\nbbb\nccc\n", gestorTa1.getListaTareas());
        assertEquals(false, gestorTa1.eliminaTareaEnPosicion(-5));
        assertEquals(false, gestorTa1.eliminaTareaEnPosicion(4));
        assertEquals(false, gestorTa1.eliminaTareaEnPosicion(10));
        assertEquals(true, gestorTa1.eliminaTareaEnPosicion(1));
        assertEquals("bbb\nccc\n", gestorTa1.getListaTareas());
        assertEquals(true, gestorTa1.eliminaTareaEnPosicion(1));
        assertEquals("ccc\n", gestorTa1.getListaTareas());
        assertEquals(true, gestorTa1.eliminaTareaEnPosicion(1));
        assertEquals("", gestorTa1.getListaTareas());
        assertEquals(false, gestorTa1.eliminaTareaEnPosicion(1));
    }

    @Test
    public void testPrimeraTareaConTexto()
    {
        GestorTareas gestorTa1 = new GestorTareas();
        gestorTa1.agregarTarea("aaa");
        gestorTa1.agregarTarea("bbb");
        gestorTa1.agregarTarea("ccc");
        gestorTa1.agregarTarea("aaaddd");
        assertEquals("aaa", gestorTa1.getPrimeraTareaConElTexto("aaa"));
        assertEquals("", gestorTa1.getPrimeraTareaConElTexto("ggg"));
        gestorTa1.getListaTareas();
        assertEquals("aaaddd", gestorTa1.getPrimeraTareaConElTexto("ddd"));
    }
    
    @Test
    public void testGetTareasConElTexto()
    {
        GestorTareas gestorTa1 = new GestorTareas();
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        gestorTa1.agregarTarea("comprar las entradas del festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals("estudiar programacion\n1" , gestorTa1.getTareasConElTexto("estudiar"));
        assertEquals("comprar el pan\ncomprar las entradas del festival\n2" , gestorTa1.getTareasConElTexto("comprar"));
        assertEquals("comprar el pan\ncomprar las entradas del festival\nestudiar programacion\n3" , gestorTa1.getTareasConElTexto("ar"));        
        assertEquals("No se encontraron coincidencias", gestorTa1.getTareasConElTexto("jugar"));
    }   
    
    @Test
    public void testGetTodasLasTareasWhile()
    {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getTodasLasTareasWhile());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals("hacer la cama\ncomprar el pan\n" , gestorTa1.getTodasLasTareasWhile());
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals("hacer la cama\ncomprar el pan\ncomprar entradas festival\nestudiar programacion\n" , gestorTa1.getTodasLasTareasWhile());
    }
    
    
    @Test
    public void testGetPrimerasTareas()
    {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getPrimerasTareas(1));
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        gestorTa1.agregarTarea("comprar las entradas del festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals("hacer la cama\n" , gestorTa1.getPrimerasTareas(1));
        assertEquals("hacer la cama\ncomprar el pan\n" , gestorTa1.getPrimerasTareas(2));
        assertEquals("hacer la cama\ncomprar el pan\ncomprar las entradas del festival\nestudiar programacion\n" , gestorTa1.getPrimerasTareas(4));        
        assertEquals("hacer la cama\ncomprar el pan\ncomprar las entradas del festival\nestudiar programacion\n" , gestorTa1.getPrimerasTareas(5));
    }    
    
    @Test
    public void testHayTareaConElTextoEficiente()
    {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(false, gestorTa1.hayTareaConElTextoEficiente("estudiar"));
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        gestorTa1.agregarTarea("comprar las entradas del festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals(true, gestorTa1.hayTareaConElTextoEficiente("estudiar"));
        assertEquals(true, gestorTa1.hayTareaConElTextoEficiente("comprar"));
        assertEquals(true , gestorTa1.hayTareaConElTextoEficiente("ar"));        
        assertEquals(false, gestorTa1.hayTareaConElTextoEficiente("jugar"));
    }       
 
    @Test
    public void testEliminaPrimeraTareaCoincidente()
    {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(false, gestorTa1.eliminaPrimeraTareaCoincidente("jugar"));
        gestorTa1.agregarTarea("jugar al futbol");
        gestorTa1.agregarTarea("estudiar programacion");
        gestorTa1.agregarTarea("hacer la cama");
        assertEquals(true, gestorTa1.eliminaPrimeraTareaCoincidente("jugar"));
        assertEquals("estudiar programacion\nhacer la cama\n" , gestorTa1.getListaTareas());
        assertEquals(false, gestorTa1.eliminaPrimeraTareaCoincidente("doblar"));
        assertEquals("estudiar programacion\nhacer la cama\n" , gestorTa1.getListaTareas());        
        assertEquals(true, gestorTa1.eliminaPrimeraTareaCoincidente("hacer"));
        assertEquals("estudiar programacion\n" , gestorTa1.getListaTareas());        
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("hacer la cena");
        assertEquals(true, gestorTa1.eliminaPrimeraTareaCoincidente("hacer"));
        assertEquals("estudiar programacion\nhacer la cena\n" , gestorTa1.getListaTareas());        
    }
    
    @Test
    public void testEliminaTareasConElTexto() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(0, gestorTa1.eliminaTareasConElTexto("jugar"));
        gestorTa1.agregarTarea("jugar al futbol");
        gestorTa1.agregarTarea("estudiar programacion");
        gestorTa1.agregarTarea("hacer la cama");
        assertEquals(1, gestorTa1.eliminaTareasConElTexto("jugar"));
        assertEquals("estudiar programacion\nhacer la cama\n" , gestorTa1.getListaTareas());
        assertEquals(0, gestorTa1.eliminaTareasConElTexto("doblar"));
        assertEquals("estudiar programacion\nhacer la cama\n" , gestorTa1.getListaTareas());        
        assertEquals(1, gestorTa1.eliminaTareasConElTexto("hacer"));
        assertEquals("estudiar programacion\n" , gestorTa1.getListaTareas());        
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("hacer la cena");
        assertEquals(2, gestorTa1.eliminaTareasConElTexto("hacer"));
        assertEquals("estudiar programacion\n" , gestorTa1.getListaTareas());     
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("hacer la cena");
        gestorTa1.agregarTarea("hacer el desayuno");        
        gestorTa1.agregarTarea("llamar a mi amigo");
        gestorTa1.agregarTarea("hacer la cena");        
        assertEquals(4, gestorTa1.eliminaTareasConElTexto("hacer"));
        assertEquals("estudiar programacion\nllamar a mi amigo\n" , gestorTa1.getListaTareas());          
    }
    
    @Test
    public void testGetListaTareasNumeradaDesdeQueSePuedenCompletarLasTareas() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getListaTareasNumerada());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        gestorTa1.marcaComoCompletada(1);
        assertEquals("1. hacer la cama\n2. comprar el pan\n" , gestorTa1.getListaTareasNumerada());
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        gestorTa1.marcaComoCompletada(2);
        assertEquals("1. hacer la cama\n2. comprar el pan\n3. comprar entradas festival\n4. estudiar programacion\n" , gestorTa1.getListaTareasNumerada());
    }
    
    
    @Test
    public void testGetListaTareasCompletadasYNoCompletadas() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getListaTareasNumerada());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals(false, gestorTa1.marcaComoCompletada(10));
        assertEquals("1. [ ] hacer la cama\n2. [ ] comprar el pan\n" , gestorTa1.getListaTareasCompletadasYNoCompletadas());
        assertEquals(true, gestorTa1.marcaComoCompletada(1));
        assertEquals("1. [x] hacer la cama\n2. [ ] comprar el pan\n" , gestorTa1.getListaTareasCompletadasYNoCompletadas());
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals(true, gestorTa1.marcaComoCompletada(2));
        assertEquals("1. [x] hacer la cama\n2. [x] comprar el pan\n3. [ ] comprar entradas festival\n4. [ ] estudiar programacion\n" , gestorTa1.getListaTareasCompletadasYNoCompletadas());
    }    
}