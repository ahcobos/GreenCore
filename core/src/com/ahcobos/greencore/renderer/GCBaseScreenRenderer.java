package com.ahcobos.greencore.renderer;

import java.util.Iterator;
import java.util.Map.Entry;

import com.ahcobos.greencore.gcmodel.GCModel;
import com.ahcobos.greencore.gcstate.GCState;
import com.ahcobos.greencore.layer.GCLayer;
import com.ahcobos.greencore.layer.GCScreen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GCBaseScreenRenderer extends GCRenderer{
	
	private GCScreen screen;
	public GCBaseScreenRenderer(GCScreen screen)
	{		
		this.screen = screen;
	}

	public void render(SpriteBatch batch, float deltaTime) {
		Gdx.gl20.glClearColor(0.046f,0.015f,0.019f,1);
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		Iterator<Entry<String, GCLayer>> it = screen.getLayers().entrySet().iterator();
		
		while(it.hasNext())
		{
			GCLayer layer = (GCLayer)it.next();
			Iterator<Entry<String, GCModel>> it2 = layer.getElements().entrySet().iterator();
			while(it2.hasNext())
			{
				GCModel model = (GCModel)it2.next();
				model.getCurrentState().getSprite().draw(batch);
			}
		}
	}
	
	
}
