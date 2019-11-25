package ultil;

import entities.Background;
import entities.BackgroundHome;
import manager.GameManager;
import manager.HomeManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JPanel implements MouseListener {
    JButton start;
    JLabel L;
    JPanel P;
    boolean[] flag = new boolean[256];
    HomeManager manager = new HomeManager();
    public Home() {
//        JButton bt = new JButton("Start");
//        bt.setSize(1000, 200);
//        bt.setBackground(Color.YELLOW);
//        addMouseListener(this);
//        this.add(bt);
//        setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        super.paintComponent(g);
        manager.draw(graphics2D);
//        manager.start(graphics2D);
//        addMouseListener(this);
//        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        TowerFrame F = new TowerFrame();
        F.setVisible(true);
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
