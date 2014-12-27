package com.ahcobos.greencore.layer;

import java.util.HashMap;

import com.ahcobos.greencore.inputprocesors.GCGestureListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.input.GestureDetector;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GCBaseScreen extends GCScreen {
	private HashMap<String, GCLayer> mLayers;
	private Camera mCamera;
	private SpriteBatch batch;
	private Game mGame;
	
	public GCBaseScreen(Game mGame) {
		this.mLayers = new HashMap<String, GCLayer>();
		this.batch = new SpriteBatch();
		this.mCamera = new OrthographicCamera(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		this.mGame = mGame;
	}

	public HashMap<String, GCLayer> getLayers() {
		return mLayers;
	}

	public void setLayers(HashMap<String, GCLayer> layers) {
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
		this.setCamera(mCamera);
	}

	@Override
	public void render(float delta) { 
		this.getCamera().update();
		this.batch.setProjectionMatrix(this.mCamera.combined);
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
	

	public Game getmGame() {
		return mGame;
	}

	public void setmGame(Game mGame) {
		this.mGame = mGame;
	}
}
