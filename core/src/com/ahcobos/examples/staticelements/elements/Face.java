package com.ahcobos.examples.staticelements.elements;

import com.ahcobos.greencore.gcmodel.GCBaseModel;
import com.badlogic.gdx.math.Vector2;

import com.ahcobos.greencore.inputprocesors.GCBaseGestureListener;
import com.ahcobos.greencore.inputprocesors.GCFling;
import com.ahcobos.greencore.inputprocesors.GCLongPress;
import com.ahcobos.greencore.inputprocesors.GCPan;
import com.ahcobos.greencore.inputprocesors.GCPanStop;
import com.ahcobos.greencore.inputprocesors.GCPinch;
import com.ahcobos.greencore.inputprocesors.GCTap;
import com.ahcobos.greencore.inputprocesors.GCTouchDown;
import com.ahcobos.greencore.inputprocesors.GCZoom;

public class Face extends GCBaseModel implements GCBaseGestureListener{

	public Face() {
		this.addState(new FaceSmileState(), "faceSmile");
		this.setCurrentState("faceSmile");
		this.setPosition(new Vector2(50,50));

		System.out.println("sprite x" + this.getSprite().getBoundingRectangle().x
				+ "sprite y" + this.getSprite().getBoundingRectangle().y 
				+ "sprite Width: " + this.getSprite().getBoundingRectangle().width
				+ "sprite Height: " + this.getSprite().getBoundingRectangle().height);

	}

	@Override
	public void onTouchDown(GCTouchDown touchDown) {
		System.out.println("Llega touch a elemento");
		System.out.println(this.getSprite().getBoundingRectangle());
		
	}

	@Override
	public void onTap(GCTap tap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLongPress(GCLongPress longPress) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFling(GCFling fling) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPan(GCPan pan) {
		this.setPosition(pan.getTouchVector());
		
	}

	@Override
	public void onPanStop(GCPanStop panStop) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onZoom(GCZoom zoom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPinch(GCPinch pinch) {
		// TODO Auto-generated method stub
		
>>>>>>> Stashed changes
	}
}
