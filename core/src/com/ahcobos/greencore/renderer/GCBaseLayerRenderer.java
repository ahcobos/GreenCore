package com.ahcobos.greencore.renderer;

import java.util.Iterator;

import com.ahcobos.greencore.layer.GCLayer;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GCBaseLayerRenderer extends GCRenderer {

	private GCLayer mLayer;
	public GCBaseLayerRenderer(GCLayer layer) {
		this.mLayer = layer;
	}
	@Override
	public void render(SpriteBatch batch) {
		for (String key : this.mLayer.getElements().keySet()) {
			this.mLayer.getElements().get(key).draw(batch);;
		    
		}
	}

}
