package com.ahcobos.greencore.gcmodel;

import java.util.HashMap;

import com.ahcobos.greencore.gcstate.GCState;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public abstract class GCModel {
	
	//=================================
	//getters
	//=================================
	public abstract HashMap<String, GCState> getStates();	
	public abstract GCState getCurrentState();
	public abstract float getX();
	public abstract float getY();
	public abstract Vector2 getPosition();
	public abstract float getOriginX();
	public abstract float getOriginY();
	public abstract float getRotation();
	public abstract float getScaleX();
	public abstract float getScaleY();

	
	//=================================
	//setters 
	//=================================
	
	public abstract void setPosition(Vector2 newPos);
	public abstract void setCurrentState(String key);
	public abstract void setX(float x);
	public abstract void setY(float y);
	public abstract void setOriginX(float originX);
	public abstract void setOriginY(float originY);
	public abstract void setRotation(float rotation);
	public abstract void setScaleX(float scaleX);
	public abstract void setScaleY(float scaleY);
	
	//=================================
	// Methods
	//=================================
	
	public abstract void addState(GCState state, String key);
	public abstract void draw(Batch batch);
	public abstract Rectangle getBoundingRectangle();
	public abstract Sprite getSprite();
	public abstract void preUpdate(float deltaTime);
	public abstract void update(float deltaTime);
	
	//=================================
	// TemplateMethod
	//=================================
	
	public void doUpdate(float deltaTime)
	{
		this.preUpdate(deltaTime);
		this.update(deltaTime);
	}
}
