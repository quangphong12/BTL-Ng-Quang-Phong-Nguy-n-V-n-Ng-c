package ultil;

import javax.swing.*;
import java.util.ArrayList;

public class Map01 extends JFrame {
    public static final int w = 900;
    public static final int h = 540;
    public Map01(){
        setSize(w,h);
        setTitle("Game Tower1111");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TowerPanel panel = new TowerPanel();

        Construct ct1 = new Construct(170, 200);
        ct1.setSize(60, 60);
        ct1.setLocation(170, 200);
        Construct ct2 = new Construct(320, 330);
        ct2.setSize(60, 60);
        ct2.setLocation(320, 330);
        Construct ct3 = new Construct(530, 230);
        ct3.setSize(60, 60);
        ct3.setLocation(530, 230);
        Construct ct4 = new Construct(750, 230);
        ct4.setSize(60, 60);
        ct4.setLocation(750, 230);
        add(ct1);
        add(ct2);
        add(ct3);
        add(ct4);
        add(panel);
//        Construct ct = new Construct();
//        add(ct);
    }
}
