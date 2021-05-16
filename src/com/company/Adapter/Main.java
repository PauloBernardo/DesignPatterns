package com.company.Adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Adapter");

        EnemyTank enemyTank = new EnemyTank();
        EnemyRobot enemyRobot = new EnemyRobot();
        EnemyAttacker enemyAttackerRobot = new EnemyRobotAdapter(enemyRobot);


        System.out.println("The Enemy Robot");
        enemyRobot.reactToHuman("Juan");
        enemyRobot.walkForward();
        enemyRobot.smashWithHands();

        System.out.println("\nThe Enemy Tank");
        manipulateEnemyAttacker(enemyTank, "Paul");

        System.out.println("\nThe Robot with Adapter");
        manipulateEnemyAttacker(enemyAttackerRobot, "Joe");
    }


    private static void manipulateEnemyAttacker(EnemyAttacker enemyAttacker, String driver) {
        enemyAttacker.assignDriver(driver);
        enemyAttacker.driveForward();
        enemyAttacker.fireWeapon();
    }
}
