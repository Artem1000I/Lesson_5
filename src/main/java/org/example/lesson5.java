package org.example;

public class lesson5 { public static void main(String[] args) {
    Player player1 = new Player("Александра", 1000, 80, 777); //ПЕРЕМЕННАЯ ПЛЕЕР 1
    System.out.println("Всего игроков: " + Player.getPlayersCount()); //всего игроков создано обратились к статическому гетору
    Player player2 = new Player("Владимир", 1200, 70, 500);  // ЭКЗЕМПЛЯР ПЛЕЕ
    Player player3 = new Player("Артем");
    System.out.println("Всего игроков: " + Player.getPlayersCount());

/*        player1.nickname = "Test";
        player2.level = 70;
        player1.money = 777;*/                              // ОБРАЩЕНИЕ НА ПРЯМУЮ ЧЕРЕЗ ЭКЗЕМПЛЯР
//        System.out.println(player2.nickname.toUpperCase());

    player3.setNickname("Артем Великий");   //пробуем изменить никнейм
    player3.setMoney(-999);                 //и изменить количество монет

    Player[] players = {player1, player2, player3}; //создаем массив пользователей

    for (Player player : players) {  //пройтись по всем плеерам
        player.printInfo();
    }

    player1.action(); //1 игрок выполнил действие 3 раза и получает 100 очков
    player1.action();
    player1.action();


    player1.printInfo();
//        player2.printInfo();
//        player3.printInfo();
    }
}
