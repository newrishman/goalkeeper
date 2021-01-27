package ru.first.project.goalkeeper;

public class РассчетВара {
    public int randomChance() {

        int random = 1 + (int) (Math.random() * 101);

        System.out.println("Шанс стойки" + random);

        return random;
    }

    public Goalkeeper position(Goalkeeper goalkeeper) {
        int random = randomChance();
        if (random < 30) {
            goalkeeper.setPosition("Butterfly");
        } else {
            goalkeeper.setPosition("StanUp");
        }
        return goalkeeper;
    }

    public Goalkeeper Рассчет() {
        Goalkeeper goalkeeper = new Goalkeeper();

        goalkeeper = position(goalkeeper);

        return goalkeeper;
    }

    public Goalkeeper характеристики(Goalkeeper goalkeeper) {
        String position = goalkeeper.getPosition();
        if (position == "Butterfly") {
            int PlayHome = goalkeeper.getHome() + 10;

            int PlayLeftDown = goalkeeper.getLeftDown() + 10;

            int PlayRightDown = goalkeeper.getRightDown() + 10;

            int PlayLeftUp = goalkeeper.getLeftUp() - 10;

            int PlayRightUp = goalkeeper.getRightUp() - 10;

            int Speed = goalkeeper.getSpeed() - 10;

            goalkeeper.setHome(PlayHome);

            goalkeeper.setLeftDown(PlayLeftDown);

            goalkeeper.setRightDown(PlayRightDown);

            goalkeeper.setSpeed(Speed);

            goalkeeper.setLeftUp(PlayLeftUp);

            goalkeeper.setRightUp(PlayRightUp);
        } else {
            int PlayHome = goalkeeper.getHome() - 10;

            int PlayLeftDown = goalkeeper.getLeftDown() - 10;

            int PlayRightDown = goalkeeper.getRightDown() -10;

            int PlayLeftUp = goalkeeper.getLeftUp() + 10;

            int PlayRightUp = goalkeeper.getRightUp() + 10;

            int Speed = goalkeeper.getSpeed() + 10;

            goalkeeper.setHome(PlayHome);

            goalkeeper.setLeftDown(PlayLeftDown);

            goalkeeper.setRightDown(PlayRightDown);

            goalkeeper.setSpeed(Speed);

            goalkeeper.setLeftUp(PlayLeftUp);

            goalkeeper.setRightUp(PlayRightUp);

        }
        return goalkeeper;
    }
}

//} Если стойка Butterfly - то вратарь имеет +10% к защите по низу и домика и -10% к защите верха.
// Скорость перемещения -10%
//
// Если стойка StandUp - то вратарь имеет +10% к защите верха и -10% к защите по низу и домика.
// Скорость перемещения +10%
