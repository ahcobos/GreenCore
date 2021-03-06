package com.ahcobos.greencore.inputprocesors;

import com.badlogic.gdx.math.Vector2;

/**
 * @author ahcobos
 * @since 2014-12-26 00:20:23
 */

public class GCPan {
	
	private float x , y , deltaX, deltaY;
	
	public GCPan() {}
	
	public GCPan(float x, float y, float deltaX, float deltaY) {
		this.x = x;
		this.y = y;
		this.deltaX = deltaX;
		this.deltaY = deltaY;
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

	public float getDeltaX() {
		return deltaX;
	}

	public void setDeltaX(float deltaX) {
		this.deltaX = deltaX;
	}

	public float getDeltaY() {
		return deltaY;
	}

	public void setDeltaY(float deltaY) {
		this.deltaY = deltaY;
	}

	public Vector2 getTouchVector() {
		return new Vector2(this.getX(), this.getY());
	}
}
