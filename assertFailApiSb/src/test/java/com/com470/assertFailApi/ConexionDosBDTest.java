
package com.com470.assertFailApi;

import java.sql.Connection;
import java.sql.SQLException;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ConexionDosBDTest {
    
   public static final String BD = "bd_agenda";
    public static final String USER = "root";
    public static final String PASS = "";
    public static final String INVALID_USER = "ssaaa";
    private ConexionBD conexionBD;
    
    @Test
    public void conexionCorrecta() {
        conexionBD = new ConexionBD(BD, USER, PASS);
        Connection con = null;
        try {
            con = conexionBD.getConnection();
        } catch (SQLException e) {  //e.printStackTrace();
            fail("La conexion ha fallado");
        }
        assertThat(con, Matchers.notNullValue());
        
    }
    @Test
    public void conexionFallida() {
        conexionBD = new ConexionBD(BD, INVALID_USER, PASS);
        Connection con = null;
        
        try {
            con = conexionBD.getConnection();
            fail("La conexion ha fallado");
        } catch (SQLException e) {
            assertThat(e, Matchers.isA(SQLException.class));
            assertThat(e.getMessage(), Matchers.startsWith("Access denied"));
            assertThat(e.getMessage(), Matchers.containsString("Access denied"));
//            assertThat(e.getSQLState(), Matchers.is("42000"));
        }
        assertThat(con, Matchers.nullValue());
    }
    
    @Test(expected = SQLException.class)
    public void conexionFallidaAnotaciones() throws SQLException{
        conexionBD = new ConexionBD(BD, INVALID_USER, PASS);
        conexionBD.getConnection();
    }
    
}
