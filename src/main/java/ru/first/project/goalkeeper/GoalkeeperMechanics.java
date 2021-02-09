package ru.first.project.goalkeeper;

public class GoalkeeperMechanics {

        public int randomChance() {

            int random = 1 + (int) (Math.random() * 101);

            System.out.println("Шанс стойки" + random);

            return random;
        }

        public Goalkeeper positionSelection(Goalkeeper goalkeeper) {
            int random = randomChance();
            if (random <= 40) {
                goalkeeper.setPosition("Butterfly");
            } else {
                goalkeeper.setPosition("StandUp");
            }
            return goalkeeper;
        }


        public Goalkeeper rackParameters(Goalkeeper goalkeeper) {
            String position = goalkeeper.getPosition();
            String s1 = "Butterfly";
            String s2 = "StandUp";
            System.out.println(s1.equals(s2));
            int playHome = goalkeeper.getHome();
            int playLeftDown = goalkeeper.getLeftDown();
            int playRightDown = goalkeeper.getRightDown();
            int playLeftUp = goalkeeper.getLeftUp();
            int playRightUp = goalkeeper.getRightUp();
            int speed = goalkeeper.getSpeed();


            if (position==s1) {
                playHome = playHome + 10;
                playLeftDown = playLeftDown + 10;
                playRightDown = playRightDown + 10;
                playLeftUp = playLeftUp - 10;
                playRightUp = playRightUp - 10;
                speed = speed - 10;


            } else {
                playHome = playHome - 10;
                playLeftDown = playLeftDown - 10;
                playRightDown = playRightDown - 10;
                playLeftUp = playLeftUp + 10;
                playRightUp = playRightUp + 10;
                speed = speed + 10;
            }
            goalkeeper.setHome(playHome);
            goalkeeper.setLeftDown(playLeftDown);
            goalkeeper.setRightDown(playRightDown);
            goalkeeper.setSpeed(speed);
            goalkeeper.setLeftUp(playLeftUp);
            goalkeeper.setRightUp(playRightUp);
            return goalkeeper;
        }
}

