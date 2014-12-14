package com.ahcobos.greencore.sourcemanager;

import com.ahcobos.greencore.assests.AssetsLoaderModel;
import com.ahcobos.greencore.exceptions.InvalidGraphicsSource;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.math.Rectangle;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */

public class GCOpenTexturePackerSource extends GCGraphicsSourceManager {

	// ===========================================================
	// Fields
	// ===========================================================
	private String packKey;
	private String packImage;
	private Rectangle packImageBounds;
	
	
	// ===========================================================
	// Constructors
	// ===========================================================
	
	
	public GCOpenTexturePackerSource() {}
	
	public GCOpenTexturePackerSource(String packKey, String packImage )
	{
		this.packKey = packKey;
		this.packImage = packImage;
	}
	
	public GCOpenTexturePackerSource(String packKey, String packImage , Rectangle packImageBounds)
	{
		this.packKey = packKey;
		this.packImage = packImage;
		this.packImageBounds = packImageBounds;
	} 
	
	// ===========================================================
	// Getter & Setter
	// ===========================================================
	public String getPackKey() {
		return packKey;
	}

	public void setPackKey(String packKey) {
		this.packKey = packKey;
	}

	public String getPackImage() {
		return packImage;
	}

	public void setPackImage(String packImage) {
		this.packImage = packImage;
	}

	public Rectangle getPackImageBounds() {
		return packImageBounds;
	}

	public void setPackImageBounds(Rectangle packImageBounds) {
		this.packImageBounds = packImageBounds;
	}
	
	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================
	
	@Override
	public Sprite buildSprite() {
		AtlasRegion region = new AtlasRegion(
				AssetsLoaderModel.getPack(this.getPackKey()).findRegion(this.getPackImage()));
		if(this.getPackImageBounds() != null)
		{
			return new Sprite(region, 
					(int)this.packImageBounds.getX(),(int)this.packImageBounds.getY(),
					(int) this.getPackImageBounds().getWidth(), (int) this.getPackImageBounds().getHeight());
		}
		if(this.getPackKey() == null  &&  this.getPackImage() == null )
		{
			 try {
					throw new InvalidGraphicsSource();
				} catch (InvalidGraphicsSource e) {
					e.printStackTrace();
				}
		}
		return new Sprite(region );
	}
	
	// ===========================================================
	// Methods
	// ===========================================================

}
