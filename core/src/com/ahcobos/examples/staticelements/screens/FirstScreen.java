package com.ahcobos.examples.staticelements.screens;

import com.ahcobos.examples.staticelements.layers.MyLayer;
import com.ahcobos.greencore.layer.GCBaseScreen;
import com.ahcobos.greencore.renderer.GCBaseLayerRenderer;
import com.ahcobos.greencore.renderer.GCRenderer;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FirstScreen extends GCBaseScreen {
	
	private MyLayer mLayer = new MyLayer("init");
	private SpriteBatch batch;
	public MyLayer getmLayer() {
		return mLayer;
	}

	public void setmLayer(MyLayer mLayer) {
		this.mLayer = mLayer;
	}

	public SpriteBatch getBatch() {
		return batch;
	}

	public void setBatch(SpriteBatch batch) {
		this.batch = batch;
	}

	public GCRenderer getmRenderer() {
		return mRenderer;
	}

	public void setmRenderer(GCRenderer mRenderer) {
		this.mRenderer = mRenderer;
	}

	private GCRenderer mRenderer;
	
	public FirstScreen() {
		this.addLayer(mLayer);
		this.batch = new SpriteBatch();
		this.mRenderer = new GCBaseLayerRenderer(this.mLayer);
	}

}
