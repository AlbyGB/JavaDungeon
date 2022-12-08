package dungeon;

import processing.core.PApplet;
import processing.event.KeyEvent;

public class MainGame extends PApplet {
    public MainGame() {

    }

    @Override
    public void settings() {
        size(800,600);
    }

    @Override
    public void setup() {
        Player.getPlayerInstance("Giovanni", getGraphics());
        Player.setPos(10,10);

    }

    @Override
    public void draw() {
        background(55);
        update();

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

    private void update() {

    }

    public static void main(String[] args) {
        PApplet.main("dungeon.MainGame");
    }
}
