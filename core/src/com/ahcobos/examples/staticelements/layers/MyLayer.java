package com.ahcobos.examples.staticelements.layers;

import com.ahcobos.examples.staticelements.elements.Face;
import com.ahcobos.greencore.layer.GCBaseLayer;

public class MyLayer extends GCBaseLayer {

	public MyLayer(String name) {
		super(name);
		this.addElement("face", new Face());
	}
}
