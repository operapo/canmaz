package com.maz.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.maz.basic.Renderer;

public class MenuComponent2 extends Components {
	public MenuComponent2(Renderer rf) {
		super(rf);
		img = new Texture(Gdx.files.internal("assets/badlogic.jpg"));

	}
	Texture img;
	 int i=20;


	@Override
	public void handleInput() {

        if(Gdx.input.isTouched()) {
        	System.out.println(i);
        	i++;
        	if(i>100) {
        	
   
        	}
        }
	}

	@Override
	public void updated(float dt) {
		handleInput();
	}

	
	@Override
	public void render(SpriteBatch sb) {
		sb.draw(img, i, 0, 100, 100);
		
	}

}
