package com.ahcobos.greencore.inputprocesors;

/**
 * @author ahcobos
 * @since 2014-12-26 00:20:23
 */

public interface GCIBaseGestureProcess {
	
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
	
	public abstract void processTouchDown(GCTouchDownProperties touchDown);
	
	public abstract void processTap(GCTapProperties tap);

	public abstract void processlongPress(GCLongPressProperties longPress);

	public abstract void processFling(GCFlingProperties gcFling);

	void processPan(GCPanProperties gcPan);


}
