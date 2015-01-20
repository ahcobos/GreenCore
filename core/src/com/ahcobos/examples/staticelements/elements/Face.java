package com.ahcobos.examples.staticelements.elements;

import com.ahcobos.greencore.gcmodel.GCBaseModel;
import com.badlogic.gdx.math.Vector2;

public class Face extends GCBaseModel {

	public Face() {
		this.addState(new FaceSmileState(), "faceSmile");
		this.setCurrentState("faceSmile");
		this.setPosition(new Vector2(100,100));
		System.out.println("sprite x" + this.getSprite().getBoundingRectangle().x
				+ "sprite y" + this.getSprite().getBoundingRectangle().y 
				+ "sprite Width: " + this.getSprite().getBoundingRectangle().width
				+ "sprite Height: " + this.getSprite().getBoundingRectangle().height);
	}
}
