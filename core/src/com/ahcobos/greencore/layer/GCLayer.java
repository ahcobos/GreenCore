package com.ahcobos.greencore.layer;

import java.util.HashMap;

import com.ahcobos.greencore.gcmodel.GCModel;
import com.ahcobos.greencore.renderer.GCRenderer;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public abstract class GCLayer {
	public abstract String getName();
	public abstract void setName(String name);
	public abstract void update();
	public abstract HashMap<String, GCModel> getElements();
	public abstract void setElements(HashMap<String, GCModel> elements);
	public abstract void addElement(String key, GCModel element);
	public abstract void removeElement(String key);
	public abstract GCRenderer getRenderer();
	public abstract void setRenderer(GCRenderer mRenderer);
}
