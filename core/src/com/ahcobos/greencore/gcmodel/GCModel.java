package com.ahcobos.greencore.gcmodel;

import java.util.HashMap;

import com.ahcobos.greencore.gcstate.GCState;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public abstract class GCModel {
	public abstract Sprite getSprite();
	public abstract HashMap<String, GCState> getStates();	
	public abstract void addState(GCState state);
	public abstract void setCurrentState(String key);
	public abstract void setCurrentState(GCState state);
	public abstract GCState getCurrentState();
	public abstract float getX();
	public abstract float getY();
	public abstract float getOriginX();
	public abstract float getOriginY();
	public abstract float getWidth();
	public abstract float getHeight();
	public abstract float getRotation();
	public abstract float getScaleX();
	public abstract float getScaleY();
}
