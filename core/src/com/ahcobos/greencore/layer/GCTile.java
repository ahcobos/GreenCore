package com.ahcobos.greencore.layer;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.HashMap;

import com.ahcobos.greencore.gcmodel.GCModel;
import com.ahcobos.greencore.gcstate.GCState;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GCTile extends GCModel{
	protected Color assignedColor;
	protected String tileName;
	protected Texture texture;
	protected boolean isObstacle;
			
	
	public GCTile(Color assignedColor){
		this.assignedColor = assignedColor;
		this.texture = texture;
		this.isObstacle = false;
		this.tileName = assignedColor.toString();
	}
		
	public GCTile(Color assignedColor, boolean isObstacle){
		this.assignedColor = assignedColor;
		this.texture = texture;
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

	public Sprite getSprite() {
		return null;
	}

	public HashMap<String, GCState> getStates() {
		return null;
	}

	public void addState(GCState state, String key) {
	
	}

	public void setCurrentState(String key) {
		
	}

	public void setCurrentState(GCState state) {
		
	}

	public GCState getCurrentState() {
		return null;
	}

	public float getX() {
		return 0;
	}

	public float getY() {
		return 0;
	}

	public Vector2 getPosition() {
		return null;
	}

	public float getOriginX() {
		return 0;
	}

	public float getOriginY() {
		return 0;
	}

	public float getWidth() {
		return 0;
	}

	public float getHeight() {
		return 0;
	}

	public float getRotation() {
		return 0;
	}

	public float getScaleX() {
		return 0;
	}

	public float getScaleY() {
		return 0;
	}

	public void draw(SpriteBatch batch) {
		
	}

	public void setPosition(Vector2 newPos) {
		
	}
	
}
