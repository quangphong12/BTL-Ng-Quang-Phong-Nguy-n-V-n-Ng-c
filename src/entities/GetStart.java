package entities;

import entities.ImageLoader;

import java.awt.*;

public class GetStart {
    public int x;
    public int y;
    Image image = ImageLoader.getImage("start.png");
    public GetStart(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void draw(Graphics2D graphics2D) {
        graphics2D.drawImage(image, x, y, null);
    }
}
