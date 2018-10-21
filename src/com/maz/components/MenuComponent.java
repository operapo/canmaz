package com.maz.components;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.maz.basic.Renderer;
import com.maz.slides.Menu;
import com.maz.tools.Animation;

public class MenuComponent extends Components {
	 
	  int i=0;
	  boolean k=true;
	  Animation birdAnimation;
	  ArrayList<Animation> anim = new ArrayList<Animation>();
	
	  
	  public MenuComponent(Renderer rf) {
		super(rf);
		img = new Texture("24.png");
		birdAnimation = new Animation(new TextureRegion(img), 6, 1.0f);

		for(int i=0;i<20;i++) {
			anim.add(new Animation(new TextureRegion(img),6,1.0f));
		}
	//	run();
	}
	Texture img;


	public void run(){
		new Thread(){public void run(){
			while(i<101){
				try {

					i++;
					Thread.sleep(10);
                    handleInput();
				}catch(Exception e){

				}

				}
		}}.start();

	}

	@Override
	public void handleInput() {
		if(i>=101) {
			rf.set(new Menu(rf));
			
    	}
        if(Gdx.input.isTouched()) {
        	System.out.println(i);
        	i++;
        	
        }
	}

	@Override
	public void updated(float dt) {
		birdAnimation.update(dt);
		for(int i=0;i<20;i++) {
			anim.get(i).update(dt);
		}
		handleInput();
		
	}

	
	@Override
	public void render(SpriteBatch sb) {
		for(int i=0;i<20;i++) {
			sb.draw(anim.get(i).getFrame(),i*10,i*10,100,100);
		}
	//sb.draw(birdAnimation.getFrame(),1,1,100,100);
		
	}

}
