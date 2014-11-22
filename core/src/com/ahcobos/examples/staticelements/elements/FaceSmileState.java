package com.ahcobos.examples.staticelements.elements;

import com.ahcobos.greencore.gcstate.GCBaseState;
import com.badlogic.gdx.math.Rectangle;

public class FaceSmileState extends GCBaseState {
	
	public FaceSmileState() {
		this.setTextureHash("base_image");
		this.setBoundsOnTexture(new Rectangle(0,0,50,50));
	}

}
