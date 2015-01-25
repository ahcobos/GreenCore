package com.ahcobos.greencore.inputprocesors;

import com.ahcobos.greencore.gcmodel.GCModel;
import com.ahcobos.greencore.layer.GCBaseScreen;
import com.ahcobos.greencore.layer.GCLayer;
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
	
	public GCBaseScreen getTScreen() {
		return tScreen;
	}

	public void setTScreen(GCBaseScreen tScreen) {
		this.tScreen = tScreen;
	}

	
	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public boolean touchDown(float x, float y, int pointer, int button) {
		GCTouchDown touchDown = this.preProcessTouchDown(x, y, pointer, button);
		this.processTouchDown(touchDown);
		
		return false;
	}

	@Override
	public boolean tap(float x, float y, int count, int button) {
		System.out.println("tap");
		System.out.println("x: "+x+" y: "+y+" count: " +count + " button: "+ button);		
		GCTap tap = this.preProcessTap(x, y, count, button);
		this.processTap(tap);
		
		return false;
	}

	@Override
	public boolean longPress(float x, float y) {
		System.out.println("longPress");
		System.out.println("x: "+x+"y: "+y);
		GCLongPress longPress =  this.preProcesslongPress(x, y);
		this.processlongPress(longPress);
		
		return false;
	}

	@Override
	public boolean fling(float velocityX, float velocityY, int button) {
		System.out.println("fling");
		System.out.println("VelocityX: "+velocityX+ " VelocityY: "+velocityY + " button: "+ button);
		GCFling fling = this.preProcessFling(velocityX, velocityY, button);
		this.processFling(fling);
		return false;
	}

	@Override
	public boolean pan(float x, float y, float deltaX, float deltaY) {
		System.out.println("pan");
		System.out.println("x: "+x+" y: "+y+" deltaX: " +deltaX+ " deltaY: "+ deltaY);
		GCPan pan = this.preProcessPan(x, y, deltaX, deltaY);
		this.processPan(pan);
		
		return false;
	}

	@Override
	public boolean panStop(float x, float y, int pointer, int button) {
		System.out.println("panstop");
		System.out.println("x: "+x+" y: "+y+" pointer: " +pointer + " button: "+ button);
		GCPanStop panStop = this.preProcessPanStop(x, y, pointer, button);
		this.processPanStop(panStop);
		
		return false;
	}

	@Override
	public boolean zoom(float initialDistance, float distance) {
		System.out.println("Zoom");
		System.out.println("initialDistante: "+ initialDistance + " distance: "+distance );
		GCZoom zoom = this.preProcessZoom(initialDistance, distance);
		this.processZoom(zoom);
		
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
		GCPinch pinch = this.preProcessPinch(initialPointer1, initialPointer2, pointer1, pointer2);
		this.processPinch(pinch);

		return false;
	}
	
	@Override
	public GCTouchDown preProcessTouchDown(float x, float y, int pointer, int button) {
		GCTouchDown mProperties = new GCTouchDown();
		mProperties.setX(this.translateX(x));
		mProperties.setY(this.translateY(y));
		mProperties.setPointer(pointer);
		mProperties.setButton(button);
		return mProperties;
	}
	
	@Override
	public GCTap preProcessTap(float x, float y, int count, int button) {
		GCTap mProperties = new GCTap();
		mProperties.setX(this.translateX(x));
		mProperties.setY(this.translateY(y));
		mProperties.setCount(count);
		mProperties.setButton(button);

		return mProperties;
	}
	
	@Override
	public GCLongPress preProcesslongPress(float x, float y) {
		GCLongPress longPress = new GCLongPress();
		longPress.setX(this.translateX(x));
		longPress.setY(this.translateY(y));
		
		return longPress; 
	}
	
	@Override
	public GCFling preProcessFling(float velocityX, float velocityY, int button){
		return new GCFling(velocityX, velocityY, button );
	}
	
	@Override
	public GCPan preProcessPan(float x, float y, float deltaX, float deltaY) {
		GCPan pan = new GCPan();
		pan.setX(this.translateX(x));
		pan.setY(this.translateY(y));
		pan.setDeltaX(deltaX);
		pan.setDeltaY(deltaY);
		
		return pan;
	}
	
	@Override
	public GCPanStop preProcessPanStop(float x, float y, int pointer, int button) {
		GCPanStop panStop = new GCPanStop();
		panStop.setX(this.translateX(x));
		panStop.setY(this.translateY(y));
		panStop.setPointer(pointer);
		panStop.setButton(button);
		
		return panStop;
	}
	
	@Override
	public GCZoom preProcessZoom(float initialDistante, float distance) {
		GCZoom zoom = new GCZoom();
		zoom.setInitialDistante(initialDistante);
		zoom.setDistance(distance);
		
		return zoom;
	}
	
	@Override
	public GCPinch preProcessPinch(Vector2 initialPointer1, Vector2 initialPointer2,
			Vector2 pointer1, Vector2 pointer2) {
		GCPinch pinch  = new GCPinch();
		pinch.setInitialPointer1(initialPointer1);
		pinch.setInitialPointer2(initialPointer2);
		pinch.setPointer1(pointer1);
		pinch.setPointer2(pointer2);
		
		return pinch;
	}

	@Override
	public void processTouchDown(GCTouchDown gcTouchDown){
		if(this.getTScreen() instanceof GCBaseGestureListener){
			((GCBaseGestureListener) this.getTScreen()).onTouchDown(gcTouchDown); 
		}
		
		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			if(mLayer instanceof GCBaseGestureListener){
				((GCBaseGestureListener) mLayer).onTouchDown(gcTouchDown); 
			}
		}
		
		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			for (String eKey : mLayer.getElements().keySet()) {
				GCModel mElement = mLayer.getElements().get(eKey);
				if(mElement instanceof GCBaseGestureListener && 
						mElement.getBoundingRectangle().contains(gcTouchDown.getTouchVector())){
					((GCBaseGestureListener) mElement).onTouchDown(gcTouchDown); 
				}
			}
		}
	}
	
	@Override
	public void processTap(GCTap gcTap){		
		if(this.getTScreen() instanceof GCBaseGestureListener){
			((GCBaseGestureListener) this.getTScreen()).onTap(gcTap); 
		}
		
		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			if(mLayer instanceof GCBaseGestureListener){
				((GCBaseGestureListener) mLayer).onTap(gcTap); 
			}
		}
		
		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			for (String eKey : mLayer.getElements().keySet()) {
				GCModel mElement = mLayer.getElements().get(eKey);
				if(mElement instanceof GCBaseGestureListener && 
						mElement.getBoundingRectangle().contains(gcTap.getTouchVector())){
					((GCBaseGestureListener) mElement).onTap(gcTap); 
				}
			}
		}
	}
	
	@Override
	public void processlongPress(GCLongPress gcLongPress) {
		if(this.getTScreen() instanceof GCBaseGestureListener){
			((GCBaseGestureListener) this.getTScreen()).onLongPress(gcLongPress); 
		}
		
		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			if(mLayer instanceof GCBaseGestureListener){
				((GCBaseGestureListener) mLayer).onLongPress(gcLongPress); 
			}
		}
		
		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			for (String eKey : mLayer.getElements().keySet()) {
				GCModel mElement = mLayer.getElements().get(eKey);
				if(mElement instanceof GCBaseGestureListener && 
						mElement.getBoundingRectangle().contains(gcLongPress.getTouchVector())){
					((GCBaseGestureListener) mElement).onLongPress(gcLongPress); 
				}
			}
		}
	}
	
	@Override
	public void processFling(GCFling gcFling) {
		if(this.getTScreen() instanceof GCBaseGestureListener){
			((GCBaseGestureListener) this.getTScreen()).onFling(gcFling); 
		}
		
		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			if(mLayer instanceof GCBaseGestureListener){
				((GCBaseGestureListener) mLayer).onFling(gcFling); 
			}
		}
	}
	
	@Override
	public void processPan(GCPan gcPan) {
		if(this.getTScreen() instanceof GCBaseGestureListener){
			((GCBaseGestureListener) this.getTScreen()).onPan(gcPan); 
		}
		
		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			if(mLayer instanceof GCBaseGestureListener){
				((GCBaseGestureListener) mLayer).onPan(gcPan); 
			}
		}

		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			for (String eKey : mLayer.getElements().keySet()) {
				GCModel mElement = mLayer.getElements().get(eKey);
				if(mElement instanceof GCBaseGestureListener && 
						mElement.getBoundingRectangle().contains(gcPan.getTouchVector())){
					((GCBaseGestureListener) mElement).onPan(gcPan); 
				}
			}
		}
	}
	
	@Override
	public void processPanStop(GCPanStop gcPanStop) {
		if(this.getTScreen() instanceof GCBaseGestureListener){
			((GCBaseGestureListener) this.getTScreen()).onPanStop(gcPanStop); 
		}
		
		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			if(mLayer instanceof GCBaseGestureListener){
				((GCBaseGestureListener) mLayer).onPanStop(gcPanStop); 
			}
		}
		
		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			for (String eKey : mLayer.getElements().keySet()) {
				GCModel mElement = mLayer.getElements().get(eKey);
				if(mElement instanceof GCBaseGestureListener && 
						mElement.getBoundingRectangle().contains(gcPanStop.getTouchVector())){
					((GCBaseGestureListener) mElement).onPanStop(gcPanStop); 
				}
			}
		}
	}
	
	@Override
	public void processZoom(GCZoom gcZoom) {
		if(this.getTScreen() instanceof GCBaseGestureListener){
			((GCBaseGestureListener) this.getTScreen()).onZoom(gcZoom); 
		}
		
		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			if(mLayer instanceof GCBaseGestureListener){
				((GCBaseGestureListener) mLayer).onZoom(gcZoom); 
			}
		}
	}
	
	@Override
	public void processPinch(GCPinch gcPinch) {
		if(this.getTScreen() instanceof GCBaseGestureListener){
			((GCBaseGestureListener) this.getTScreen()).onPinch(gcPinch); 
		}
		
		for (String key : this.getTScreen().getLayers().keySet()) {
			GCLayer mLayer = this.getTScreen().getLayers().get(key);
			if(mLayer instanceof GCBaseGestureListener){
				((GCBaseGestureListener) mLayer).onPinch(gcPinch);
			}
		}
	} 
	
	
	// ===========================================================
	// Methods
	// ===========================================================

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
