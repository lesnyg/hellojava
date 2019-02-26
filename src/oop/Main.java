package oop;

public class Main {
    public static void main(String[] args) {
/*
        int clericMP;
        가상 세계에 용사를 생성
        Hero hero = new Hero();

        생성된 용사에게 최초의 HP와 이름을 설정
        hero.name = "용사";
        hero.hp = 100;
        System.out.println("HERO " + hero.name + "를 생성했습니다.");
*/

        Cleric cleric = new Cleric();
        System.out.println("======성직자를 생성했습니다.=====");

        cleric.selfAid();
        System.out.println();
        System.out.println("=====마법을 사용하여 MP는 5소비되고 HP는 최대로 회복하였습니다.=====");

        showPoint(cleric);

       int point =  cleric.pray(3);
        System.out.println();
        System.out.println("=====성직자가 기도를 하였습니다.=====");
        System.out.println("성직자의 MP가 " + point + "만큼 상승했습니다." );
        showPoint(cleric);
    }

    private static void showPoint(Cleric cleric) {
        System.out.println("성직자의 MP가 " + cleric.mp + "(이)가 되었습니다.");
        System.out.println("성직자의 HP가 " + cleric.hp + "(이)가 되었습니다.");
    }
}
