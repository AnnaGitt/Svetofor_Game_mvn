public class Svetofor {
    public static boolean isGreenLight = false;
    public static int MAX_SPEED = 10;

    //Функция для опеределения того, что игрок выбыл или нет
    public static boolean isPlayerWin(int speedOfPlayer) {
        boolean winOrNot;
        if (isGreenLight) winOrNot = true;
        else if (speedOfPlayer >= MAX_SPEED) winOrNot = false;
        else winOrNot = true;
        return winOrNot;
    }

    //Функция для подсчёта числа выбывших игроков
    public static int numberOfLosers(int[] playersSpeeds) {
        int numOfLosers = 0;
        for (int i = 0; i < playersSpeeds.length; i++) {
            if (!isPlayerWin(playersSpeeds[i])) { //Проверка на то, что игкрок проиграл через функцию "isPlayerWin"
                numOfLosers++;
            }
        }
        return numOfLosers;
    }

    //Функция для заполнения массива скоростями выбывщих игроков
    public static int[] speedsOfLoserPlayers(int[] playersSpeeds) {
        int[] speedsOfLoserPlayer = new int[numberOfLosers(playersSpeeds)]; //Создание массива для скоростей проигравших через функцию подсчёта проигравших
        int arrayPosition = 0;
        for (int i = 0; i < playersSpeeds.length; i++) {
            if (!isPlayerWin(playersSpeeds[i])) { //Проверка на то, что игкрок проиграл через функцию "isPlayerWin"
                speedsOfLoserPlayer[arrayPosition] = playersSpeeds[i];
                arrayPosition++;
            }
        }
        return speedsOfLoserPlayer;
    }

    //Функция для заполнения массива скоростями победивших игроков
    public static int[] speedsOfWinnerPlayers(int[] playersSpeeds) {
        int[] speedsOfWinnerPlayers = new int[playersSpeeds.length - numberOfLosers(playersSpeeds)]; //Создание массива для скоростей проигравших через функцию подсчёта проигравших минус общее кол-во игроков
        int arrayPosition = 0;
        for (int i = 0; i < playersSpeeds.length; i++) {
            if (isPlayerWin(playersSpeeds[i])) {
                speedsOfWinnerPlayers[arrayPosition] = playersSpeeds[i];
                arrayPosition++;
            }
        }
        return speedsOfWinnerPlayers;
    }

    //Функция для вывода элементов массива
    public static void printArray(int[] arrayForPrint) {
        for (int i = 0; i < arrayForPrint.length; i++) {
            System.out.print(arrayForPrint[i] + " ");
        }
    }
}
