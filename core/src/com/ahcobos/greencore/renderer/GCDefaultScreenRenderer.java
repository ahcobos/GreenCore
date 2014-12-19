package com.ahcobos.greencore.renderer;

import java.util.Iterator;

import com.ahcobos.greencore.gcmodel.GCModel;
import com.ahcobos.greencore.layer.GCLayer;
import com.ahcobos.greencore.layer.GCScreen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GCDefaultScreenRenderer extends GCRenderer{
	
	private GCScreen screen;
	private int c = 0;
	public GCDefaultScreenRenderer(GCScreen screen)
	{		
		this.screen = screen;
	}

	public void render(SpriteBatch batch, float deltaTime) {
		Gdx.gl20.glClearColor(0.046f,0.015f,0.019f,1);
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		Iterator<String> it = screen.getLayers().keySet().iterator();
		
		while(it.hasNext())
		{

			String s = (String)it.next();
			GCLayer layer = screen.getLayers().get(s);
			
			Iterator<String> it2 = layer.getElements().keySet().iterator();
			while(it2.hasNext())
			{
				GCModel model = layer.getElements().get(it2.next());
				model.draw(batch);
			}
		
		}
	}
	
	
}
