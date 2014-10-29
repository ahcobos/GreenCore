package com.ahcobos.greencore.exceptions;

public class NullCurrentStateException extends GCException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String getMessage()
	{
		return "It looks like you still don't have any current state, please use GCModel.addState(GCState state)";
	}

}
