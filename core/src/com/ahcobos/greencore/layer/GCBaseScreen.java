package com.ahcobos.greencore.layer;

import java.util.LinkedHashMap;

import com.ahcobos.greencore.game.GCGame;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GCBaseScreen extends GCScreen {
	private LinkedHashMap<String, GCLayer> mLayers;
	private Camera mCamera;
	private SpriteBatch batch;
	private GCGame mGame;
	
	public GCBaseScreen(GCGame mGame) {
		this.mLayers = new LinkedHashMap<String, GCLayer>();
		this.batch = new SpriteBatch();
		this.mCamera = new OrthographicCamera(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		this.mGame = mGame;
	}

	public LinkedHashMap<String, GCLayer> getLayers() {
		return mLayers;
	}

	public void setLayers(LinkedHashMap<String, GCLayer> layers) {
		this.mLayers = layers;
	}
	
	public void addLayer(GCLayer mLayer)
	{
		this.mLayers.put(mLayer.getName(), mLayer);
	}
	
	public void removeLayer(String key)
	{
		this.mLayers.remove(key);
	}
	
	public void removeLayer(GCLayer mLayer)
	{
		this.mLayers.remove(mLayer.getName());
	}

	@Override
	public Camera getCamera() {
		return this.mCamera;
	}

	@Override
	public void setCamera(Camera mCamera) {
		this.mCamera = mCamera;
	}

	@Override
	public void render(float delta) { 
		this.doUpdate(delta);
		this.getCamera().update();
		this.batch.setProjectionMatrix(this.getCamera().combined);
		this.batch.begin();
		Gdx.gl.glClearColor(1f, 1f, 1f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		for (String key : this.mLayers.keySet()) {
			this.mLayers.get(key).getRenderer().render(this.batch, delta);
		}
		this.batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SpriteBatch getBatch() {
		return this.batch;
	}

	@Override
	public void setBatch(SpriteBatch mBatch) {
		this.batch = mBatch;
	}

	public GCGame getmGame() {
		return mGame;
	}

	public void setmGame(Game mGame) {
		this.mGame = (GCGame)mGame;
	}
	
	@Override
	public void preUpdate(float deltaTime)
	{
		for (String key : this.mLayers.keySet()) {
			this.mLayers.get(key).doUpdate(deltaTime);
		}
	}

	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setScreen(String key) {
		this.getMGame().setScreen(key);
	}

	@Override
	public GCGame getMGame() {
		return (GCGame) mGame;
	}

	@Override
	public void setMGame(GCGame mGame) {
		this.mGame = mGame;
	}
}
