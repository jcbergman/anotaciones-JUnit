
package com.com470.notaApi;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class UtilidadesNullTest {
    
    private UtilidadesNull utils;
    
    @Before
    public void setUp() {
        utils=new UtilidadesNull();
    }

    @Test
    public void testbuscaPersona() {
        //when
        Persona personaA = utils.buscaPersona("Juan");
        Persona PersonaNull = utils.buscaPersona("Pepe");
        //then
        assertNull(PersonaNull);
        assertNotNull(personaA);
    }
    
    @Test
    public void testDevuelveObjeto() {
        //when
        Persona personaA = utils.buscaPersona("Juan");
        Persona PersonaNull = utils.buscaPersona("Pepe");
        //then
        assertNull(PersonaNull);
        assertNotNull(personaA);
    }
}
