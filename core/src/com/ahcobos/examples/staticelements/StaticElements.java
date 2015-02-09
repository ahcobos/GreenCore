package com.ahcobos.examples.staticelements;

import com.ahcobos.examples.staticelements.screens.FirstScreen;
import com.ahcobos.greencore.assests.AssetsLoaderModel;
import com.ahcobos.greencore.inputprocesors.GCGestureListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.input.GestureDetector;

public class StaticElements extends Game {

	private FirstScreen mScreen;

	@Override
	public void create() {
		new AssetsLoaderModel();
		TextureAtlas atlas;
		AssetsLoaderModel.addTexture("badlogic.jpg", "base_image");
		AssetsLoaderModel.addTexture("sprite-animation4.gif", "runing_man");
		AssetsLoaderModel.addPack("and_engine.pack", "and_engine");
		this.mScreen = new FirstScreen(this);
		Gdx.input.setInputProcessor(new GestureDetector(new GCGestureListener(this.mScreen)));
		this.setScreen(mScreen);
	}
	
	@Override
	public void render () {
		super.render();
		System.out.println(Gdx.graphics.getFramesPerSecond());
	}

}
