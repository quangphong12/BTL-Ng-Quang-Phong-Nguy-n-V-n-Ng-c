package ultil;

import entities.Background;
import entities.BackgroundHome;
import entities.ClassifyTower;
import entities.GetConstruct;
import manager.GameManager;
import manager.HomeManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClassifyPanel extends JPanel implements MouseListener {
    int x;
    int y;
    ClassifyTower ct;
    public ClassifyPanel(int x, int y){
        ct = new ClassifyTower(x, y);
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        super.paintComponent(g);
        ct.draw(graphics2D);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
