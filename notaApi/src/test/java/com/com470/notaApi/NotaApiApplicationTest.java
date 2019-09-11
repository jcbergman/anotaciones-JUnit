/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.notaApi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class NotaApiApplicationTest {
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Antes de todos los Test");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Despues de todos los Test");
    }
    
    @Before
    public void setUp() {
        System.out.println("Antes de cada Test");
    }
    
    @After
    public void tearDown() {
        System.out.println("Despues de cada Test \n");
    }

    @Test
    public void primerTest() {
        System.out.println("Primer Test");
    }
    @Test
    public void segundoTest() {
        System.out.println("Segundo Test");
    }
    
}
