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
public class GCBaseModel extends GCModel {
	
	//=================================
	// fileds
	//=================================
	private HashMap<String,GCState> states ;
	private GCState currentState;
	private float originX, originY;
	private float rotation, scaleX, scaleY;
	private Vector2 position;
	
	//=================================
	// constructors
	//=================================
	
	public GCBaseModel() {
		this.states = new HashMap<String, GCState>();
		this.position = new Vector2(0,0);
		this.setScaleX(1f);
		this.setScaleY(1f);
	}
	
	//=================================
	//getters
	//=================================
	
	@Override
	public Sprite getSprite() {
		return this.getCurrentState().getSprite();
	}
	
	@Override
	public HashMap<String, GCState> getStates() {
		return this.states;
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
	public Vector2 getPosition() {
		return this.position;
	}
	
	//=================================
	//setters 
	//=================================
	
	public void setStates(HashMap<String, GCState> states) {
		this.states = states;
	}
	
	@Override
	public void setPosition(Vector2 newPos) {
		this.position = newPos;		
	}
	
	@Override
	public void setCurrentState(String key) {
		//maybe it is better to just set the current state name +
		this.currentState = this.getStates().get(key);
	}
	
	@Override
	public void setX(float x) {
		this.position.x = x;
	}

	@Override
	public void setY(float y) {
		this.position.y = y;
	}

	@Override
	public void setOriginX(float originX) {
		this.originX = originX;		
	}

	@Override
	public void setOriginY(float originY) {
		this.originY = originY;
	}

	@Override
	public void setRotation(float rotation) {
		this.rotation = rotation;
	}

	@Override
	public void setScaleX(float scaleX) {
		this.scaleX = scaleX;
	}

	@Override
	public void setScaleY(float scaleY) {
		this.scaleY = scaleY;
	}
	
	//=================================
	// Methods
	//=================================

	@Override
	public void addState( GCState state, String key) {
		this.getStates().put(key, state);
	}

	@Override
	public void draw(Batch batch) {
		Sprite toDraw = this.getCurrentState().getSprite();
		toDraw.setPosition(getX(), getY());
		toDraw.setRotation(this.getRotation());
		toDraw.setScale(getScaleX(), getScaleY());
		toDraw.draw(batch);
	}
	
	@Override
	public Rectangle getBoundingRectangle() {
		return this.getSprite().getBoundingRectangle();
	}

	@Override
	public void preUpdate(float deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
		
	}
}
