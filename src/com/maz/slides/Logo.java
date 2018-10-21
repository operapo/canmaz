package com.maz.slides;

import com.maz.basic.Renderer;
import com.maz.components.RenderComponents;
import com.maz.components.MenuComponent2;

public class Logo extends RenderComponents{

	public Logo(Renderer rf) {
		super(rf);
		this.addComponent(new MenuComponent2(rf));
	}

}
