package com.ahcobos.examples.staticelements;

import com.ahcobos.examples.staticelements.screens.FirstScreen;
import com.ahcobos.greencore.assests.AssetsLoaderModel;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class StaticElements extends Game {

	private FirstScreen mScreen = new FirstScreen();

	@Override
	public void create() {
		new AssetsLoaderModel();
		AssetsLoaderModel.addTexture("badlogic.jpg", "base_image");
		this.setScreen(mScreen);
	}
	
	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		mScreen.getBatch().begin();
		mScreen.getmRenderer().render(mScreen.getBatch());
		mScreen.getBatch().end();
	}

}
