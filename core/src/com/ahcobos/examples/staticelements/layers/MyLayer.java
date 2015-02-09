package com.ahcobos.examples.staticelements.layers;

import com.ahcobos.examples.staticelements.elements.Face;
import com.ahcobos.greencore.layer.GCBaseLayer;
import com.badlogic.gdx.math.Vector2;

public class MyLayer extends GCBaseLayer {

	public MyLayer(String name) {
		super(name);
		for(int i = 0; i<1000; i++)
		{
			Face t = new Face();
			t.setPosition(new Vector2((i-300)+50, (i-300)+50));
			this.addElement("face_"+i, t);
		}
		
	}
}
