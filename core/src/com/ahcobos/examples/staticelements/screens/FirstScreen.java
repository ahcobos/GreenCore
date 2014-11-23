package com.ahcobos.examples.staticelements.screens;

import com.ahcobos.examples.staticelements.layers.MyLayer;
import com.ahcobos.greencore.layer.GCBaseScreen;
import com.ahcobos.greencore.renderer.GCBaseLayerRenderer;
import com.ahcobos.greencore.renderer.GCRenderer;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FirstScreen extends GCBaseScreen {
	
	private MyLayer mLayer = new MyLayer("init");
	private MyLayer mLayer2 = new MyLayer("init2");

	public MyLayer getmLayer() {
		return mLayer;
	}

	public void setmLayer(MyLayer mLayer) {
		this.mLayer = mLayer;
	}
	
	public FirstScreen() {
		super();
		this.addLayer(mLayer);
		this.addLayer(mLayer2);
	}

}
