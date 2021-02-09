package ru.first.project.goalkeeper;

/**
 * Класс, описывающий нападающего.
 */
public class Forward {
    private int shotPower;
    private int shotDirection;

    public int getShotPower() {
        return shotPower;
    }

    public void setShotPower(int shotPower) {
        this.shotPower = shotPower;
    }

    public int getShotDirection() {
        return shotDirection;
    }

    public void setShotDirection(int shotDirection) {
        this.shotDirection = shotDirection;
    }
}