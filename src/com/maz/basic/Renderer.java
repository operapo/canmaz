package com.maz.basic;

import java.util.Stack;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public  class Renderer {

	private Stack<RenderFormat> renderComponents;
	
	public Renderer() {
		renderComponents =new Stack<RenderFormat>();
	}
	public void push(RenderFormat rc) {
		renderComponents.push(rc);
	}
	public void pop() {
		renderComponents.pop();
	}
	public void set(RenderFormat rc) {
		renderComponents.pop();
		renderComponents.push(rc);
	}
	public void update(float dt) {
		renderComponents.peek().updated(dt);
	}
	public void render(SpriteBatch sb) {
		renderComponents.peek().render(sb);
	}
	
}
