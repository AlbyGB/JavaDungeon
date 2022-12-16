package dungeon;

import processing.core.PApplet;
import processing.event.KeyEvent;

public class Window extends PApplet {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        Player.getPlayerInstance("Giovanni", getGraphics());
        Player.setPos(10,10);

    }

    @Override
    public void draw() {
        background(55);

        Player.draw();
    }

    @Override
    public void keyPressed(KeyEvent event) {
        switch (event.getKeyCode()) {
            case 65 -> Player.move(-1, 0);
            case 68 -> Player.move(1, 0);
            case 87 -> Player.move(0,-1);
            case 83 -> Player.move(0,1);
        }

    }

    public void open() {
        PApplet.main("dungeon.Window");
    }
}
