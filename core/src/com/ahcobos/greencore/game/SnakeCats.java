package com.ahcobos.greencore.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public class SnakeCats extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	int pos;
	float time;
	float lastTime;
	int speed;
	int bandera=0;
	
	@Override
	public void create () {
		pos = 0;
		this.time = 0f;
		this.lastTime = 0f;
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		this.speed = 1;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0.4f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		if((this.time) > (this.lastTime  + 1f))
		{
			if((this.pos + (this.img.getWidth()/2)) > Gdx.graphics.getWidth() ){
				if (bandera==0){
					bandera=1;
				}else{
					bandera=0;
				}
			}
			if(bandera==1)
			{
				this.pos = this.pos - this.speed;
			}else
			{
				this.pos = this.pos + this.speed;				
			}
		}
		
		System.out.println();
		
		batch.begin(); // PINTOR DIBUJE LO SIGUIENTE

		batch.draw(img, this.pos, 0);	
		
		this.time = this.time + Gdx.graphics.getDeltaTime();
		System.out.println(this.time );
		
		
		
		batch.end();// PINTOR NO DIBUJE NADA MAS
	}
}
