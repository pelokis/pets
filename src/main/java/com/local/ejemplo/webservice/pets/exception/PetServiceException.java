package com.local.ejemplo.webservice.pets.exception;

public class PetServiceException extends Exception{
	private static final long serialVersionUID = 1L;
	private String mensaje;
	
	public PetServiceException(String mensaje) {
		super();
		this.mensaje = mensaje;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
