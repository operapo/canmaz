package com.maz.components;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.maz.basic.Renderer;

public abstract class Components  {

	public String ComponentName;
	protected Renderer rf;

	Components(Renderer rf) {
		ComponentName = this.getClass().getSimpleName();
		this.rf=rf;
	}

	public String getName() {
		return ComponentName;
	}

	public abstract void updated(float dt);
	public abstract void handleInput();
	public abstract void render(SpriteBatch sb);

}
