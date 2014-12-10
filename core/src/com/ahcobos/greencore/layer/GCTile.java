package com.ahcobos.greencore.layer;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class GCTile{
	protected Color assignedColor;
	protected String tileName;
	protected BufferedImage tileImage;
	protected boolean isObstacle;
			
	
	public GCTile(Color assignedColor, BufferedImage tileImage){
		this.assignedColor = assignedColor;
		this.tileImage = tileImage;
		this.isObstacle = false;
		this.tileName = assignedColor.toString();
	}
		
	public GCTile(Color assignedColor, BufferedImage tileImage, boolean isObstacle){
		this.assignedColor = assignedColor;
		this.tileImage = tileImage;
		this.isObstacle = isObstacle;
		this.tileName = assignedColor.toString();
	}
	
	public void setTileName(String name){
		this.tileName = name;
	}
	
	public void setTileColor(Color c){
		this.assignedColor = c;
	}
	
	public void setTileImage(BufferedImage image){
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
	
	public BufferedImage getTileImage(){
		return this.tileImage;
	}
	
	public boolean isObstacle(){
		return this.isObstacle;
	}
	
}
