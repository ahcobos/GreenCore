package com.ahcobos.greencore.inputprocesors;

import com.badlogic.gdx.math.Vector2;

/**
 * @author ahcobos
 * @since 2014-12-26 00:20:23
 */

public class GCPanStop {
	
	private float x , y;
	private int pointer, button;
	
	public GCPanStop() {}
	
	public GCPanStop(float x, float y, int pointer, int button) {
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

	public Vector2 getTouchVector() {
		return new Vector2(this.getX(), this.getY());
	}
}
