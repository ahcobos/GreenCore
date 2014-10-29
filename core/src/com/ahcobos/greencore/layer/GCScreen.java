package com.ahcobos.greencore.layer;

import java.util.HashMap;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Camera;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public abstract class GCScreen  extends ScreenAdapter{

	public abstract HashMap<String, GCLayer> getLayers();	
	public abstract void setLayers(HashMap<String, GCLayer> layers);	
	public abstract void addLayer(GCLayer mLayer);
	public abstract void removeLayer(String key);
	public abstract void removeLayer(GCLayer mLayer);
	public abstract Camera getCamera();
	public abstract void setCamera(Camera mCamera);

}
