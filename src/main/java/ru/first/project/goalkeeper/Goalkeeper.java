package ru.first.project.goalkeeper;

/**
 * Класс, описывающий вратаря.
 */
public class Goalkeeper {
    private int speed = 60;

    private int leftUp = 45;

    private int rightUp = 60;

    private int leftDown = 55;

    private int rightDown = 70;

    private int home = 40;

    private int standUp;

    private int butterfly;

    private String position;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLeftUp() {
        return leftUp;
    }

    public void setLeftUp(int leftUp) {
        this.leftUp = leftUp;
    }

    public int getRightUp() {
        return rightUp;
    }

    public void setRightUp(int rightUp) {
        this.rightUp = rightUp;
    }

    public int getLeftDown() {
        return leftDown;
    }

    public void setLeftDown(int leftDown) {
        this.leftDown = leftDown;
    }

    public int getRightDown() {
        return rightDown;
    }

    public void setRightDown(int rightDown) {
        this.rightDown = rightDown;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}


