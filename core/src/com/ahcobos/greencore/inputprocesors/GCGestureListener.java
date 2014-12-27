package com.ahcobos.greencore.inputprocesors;

import com.ahcobos.greencore.layer.GCBaseScreen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.input.GestureDetector.GestureListener;
import com.badlogic.gdx.math.Vector2;

/**
 * @author ahcobos
 * @since 2014-12-26 00:20:23
 */

public class GCGestureListener implements GestureListener, GCIBaseGestureProcess{
	
	private GCBaseScreen tScreen;
	
	public GCGestureListener(GCBaseScreen tScreen) {
		this.tScreen = tScreen;
	}

	@Override
	public boolean touchDown(float x, float y, int pointer, int button) {
		System.out.println("touchDown");
		System.out.println("x: "+x+" y: "+y+" pointer: " +pointer + " button: "+ button);
		GCTouchDownProperties touchDown = this.preProcessTouchDown(x, y, pointer, button);
		this.processTouchDown(touchDown);
		
		return false;
	}

	@Override
	public boolean tap(float x, float y, int count, int button) {
		System.out.println("tap");
		System.out.println("x: "+x+" y: "+y+" count: " +count + " button: "+ button);		
		GCTapProperties tap = this.preProcessTap(x, y, count, button);
		this.processTap(tap);
		
		return false;
	}

	@Override
	public boolean longPress(float x, float y) {
		System.out.println("longPress");
		System.out.println("x: "+x+"y: "+y);
		GCLongPressProperties longPress =  this.preProcesslongPress(x, y);
		this.processlongPress(longPress);
		return false;
	}

	@Override
	public boolean fling(float velocityX, float velocityY, int button) {
		System.out.println("fling");
		System.out.println("VelocityX: "+velocityX+ " VelocityY: "+velocityY + " button: "+ button);
		GCFlingProperties fling = this.preProcessFling(velocityX, velocityY, button);
		this.processFling(fling);
		return false;
	}

	@Override
	public boolean pan(float x, float y, float deltaX, float deltaY) {
		System.out.println("pan");
		System.out.println("x: "+x+" y: "+y+" deltaX: " +deltaX+ " deltaY: "+ deltaY);
		GCPanProperties pan = this.preProcessPan(x, y, deltaX, deltaY);
		this.processPan(pan);
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
	
	@Override
	public GCTouchDownProperties preProcessTouchDown(float x, float y, int pointer, int button) {
		GCTouchDownProperties mProperties = new GCTouchDownProperties();
		mProperties.setX(this.translateX(x));
		mProperties.setY(this.translateY(y));
		mProperties.setPointer(pointer);
		mProperties.setButton(button);
		return mProperties;
	}
	
	@Override
	public GCTapProperties preProcessTap(float x, float y, int count, int button) {
		GCTapProperties mProperties = new GCTapProperties();
		mProperties.setX(this.translateX(x));
		mProperties.setY(this.translateY(y));
		mProperties.setCount(count);
		mProperties.setButton(button);

		return mProperties;
	}
	
	@Override
	public GCLongPressProperties preProcesslongPress(float x, float y) {
		GCLongPressProperties longPress = new GCLongPressProperties();
		longPress.setX(this.translateX(x));
		longPress.setY(this.translateY(y));
		
		return longPress; 
	}
	
	@Override
	public GCFlingProperties preProcessFling(float velocityX, float velocityY, int button){
		return new GCFlingProperties(velocityX, velocityY, button );
	}
	
	@Override
	public GCPanProperties preProcessPan(float x, float y, float deltaX, float deltaY) {
		GCPanProperties pan = new GCPanProperties();
		pan.setX(this.translateX(x));
		pan.setY(this.translateY(y));
		pan.setDeltaX(deltaX);
		pan.setDeltaY(deltaY);
		
		return pan;
	}
	
	public void preProcessPanStop(float x, float y, int pointer, int button){}
	
	public void preProcessZoom(float initialDistance, float distance){}
	
	public void preProcessPinch(Vector2 initialPointer1, Vector2 initialPointer2,
			Vector2 pointer1, Vector2 pointer2) {}

	@Override
	public void processTouchDown(GCTouchDownProperties gcTouchDown){}
	
	@Override
	public void processTap(GCTapProperties gcTap){}
	
	@Override
	public void processlongPress(GCLongPressProperties gcLongPress) {}
	
	@Override
	public void processFling(GCFlingProperties gcFling){}
	
	@Override
	public void processPan(GCPanProperties gcPan){}
	
	public void processPanStop(float x, float y, int pointer, int button){}
	
	public void processPinch(Vector2 initialPointer1, Vector2 initialPointer2,
			Vector2 pointer1, Vector2 pointer2) {} 
	
	public float translateX(float x)
	{
		float camposx = this.tScreen.getCamera().position.x;
		float wSize = Gdx.graphics.getWidth();
		return (x - (wSize/2) + camposx);	
	}
	
	public float translateY( float y)
	{
		float camposy = this.tScreen.getCamera().position.y;
		float hSize = Gdx.graphics.getHeight();
		return (-y +(hSize/2) + camposy );
	}
}
