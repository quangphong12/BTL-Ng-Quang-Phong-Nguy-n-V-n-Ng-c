package entities;

import java.awt.*;

public class money {
    public int money = 200;
    public void draw(Graphics2D g2d) {
        Font font = new Font("Georgia", Font.ITALIC, 20);
        g2d.setFont(font);
        g2d.drawRect(700, 0, 70, 25);
        g2d.setColor(Color.red);
        String s = String.valueOf(money);
        g2d.drawString(s, 700, 20);
        g2d.setBackground(Color.CYAN);
    }
}
