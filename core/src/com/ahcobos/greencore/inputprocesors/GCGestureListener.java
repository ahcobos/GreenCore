package com.ahcobos.greencore.inputprocesors;

import com.badlogic.gdx.input.GestureDetector.GestureListener;
import com.badlogic.gdx.math.Vector2;

public class GCGestureListener implements GestureListener{

	@Override
	public boolean touchDown(float x, float y, int pointer, int button) {
		System.out.println("touchDown");
		System.out.println("x: "+x+" y: "+y+" pointer: " +pointer + " button: "+ button);
		return false;
	}

	@Override
	public boolean tap(float x, float y, int count, int button) {
		System.out.println("tap");
		System.out.println("x: "+x+" y: "+y+" count: " +count + " button: "+ button);
		return false;
	}

	@Override
	public boolean longPress(float x, float y) {
		System.out.println("longPress");
		System.out.println("x: "+x+"y: "+y);
		return false;
	}

	@Override
	public boolean fling(float velocityX, float velocityY, int button) {
		System.out.println("fling");
		System.out.println("VelocityX: "+velocityX+ " VelocityY: "+velocityY + " button: "+ button);
		return false;
	}

	@Override
	public boolean pan(float x, float y, float deltaX, float deltaY) {
		System.out.println("pan");
		System.out.println("x: "+x+" y: "+y+" deltaX: " +deltaX+ " deltaY: "+ deltaY);
		return false;
	}

	@Override
	public boolean panStop(float x, float y, int pointer, int button) {
		System.out.println("panstop");
		System.out.println("x: "+x+" y: "+y+" pointer: " +pointer + " button: "+ button);
		return false;
	}

	@Override
	public boolean zoom(float initialDistance, float distance) {
		System.out.println("Zoom");
		System.out.println("initialDistante: "+ initialDistance + " distance: "+distance );
		return false;
	}

	@Override
	public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2,
			Vector2 pointer1, Vector2 pointer2) {
		System.out.println("pinch");
		System.out.println("initialPointer1 x:"+initialPointer1.x + "initialPointer1 y:"
							+ initialPointer1.y);
		System.out.println("initialPointer2 x:"+initialPointer2.x + "initialPointer2 y:"
				+ initialPointer2.y);
		System.out.println("Pointer1 x:"+pointer1.x + "pointer1 y:"
				+ pointer1.y);
		System.out.println("Pointer2 x:"+pointer2.x + "pointer2 y:"
				+ pointer2.y);
		return false;
	}

}
