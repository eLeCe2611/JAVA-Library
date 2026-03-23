/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package negocio;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivanrguez
 */
public class LibroTest {
    
    public LibroTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
  
    /**
     * Test of getIdLibro method, of class Libro.
     */
    @org.junit.Test
    public void testGetIdLibro() {
        System.out.println("getIdLibro");
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        int expResult = 10;
        int result = instance.getIdLibro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setIdLibro method, of class Libro.
     */
    @org.junit.Test
    public void testSetIdLibro() {
        System.out.println("setIdLibro");
        int idLibro = 11;
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        instance.setIdLibro(idLibro);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getIsbn method, of class Libro.
     */
    @org.junit.Test
    public void testGetIsbn() {
        System.out.println("getIsbn");
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        int expResult = 110;
        int result = instance.getIsbn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setIsbn method, of class Libro.
     */
    @org.junit.Test
    public void testSetIsbn() {
        System.out.println("setIsbn");
        int isbn = 111;
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        instance.setIsbn(isbn);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Libro.
     */
    @org.junit.Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        String expResult = "Segunda Fundacion";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Libro.
     */
    @org.junit.Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "2ª Fundacion";
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getAutor method, of class Libro.
     */
    @org.junit.Test
    public void testGetAutor() {
        System.out.println("getAutor");
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        String expResult = "Asimov";
        String result = instance.getAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setAutor method, of class Libro.
     */
    @org.junit.Test
    public void testSetAutor() {
        System.out.println("setAutor");
        String autor = "Isaac Asimov";
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        instance.setAutor(autor);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioMax method, of class Libro.
     */
    @org.junit.Test
    public void testGetPrecioMax() {
        System.out.println("getPrecioMax");
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        double expResult = 10.0;
        double result = instance.getPrecioMax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioMax method, of class Libro.
     */
    @org.junit.Test
    public void testSetPrecioMax() {
        System.out.println("setPrecioMax");
        double precioMax = 11.0;
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        instance.setPrecioMax(precioMax);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioMin method, of class Libro.
     */
    @org.junit.Test
    public void testGetPrecioMin() {
        System.out.println("getPrecioMin");
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        double expResult = 9.0;
        double result = instance.getPrecioMin();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioMin method, of class Libro.
     */
    @org.junit.Test
    public void testSetPrecioMin() {
        System.out.println("setPrecioMin");
        double precioMin = 10.0;
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        instance.setPrecioMin(precioMin);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaDeposito method, of class Libro.
     */
    @org.junit.Test
    public void testGetFechaDeposito() {
        System.out.println("getFechaDeposito");
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        Calendar expResult = Calendar.getInstance();
        Calendar result = instance.getFechaDeposito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaDeposito method, of class Libro.
     */
    @org.junit.Test
    public void testSetFechaDeposito() {
        System.out.println("setFechaDeposito");
        Calendar fechaDeposito = null;
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        instance.setFechaDeposito(fechaDeposito);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaRetirada method, of class Libro.
     */
    @org.junit.Test
    public void testGetFechaRetirada() {
        System.out.println("getFechaRetirada");
        
        Calendar hoy = Calendar.getInstance();
        Calendar expResult = hoy;
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        Calendar result = instance.getFechaRetirada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaRetirada method, of class Libro.
     */
    @org.junit.Test
    public void testSetFechaRetirada() {
        System.out.println("setFechaRetirada");
        Calendar fechaRetirada = null;
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        instance.setFechaRetirada(fechaRetirada);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getVendedor method, of class Libro.
     */
    @org.junit.Test
    public void testGetVendedor() {
        System.out.println("getVendedor");
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = null;
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        Vendedor expResult = null;
        Vendedor result = instance.getVendedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setVendedor method, of class Libro.
     */
    @org.junit.Test
    public void testSetVendedor() {
        System.out.println("setVendedor");
        Vendedor vendedor = null;
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", "Vendedor Test");
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        instance.setVendedor(vendedor);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Libro.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        
        Calendar hoy = Calendar.getInstance();
        Vendedor nuevoVendedor = new Vendedor("123123A", "955123123", "test@upo.es", null);
        Libro instance = new Libro(10, 110, "Segunda Fundacion", "Asimov", 10.0, 9.0, hoy, hoy, nuevoVendedor);
        
        String expResult = "libro{idLibro=10, isbn=110, titulo=Segunda Fundacion, autor=Asimov, precioMax=10.0, precioMin=9.0, fechaDeposito=19-12-2021, fechaRetirada=19-12-2021, Vendedor=null}\n";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
