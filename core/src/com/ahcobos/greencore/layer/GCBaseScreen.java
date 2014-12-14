package com.ahcobos.greencore.layer;

import java.util.HashMap;

import com.ahcobos.greencore.inputprocesors.GCGestureListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
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
	
	public GCBaseScreen() {
		this.mLayers = new HashMap<String, GCLayer>();
		this.batch = new SpriteBatch();
		this.mCamera = new OrthographicCamera(Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		Gdx.input.setInputProcessor(new GestureDetector(new GCGestureListener()));
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
		this.batch.begin();
		this.batch.setProjectionMatrix(this.mCamera.combined);
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
}
