package com.ahcobos.greencore.inputprocesors;

import com.badlogic.gdx.math.Vector2;

/**
 * @author ahcobos
 * @since 2014-12-26 00:20:23
 */

public interface GCIBaseGestureProcess {
	
	// ===========================================================
	// preProcess functions
	// ===========================================================
	
	public abstract GCTouchDown preProcessTouchDown(float x, 
			float y, int pointer, int button);
	
	public abstract GCTap preProcessTap(float x, float y,
			int count, int button);
	
	public abstract GCLongPress preProcesslongPress(float x,
			float y);
	
	public abstract GCFling preProcessFling(float velocityX, 
			float velocityY, int button);
	
	public abstract GCPan preProcessPan(float x, float y, 
			float deltaX, float deltaY);
	
	public abstract GCPanStop preProcessPanStop(float x, float y, int pointer,
			int button);
	
	public abstract GCZoom preProcessZoom(float initialDistante, float distance);
	
	public abstract GCPinch preProcessPinch(Vector2 initialPointer1,
			Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2);
	
	// ===========================================================
	// process functions
	// ===========================================================
	
	public abstract void processTouchDown(GCTouchDown gcTouchDown);
	
	public abstract void processTap(GCTap gcTap);

	public abstract void processlongPress(GCLongPress gcLongPress);

	public abstract void processFling(GCFling gcFling);

	public abstract void processPan(GCPan gcPan);

	public abstract void processPanStop(GCPanStop gcPanStop);

	public abstract void processZoom(GCZoom gcZoom);

	public abstract void processPinch(GCPinch gcPinch);
}
