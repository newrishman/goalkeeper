package ru.first.project.goalkeeper;

/**
 * Класс, описывающий нападающего.
 */
public class Forward {
    private int shotPower;
    private int shorDirection;

    public int getShotPower() {
        return shotPower;
    }

    public void setShotPower(int shotPower) {
        this.shotPower = shotPower;
    }

    public int getShorDirection() {
        return shorDirection;
    }

    public void setShorDirection(int shorDirection) {
        this.shorDirection = shorDirection;
    }
}