package ru.first.project.goalkeeper;

public class РассчетВара { //fixme что за название класса? Рассчет чего? Почему на русском?

    public int randomChance() {  // fixme этот метод просто возвращает рандомное число, а не какой-то шанс стойки

        int random = 1 + (int) (Math.random() * 101);

        System.out.println("Шанс стойки" + random);

        return random;
    }

    public Goalkeeper position(Goalkeeper goalkeeper) { // fixme название метода должно говорить, что оно делает
        int random = randomChance();
        if (random < 30) { //fixme должно быть <=
            goalkeeper.setPosition("Butterfly");
        } else {
            goalkeeper.setPosition("StanUp");
        }
        return goalkeeper;
    }


    //fixme этот метод бесполезен. Для чего он нужен? Создать вратаря и просто задать позицию? См. нападающего
    public Goalkeeper Рассчет() { //fixme странное название. Тем более уже есть класс рассчет
        Goalkeeper goalkeeper = new Goalkeeper();

        goalkeeper = position(goalkeeper); // fixme название метода должно говорить, что оно делает
        // значит должно быть setPosition, т.е. присвоить позицию

        return goalkeeper;
    }


    public Goalkeeper характеристики(Goalkeeper goalkeeper) { //fixme странное название. Метод - это действие.
        String position = goalkeeper.getPosition();


        if (position == "Butterfly") { //fixme я говорил почитать про сравнение строк. Тут всегда будет false

            int PlayHome = goalkeeper.getHome() + 10; //fixme дублирование кода. Индусский код

            int PlayLeftDown = goalkeeper.getLeftDown() + 10; //fixme дублирование кода

            int PlayRightDown = goalkeeper.getRightDown() + 10; //fixme дублирование кода

            int PlayLeftUp = goalkeeper.getLeftUp() - 10; //fixme дублирование кода

            int PlayRightUp = goalkeeper.getRightUp() - 10; //fixme дублирование кода

            int Speed = goalkeeper.getSpeed() - 10; //fixme дублирование кода

            goalkeeper.setHome(PlayHome); //fixme дублирование кода

            goalkeeper.setLeftDown(PlayLeftDown); //fixme дублирование кода

            goalkeeper.setRightDown(PlayRightDown); //fixme дублирование кода

            goalkeeper.setSpeed(Speed); //fixme дублирование кода

            goalkeeper.setLeftUp(PlayLeftUp); //fixme дублирование кода

            goalkeeper.setRightUp(PlayRightUp); //fixme дублирование кода
        } else {
            int PlayHome = goalkeeper.getHome() - 10; //fixme дублирование кода

            int PlayLeftDown = goalkeeper.getLeftDown() - 10; //fixme дублирование кода

            int PlayRightDown = goalkeeper.getRightDown() - 10; //fixme дублирование кода

            int PlayLeftUp = goalkeeper.getLeftUp() + 10; //fixme дублирование кода

            int PlayRightUp = goalkeeper.getRightUp() + 10; //fixme дублирование кода

            int Speed = goalkeeper.getSpeed() + 10; //fixme дублирование кода

            goalkeeper.setHome(PlayHome); //fixme дублирование кода

            goalkeeper.setLeftDown(PlayLeftDown); //fixme дублирование кода

            goalkeeper.setRightDown(PlayRightDown); //fixme дублирование кода

            goalkeeper.setSpeed(Speed); //fixme дублирование кода

            goalkeeper.setLeftUp(PlayLeftUp); //fixme дублирование кода

            goalkeeper.setRightUp(PlayRightUp); //fixme дублирование кода

        }
        return goalkeeper;
    }

    //todo посмотреть, запомнить, удалить
    private Goalkeeper примерЗаполненияКласса(Goalkeeper goalkeeper) {

        int PlayHome = goalkeeper.getHome();          //переменные с маленькой буквы
        int PlayLeftDown = goalkeeper.getLeftDown();  //переменные с маленькой буквы
        int PlayRightDown = goalkeeper.getRightDown();  //переменные с маленькой буквы
        int PlayLeftUp = goalkeeper.getLeftUp();  //переменные с маленькой буквы
        int PlayRightUp = goalkeeper.getRightUp();  //переменные с маленькой буквы
        int Speed = goalkeeper.getSpeed();  //переменные с маленькой буквы

        if (goalkeeper.getPosition() == "") { //String position = goalkeeper.getPosition(); тебе String position
            // нужен в одном месте только. Ради этого не стоит делать новую переменную
            PlayHome = PlayHome - 10;   // пример. число PlayHome = 10;  А теперь число PlayHome
                                        // будет равно его старое значение - 10;
            PlayLeftDown = PlayLeftDown - 10;
            PlayRightDown = PlayRightDown - 10;
            PlayLeftUp = PlayLeftUp - 10;
            PlayRightUp = PlayRightUp - 10;
            Speed = Speed - 10;
        } else {
            PlayHome = PlayHome + 10;
            PlayLeftDown = PlayLeftDown + 10;
            PlayRightDown = PlayRightDown + 10;
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
