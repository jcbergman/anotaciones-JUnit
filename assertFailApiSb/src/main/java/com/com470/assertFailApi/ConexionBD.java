/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com470.assertFailApi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class ConexionBD {
    //parametros de conexion
    private final String db;
    private final String url;
    private final String user;
    private final String pass;

    public ConexionBD(final String db, final String user, final String pass) {
        super();
        this.db = db;
        this.url = "jdbc:mysql://localhost/" + db + "?";
        this.user = user;
        this.pass = pass;
    }
 
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url+"user="+this.user+"&password="+this.pass);
    }

    public String getDb() {
        return db;
    }
    public String getUser() {
        return user;
    }
    
    
}
