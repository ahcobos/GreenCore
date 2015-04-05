package com.ahcobos.greencore.game;

import com.ahcobos.greencore.inputprocesors.GCGestureListener;
import com.ahcobos.greencore.layer.GCBaseScreen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.input.GestureDetector;

public class GCGame extends Game {

	@Override
	public void create() {

	}
	
	@Override
	public void setScreen (Screen screen) 
	{
		super.setScreen(screen);
		Gdx.input.setInputProcessor(new GestureDetector(new GCGestureListener((GCBaseScreen) screen)));
	}

}
