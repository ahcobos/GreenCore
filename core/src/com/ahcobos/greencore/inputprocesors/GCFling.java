package com.ahcobos.greencore.inputprocesors;

/**
 * @author ahcobos
 * @since 2014-12-26 00:20:23
 */

public class GCFling {
	
	private float velocityX ,velocityY;
	private int button;
	
	public GCFling() {}
	
	public GCFling(float velocityX, float velocityY, int button) {
		this.velocityX = velocityX;
		this.velocityY = velocityY;
		this.button = button;
	}

	public float getVelocityX() {
		return velocityX;
	}

	public void setVelocityX(float velocityX) {
		this.velocityX = velocityX;
	}

	public float getVelocityY() {
		return velocityY;
	}

	public void setVelocityY(float velocityY) {
		this.velocityY = velocityY;
	}

	public int getButton() {
		return button;
	}

	public void setButton(int button) {
		this.button = button;
	}
}
