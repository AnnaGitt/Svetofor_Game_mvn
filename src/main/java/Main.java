public class Main {
    public static void main(String[] args) {
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0}; //Задаём скорости игроков
        String[] playersNamesWithSpeed = new String[]{"James 10", "Mya 9", "Maks 0", "Daniel 11", "Finn 0"}; //Задаём имена и скорости игроков

        System.out.println("Кол-во выбывших игроков: " + Svetofor.numberOfLosers(playersSpeeds)); // Вывод числа выбывших игроков

        System.out.print("Скорости выбывших игроков: ");
        Svetofor.printArrayInts(Svetofor.speedsOfLoserPlayers(playersSpeeds)); //Вывод скоростей выбывших игроков
        System.out.println("");

        System.out.print("Скорости победивших игроков: ");
        Svetofor.printArrayInts(Svetofor.speedsOfWinnerPlayers(playersSpeeds)); //Вывод скоростей выбывших игроков
        System.out.println("");

        System.out.print("Имена победителей: ");
        Svetofor.printArrayStrings(Svetofor.winnerPlayerNames(playersNamesWithSpeed)); //Вывод имён победителей
    }
}
