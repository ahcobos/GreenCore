package com.ahcobos.greencore.gcstate;

import com.ahcobos.greencore.assests.AssetsLoaderModel;
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
	
	public GCBaseState() {
		// TODO Auto-generated constructor stub
	}
	
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
	

}
