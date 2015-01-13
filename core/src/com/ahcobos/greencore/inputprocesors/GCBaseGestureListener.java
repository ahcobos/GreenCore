package com.ahcobos.greencore.inputprocesors;

public abstract interface GCBaseGestureListener {

	public abstract void onTouchDown(GCTouchDown touchDown);
	public abstract void onTap(GCTap tap);
	public abstract void onLongPress(GCLongPress longPress);
	public abstract void onFling(GCFling fling);
	public abstract void onPan(GCPan pan);
	public abstract void onPanStop(GCPanStop panStop);
	public abstract void onZoom(GCZoom zoom);
	public abstract void onPinch(GCPinch pinch);
}
