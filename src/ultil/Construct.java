package ultil;

import entities.Background;
import entities.BackgroundHome;
import entities.GetConstruct;
import manager.GameManager;
import manager.HomeManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Construct extends JPanel implements MouseListener {
    int x;
    int y;
    GetConstruct gct = new GetConstruct();
    public Construct(int x, int y){
        this.x = x;
        this.y = y;
        addMouseListener(this);
        setVisible(true);
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        super.paintComponent(g);
        gct.draw(graphics2D);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ClassifyFrame CF = new ClassifyFrame(x, y);
        CF.setVisible(true);
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
