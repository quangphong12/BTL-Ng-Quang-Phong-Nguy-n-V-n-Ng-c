package entities;

import java.awt.*;

public class GetConstruct  {
    Image image = ImageLoader.getImage("position.png");
    public void draw(Graphics2D graphics2D) {
        graphics2D.drawImage(image, 0, 0, null);
    }
}
