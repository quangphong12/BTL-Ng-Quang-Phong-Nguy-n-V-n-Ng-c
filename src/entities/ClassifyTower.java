package entities;

import javax.swing.*;
import java.awt.*;

public class ClassifyTower extends JPanel {
    int x;
    int y;
    public ClassifyTower(int x, int y){
        this.x = x;
        this.y = y;
    }
    Image image = ImageLoader.getImage("classify.png");
    public void draw(Graphics2D graphics2D) {
        Font font = new Font("Georgia", Font.ITALIC, 20);
        graphics2D.setFont(font);
        graphics2D.drawImage(image, 0, 0, null);
        String s1 = String.valueOf(x);
        String s2 = String.valueOf(y);
        graphics2D.drawString("x = " + s1, 0, 50);
        graphics2D.drawString(" y = " + s2, 100, 50);
        graphics2D.setBackground(Color.CYAN);
    }
}
