package com.ahcobos.greencore.sourcemanager;

import com.ahcobos.greencore.assests.AssetsLoaderModel;
import com.ahcobos.greencore.exceptions.InvalidGraphicsSource;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

/**
 * @author ahcobos
 * @since 2014-12-13 19:32:27
 */
public class GCTextureSource extends GCGraphicsSourceManager {

	// ===========================================================
	// Fields
	// ===========================================================
	private String textureKey;
	private Rectangle bounds;
	
	// ===========================================================
	// Constructors
	// ===========================================================
	
	public GCTextureSource() {}
	
	public GCTextureSource(String textureKey)
	{
		this.textureKey = textureKey;
	}
	
	public GCTextureSource(String textureKey, Rectangle bounds)
	{
		this.textureKey = textureKey;
		this.bounds = bounds;
	} 
	
	// ===========================================================
	// Getter & Setter
	// ===========================================================
	
	public String getTextureKey() {
		return textureKey;
	}

	public void setTextureKey(String textureKey) {
		this.textureKey = textureKey;
	}

	public Rectangle getBounds() {
		return bounds;
	}

	public void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}
	
	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================
	
	@Override
	public Sprite buildSprite() {
		if(this.getBounds() != null)
		{
			return new Sprite(AssetsLoaderModel.getTexture(this.getTextureKey()),
					(int)this.getBounds().getX(), (int)this.getBounds().getY(),
					(int)this.getBounds().getWidth(),(int)this.getBounds().getHeight());
		}
		if(this.getTextureKey() == null)
		{
		 try {
				throw new InvalidGraphicsSource();
			} catch (InvalidGraphicsSource e) {
				e.printStackTrace();
			}
		}
		return new Sprite(AssetsLoaderModel.getTexture(this.getTextureKey()));
	}
	
	// ===========================================================
	// Methods
	// ===========================================================
}
