package com.ahcobos.greencore.gcstate;

import com.ahcobos.greencore.assests.AssetsLoaderModel;
import com.ahcobos.greencore.exceptions.NullCurrentStateException;
import com.ahcobos.greencore.sourcemanager.GCGraphicsSourceManager;
import com.ahcobos.greencore.sourcemanager.GCTextureSource;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GCBaseState extends GCState {
	
	// ===========================================================
	// Fields
	// ===========================================================

	private String name;
	private String textureKey;
	private Rectangle boundsOnTexture;
	private Sprite sprite;
	private float width, height;
	private GCGraphicsSourceManager mGraphicsSourceManager;
	
	// ===========================================================
	// Constructors
	// ===========================================================
	
	public GCBaseState() {}
	
	public GCBaseState(Texture texture){
		this.sprite = new Sprite(texture);
	}
	
	public GCBaseState(Texture texture, int width, int height){
		this.sprite = new Sprite(texture, width, height);
	}
	
	public GCBaseState(Texture texture, int srcX, int srcY, int width, int height){
		this.sprite = new Sprite(texture, srcX, srcY, width, height);
	}		
	
	public GCBaseState(TextureRegion textureRegion){
		this.sprite = new Sprite(textureRegion);
	}
	
	public GCBaseState(TextureRegion textureRegion, int srcX, int srcY, int width, int height){
		this.sprite = new Sprite(textureRegion, srcX, srcY, width, height);			
	}
	
	public GCBaseState(Sprite sprite){
		this.sprite = sprite;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTextureHash() {
		return textureKey;
	}

	public void setTextureHash(String textureHash) {
		this.textureKey= textureHash;
	}

	public Rectangle getBoundsOnTexture() {
		return boundsOnTexture;
	}

	public void setBoundsOnTexture(Rectangle boundsOnTexture) {
		this.boundsOnTexture = boundsOnTexture;
	}
	
	public float getWidth(){
		return this.width;
	}
	
	public void setWidth(float width){
		this.width = width;
	}
	
	public float getHeight(){
		return this.height;
	}
	
	public void setHeight(float height){
		this.height = height;
	}
	
	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================
	
	@Override
	public Sprite getSprite() {
		if(this.sprite != null)
		{
			return this.sprite;
		}
		this.sprite = this.getGraphicsSourceManager().buildSprite();
		return this.sprite;
	}
	
	
	@Override
	public GCGraphicsSourceManager getGraphicsSourceManager() {
		if(this.mGraphicsSourceManager != null)
		{
			return this.mGraphicsSourceManager;
		}
		this.mGraphicsSourceManager = new GCTextureSource();
		return this.mGraphicsSourceManager;
	}

	@Override
	public void setGraphicsSourceManager(
			GCGraphicsSourceManager mGraphicsSourceManager) {
		this.mGraphicsSourceManager = mGraphicsSourceManager;
		
	}


}
