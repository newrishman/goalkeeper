package ru.first.project.goalkeeper;

public class ForwardMechanics {

    public int RandomChance() {

        int random = (int) (Math.random() * 101);

        System.out.println("Шанс попадания" + random);

        return random;
    }

    public int strikerAccuracy(Forward forward) {

        int shotPower = forward.getShotPower();


        if (shotPower <= 0 || shotPower >= 100) {

            System.out.println("Ошибка");

            return 0;

        }
        int accuracy;

        if (shotPower < 100 && shotPower > 75) {

            accuracy = 25;

        } else if (shotPower < 75 && shotPower > 50) {

            accuracy = 50;

        } else if (shotPower < 50 && shotPower > 25) {

            accuracy = 75;

        } else {
            accuracy=100;
        }
        return accuracy;
    }



    public void calculation(int RandomChance, int accuracy) {
        if (accuracy == 0 || RandomChance == 0) {

            System.out.println("Ошибка вычесления");
            return;
        }
        if ( RandomChance > accuracy ){
            System.out.println("Ты промахнулся");
        }else {
            System.out.println("Ты попал");
        }
    }
}
