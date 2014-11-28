package com.ahcobos.greencore.utils;

import com.ahcobos.greencore.gcstate.GCAnimatedState;
import com.ahcobos.greencore.gcstate.GCState;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GCAnimatedStateFactory{
	
	public GCState state;
	float frameDuration = 0.9f;
	
	//With texture		
	public GCState getAnimatedState(Texture t, int cols){
		int regionWidth = t.getWidth()/cols;
		TextureRegion []textureRegion = new TextureRegion[cols];
				
		for(int i = 0; i < cols; i++){
			textureRegion[i] = new TextureRegion(t, i*regionWidth, 0, regionWidth, t.getHeight());
		}
		
		Animation a = new Animation(frameDuration, textureRegion);
		state = new GCAnimatedState(a);
		return state;
	}
	
	public GCState getAnimatedState(Texture t, int cols, float frameDuration, boolean isLoop){
		int regionWidth = t.getWidth()/cols;
		TextureRegion []textureRegion = new TextureRegion[cols];
				
		for(int i = 0; i < cols; i++){
			textureRegion[i] = new TextureRegion(t, i*regionWidth, 0, regionWidth, t.getHeight());
		}
		
		Animation a = new Animation(frameDuration, textureRegion);
		state = new GCAnimatedState(a, isLoop);		
		return state;
	}
	
	public GCState getAnimatedState(Texture t, int cols, float frameDuration){
		TextureRegion []textureRegion = new TextureRegion[cols];
		int regionWidth = t.getWidth()/cols;
		
		for(int i = 0; i < cols; i++){
			textureRegion[i] = new TextureRegion(t, i*regionWidth, 0, regionWidth, t.getHeight());
		}
		
		Animation a = new Animation(frameDuration, textureRegion);
		state = new GCAnimatedState(a);		

		return state;
	}
	
	//With TextureRegion 
	public GCState getAnimatedState(TextureRegion tr, int cols){
		int regionWidth = tr.getRegionWidth()/cols;
		TextureRegion []textureRegion = new TextureRegion[cols];
				
		for(int i = 0; i < cols; i++){
			textureRegion[i] = new TextureRegion(tr, i*regionWidth, 0, regionWidth, tr.getRegionHeight());
		}
		
		Animation a = new Animation(frameDuration, textureRegion);
		state = new GCAnimatedState(a);
		
		return state;
	}	
	
	public GCState getAnimatedState(TextureRegion tr, int cols, float frameDuration){		
		int regionWidth = tr.getRegionWidth()/cols;
		TextureRegion []textureRegion = new TextureRegion[cols];
				
		for(int i = 0; i < cols; i++){
			textureRegion[i] = new TextureRegion(tr, i*regionWidth, 0, regionWidth, tr.getRegionHeight());
		}
		
		Animation a = new Animation(frameDuration, textureRegion);
		state = new GCAnimatedState(a);
				
		return state;
	}
	
	public GCState getAnimatedState(TextureRegion tr, int cols, float frameDuration, boolean isLoop){
		int regionWidth = tr.getRegionWidth()/cols;
		TextureRegion []textureRegion = new TextureRegion[cols];
				
		for(int i = 0; i < cols; i++){
			textureRegion[i] = new TextureRegion(tr, i*regionWidth, 0, regionWidth, tr.getRegionHeight());
		}
		
		Animation a = new Animation(frameDuration, textureRegion);
		state = new GCAnimatedState(a, isLoop);		
		return state;
	}
	
	//With TextRegion array
	public GCState getAnimatedState(TextureRegion[] tr, float frameDuration, boolean isLoop){
		
		return state;
	}
	
	public GCState getAnimatedState(TextureRegion[] tr, float frameDuration){
		Animation a = new Animation(frameDuration, tr);
		state = new GCAnimatedState(a);				
		return state;
	}
	
	public GCState getAnimatedState(TextureRegion[] tr){
		Animation a = new Animation(frameDuration, tr);
		state = new GCAnimatedState(a);		
		return state;
	}
	
	//With File Handle resource
	public GCState getAnimatedState(FileHandle f, int cols, float frameDuration, boolean isLoop){
		Texture t = new Texture(f);
		TextureRegion []textureRegion = new TextureRegion[cols];
		int regionWidth = t.getWidth()/cols;
		
		for(int i = 0; i < cols; i++){
			textureRegion[i] = new TextureRegion(t, i*regionWidth, 0, regionWidth, t.getHeight());
		}
		
		Animation a = new Animation(frameDuration, textureRegion);
		state = new GCAnimatedState(a, isLoop);		
		return state;
	}
	
	public GCState getAnimatedState(FileHandle f, int cols, float frameDuration){
		Texture t = new Texture(f);
		TextureRegion []textureRegion = new TextureRegion[cols];
		int regionWidth = t.getWidth()/cols;
		
		for(int i = 0; i < cols; i++){
			textureRegion[i] = new TextureRegion(t, i*regionWidth, 0, regionWidth, t.getHeight());
		}
		
		Animation a = new Animation(frameDuration, textureRegion);
		state = new GCAnimatedState(a);	
		
		return state;
	}


	public GCState getAnimatedState(FileHandle f, int cols){
		Texture t = new Texture(f);
		TextureRegion []textureRegion = new TextureRegion[cols];
		int regionWidth = t.getWidth()/cols;
		
		for(int i = 0; i < cols; i++){
			textureRegion[i] = new TextureRegion(t, i*regionWidth, 0, regionWidth, t.getHeight());
		}
		
		Animation a = new Animation(frameDuration, textureRegion);
		state = new GCAnimatedState(a);		
		
		return state;
	}
	
	//With texture path
	public GCState getAnimatedState(String internalPath, int cols, float frameDuration, boolean isLoop){
		
		Texture t = new Texture(internalPath);
		TextureRegion []textureRegion = new TextureRegion[cols];
		int regionWidth = t.getWidth()/cols;
		
		for(int i = 0; i < cols; i++){
			textureRegion[i] = new TextureRegion(t, i*regionWidth, 0, regionWidth, t.getHeight());
		}
		
		Animation a = new Animation(frameDuration, textureRegion);
		state = new GCAnimatedState(a, isLoop);		
		return state;
	}
	
	public GCState getAnimatedState(String internalPath, int cols, float frameDuration){
		Texture t = new Texture(internalPath);
		TextureRegion []textureRegion = new TextureRegion[cols];
		int regionWidth = t.getWidth()/cols;
		
		for(int i = 0; i < cols; i++){
			textureRegion[i] = new TextureRegion(t, i*regionWidth, 0, regionWidth, t.getHeight());
		}
		
		Animation a = new Animation(frameDuration, textureRegion);
		state = new GCAnimatedState(a);	
		
		return state;
	}


	public GCState getAnimatedState(String internalPath, int cols){
		Texture t = new Texture(internalPath);
		TextureRegion []textureRegion = new TextureRegion[cols];
		int regionWidth = t.getWidth()/cols;
		
		for(int i = 0; i < cols; i++){
			textureRegion[i] = new TextureRegion(t, i*regionWidth, 0, regionWidth, t.getHeight());
		}
		
		Animation a = new Animation(frameDuration, textureRegion);
		state = new GCAnimatedState(a);		
		
		return state;
	}	
	
}
