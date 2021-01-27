package ru.first.project.goalkeeper;

public class Рассчет {

    public int RandomChance() {

        int random = (int) (Math.random() * 101);

        System.out.println("Шанс попадания" + random);

        return random;
    }

    public int точностьНападения(Forward forward) {

        int shotPower = forward.getShotPower();


        if (shotPower < 0 || shotPower > 100) {

            System.out.println("Ошибка");

            return 0;

        }
        int точность;

        if (shotPower < 100 && shotPower > 75) {

            точность = 25;

        } else if (shotPower < 75 && shotPower > 50) {

            точность = 50;

        } else if (shotPower < 50 && shotPower > 25) {

            точность = 75;

        } else {
            точность=100;
        }
            return точность;
        }



    public void Счет(int RandomChance, int точность) {
        if (точность == 0 || RandomChance == 0) {

            System.out.println("Ошибка вычесления");
            return;
        }
        if ( RandomChance > точность ){
            System.out.println("Ты промахнулся");
        }else {
            System.out.println("Ты попал");
        }
    }
}

