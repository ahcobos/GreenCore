package com.ahcobos.greencore.gcstate;

import com.ahcobos.greencore.sourcemanager.GCGraphicsSourceManager;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * @author ahcobos
 * @since 2014-10-29 13:02:35
 */
public abstract class GCState {
	public abstract Sprite getSprite();
	public abstract GCGraphicsSourceManager getGraphicsSourceManager();
	public abstract void setGraphicsSourceManager(GCGraphicsSourceManager mGraphicsSourceManager);
}
