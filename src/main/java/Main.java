public class Main {
    public static void main(String[] args) {
        Svetofor svetofor = new Svetofor(false);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0}; //Задаём скорости игроков
        String[] playersNamesWithSpeed = new String[]{"James 10", "Mya 9", "Maks 0", "Daniel 11", "Finn 4"}; //Задаём имена и скорости игроков

        System.out.println("Кол-во выбывших игроков: " + svetofor.numberOfLosers(playersSpeeds)); // Вывод числа выбывших игроков

        System.out.print("Скорости выбывших игроков: ");
        ServiceFunctions.printArrayInts(svetofor.speedsOfLoserPlayers(playersSpeeds)); //Вывод скоростей выбывших игроков
        System.out.println("");

        System.out.print("Скорости победивших игроков: ");
        ServiceFunctions.printArrayInts(svetofor.speedsOfWinnerPlayers(playersSpeeds)); //Вывод скоростей выбывших игроков
        System.out.println("");

        System.out.print("Имена победителей: ");
        ServiceFunctions.printArrayStrings(svetofor.winnerPlayerNames(playersNamesWithSpeed)); //Вывод имён победителей
    }
}
