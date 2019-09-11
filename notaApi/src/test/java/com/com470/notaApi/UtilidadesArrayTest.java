
package com.com470.notaApi;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class UtilidadesArrayTest {
    
    public UtilidadesArray utils;
    
    @Before
    public void setUp() {
        utils=new UtilidadesArray();
    }

    @Test
    public void testArray() {
        //given
        String [] esperado={"uno","dos","tres"};
        //when
        String[] resultado = utils.ArrayStrings("uno","dos","tres");
        //then
        assertArrayEquals(esperado, resultado);
        assertEquals(3, resultado.length);
        assertEquals(esperado.length, resultado.length);
        
        assertEquals(esperado[0], resultado[0]);
        assertNotEquals(esperado[0], resultado[1]);
    }
    @Test
    public void testAssertTrue(){
    boolean resultadoTrue=utils.esMayorQue10(20);
    boolean resultadoFalse=utils.esMayorQue10(5);
    
        assertTrue(resultadoTrue);
        assertFalse(resultadoFalse);
    
    }
    
}
