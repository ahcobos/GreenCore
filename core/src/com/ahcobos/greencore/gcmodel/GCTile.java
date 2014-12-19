package com.ahcobos.greencore.gcmodel;

import java.awt.Color;

import com.ahcobos.greencore.gcstate.GCStaticState;
import com.badlogic.gdx.graphics.Texture;

public class GCTile extends GCBaseModel implements Cloneable{
	protected Color assignedColor;
	protected String tileName;
	protected Texture tileImage;
	protected boolean isObstacle;
	protected GCStaticState staticState;		
	
	public GCTile(Color assignedColor, Texture tileImage){
		this.assignedColor = assignedColor;
		this.tileImage = tileImage;
		this.isObstacle	 = false;
		this.tileName = assignedColor.toString();
		this.staticState = new GCStaticState(tileImage);		
		this.addState(staticState, tileName);
		this.setCurrentState(tileName);
	}
		
	public GCTile(Color assignedColor, Texture tileImage, boolean isObstacle){
		this.assignedColor = assignedColor;
		this.tileImage = tileImage;
		this.isObstacle = isObstacle;
		this.tileName = assignedColor.toString();
		this.staticState = new GCStaticState(tileImage);		
		this.addState(staticState, tileName);
		this.setCurrentState(tileName);
	}
		
	public void setTileName(String name){
		this.tileName = name;
	}
	
	public void setTileColor(Color c){
		this.assignedColor = c;
	}
	
	public void setTileImage(Texture image){
		this.tileImage = image;
	}	

	public void setIsObstacle(boolean isObstacle){
		this.isObstacle = isObstacle;
	}	
	
	public String getTileName(){
		return this.tileName;
	}
	
	public Color getTileColor(){
		return this.assignedColor;
	}
	
	public boolean isObstacle(){
		return this.isObstacle;
	}	
	
	public GCTile clone(){
		GCTile tile = null;
		try{
			tile = (GCTile)super.clone();
		}catch(Exception e){
			e.printStackTrace();
		}
		return tile;
	}
}
