package com.ahcobos.examples.staticelements.elements;

import com.ahcobos.greencore.gcstate.GCBaseState;
import com.ahcobos.greencore.sourcemanager.GCOpenTexturePackerSource;
import com.ahcobos.greencore.sourcemanager.GCTextureSource;
import com.badlogic.gdx.math.Rectangle;

public class FaceSmileState extends GCBaseState {
	
	public FaceSmileState() {
		this.setTextureHash("base_image");
		this.setGraphicsSourceManager(new GCOpenTexturePackerSource("and_engine", "tank"));
		//GCTextureSource nSource = new GCTextureSource("base_image");
		//this.setGraphicsSourceManager(nSource);
		this.setBoundsOnTexture(new Rectangle(0,0,50,50));
	}

}
