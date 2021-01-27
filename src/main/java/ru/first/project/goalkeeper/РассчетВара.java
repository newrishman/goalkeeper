package ru.first.project.goalkeeper;

import javax.swing.text.Position;

public class РассчетВара {
    public int RandomChance() {

        int random =1 + (int) (Math.random() * 101);

        System.out.println("Шанс стойки" + random);

        return random;
    }
    public int position(int RandomChance, int Butterfly , int StandUp) {

        if ( RandomChance < 30){
           Goalkeeper.setButterfly();
        }else

    }
    public void Характеристики(Goalkeeper goalkeeper){
        int Butterfly=goalkeeper.setButterfly();
        if (Position==Butterfly){

        }


    }


}


//метод Вратарь рассчитатьВратаря(String позиция){
//if(позиция равна батерфляй){
//ловушка - 10
//бла бла + 10
//} if else{
//ловушка +10
//бла бла - 10
//}
//} Если стойка Butterfly - то вратарь имеет +10% к защите по низу и домика и -10% к защите верха.
// Скорость перемещения -10%
//
// Если стойка StandUp - то вратарь имеет +10% к защите верха и -10% к защите по низу и домика.
// Скорость перемещения +10%
// (Forward forward) {
//
//        int Butterfly = Goalkeeper.getButterfly();

//public int точностьНападения(Forward forward) {
//
//        int shotPower = forward.getShotPower();