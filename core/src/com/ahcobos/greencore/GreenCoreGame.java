package com.ahcobos.greencore;

import com.ahcobos.greencore.assests.AssetsLoaderModel;
import com.ahcobos.greencore.gcmodel.GCBaseModel;
import com.ahcobos.greencore.gcmodel.GCModel;
import com.ahcobos.greencore.gcstate.GCBaseState;
import com.ahcobos.greencore.gcstate.GCStaticState;
import com.ahcobos.greencore.layer.GCBaseLayer;
import com.ahcobos.greencore.renderer.GCBaseLayerRenderer;
import com.ahcobos.greencore.renderer.GCRenderer;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GreenCoreGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private GCModel mFace = new GCBaseModel();
	private GCBaseState smileFace = new GCStaticState();
	private GCRenderer mRenderer;
	private GCBaseLayer mLayer= new GCBaseLayer("play");
	
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		new AssetsLoaderModel();
		AssetsLoaderModel.addTexture("badlogic.jpg", "basica");
		
		this.smileFace.setName("smile");
		this.smileFace.setTextureHash("basica");
		this.smileFace.setBoundsOnTexture(new Rectangle(0, 0, 50, 50));
		this.mFace.addState(smileFace, "sonriendo");
		this.mFace.setCurrentState("sonriendo");
		
		this.mLayer.addElement("smile", this.mFace);
		
		this.mFace.setPosition(new Vector2(10,10));
		
		
		this.mRenderer = new GCBaseLayerRenderer(this.mLayer);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		this.mRenderer.render(batch, 0f);
		batch.end();
	}
}
