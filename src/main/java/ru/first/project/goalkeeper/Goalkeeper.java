package ru.first.project.goalkeeper;

/**
 * Класс, описывающий вратаря.
 */
public class Goalkeeper {
    private int speed = 60;

    private int leftUp = 45;

    private int RightUp = 60;

    private int LeftDown = 55;

    private int RightDown = 70;

    private int Home = 40;

    private int StandUp = 30;

    private int Butterfly = 70;


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
        return RightUp;
    }

    public void setRightUp(int rightUp) {
        RightUp = rightUp;
    }

    public int getLeftDown() {
        return LeftDown;
    }

    public void setLeftDown(int leftDown) {
        LeftDown = leftDown;
    }

    public int getRightDown() {
        return RightDown;
    }

    public void setRightDown(int rightDown) {
        RightDown = rightDown;
    }

    public int getHome() {
        return Home;
    }

    public void setHome(int home) {
        Home = home;
    }

    public int getStandUp() {
        return StandUp;
    }

    public void setStandUp(int standUp) {
        StandUp = standUp;
    }

    public int getButterfly() {
        return Butterfly;
    }

    public void setButterfly(int butterfly) {
        Butterfly = butterfly;
    }
}

