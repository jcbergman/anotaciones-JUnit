
package com.com470.assertFailApi;

import java.sql.Connection;
import java.sql.SQLException;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConexionUnoBDTest {
    
    public static final String BD="bd_agenda";
    public static final String USER="root";
    public static final String PASS="";
    public static final String INVALID_USER="noValido";
    private ConexionBD conexionBD;
    
    @Test
    public void conexionCorrecta() {
        conexionBD = new ConexionBD(BD, USER, PASS);
        com.mysql.jdbc.Connection con = null;
        try {
            con = (com.mysql.jdbc.Connection) conexionBD.getConnection();
        } catch (SQLException e) {
            fail("la conexion fallo");
        }
        assertThat(con,Matchers.notNullValue());
        assertThat(conexionBD.getDb(), Matchers.equalTo("bd_agenda"));
        
        
        
    }
    
}
