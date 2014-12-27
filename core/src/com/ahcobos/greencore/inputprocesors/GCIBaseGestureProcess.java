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
	
	public abstract GCTouchDownProperties preProcessTouchDown(float x, 
			float y, int pointer, int button);
	
	public abstract GCTapProperties preProcessTap(float x, float y,
			int count, int button);
	
	public abstract GCLongPressProperties preProcesslongPress(float x,
			float y);
	
	public abstract GCFlingProperties preProcessFling(float velocityX, 
			float velocityY, int button);
	
	public abstract GCPanProperties preProcessPan(float x, float y, 
			float deltaX, float deltaY);
	
	public abstract GCPanStopProperties preProcessPanStop(float x, float y, int pointer,
			int button);
	
	public abstract GCZoomProperties preProcessZoom(float initialDistante, float distance);
	
	public abstract GCPinchProperties preProcessPinch(Vector2 initialPointer1,
			Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2);
	
	// ===========================================================
	// process functions
	// ===========================================================
	
	public abstract void processTouchDown(GCTouchDownProperties gcTouchDown);
	
	public abstract void processTap(GCTapProperties gcTap);

	public abstract void processlongPress(GCLongPressProperties gcLongPress);

	public abstract void processFling(GCFlingProperties gcFling);

	public abstract void processPan(GCPanProperties gcPan);

	public abstract void processPanStop(GCPanStopProperties gcPanStop);

	public abstract void processZoom(GCZoomProperties gcZoom);

	public abstract void processPinch(GCPinchProperties gcPinch);
}
