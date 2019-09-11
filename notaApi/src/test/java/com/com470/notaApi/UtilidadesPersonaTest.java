package com.com470.notaApi;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UtilidadesPersonaTest {

    private UtilidadesPersona utils;
    

    @Before
    public void setUp() {
        utils = new UtilidadesPersona();
    }

    @Test
    public void testCarlos() {
        //when
        Persona carlos = utils.getCarlos();
        //then
        assertEquals("Carlos", carlos.getNombre());
        assertEquals("Perez", carlos.getApellido());
    }
    
    @Test
    public void testJuan() {
        //when
        Persona juan = utils.getJuan();
        //then
        assertEquals("Juan", juan.getNombre());
        assertEquals("Lopez", juan.getApellido());
    }
    @Test
    public void testPersonasDiferentes() {
        //when
        Persona juan = utils.getJuan();
         Persona carlos = utils.getCarlos();
        //then
        assertNotEquals(juan, carlos);
    }
    

}
