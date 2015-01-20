package com.ahcobos.greencore.gcstate;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GCStaticState extends GCBaseState{
		
		private Sprite sprite;
		
		public GCStaticState(){}
		
		public GCStaticState(Texture texture){
			this.sprite = new Sprite(texture);
		}
		
		public GCStaticState(Texture texture, int width, int height){
			this.sprite = new Sprite(texture, width, height);
		}
		
		public GCStaticState(Texture texture, int srcX, int srcY, int width, int height){
			this.sprite = new Sprite(texture, srcX, srcY, width, height);
		}		
		
		public GCStaticState(TextureRegion textureRegion){
			this.sprite = new Sprite(textureRegion);
		}
		
		public GCStaticState(TextureRegion textureRegion, int srcX, int srcY, int width, int height){
			this.sprite = new Sprite(textureRegion, srcX, srcY, width, height);			
		}
		
		public GCStaticState(Sprite sprite){
			this.sprite = sprite;
		}
		
		public Sprite getSprite(){
			return this.sprite;
		}
	}

