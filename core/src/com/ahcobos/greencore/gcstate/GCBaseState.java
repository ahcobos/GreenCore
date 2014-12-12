package com.ahcobos.greencore.gcstate;

import com.ahcobos.greencore.assests.AssetsLoaderModel;
import com.ahcobos.greencore.exceptions.NullCurrentStateException;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GCBaseState extends GCState {
	private String name;
	private String textureKey;
	private Rectangle boundsOnTexture;
	private Sprite sprite;
	private float width, height;
	
	@Override
	public Sprite getSprite() {
		if(this.sprite != null)
		{
			return this.sprite;
		}
		
		Sprite tm = new Sprite(AssetsLoaderModel.getTexture(this.getTextureHash()));
		this.sprite = tm;
		return this.sprite;
	}
	
	public GCBaseState() {}
	
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
		

}
