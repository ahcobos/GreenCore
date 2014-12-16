package com.ahcobos.greencore.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ahcobos.examples.staticelements.StaticElements;
import com.ahcobos.greencore.GreenCoreGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new StaticElements(), config);
	}
}
