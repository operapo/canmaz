package com.maz.slides;

import com.maz.basic.Renderer;
import com.maz.components.RenderComponents;
import com.maz.components.MenuComponent;

public class Menu extends RenderComponents{

	public Menu(Renderer rf) {
		super(rf);
		this.addComponent(new MenuComponent(rf));
	}

}
