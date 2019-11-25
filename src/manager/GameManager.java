package manager;

import entities.*;
import ultil.Construct;
import ultil.TowerFrame;

import java.awt.*;
import java.util.ArrayList;

public class GameManager {
    Tower tower1;
    Tower tower2;
    ArrayList<Bullet> bullets;
    ArrayList<Boss> bossArrayList;
    ArrayList<Explosion> explosions;
    Background bg = new Background(0, 0);
    money m = new money();
    public void initGame(){
        bossArrayList = new ArrayList<>();
        tower1 = new Tower(350,200);
        bullets = new ArrayList<>();
        explosions = new ArrayList<>();
        initBoss(0, 145);
        initBoss(-100, 145);
        initBoss(-200, 145);
        initBoss(-300, 145);
        initBoss(-400, 145);
        initBoss(-500, 145);
    }

    public void draw(Graphics2D graphics2D){
        bg.draw(graphics2D);
        m.draw(graphics2D);
        tower1.draw(graphics2D);
//        tower2.draw(graphics2D);
        for (Bullet bullet : bullets){
            bullet.draw(graphics2D);
        }

        for (Boss boss: bossArrayList) {
            boss.draw(graphics2D);
            boss.hp(graphics2D);
        }
//
//        for(Boss boss1: bossArrayList){
//            boss1.draw(graphics2D);
//        }
        graphics2D.drawArc(200, 50, 300, 300, 0, 360);
        graphics2D.setColor(Color.red);
        for (int i = explosions.size() - 1; i >= 0; i--) {
            boolean delete = explosions.get(i).draw(graphics2D);
            if (delete) {
                explosions.remove(i);
            }
        }
    }
    void initBoss(int x, int y) {
        if (bossArrayList.size() <= 5 || bossArrayList.get(bossArrayList.size() -1).y > 500) {
            bossArrayList.add(new Boss(x, y));
        }
    }

    public void towerFire(int a, int b){
        tower1.fire(bullets, a, b);
//        tower2.fire(bullets);
    }

    public void towerMove(int orient){
        tower1.orient = orient;
//        tower1.move();
    }
    public boolean checkDie() {
        for (Boss boss : bossArrayList) {
            Rectangle rect1 = boss.getRect()
                    .intersection(tower1.getRect());
//            Rectangle rect2 = boss.getRect()
//                    .intersection(tower2.getRect());
            if (rect1.isEmpty() == false) {
                //SoundLoader.play("cham_xe.wav");
                return true;
            }
        }
        return false;
    }


    public void AI() {

        for (int i = bossArrayList.size() - 1; i >= 0; i--) {
            if(Math.pow(bossArrayList.get(i).getX() - 350, 2) + Math.pow(bossArrayList.get(i).getY() - 200, 2) <= 22500){
                int max = 0;
                int ik = 0;
                for(int k = bossArrayList.size() - 1; k >= 0; k --){
                    if(bossArrayList.get(k).getX() >= max  && Math.pow(bossArrayList.get(k).getX() - 350, 2) + Math.pow(bossArrayList.get(k).getY() - 200, 2) <= 22500) {
                        max = bossArrayList.get(k).getX();
                        ik = k;
                    }

                }
                towerFire(bossArrayList.get(ik).getX(), bossArrayList.get(ik).getY());
            }
            boolean delete = bossArrayList.get(i).move();
            if (delete) {
                bossArrayList.remove(i);
            }else {
//                int count = 0;
                for (int j = 0; j < bullets.size(); j++) {
                    Rectangle rect = bossArrayList.get(i).getRect()
                            .intersection(bullets.get(j).getRect());
                    if (rect.isEmpty() == false) {
//                        count ++;
                        bossArrayList.get(i).hp = bossArrayList.get(i).hp - tower1.dame + bossArrayList.get(i).armor;
//                        bullets.remove(j);
                        bullets.remove(j);
                    }
                    if(bossArrayList.get(i).hp <= 0){
                        Boss boss = bossArrayList.get(i);
                        int x = boss.x + boss.images[boss.type].getWidth(null) / 2;
                        int y = boss.y + boss.images[boss.type].getHeight(null) / 2;
                        explosions.add(new Explosion(x, y));
                        //bullets.remove(j);
                        bossArrayList.remove(i);
                        System.out.println(i);
                        m.money += 10;
//                        count = 0;
                        //SoundLoader.play("eat_explo.wav");
                        break;
                    }
                }
            }
        }

        for (int i = bullets.size() - 1; i >= 0; i--) {
            boolean delete1 = bullets.get(i).move();
            if (delete1) {
                bullets.remove(i);
                System.out.println(i);
            }
        }
    }

}
