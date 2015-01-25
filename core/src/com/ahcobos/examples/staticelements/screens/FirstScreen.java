package com.ahcobos.examples.staticelements.screens;

import com.ahcobos.examples.staticelements.layers.MyLayer;
import com.ahcobos.greencore.inputprocesors.GCBaseGestureListener;
import com.ahcobos.greencore.inputprocesors.GCFling;
import com.ahcobos.greencore.inputprocesors.GCLongPress;
import com.ahcobos.greencore.inputprocesors.GCPan;
import com.ahcobos.greencore.inputprocesors.GCPanStop;
import com.ahcobos.greencore.inputprocesors.GCPinch;
import com.ahcobos.greencore.inputprocesors.GCTap;
import com.ahcobos.greencore.inputprocesors.GCTouchDown;
import com.ahcobos.greencore.inputprocesors.GCZoom;
import com.ahcobos.greencore.layer.GCBaseScreen;
import com.ahcobos.greencore.renderer.GCBaseLayerRenderer;
import com.ahcobos.greencore.renderer.GCRenderer;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FirstScreen extends GCBaseScreen implements GCBaseGestureListener {
	
	private MyLayer mLayer = new MyLayer("init");

	public MyLayer getmLayer() {

		return mLayer;
	}

	public void setmLayer(MyLayer mLayer) {
		this.mLayer = mLayer;
	}
	
	public FirstScreen(Game mGame) {
		super(mGame);
		this.addLayer(mLayer);
	}

	@Override
	public void onTouchDown(GCTouchDown touchDown) {
		
	}

	@Override
	public void onTap(GCTap tap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLongPress(GCLongPress longPress) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFling(GCFling fling) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPan(GCPan pan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPanStop(GCPanStop panStop) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onZoom(GCZoom zoom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPinch(GCPinch pinch) {
		// TODO Auto-generated method stub
		
	}

}
