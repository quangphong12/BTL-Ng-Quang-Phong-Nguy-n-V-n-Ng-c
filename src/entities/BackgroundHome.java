package entities;

import java.awt.*;

public class BackgroundHome {
    public int x;
    public int y;
    Image image = ImageLoader.getImage("home.png");
    public BackgroundHome(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void draw(Graphics2D graphics2D) {
        graphics2D.drawImage(image, x, y, null);
    }
}
