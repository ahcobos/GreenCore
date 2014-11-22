package com.ahcobos.examples.staticelements.elements;

import com.ahcobos.greencore.gcmodel.GCBaseModel;

public class Face extends GCBaseModel {

	public Face() {
		this.addState(new FaceSmileState(), "faceSmile");
		this.setCurrentState("faceSmile");
	}
}
