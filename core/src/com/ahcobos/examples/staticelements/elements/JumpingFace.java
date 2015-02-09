package com.ahcobos.examples.staticelements.elements;

import com.ahcobos.greencore.assests.AssetsLoaderModel;
import com.ahcobos.greencore.gcstate.GCAnimatedState;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class JumpingFace extends GCAnimatedState {

	private static final int        FRAME_COLS = 6;  
    private static final int        FRAME_ROWS = 5;  
    
    private Texture                         walkSheet;              
    private TextureRegion[]                 walkFrames; 
    TextureRegion                   currentFrame; 
    
	public JumpingFace() {
		walkSheet = AssetsLoaderModel.getTexture("runing_man"); 
		TextureRegion[][] tmp = TextureRegion.split(walkSheet, walkSheet.getWidth()/FRAME_COLS, walkSheet.getHeight()/FRAME_ROWS);
		walkFrames = new TextureRegion[FRAME_COLS * FRAME_ROWS];
		int index = 0;
		for (int i = 0; i < FRAME_ROWS; i++) {
            for (int j = 0; j < FRAME_COLS; j++) {
                walkFrames[index++] = tmp[i][j];
            }
        }
		this.setStateTime(0.025f);
		this.setLoop(true);
		this.setAnimation(new Animation(this.getStateTime(), walkFrames));
		
	}
}
