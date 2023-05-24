/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package pruebas.unitarias;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Alumno
 */
public class MatricadNGTest {

    static String[] cadenes;
    static String[] vacia;

    @BeforeClass
    public static void setUpClass() throws Exception {
        cadenes = new String[]{"hola", "que", "tal", "estas", "hola"}; 	// carrega la matriu de cadenes
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test(expectedExceptions = java.lang.IllegalArgumentException.class)
    public void constructor1() {
        Matricad constructor1 = new Matricad(vacia);
    }

    @Test(expectedExceptions = java.lang.IllegalArgumentException.class)
    public void constructor2() {
        Matricad constructor2 = new Matricad(null);
    }

    @Test
    public void constructor3() {
        Matricad constructor3 = new Matricad(cadenes);
    }

    /**
     * Test of getCantidadCadenasQueEmpiezanCon method, of class Matricad.
     */
    @Test
    public void testGetCantidadCadenasQueEmpiezanCon() {
        System.out.println("getCantidadCadenasQueEmpiezanCon");
        char letra = 'h';
        Matricad instance = new Matricad(cadenes);
        int expResult = 2;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of hayCadenasQueEmpiezanPor method, of class Matricad.
     */
    @Test
    public void testHayCadenasQueEmpiezanPor() {
        System.out.println("hayCadenasQueEmpiezanPor");
        char letra = 't';
        Matricad instance = new Matricad(cadenes);
        boolean expResult = true;
        boolean result = instance.hayCadenasQueEmpiezanPor(letra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getConcatenacionCadenas method, of class Matricad.
     */
    @Test
    public void testGetConcatenacionCadenas() {
        System.out.println("getConcatenacionCadenas");
        Matricad instance = new Matricad(cadenes);
        String expResult = "holauqetalcomoestáshola";
        String result = instance.getConcatenacionCadenas();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicionesDe method, of class Matricad.
     */
    @Test
    public void testGetPosicionesDe() {
        System.out.println("getPosicionesDe");
        String unaCadena = "adios";
        Matricad instance = new Matricad(cadenes);
        ArrayList expResult = new ArrayList();
        ArrayList result = instance.getPosicionesDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testGetPosicionesDe() {
        System.out.println("getPosicionesDe");
        String unaCadena = "hola";
        Matricad instance = new Matricad(cadenes);
        ArrayList expResult = new ArrayList();
        ArrayList result = instance.getPosicionesDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
        public void testGetPosicionesDe() {
        System.out.println("getPosicionesDe");
        String unaCadena = "hola";
        Matricad instance = new Matricad(null);
        ArrayList expResult = new IllegalArgumentException();;
        ArrayList result = instance.getPosicionesDe(unaCadena);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
