/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.assertFailApi;

import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class AssertThatTest {
    
    public AssertThatTest() {
    }

    @Test
    public void testSomeMethod() {
        String cadena="HolaMundo";
        assertEquals("HolaMundo", cadena);
        assertThat(cadena, Matchers.is(Matchers.equalTo("HolaMundo")));
        assertThat(cadena, Matchers.equalTo("HolaMundo"));
        assertThat(cadena, Matchers.not(Matchers.equalTo("Hola")));
        assertThat(cadena, Matchers.is(Matchers.not(Matchers.equalTo("Adios"))));
        assertThat(cadena, Matchers.notNullValue());
        assertThat(cadena, Matchers.is(Matchers.notNullValue()));
        assertThat(cadena, Matchers.is("HolaMundo"));
    }
    
}
