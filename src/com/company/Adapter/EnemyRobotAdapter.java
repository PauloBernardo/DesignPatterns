package com.company.Adapter;

public class EnemyRobotAdapter implements EnemyAttacker {
    private final EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }


    @Override
    public void fireWeapon() {
        enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        enemyRobot.reactToHuman(driverName);
    }
}
