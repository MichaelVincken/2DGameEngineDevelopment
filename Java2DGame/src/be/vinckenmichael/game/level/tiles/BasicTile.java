package be.vinckenmichael.game.level.tiles;

import be.vinckenmichael.game.gfx.Screen;
import be.vinckenmichael.game.level.Level;

public class BasicTile extends Tile {

	protected int tileId;
	protected int tileColour;
	
	public BasicTile(int id, int x, int y, int tileColour) {
		super(id, false, false);
		this.tileId = x + y;
		this.tileColour = tileColour;
	}

	public void render(Screen screen, Level level, int x, int y) {
		screen.render(x, y, tileId, tileColour);
	}
}
