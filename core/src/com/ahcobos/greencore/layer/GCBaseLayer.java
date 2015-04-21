package com.ahcobos.greencore.layer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import com.ahcobos.greencore.gcmodel.GCModel;
import com.ahcobos.greencore.renderer.GCBaseLayerRenderer;
import com.ahcobos.greencore.renderer.GCRenderer;
import com.badlogic.gdx.Game;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GCBaseLayer extends GCLayer{
	
	//=================================
	// fileds
	//=================================
	
	protected String name;
	protected HashMap<String, GCModel> elements;
	protected GCRenderer renderer;
	protected GCScreen mScreen;
	
	//=================================
	// constructors
	//=================================
	
	public GCBaseLayer(String name, GCScreen mScreen) {
		this.name = name;
		this.elements = new HashMap<String, GCModel>();
		this.renderer = new GCBaseLayerRenderer(this);
		this.mScreen = mScreen;
	}
	
	public GCBaseLayer(String name) {
		this.name = name;
		this.elements = new HashMap<String, GCModel>();
		this.renderer = new GCBaseLayerRenderer(this);
	}

	//=================================
	//getters
	//=================================
	
	public String getName() {
		return name;
	}

	@Override
	public HashMap<String, GCModel> getElements() {
		return this.elements;
	}
	
	@Override
	public GCRenderer getRenderer() {
		return this.renderer;
	}
	
	@Override
	public GCScreen getScreen() {
			return this.mScreen;
	}

	//=================================
	//setters 
	//=================================
	
	@Override
	public void setElements(HashMap<String, GCModel> elements) {
		this.elements = elements;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void setRenderer(GCRenderer mRenderer) {
		this.renderer = mRenderer;
	}
	
	@Override
	public void setScreen(GCScreen mScreen) {
		this.mScreen = mScreen;
	}
	
	//=================================
	// Methods
	//=================================

	@Override
	public void addElement(String hash, GCModel element) {
		this.elements.put(hash, element);
	}

	@Override
	public void removeElement(String key) {
		this.elements.remove(key);
	}

	@Override
	public void preUpdate(float deltaTime) {
		for (String key : this.getElements().keySet()) {
			this.getElements().get(key).doUpdate(deltaTime);
		}
	}

	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
		
	}

}
