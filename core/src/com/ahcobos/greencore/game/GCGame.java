package com.ahcobos.greencore.game;

import java.util.HashMap;

import com.ahcobos.greencore.inputprocesors.GCGestureListener;
import com.ahcobos.greencore.layer.GCBaseScreen;
import com.ahcobos.greencore.layer.GCScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.input.GestureDetector;

public class GCGame extends Game {
	
	protected HashMap<String, GCScreen> screens;

	//=================================
	// Inherit Methods
	//=================================

	@Override
	public void create() {
		
	}
	
	public void setScreen(String key) 
	{
		super.setScreen(this.getScreens().get(key));
		Gdx.input.setInputProcessor(new GestureDetector(new GCGestureListener((GCBaseScreen) this.getScreens().get(key))));
	}
	
	public HashMap<String, GCScreen> getScreens()
	{
		if(this.screens == null){
			this.screens = new HashMap<String, GCScreen>();
		}
		
		return this.screens;
	}
	
	//=================================
	// Methods
	//=================================
	
	public void addScreen(String key, GCScreen screen)
	{
		if(!this.getScreens().containsKey(key))
			screens.put(key, screen);
	}
	
}
