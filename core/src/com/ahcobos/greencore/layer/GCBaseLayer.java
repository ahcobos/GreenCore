package com.ahcobos.greencore.layer;

import java.util.HashMap;

import com.ahcobos.greencore.gcmodel.GCModel;
import com.ahcobos.greencore.renderer.GCBaseLayerRenderer;
import com.ahcobos.greencore.renderer.GCRenderer;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GCBaseLayer extends GCLayer{
	
	protected String name;
	protected HashMap<String, GCModel> elements;
	protected GCRenderer renderer;
	
	public GCBaseLayer(String name) {
		this.name = name;
		this.elements = new HashMap<String, GCModel>();
		this.renderer = new GCBaseLayerRenderer(this);
	}

	public String getName() {
		return name;
	}
	
	public void update(){}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public HashMap<String, GCModel> getElements() {
		return this.elements;
	}

	@Override
	public void setElements(HashMap<String, GCModel> elements) {
		this.elements = elements;
	}

	@Override
	public void addElement(String hash, GCModel element) {
		this.elements.put(hash, element);
	}

	@Override
	public void removeElement(String key) {
		this.elements.remove(key);
	}

	@Override
	public GCRenderer getRenderer() {
		return this.renderer;
	}

	@Override
	public void setRenderer(GCRenderer mRenderer) {
		this.renderer = mRenderer;
	}

}
