package com.ahcobos.greencore.inputprocesors;

import com.badlogic.gdx.math.Vector2;

/**
 * @author ahcobos
 * @since 2014-12-26 00:20:23
 */

public class GCLongPress {
	
	private float x , y;

	public GCLongPress() {
		// TODO Auto-generated constructor stub
	}
	
	public GCLongPress(float x , float y) {
		this.x = x;
		this.y = y;
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

	public Vector2 getTouchVector() {
		return new Vector2(this.getX(), this.getY());
	}

}
