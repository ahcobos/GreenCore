package com.ahcobos.greencore.gcmodel;

import java.util.HashMap;

import com.ahcobos.greencore.gcstate.GCState;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public abstract class GCModel {
	public abstract Sprite getSprite();
	public abstract HashMap<String, GCState> getStates();	
	public abstract void addState(GCState state, String key);
	public abstract void setCurrentState(String key);
	public abstract void setCurrentState(GCState state);
	public abstract GCState getCurrentState();
	public abstract float getX();
	public abstract float getY();
	public abstract Vector2 getPosition();
	public abstract float getOriginX();
	public abstract float getOriginY();
	public abstract float getWidth();//necesary? it should be keeped in the state 	
	public abstract float getHeight();//necesary?
	public abstract float getRotation();
	public abstract float getScaleX();
	public abstract float getScaleY();
	public abstract void draw(SpriteBatch batch);
	
	//=================================
	//setters 
	//=================================
	
	public abstract void setPosition(Vector2 newPos);
	
}
