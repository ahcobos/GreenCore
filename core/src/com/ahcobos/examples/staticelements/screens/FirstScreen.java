package com.ahcobos.examples.staticelements.screens;

import com.ahcobos.examples.staticelements.layers.MyLayer;
import com.ahcobos.greencore.layer.GCBaseScreen;
import com.ahcobos.greencore.renderer.GCBaseLayerRenderer;
import com.ahcobos.greencore.renderer.GCRenderer;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FirstScreen extends GCBaseScreen {
	
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

}
