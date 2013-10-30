package com.stonebeard.po.level.tile;

import com.stonebeard.po.graphics.Screen;
import com.stonebeard.po.graphics.Sprite;

public class VoidTile extends Tile {

	public VoidTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
}
	
