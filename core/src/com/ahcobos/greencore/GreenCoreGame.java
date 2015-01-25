package com.ahcobos.greencore;


import com.ahcobos.greencore.assests.AssetsLoaderModel;
import com.ahcobos.greencore.gcmodel.GCBaseModel;
import com.ahcobos.greencore.gcmodel.GCModel;
import com.ahcobos.greencore.gcmodel.GCTile;
import com.ahcobos.greencore.gcstate.GCBaseState;
import com.ahcobos.greencore.inputprocesors.GCGestureListener;
import com.ahcobos.greencore.layer.GCBaseScreen;
import com.ahcobos.greencore.layer.GCTiledLayer;
import com.ahcobos.greencore.renderer.GCDefaultScreenRenderer;
import com.ahcobos.greencore.renderer.GCRenderer;
import com.ahcobos.greencore.utils.GCColorManager;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Rectangle;



/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GreenCoreGame extends Game {
	private SpriteBatch batch;
	//private Texture img;
	private GCModel mFace = new GCBaseModel();
	//private GCBaseState smileFace = new GCBaseState();
	private GCBaseState smileFace;
	private GCBaseScreen mainScreen;
	private GCRenderer mRenderer;
	private GCTiledLayer layer1;
	private GCTiledLayer layer2;
	//private GCBaseLayer mLayer= new GCBaseLayer("play");
	private GCTile tile1, tile2, tile3;
	
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
		
		//The transparence is irrelevant?
		
		//Different ways to inicializate a tile
		tile1 = new GCTile(Color.valueOf(GCColorManager.getHexColorNotation(0, 162, 232)), AssetsLoaderModel.getTexture("tile1"));
		tile2 = new GCTile(0, 0, 0, AssetsLoaderModel.getTexture("tile2"));
		tile3 = new GCTile(GCColorManager.getHexColorNotation(63, 72, 204), AssetsLoaderModel.getTexture("tile3"));
		
		//Gdx.input.setInputProcessor(new GestureDetector(new GCGestureListener()));
		//this.smileFace = new GCBaseState(AssetsLoaderModel.getTexture("basica"));
		//this.smileFace.setName("smile");
		//this.smileFace.setTextureHash("basica");
		//this.smileFace.setBoundsOnTexture(new Rectangle(0, 0, 50, 50));
		//this.mFace.addState(smileFace, "sonriendo");
		//this.mFace.setCurrentState("sonriendo");
		//this.mLayer.addElement("smile", this.mFace);
		
		layer1 = new GCTiledLayer("layer1");
		layer1.addTile(tile2);
		layer1.setTileSize(80);
		layer1.constructTiledLayer(AssetsLoaderModel.getPixmap("Layer1"));
		
		layer2 = new GCTiledLayer("layer2");
		layer2.addTile(tile1);
		layer2.addTile(tile3);
		layer2.setTileSize(40);
		layer2.constructTiledLayer(AssetsLoaderModel.getPixmap("Layer2"));
		
		
		//this.mainScreen.addLayer(mLayer);
		this.mainScreen.addLayer(layer2);
		this.mainScreen.addLayer(layer1);
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
