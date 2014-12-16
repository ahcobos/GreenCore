package com.ahcobos.greencore.layer;

import java.awt.Color;
import java.util.HashMap;

import com.ahcobos.greencore.gcmodel.GCBaseModel;
import com.ahcobos.greencore.gcstate.GCState;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GCTile extends GCBaseModel{
	protected Color assignedColor;
	protected String tileName;
	protected Texture tileImage;
	protected boolean isObstacle;
			
	
	public GCTile(Color assignedColor, Texture texture){
		this.assignedColor = assignedColor;
		this.tileImage = texture;
		this.isObstacle = false;
		this.tileName = assignedColor.toString();
	}
		
	public GCTile(Color assignedColor, boolean isObstacle, Texture texture){
		this.assignedColor = assignedColor;
		this.tileImage = texture;
		this.isObstacle = isObstacle;
		this.tileName = assignedColor.toString();
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
	
	public Texture getTileImage(){
		return this.tileImage;
	}	
	
	public boolean isObstacle(){
		return this.isObstacle;
	}		
}
