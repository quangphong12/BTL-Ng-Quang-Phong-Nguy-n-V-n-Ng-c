package ultil;

import entities.Background;
import entities.BackgroundHome;
import manager.GameManager;
import manager.HomeManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start extends JPanel implements MouseListener {
    HomeManager manager = new HomeManager();
    public Start(){
        addMouseListener(this);
        setVisible(true);
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        super.paintComponent(g);
        manager.start(graphics2D);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Map01 m = new Map01();
        m.setVisible(true);
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
