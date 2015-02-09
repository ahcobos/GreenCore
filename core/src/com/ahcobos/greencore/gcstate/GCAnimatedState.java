package com.ahcobos.greencore.gcstate;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class GCAnimatedState extends GCBaseState {
	
	private Animation animation;

	private boolean isLoop;
	private float stateTime;

	public GCAnimatedState(){
		this.isLoop = true;
	}

	public GCAnimatedState(Animation a, boolean isLoop)
	{
		this.animation = a;
		this.isLoop =  isLoop;
	}

	public GCAnimatedState(Animation a)
	{
		this.animation = a;
		this.isLoop =  true;
	}

	public Animation getAnimation()
	{
		return animation;
	}

	public boolean getIsLoop()
	{
		return isLoop;		
	}

	public Sprite getSprite()
	{
		stateTime += Gdx.graphics.getDeltaTime();
		return new Sprite(animation.getKeyFrame(stateTime, this.getIsLoop()));
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	public float getStateTime() {
		return stateTime;
	}

	public void setStateTime(float stateTime) {
		this.stateTime = stateTime;
	}

	public void setLoop(boolean isLoop) {
		this.isLoop = isLoop;
	}
}
