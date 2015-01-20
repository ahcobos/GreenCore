package com.ahcobos.greencore;

import com.ahcobos.greencore.assests.AssetsLoaderModel;
import com.ahcobos.greencore.gcmodel.GCBaseModel;
import com.ahcobos.greencore.gcmodel.GCModel;
import com.ahcobos.greencore.gcstate.GCBaseState;
<<<<<<< Updated upstream
import com.ahcobos.greencore.gcstate.GCStaticState;
import com.ahcobos.greencore.inputprocesors.GCGestureListener;
import com.ahcobos.greencore.layer.GCBaseLayer;
import com.ahcobos.greencore.renderer.GCBaseLayerRenderer;
=======
import com.ahcobos.greencore.inputprocesors.GCGestureListener;
import com.ahcobos.greencore.layer.GCBaseScreen;
import com.ahcobos.greencore.layer.GCTiledLayer;
import com.ahcobos.greencore.renderer.GCDefaultScreenRenderer;
>>>>>>> Stashed changes
import com.ahcobos.greencore.renderer.GCRenderer;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Rectangle;
<<<<<<< Updated upstream
import com.badlogic.gdx.math.Vector2;
=======
>>>>>>> Stashed changes

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GreenCoreGame extends Game {
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

		AssetsLoaderModel.addTexture("tiledLayers/tile1.jpg");
		AssetsLoaderModel.addTexture("tiledLayers/tile2.jpg");	
		AssetsLoaderModel.addTexture("tiledLayers/tile3.jpg");	
		
		AssetsLoaderModel.addPixmap("tiledLayers/Layer1.png");
		AssetsLoaderModel.addPixmap("tiledLayers/Layer2.png");

		this.smileFace.setName("smile");
		this.smileFace.setTextureHash("basica");
		this.smileFace.setBoundsOnTexture(new Rectangle(0, 0, 50, 50));
		this.mFace.addState(smileFace, "sonriendo");
		this.mFace.setCurrentState("sonriendo");

		mainScreen = new GCBaseScreen(this);
		mRenderer = new GCDefaultScreenRenderer(mainScreen);
		
		Gdx.input.setInputProcessor(new GestureDetector(new GCGestureListener(mainScreen)));
		
		this.mLayer.addElement("smile", this.mFace);
		
		this.mFace.setPosition(new Vector2(100,100));
		
		
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
