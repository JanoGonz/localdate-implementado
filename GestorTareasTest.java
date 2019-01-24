

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
    
    /** 
     * Test para el método 03
     */
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

    /** 
     * Test para el método 09
     */
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
    
    /** 
     * Test para el método 11
     */    
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
    
    /** 
     * Test para el método 13
     */    
    @Test
    public void testGetTareasPosicionImpar() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getTareasPosicionImpar());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals("hacer la cama\n" , gestorTa1.getTareasPosicionImpar());
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals("hacer la cama\ncomprar entradas festival\n" , gestorTa1.getTareasPosicionImpar());
    }  
    
    
    /** 
     * Test para el método 15
     */    
    @Test
    public void testHayTareaConElTexto() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(false , gestorTa1.hayTareaConElTexto("jugar"));
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals(true , gestorTa1.hayTareaConElTexto("cama"));
        assertEquals(true , gestorTa1.hayTareaConElTexto("el"));     
        assertEquals(false , gestorTa1.hayTareaConElTexto("coche"));        
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals(true , gestorTa1.hayTareaConElTexto("festival"));
        assertEquals(true , gestorTa1.hayTareaConElTexto("programacion"));  
        assertEquals(false , gestorTa1.hayTareaConElTexto("ramas"));        
    }     
        
    /** 
     * Test para el método 16
     */  
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

    /** 
     * Test para el método 17
     */  
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
    
    /** 
     * Test para el método 19
     */      
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
    
    /** 
     * Test para el método 21
     */      
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
    
    /** 
     * Test para el método 23
     */      
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
    
    /** 
     * Test para el método 25
     */      
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
    
    /** 
     * Test para el método 26
     */   
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
    
    /** 
     * Test para el método 27
     */      
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
    
    /** 
     * Test para el método 11
     */      
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
    
    /** 
     * Test para el método 29 y 30
     */      
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
    
   /** 
     * Test para el método 32
     */      
    @Test
    public void testGetListaTareasCompletadasYNoCompletadasConPrioridad() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getListaTareasCompletadasYNoCompletadasConPrioridad());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals(false, gestorTa1.marcaComoCompletada(10));
        assertEquals("1. [ ] hacer la cama 5\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasCompletadasYNoCompletadasConPrioridad());
        assertEquals(true, gestorTa1.marcaComoCompletada(1));
        assertEquals("1. [x] hacer la cama 5\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasCompletadasYNoCompletadasConPrioridad());
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals(true, gestorTa1.marcaComoCompletada(2));
        assertEquals("1. [x] hacer la cama 5\n2. [x] comprar el pan 5\n3. [ ] comprar entradas festival 5\n4. [ ] estudiar programacion 5\n" , gestorTa1.getListaTareasCompletadasYNoCompletadasConPrioridad());
    }   
    
    
    
    /** 
     * Test para el método 32 y 33
     */      
    @Test
    public void testGetListaTareasCompletadasYNoCompletadasConPrioridad2() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getListaTareasCompletadasYNoCompletadasConPrioridad());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals(false, gestorTa1.marcaComoCompletada(10));
        gestorTa1.setPrioridad(1, 1);
        assertEquals("1. [ ] hacer la cama 1\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasCompletadasYNoCompletadasConPrioridad());
        gestorTa1.setPrioridad(1, 3);
        assertEquals("1. [ ] hacer la cama 3\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasCompletadasYNoCompletadasConPrioridad());
        gestorTa1.setPrioridad(1, 7);   
        assertEquals("1. [ ] hacer la cama 3\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasCompletadasYNoCompletadasConPrioridad()); 
        gestorTa1.setPrioridad(3, 3);        
        assertEquals("1. [ ] hacer la cama 3\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasCompletadasYNoCompletadasConPrioridad());        
        assertEquals(true, gestorTa1.marcaComoCompletada(1));
        assertEquals("1. [x] hacer la cama 3\n2. [ ] comprar el pan 5\n" , gestorTa1.getListaTareasCompletadasYNoCompletadasConPrioridad());
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        gestorTa1.setPrioridad(3, 3);  
        gestorTa1.setPrioridad(4, 2);  
        assertEquals(true, gestorTa1.marcaComoCompletada(2));
        assertEquals("1. [x] hacer la cama 3\n2. [x] comprar el pan 5\n3. [ ] comprar entradas festival 3\n4. [ ] estudiar programacion 2\n" , gestorTa1.getListaTareasCompletadasYNoCompletadasConPrioridad());
    }
    
     
    /** 
     * Test para el método 34
     */      
    @Test
    public void testGetTareaMasPrioritaria() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("" , gestorTa1.getTareaMasPrioritaria());        
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals("[ ] comprar el pan 5" , gestorTa1.getTareaMasPrioritaria());        
        gestorTa1.setPrioridad(1, 1);
        gestorTa1.setPrioridad(1, 7);   
        gestorTa1.setPrioridad(3, 3);        
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        gestorTa1.setPrioridad(3, 3);  
        gestorTa1.setPrioridad(4, 2);  
        assertEquals("[ ] hacer la cama 1" , gestorTa1.getTareaMasPrioritaria());
        gestorTa1.setPrioridad(3, 1);  
        assertEquals("[ ] comprar entradas festival 1" , gestorTa1.getTareaMasPrioritaria());  
        gestorTa1.setPrioridad(1, 5);  
        assertEquals("[ ] comprar entradas festival 1" , gestorTa1.getTareaMasPrioritaria());  
        gestorTa1.setPrioridad(4, 1);    
        assertEquals("[ ] estudiar programacion 1" , gestorTa1.getTareaMasPrioritaria());          
    }  
    
    
    /** 
     * Test para el método 35
     */      
    @Test
    public void testGetTareasPorPrioridad() {
        GestorTareas gestorTa1 = new GestorTareas();  
        assertEquals("", gestorTa1.getTareasPorPrioridad());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals("hacer la cama 5\ncomprar el pan 5\n", gestorTa1.getTareasPorPrioridad());      
        gestorTa1.setPrioridad(1, 1); 
        gestorTa1.setPrioridad(2, 3);     
        assertEquals("hacer la cama 1\ncomprar el pan 3\n", gestorTa1.getTareasPorPrioridad());   
        gestorTa1.setPrioridad(1, 4); 
        gestorTa1.setPrioridad(2, 3);     
        assertEquals("comprar el pan 3\nhacer la cama 4\n", gestorTa1.getTareasPorPrioridad());         
        gestorTa1.agregarTarea("comprar entradas festival");
        gestorTa1.agregarTarea("estudiar programacion");
        assertEquals("comprar el pan 3\nhacer la cama 4\ncomprar entradas festival 5\nestudiar programacion 5\n", gestorTa1.getTareasPorPrioridad());    
        gestorTa1.setPrioridad(3, 3);  
        gestorTa1.setPrioridad(4, 2);  
        assertEquals("estudiar programacion 2\ncomprar el pan 3\ncomprar entradas festival 3\nhacer la cama 4\n", gestorTa1.getTareasPorPrioridad());                
    }    
    
        /** 
     * Test para el método 37 y 38
     */      
    @Test
    public void testGetListaTareasConFechaVencimiento() {
        GestorTareas gestorTa1 = new GestorTareas();  
        assertEquals("", gestorTa1.getListaTareasConFechaVencimiento());
        gestorTa1.agregarTarea("hacer la cama");
        gestorTa1.agregarTarea("comprar el pan");
        assertEquals("1. hacer la cama\n2. comprar el pan\n", gestorTa1.getListaTareasConFechaVencimiento());      
	gestorTa1.fijarFechaTope(1, 21, 1, 2019);
        assertEquals("1. hacer la cama - 21/01/2019\n2. comprar el pan\n", gestorTa1.getListaTareasConFechaVencimiento());  
        gestorTa1.fijarFechaTope(2, 23, 2, 2019);
        assertEquals("1. hacer la cama - 21/01/2019\n2. comprar el pan - 23/02/2019\n", gestorTa1.getListaTareasConFechaVencimiento()); 
	gestorTa1.fijarFechaTope(2, 5, 12, 2019);  
	assertEquals("1. hacer la cama - 21/01/2019\n2. comprar el pan - 05/12/2019\n", gestorTa1.getListaTareasConFechaVencimiento());               
    }    
}







