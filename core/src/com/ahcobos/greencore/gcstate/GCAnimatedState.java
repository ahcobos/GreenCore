package com.ahcobos.greencore.gcstate;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GCAnimatedState extends GCBaseState {
	
	private Animation a;
	private boolean isLoop;
	private float stateTime;
	
	public GCAnimatedState(Animation a,boolean isLoop)
	{
		this.a = a;
		this.isLoop =  isLoop;
	}
	
	public GCAnimatedState(Animation a)
	{
		this.a = a;
		this.isLoop =  true;
	}	
	
	public Animation getAnimation()
	{
		return a;
	}
	
	public boolean getIsLoop()
	{
		return isLoop;		
	}
		
	public Sprite getSprite()
	{
		stateTime += Gdx.graphics.getDeltaTime();
		return (Sprite)a.getKeyFrame(stateTime);
	}
}
