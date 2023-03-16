package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	
	
	public static Connection conex() throws ClassNotFoundException, SQLException
    {
        //Cargar y referencia el driver de conexion (Clase de conexion)
        Class.forName( "com.mysql.jdbc.Driver" );
        
        String url = "jdbc:mysql://localhost:33064/empresa";
        
        Connection cnn = DriverManager.getConnection(url, "root" , "");
        
        return cnn;
        
        
    }
	
}
