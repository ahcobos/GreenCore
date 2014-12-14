package com.ahcobos.greencore.layer;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.HashMap;

import com.ahcobos.greencore.gcmodel.GCTile;
import com.badlogic.gdx.math.Vector2;

public abstract class GCTiledLayer extends GCBaseLayer{
	
	protected BufferedImage baseLayerImage;
	protected HashMap<String, GCTile> tilesMap;
	protected float tileSize = 16.0f;
	
	public GCTiledLayer(String name, BufferedImage baseLayerImage){
		super(name);
		this.baseLayerImage = baseLayerImage;
		tilesMap = new HashMap<String, GCTile>();
		
		constructTiledLayer(this.baseLayerImage);
	}
	
	public void setTileSize(float tileSize){
		this.tileSize = tileSize;
	}
	
	public void constructTiledLayer(BufferedImage baseLayerImage){
		for(int y = 0; y<baseLayerImage.getWidth(); y++){
			for(int x = 0; x<baseLayerImage.getHeight(); x++){
				if(getTile(new Color(baseLayerImage.getRGB(x, baseLayerImage.getHeight()-y-1)).toString())!= null){
					GCTile tile = getTile(new Color(baseLayerImage.getRGB(x, baseLayerImage.getHeight()-y-1)).toString()).clone();
					tile.setPosition(new Vector2(x*this.getTileSize(), y*this.getTileSize()));
					addElement(tile.getPosition().toString(), tile);
				}
			}
		}
	}
	
	public void addTile(GCTile tile){
		if(tile != null)
			tilesMap.put(tile.getTileName(), tile);		
		else{
			System.err.println("Error! GCTile is null and cannot be put in tilesMap");
		}
	}
	
	public float getTileSize(){
		return this.tileSize;
	}
	public GCTile getTile(String name){
		return tilesMap.get(name);
	}
	
}
