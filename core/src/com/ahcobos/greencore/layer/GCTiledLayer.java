package com.ahcobos.greencore.layer;

import java.awt.Color;
import java.util.HashMap;

import com.ahcobos.greencore.gcmodel.GCTile;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.math.Vector2;

public class GCTiledLayer extends GCBaseLayer{
	
	protected Pixmap baseLayerImage;
	protected HashMap<String, GCTile> tilesMap;
	protected float tileSize = 16.0f;
	
	public GCTiledLayer(String name){
		super(name);
		tilesMap = new HashMap<String, GCTile>();
	}

	
	public void constructTiledLayer(Pixmap baseLayerImage){
		for(int y = 0; y<baseLayerImage.getHeight(); y++){
			for(int x = 0; x<baseLayerImage.getWidth(); x++){				
				if(getTile(new Color(baseLayerImage.getPixel(x, baseLayerImage.getHeight()-y-1)).toString()) != null){
					GCTile tile = getTile(new Color(baseLayerImage.getPixel(x, baseLayerImage.getHeight()-y-1)).toString()).clone();
					tile.setPosition(new Vector2(x*this.getTileSize(), y*this.getTileSize()));
					addElement(tile.getPosition().toString(), tile);					
				}
				
			}
		}
	}
	
	public void addTile(GCTile tile){
		if(tile != null)
			tilesMap.put(tile.getTileName(), tile);	
			else
			System.err.println("Error! GCTile is null and cannot be put in tilesMap");
	}
	
	public void setTileSize(float tileSize){
		this.tileSize = tileSize;
	}
	
	
	public float getTileSize(){
		return this.tileSize;
	}
	
	public GCTile getTile(String name){
		return tilesMap.get(name);
	}
	
}
