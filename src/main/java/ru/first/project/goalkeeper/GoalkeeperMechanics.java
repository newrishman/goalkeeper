package ru.first.project.goalkeeper;

public class GoalkeeperMechanics {

    public class Mechanics {

        public int randomChance() {  //Не понимаю как сделать Шанс,а не рандом

            int random = 1 + (int) (Math.random() * 101);

            System.out.println("Шанс стойки" + random);

            return random;
        }

        public Goalkeeper positionSelection(Goalkeeper goalkeeper) {
            int random = randomChance();
            if (random <= 30) {
                goalkeeper.setPosition("Butterfly");
            } else {
                goalkeeper.setPosition("StanUp");
            }
            return goalkeeper;
        }


        public Goalkeeper rackParameters(Goalkeeper goalkeeper) {
            String position = goalkeeper.getPosition();
            String s1 = "Butterfly";
            String s2 = new String("StandUp");
            System.out.println(s1 == s2.intern());
            int PlayHome = goalkeeper.getHome();
            int PlayLeftDown = goalkeeper.getLeftDown();
            int PlayRightDown = goalkeeper.getRightDown();
            int PlayLeftUp = goalkeeper.getLeftUp();
            int PlayRightUp = goalkeeper.getRightUp();
            int Speed = goalkeeper.getSpeed();


            if (position == s1) {
                PlayHome = PlayHome + 10;
                PlayLeftDown = PlayLeftDown + 10;
                PlayRightDown = PlayRightDown + 10;
                PlayLeftUp = PlayLeftUp - 10;
                PlayRightUp = PlayRightUp - 10;
                Speed = Speed - 10;


            } else {
                PlayHome = PlayHome - 10;
                PlayLeftDown = PlayLeftDown - 10;
                PlayRightDown = PlayRightDown - 10;
                PlayLeftUp = PlayLeftUp + 10;
                PlayRightUp = PlayRightUp + 10;
                Speed = Speed + 10;
            }
            goalkeeper.setHome(PlayHome);
            goalkeeper.setLeftDown(PlayLeftDown);
            goalkeeper.setRightDown(PlayRightDown);
            goalkeeper.setSpeed(Speed);
            goalkeeper.setLeftUp(PlayLeftUp);
            goalkeeper.setRightUp(PlayRightUp);
            return goalkeeper;
        }
    }
}
