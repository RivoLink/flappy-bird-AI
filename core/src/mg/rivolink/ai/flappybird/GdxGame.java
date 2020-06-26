package mg.rivolink.ai.flappybird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class GdxGame extends Game{
	
	@Override
	public void create(){
		
	}
	
	@Override
	public void render(){
		Gdx.gl.glClearColor(1,1,1,1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glViewport(0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		
	}
}
