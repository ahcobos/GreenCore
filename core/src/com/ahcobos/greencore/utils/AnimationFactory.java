package com.ahcobos.greencore.utils;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AnimationFactory {
	
	float duration = 0.9f;
	
	/**
	 * This method builds a TextureRegion array wich contains every frame for the animation
	 */
	public TextureRegion[] buildTextureFrames(Texture t, int cols, int rows)
	{
//		this piece of code has been taken from https://github.com/libgdx/libgdx/wiki/2D-Animation
		TextureRegion [] textureRegion = new TextureRegion[cols * rows];
		TextureRegion[][] tmp = TextureRegion.split(t, t.getWidth()/cols, t.getHeight()/rows);
				
		int index = 0;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++)
			{
				textureRegion[index] = tmp[i][j];
			}	
		}
		return textureRegion;
	}
	
	/**
	 * This method creates an Animation whit the given params
	 */
	public Animation buildAnimation(Texture t, int cols, int rows){
		Animation a = new Animation(duration, this.buildTextureFrames(t, cols, rows));
		return a;
	}
	
	/**
	 * This method creates an Animation whit the given params
	 */
	public Animation buildAnimation(Texture t, int cols, int rows, float duration){
		Animation a = new Animation(duration, this.buildTextureFrames(t, cols, rows));
		return a;
	}
}
