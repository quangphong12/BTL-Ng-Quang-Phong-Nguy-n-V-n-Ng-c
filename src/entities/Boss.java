package entities;

import ultil.TowerFrame;

import java.awt.*;
import java.util.Random;

public class Boss {
    Random random = new Random();
    public int type = random.nextInt(1);
    public int x;
    public int y;
    public int hp = 60;
    public int armor = 2;
    public int money;
    public Boss(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    //    public int y = -100;
//    public int x = 140 + random.nextInt(TowerFrame.w - 310);
    public Image[] images = {
      ImageLoader.getImage("boss02.png"),
    };
    public void hp(Graphics2D g2d){
        g2d.setColor(Color.red);
        int[] xPos = new int[]{x, x  + hp, x + hp, x};
        int[] yPos = new int[]{y, y,y + 5,y + 5 };
        g2d.fillPolygon(xPos,yPos,4);
        String s = String.valueOf(hp);
        g2d.drawString(s, x, y - 2);
        String s1 = String.valueOf(x);
        g2d.drawString("x = " + s1, x + 15, y - 2);
        String s2 = String.valueOf(y);
        g2d.drawString("y = " + s2, x + 50, y - 2);
    }
    public void draw(Graphics2D g2d) {
        g2d.drawImage(images[0], x, y, null);

    }

    public int speed = 1;
    public boolean move() {
        int xR = x;
        int yR = y;
        if (y <= 0 || y >= TowerFrame.h) {
            y = yR;
        }
        if (x <= 140 || x >= TowerFrame.w) {
            x = xR;
        }
        if(x < 240){
            x += speed;
        }
        if(x >= 210 && x < 240){
            y += speed;
        }

        if(x == 240 && y <= 400){
            y += speed;
            //return y > TowerFrame.h;
        }


        if(y == 400 && x <= 460){
            x += speed;
            //return x > TowerFrame.w;
        }
        if(x == 460 && y <= 400 && y >= 105){
            y -= speed;
            //return x > TowerFrame.w;
        }
        if(y == 105 && x <= 690 && x >= 460){
            x += speed;
        }
        if(x == 690 && y >= 105 && y <= 310){
            y += speed;
        }
        if(y == 310 && x >= 680){
            x += speed;
        }
        return x > TowerFrame.w;
    }
    public Rectangle getRect() {
        Rectangle rect = new Rectangle(
                x,
                y,
                images[0].getWidth(null),
                images[0].getHeight(null)
        );
        return rect;
    }
}
