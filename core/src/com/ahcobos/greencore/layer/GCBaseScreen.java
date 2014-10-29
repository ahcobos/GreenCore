package com.ahcobos.greencore.layer;

import java.util.HashMap;

import com.badlogic.gdx.graphics.Camera;

public class GCBaseScreen extends GCScreen {
	private HashMap<String, GCLayer> mLayers;
	private Camera mCamera;

	public HashMap<String, GCLayer> getLayers() {
		return mLayers;
	}

	public void setLayers(HashMap<String, GCLayer> layers) {
		this.mLayers = layers;
	}
	
	public void addLayer(GCLayer mLayer)
	{
		this.mLayers.put(mLayer.getName(), mLayer);
	}
	
	public void removeLayer(String key)
	{
		this.mLayers.remove(key);
	}
	
	public void removeLayer(GCLayer mLayer)
	{
		this.mLayers.remove(mLayer.getName());
	}

	@Override
	public Camera getCamera() {
		return this.mCamera;
	}

	@Override
	public void setCamera(Camera mCamera) {
		this.setCamera(mCamera);
	}
}