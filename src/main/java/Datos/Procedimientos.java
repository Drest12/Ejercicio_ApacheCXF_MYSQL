package Datos;

import java.sql.*;

import javax.jws.WebService;

@WebService(targetNamespace = "http://Datos/", endpointInterface = "Datos.ProcedimientoInterface", portName = "ProcedimientosPort", serviceName = "ProcedimientosService")
public class Procedimientos implements ProcedimientoInterface {
	
private PreparedStatement sql;
private Connection conect;

    public void eliminacion(int id)
    {
    	
    	try {
    		conect= Conexion.conex();
			sql = conect.prepareStatement("delete from travel where id=?");
			sql.setInt(1, id);

			 int rpta = sql.executeUpdate();

			 if(rpta > 0)
			 {
			 System.out.println("Registro Eliminado");
			 }
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
    }
    
	

}
