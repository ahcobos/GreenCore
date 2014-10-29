package com.ahcobos.greencore.exceptions;

public class StateNotFound extends GCException {

	private String key;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public StateNotFound(String key) {
		// TODO Auto-generated constructor stub
		this.key = key;
	}
	
	public String getMessage()
	{
		return "It looks like you don't have a state named "+key;
	}

}
