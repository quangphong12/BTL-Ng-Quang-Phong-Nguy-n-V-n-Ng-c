package manager;

import entities.BackgroundHome;
import entities.GetStart;

import java.awt.*;

public class HomeManager {
    BackgroundHome bg = new BackgroundHome(0, 0);
    GetStart gs = new GetStart(0, 0);
    public void draw(Graphics2D g){
        bg.draw(g);
    }
    public void start(Graphics2D g){
        gs.draw(g);
    }
}
