package mg.rivolink.ai.flappybird;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	
	public static void main(String[] args){
		
		LwjglApplicationConfiguration cfg=new LwjglApplicationConfiguration();
		cfg.title="Flappy Bird AI";
		cfg.width=288;
		cfg.height=512;
		
		new LwjglApplication(new GdxGame(),cfg);
	}
}
