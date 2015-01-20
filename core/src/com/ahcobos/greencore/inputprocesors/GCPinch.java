package com.ahcobos.greencore.inputprocesors;

/**
 * @author ahcobos
 * @since 2014-12-26 00:20:23
 */

import com.badlogic.gdx.math.Vector2;

public class GCPinch {
	
	private Vector2 initialPointer1, initialPointer2;
	private Vector2 pointer1,  pointer2;
	
	public GCPinch() {}
	
	public GCPinch(Vector2 initialPointer1, Vector2 initialPointer2,
			Vector2 pointer1, Vector2 pointer2) {
		this.initialPointer1 = initialPointer1;
		this.initialPointer2 = initialPointer2;
		this.pointer1 = pointer1;
		this.pointer2 = pointer2;
	}

	public Vector2 getInitialPointer1() {
		return initialPointer1;
	}

	public void setInitialPointer1(Vector2 initialPointer1) {
		this.initialPointer1 = initialPointer1;
	}

	public Vector2 getInitialPointer2() {
		return initialPointer2;
	}

	public void setInitialPointer2(Vector2 initialPointer2) {
		this.initialPointer2 = initialPointer2;
	}

	public Vector2 getPointer1() {
		return pointer1;
	}

	public void setPointer1(Vector2 pointer1) {
		this.pointer1 = pointer1;
	}

	public Vector2 getPointer2() {
		return pointer2;
	}

	public void setPointer2(Vector2 pointer2) {
		this.pointer2 = pointer2;
	}
}
