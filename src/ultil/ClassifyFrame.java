package ultil;

import entities.ClassifyTower;

import javax.swing.*;

public class ClassifyFrame extends JFrame {
    int x;
    int y;
    public ClassifyFrame(int x, int y){
        setSize(320, 140);
        setTitle("selected Tower");
        setLocationRelativeTo(null);
        setResizable(false);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClassifyPanel cp = new ClassifyPanel(x, y);
        add(cp);

    }
}
