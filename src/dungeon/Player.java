package dungeon;

import processing.core.PGraphics;

public class Player {
    private final String name;
    private final PGraphics gfx;
    private  int x;
    private  int y;

    public Player(String name, PGraphics gfx) {
        this.name = name;
        this.gfx = gfx;
        x = 0;
        y = 0;
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        gfx.fill(255,0,0);
        gfx.rect(x*16,y*16,16,16);
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
