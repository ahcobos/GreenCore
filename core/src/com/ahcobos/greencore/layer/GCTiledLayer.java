package com.ahcobos.greencore.layer;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.HashMap;

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
		Color[][] colorsArray = new Color[baseLayerImage.getWidth()][baseLayerImage.getHeight()];
		
		for(int y = 0; y<baseLayerImage.getWidth(); y++){
			for(int x = 0; x<baseLayerImage.getHeight(); x++){
				colorsArray[x][y] = new Color(baseLayerImage.getRGB(x, y));
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
}
