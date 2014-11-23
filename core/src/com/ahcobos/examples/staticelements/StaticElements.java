package com.ahcobos.examples.staticelements;

import com.ahcobos.examples.staticelements.screens.FirstScreen;
import com.ahcobos.greencore.assests.AssetsLoaderModel;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class StaticElements extends Game {

	private FirstScreen mScreen;

	@Override
	public void create() {
		new AssetsLoaderModel();
		AssetsLoaderModel.addTexture("badlogic.jpg", "base_image");
		this.mScreen = new FirstScreen();
		this.setScreen(mScreen);
	}

}
