package com.ahcobos.greencore.inputprocesors;

import com.badlogic.gdx.math.Vector2;

/**
 * @author ahcobos
 * @since 2014-12-26 00:20:23
 */

public class GCTap {
	
	private float x ,y;
	private int count, button;

	public GCTap() {}
	
	public GCTap(float x, float y , int count , int button){
		this.x = x;
		this.y = y;
		this.count = count;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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
