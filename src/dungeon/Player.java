package dungeon;

import processing.core.PGraphics;
import processing.core.PVector;

public class Player {
    private static Player playerInstance = null;

    private static String name;

    private static PGraphics gfx;

    private static PVector direction;

    private Player(String name, PGraphics gfx) {
        Player.name = name;
        Player.gfx = gfx;
        direction = new PVector(0, 0);
    }

    public static void getPlayerInstance(String playerName, PGraphics gfx) {
        if (isNull()) {
            playerInstance = new Player(playerName, gfx);
        }
    }

    public static void setPos(int x, int y) {
        direction.x = x;
        direction.y = y;
    }

    public static void draw() {
        gfx.fill(255,0,0);
        gfx.rect(direction.x*16,direction.y*16,16,16);
    }

    public static void move(int dx, int dy) {
        direction.x += dx;
        direction.y += dy;
    }

    private static boolean isNull() {
        return playerInstance == null;
    }
}
