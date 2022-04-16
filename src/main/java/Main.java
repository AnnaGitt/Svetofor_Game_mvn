public class Main {
    public static void main(String[] args) {
        Game game = new Game(false);
        SpeedyGame speedyGame = new SpeedyGame(false, 10);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0}; //Задаём скорости игроков
        String[] playersNamesWithSpeed = new String[]{"James 10", "Mya 9", "Maks 0", "Daniel 11", "Finn 4"}; //Задаём имена и скорости игроков

        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("Игра без учёта максимальной скорости");
        System.out.println("-------------------------------------");
        System.out.println("");

        System.out.println("*************************************");
        System.out.println("Кол-во выбывших игроков: " + game.numberOfLosers(playersSpeeds)); // Вывод числа выбывших игроков

        System.out.print("Скорости выбывших игроков: ");
        ServiceFunctions.printArrayInts(game.speedsOfLoserPlayers(playersSpeeds)); //Вывод скоростей выбывших игроков
        System.out.println("");

        System.out.print("Скорости победивших игроков: ");
        ServiceFunctions.printArrayInts(game.speedsOfWinnerPlayers(playersSpeeds)); //Вывод скоростей выбывших игроков
        System.out.println("");

        System.out.print("Имена победителей: ");
        ServiceFunctions.printArrayStrings(game.winnerPlayerNames(playersNamesWithSpeed)); //Вывод имён победителей
        System.out.println("");
        System.out.println("*************************************");

        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("Игра с учётом максимальной скорости");
        System.out.println("-------------------------------------");
        System.out.println("");

        System.out.println("*************************************");
        System.out.println("Кол-во выбывших игроков: " + speedyGame.numberOfLosers(playersSpeeds)); // Вывод числа выбывших игроков

        System.out.print("Скорости выбывших игроков: ");
        ServiceFunctions.printArrayInts(speedyGame.speedsOfLoserPlayers(playersSpeeds)); //Вывод скоростей выбывших игроков
        System.out.println("");

        System.out.print("Скорости победивших игроков: ");
        ServiceFunctions.printArrayInts(speedyGame.speedsOfWinnerPlayers(playersSpeeds)); //Вывод скоростей выбывших игроков
        System.out.println("");

        System.out.print("Имена победителей: ");
        ServiceFunctions.printArrayStrings(speedyGame.winnerPlayerNames(playersNamesWithSpeed)); //Вывод имён победителей
        System.out.println("");
        System.out.println("*************************************");

    }
}
