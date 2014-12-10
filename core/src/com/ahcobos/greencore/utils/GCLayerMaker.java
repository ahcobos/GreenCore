package com.ahcobos.greencore.utils;

import java.awt.image.BufferedImage;
import java.util.HashMap;

import com.ahcobos.greencore.layer.GCLayer;
import com.ahcobos.greencore.layer.GCTile;

public abstract class GCLayerMaker {
	
	protected BufferedImage baseLayerImage;
	protected HashMap <String, GCTile>tilesMap;
		
	public void setImageLayer(BufferedImage baseLayerImage){
		this.baseLayerImage = baseLayerImage;
	}
	
	public void addTile(GCTile tile){
		tilesMap.put(tile.getTileName(), tile);
	}
	
	
}
