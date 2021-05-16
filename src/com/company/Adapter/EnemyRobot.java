package com.company.Adapter;

import java.util.Random;

public class EnemyRobot {
    private final Random generator = new Random();

    public void smashWithHands() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot causes " + attackDamage + " damage with its metal hands");
    }

    public void walkForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot walks forward " + movement + " meters");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }
}
