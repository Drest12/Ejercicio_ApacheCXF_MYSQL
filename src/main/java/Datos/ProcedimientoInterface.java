package Datos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "ProcedimientoInterface", targetNamespace = "http://Datos/")
public interface ProcedimientoInterface {

	@WebMethod(operationName = "eliminacion", action = "urn:Eliminacion")
	@RequestWrapper(className = "Datos.jaxws.Eliminacion", localName = "eliminacion", targetNamespace = "http://Datos/")
	@ResponseWrapper(className = "Datos.jaxws.EliminacionResponse", localName = "eliminacionResponse", targetNamespace = "http://Datos/")
	@WebResult(name = "return")
	void eliminacion(@WebParam(name = "arg0") int id);

}