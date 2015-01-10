package com.ahcobos.greencore.inputprocesors;

/**
 * @author ahcobos
 * @since 2014-12-26 00:20:23
 */

public class GCTouchDown {
	private float x, y;
	private int pointer , button;

	public GCTouchDown(){}
	
	public GCTouchDown(float x , float y, int pointer ,int button)
	{
		this.x = x;
		this.y = y;
		this.pointer = pointer;
		this.button = button;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getPointer() {
		return pointer;
	}

	public void setPointer(int pointer) {
		this.pointer = pointer;
	}

	public int getButton() {
		return button;
	}

	public void setButton(int button) {
		this.button = button;
	}
	
	
}
