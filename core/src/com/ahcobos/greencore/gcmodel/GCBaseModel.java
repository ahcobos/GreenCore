package com.ahcobos.greencore.gcmodel;

import java.util.HashMap;

import com.ahcobos.greencore.gcstate.GCState;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GCBaseModel extends GCModel {
	
	private HashMap<String,GCState> states ;
	private GCState currentState;
	private float originX, originY;
	private float rotation, scaleX, scaleY;
	private Vector2 position;
	
	public void setStates(HashMap<String, GCState> states) {
		this.states = states;
	}

	public GCBaseModel() {
		this.states = new HashMap<String, GCState>();
		this.position = new Vector2(0,0);
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
	public GCState getCurrentState() {
		return this.currentState;
	}

	@Override
	public float getX() {
		return this.position.x;
	}

	@Override
	public float getY() {
		return this.position.y;
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
	public void draw(Batch batch) {
		Sprite toDraw = this.getCurrentState().getSprite();
		toDraw.setPosition(getX(), getY());
//		toDraw.setRotation(this.getRotation());
//		toDraw.setScale(getScaleX(), getScaleY());
		toDraw.draw(batch);
	}

	@Override
	public void setPosition(Vector2 newPos) {
		this.position = newPos;		
	}
		
	@Override
	public Vector2 getPosition() {
		return this.position;
	}


}
