package org.example;

public class Player {
    //public из любого места можно обратиться, protected , default(private-package), private к полю или методу нельзя не обратиться не откуда  //модификаторы
    private static int playersCount;
    private String nickname;
    private int points;
    private int level;
    private int money;    //установлены модификаторы private

    public static int getPlayersCount() {
        return playersCount;
    } // статический метод

    public Player(String nickname, int points, int level, int money) { //КОНСТРУКТОР
        setNickname(nickname);
        this.points = points;   //this пишем кода нужно чётко  описать что и куда ложится
        this.level = level;
        this.money = money;

        playersCount++; //как только создаётся новый экземпляр
    }

    public Player(String nickname) {
        this(nickname, 0, 1, 100);
    } //СТАРТОВЫЕ ЗНАЧЕНИЯ

    public Player() {
        this("");
    } // THIS В ТОМ САМОМ ЭКЗЕМПЛЯРЕ, НИКНЕЙМ ПО УМОЛЧАНИЮ ПУСТОЙ

    public void printInfo() { //ПЕЧАТЬ ДАННЫХ ИГРОКА НЕ СТАТИЧЕСКИЙ МЕТОД МОЖЕМ ОБРАЩАТЬСЯ К НЕСТАТИЧЕСКИМ ПОЛЯМ
        System.out.println(String.format("Игрок %s(lvl: %s) имеет %s очков и %s монет", nickname, level, points,
                money));
    }

    public void action() {
        System.out.printf("Пользователь %s выполняет некоторое действие и получает 100 очков!%n", nickname);
        points += 100;  // видем только внутри класса
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname.toUpperCase();
    } //никнейм должен быть большими буквами

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {  // количество монет всегда положительное
        if (money < 0) {
            money = Math.abs(money);
        }
        this.money = money;
    }

    public int getPoints() {
        return points;
    }

    public int getLevel() {
        return level;
    }   //методы акцессоры доступ
}
