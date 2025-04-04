package Main.Game.Collectible;

import Main.Game.Character.Player;

import java.awt.*;

public abstract class  Item implements Collectible {

   private int x;
   private int y;
   private String name;
    public Item(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }


    public void collect(Player player) {

    }
    public void use(Player player) {

    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
