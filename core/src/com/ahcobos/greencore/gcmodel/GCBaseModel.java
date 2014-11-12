package com.ahcobos.greencore.gcmodel;

import java.util.HashMap;

import com.ahcobos.greencore.gcstate.GCState;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GCBaseModel extends GCModel {
	
	private HashMap<String,GCState> states ;
	private GCState currentState;
	private float x , y, originX, originY, width, height ;
	private float rotation, scaleX, scaleY;
	public void setStates(HashMap<String, GCState> states) {
		this.states = states;
	}

	public GCBaseModel() {
		this.states = new HashMap<String, GCState>();
	}

	@Override
	public Sprite getSprite() {
		return this.getCurrentState().getSprite();
	}

	@Override
	public HashMap<String, GCState> getStates() {
		return this.states;
	}

	@Override
	public void addState( GCState state, String key) {
		this.getStates().put(key, state);
	}

	@Override
	public void setCurrentState(String key) {
		//maybe it is better to just set the current state name +
		this.currentState = this.getStates().get(key);
	}

	@Override
	public void setCurrentState(GCState state) {
		// I do not know if it is necessary 
	}

	@Override
	public GCState getCurrentState() {
		return this.getCurrentState();
	}

	@Override
	public float getX() {
		return this.x;
	}

	@Override
	public float getY() {
		return this.y;
	}

	@Override
	public float getOriginX() {
		return this.originX;
	}

	@Override
	public float getOriginY() {
		return this.originY;
	}

	@Override
	public float getWidth() {
		return this.width;
	}

	@Override
	public float getHeight() {
		return this.height;
	}

	@Override
	public float getRotation() {
		return this.rotation;
	}

	@Override
	public float getScaleX() {
		return this.scaleX;
	}

	@Override
	public float getScaleY() {
		return this.scaleY;
	}

	@Override
	public void draw(SpriteBatch batch) {
		this.getCurrentState().getSprite().draw(batch);
	}

}
