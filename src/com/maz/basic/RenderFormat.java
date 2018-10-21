package com.maz.basic;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.maz.components.Components;

//RenderComponent is almost same as State

public abstract class RenderFormat {

	protected List<Components> components = new ArrayList<Components>();
	protected List<Thread> updater = new ArrayList<Thread>();
	protected List<Thread> renderer = new ArrayList<Thread>();

	protected Renderer rf;
	protected OrthographicCamera cam = new OrthographicCamera();
	protected Vector3 mouse;

	protected  RenderFormat(Renderer rf) {
	this.rf=rf;
	cam.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	cam.update();
	}
	
	public RenderFormat setRenderFormat(Renderer rf) {
		this.rf = rf;
		return this;
	}

	public RenderFormat addComponent(Components... components) {
		for (int i = 0; i < components.length; i++)
			this.components.add(components[i]);
		return this;
	}

	public void removeComponent(int index) {
		this.components.remove(index);
	}

	public void showAllComponents() {
		for (int i = 0; i < this.components.size(); i++)
			System.out.println("" + components.get(i).getName() + " : " + (i + 1));
	}

	public Boolean isContained(Components cm) {
		if (components.contains(cm)) {
			return true;
		} else {
			return false;
		}
	}

	public void handleInput() {
		for (int i = 0; i < this.components.size(); i++)
			components.get(i).handleInput();
	};

	public abstract void updated(float dt);

	public abstract void render(SpriteBatch sb);

}
