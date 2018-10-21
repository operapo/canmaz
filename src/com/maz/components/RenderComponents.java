package com.maz.components;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.maz.basic.RenderFormat;
import com.maz.basic.Renderer;

public abstract class RenderComponents extends RenderFormat {


	protected RenderComponents(Renderer rf) {
		super(rf);
	}
	
	@Override
	public void updated(float dt) {
		for (int i = 0; i < this.components.size(); i++)
			components.get(i).updated(dt);
	}
	
	@Override
	public void render(SpriteBatch sb) {
		sb.begin();
		for (int i = 0; i < this.components.size(); i++)
			components.get(i).render(sb);
		sb.end();
	}

}
