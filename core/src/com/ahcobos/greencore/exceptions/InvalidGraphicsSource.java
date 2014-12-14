package com.ahcobos.greencore.exceptions;

public class InvalidGraphicsSource extends GCException {

	@Override
	public String getMessage() {
		return "You don't have a valid configuration in your Graphics Manager";
	}

}
