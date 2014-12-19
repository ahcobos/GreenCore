package com.ahcobos.greencore;

import java.awt.Color;

import com.ahcobos.greencore.assests.AssetsLoaderModel;
import com.ahcobos.greencore.gcmodel.GCBaseModel;
import com.ahcobos.greencore.gcmodel.GCModel;
import com.ahcobos.greencore.gcmodel.GCTile;
import com.ahcobos.greencore.gcstate.GCBaseState;
import com.ahcobos.greencore.layer.GCBaseLayer;
import com.ahcobos.greencore.layer.GCBaseScreen;
import com.ahcobos.greencore.layer.GCTiledLayer;
import com.ahcobos.greencore.renderer.GCDefaultScreenRenderer;
import com.ahcobos.greencore.renderer.GCRenderer;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GreenCoreGame extends ApplicationAdapter {
	private SpriteBatch batch;
	//private Texture img;
	private GCModel mFace = new GCBaseModel();
	//private GCBaseState smileFace = new GCBaseState();
	private GCBaseState smileFace;
	private GCBaseScreen mainScreen;
	private GCRenderer mRenderer;
	//private GCBaseLayer mLayer= new GCBaseLayer("play");
	private GCTiledLayer layer2;
	private GCTile tile1, tile2;
	
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		new AssetsLoaderModel();
		
		AssetsLoaderModel.addTexture("badlogic.jpg", "basica");
		AssetsLoaderModel.addTexture("tiledLayers/tile1.jpg");
		AssetsLoaderModel.addTexture("tiledLayers/tile2.jpg");		
		AssetsLoaderModel.addPixmap("tiledLayers/baseLayer.png");
		
		
		mainScreen = new GCBaseScreen();
		mRenderer = new GCDefaultScreenRenderer(mainScreen);
		
		tile1 = new GCTile(new Color(255,255,255), AssetsLoaderModel.getTexture("tile1"));
		tile2 = new GCTile(new Color(0,0,255), AssetsLoaderModel.getTexture("tile2"));
		
		//Gdx.input.setInputProcessor(new GestureDetector(new GCGestureListener()));
		this.smileFace = new GCBaseState(AssetsLoaderModel.getTexture("basica"));
		this.smileFace.setName("smile");
		//this.smileFace.setTextureHash("basica");
		//this.smileFace.setBoundsOnTexture(new Rectangle(0, 0, 50, 50));
		this.mFace.addState(smileFace, "sonriendo");
		this.mFace.setCurrentState("sonriendo");
		//this.mLayer.addElement("smile", this.mFace);
		
		this.layer2 = new GCTiledLayer("layer2");
		this.layer2.setTileSize(80);
		this.layer2.addTile(tile1);
		this.layer2.addTile(tile2);
		this.layer2.constructTiledLayer(AssetsLoaderModel.getPixmap("baseLayer"));
		
		this.mainScreen.addLayer(layer2);
		//this.mainScreen.addLayer(mLayer);		
		//this.mFace.setPosition(new Vector2(100,100));		
		
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
