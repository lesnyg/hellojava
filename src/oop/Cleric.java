package oop;

import java.util.Random;

public class Cleric {
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    void selfAid() {
        mp -= 5;
        hp = MAX_HP;
    }

    int pray(int prayTime) {
        int point = new Random().nextInt(3) + prayTime;
        mp += point;
        if (mp > MAX_MP) {
            mp = MAX_MP;
        }
        return point;
    }

}
