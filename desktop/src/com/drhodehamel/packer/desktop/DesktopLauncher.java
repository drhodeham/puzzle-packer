package com.drhodehamel.packer.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.drhodehamel.packer.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "puzzle-packer";
		config.width = 1280;
		config.height = 720;
		new LwjglApplication(new Main(), config);
	}
}
