package com.com470.notaApi;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UtilidadesSameTest {

    private UtilidadesNull utils;

    @Before
    public void setUp() {
        utils = new UtilidadesNull();
    }

    @Test
    public void testSome() {
        //given
        Persona p = new Persona("Juan", "Lopez");
        //when
        Persona resultado = utils.devuelveObjeto(p);
        //then
        assertSame(p,resultado);
        assertEquals(p,resultado);
    }
//    @Test
//    public void testNotSome() {
//        //given
//        Persona p = new Persona("Marco", "Torrez");
//        //when
//        Persona resultado = utils.devuelveObjeto(p);
//        //then
//        assertNotSame(p,resultado);
//        assertNotEquals(p,resultado);
//    }
//    @Test
//    public void testSome2() {
//        //given
//        Persona p = new Persona("Maria", "Martinez");
//        //when
//        Persona resultado = utils.devuelveObjeto(p);
//        //then
//        assertNotSame(p,resultado);
//        assertEquals(p,resultado);
//    }
//    
    
    

}
