package com.rest.srv.implementacion;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.rest.srv.interfaces.IOperaciones;

@Path("operaciones")
public class ImpOperaciones implements IOperaciones {
	
	String mensaje = "El resultado es: ";

	@GET
	@Path("/sumar/{numA}/{numB}")
	@Override
	public String Sumar(@PathParam("numA") double numA, @PathParam("numB") double numB) {
		// TODO Auto-generated method stub
		return mensaje + (numA + numB);
	}

	@GET
	@Path("/restar/{numA}/{numB}")
	@Override
	public String Restar(@PathParam("numA") double numA, @PathParam("numB") double numB) {
		// TODO Auto-generated method stub
		return mensaje + (numA - numB);
	}

	@GET
	@Path("/producto/{numA}/{numB}")
	@Override
	public String Multiplicar(@PathParam("numA") double numA, @PathParam("numB") double numB) {
		// TODO Auto-generated method stub
		return mensaje + (numA * numB);
	}

	@GET
	@Path("/dividir/{numA}/{numB}")
	@Override
	public String Dividir(@PathParam("numA") double numA, @PathParam("numB") double numB) {
		// TODO Auto-generated method stub
		return mensaje + (numA / numB);
	}

}
