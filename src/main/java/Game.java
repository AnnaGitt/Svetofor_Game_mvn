public class Game {
    private boolean isGreenLight;

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public boolean getIsGreenLight() {
        return isGreenLight;
    }

    public void setIsGreenLight(boolean greenLight) {
        isGreenLight = greenLight;
    }

    //Функция для опеределения того, что игрок выбыл или нет с учётом светофора
    public boolean isPlayerWin(int speedOfPlayer) {
        boolean winOrNot;
        if (isGreenLight) winOrNot = true;
        else if (speedOfPlayer > 0) winOrNot = false;
        else winOrNot = true;
        return winOrNot;
    }

    //Функция для подсчёта числа выбывших игроков
    public int numberOfLosers(int[] playersSpeeds) {
        int numOfLosers = 0;

        for (int i = 0; i < playersSpeeds.length; i++) {
            if (!isPlayerWin(playersSpeeds[i])) { //Проверка на то, что игкрок проиграл через функцию "isPlayerWin"
                numOfLosers++;
            }
        }

        return numOfLosers;
    }

    //Функция для заполнения массива скоростями выбывщих игроков
    public int[] speedsOfLoserPlayers(int[] playersSpeeds) {
        int[] speedsOfLoserPlayer = new int[numberOfLosers(playersSpeeds)]; //Создание массива для скоростей проигравших
        int arrayPosition = 0;                                              //через функцию подсчёта проигравших

        for (int i = 0; i < playersSpeeds.length; i++) {
            if (!isPlayerWin(playersSpeeds[i])) { //Проверка на то, что игкрок проиграл через функцию "isPlayerWin"
                speedsOfLoserPlayer[arrayPosition] = playersSpeeds[i];
                arrayPosition++;
            }
        }

        return speedsOfLoserPlayer;
    }

    //Функция для заполнения массива скоростями победивших игроков
    public int[] speedsOfWinnerPlayers(int[] playersSpeeds) {
        int[] speedsOfWinnerPlayers = new int[playersSpeeds.length - numberOfLosers(playersSpeeds)]; //Создание массива для скоростей проигравших
        int arrayPosition = 0;                                                               //по принципу [все скорости] - [допустимые скорости]

        for (int i = 0; i < playersSpeeds.length; i++) {
            if (isPlayerWin(playersSpeeds[i])) {
                speedsOfWinnerPlayers[arrayPosition] = playersSpeeds[i];
                arrayPosition++;
            }

        }
        return speedsOfWinnerPlayers;
    }

    //Функция для определения имён победителей
    public String[] winnerPlayerNames(String[] playersNamesWithSpeed) {
        int winnerPlayerNamesArrayPosition = 0;
        String[] allPlayersNames = new String[playersNamesWithSpeed.length]; //Создание массива для всех имён
        int[] allPlayersSpeeds = new int[playersNamesWithSpeed.length]; //Создание массива для всех скоростей

        for (int i = 0; i < playersNamesWithSpeed.length; i++) { //Цикл для разбиения массива строк на отдельные элементы
            String[] parts = playersNamesWithSpeed[i].split(" "); //и заполнения ими соответствующих массивов
            allPlayersNames[i] = parts[0];
            allPlayersSpeeds[i] = Integer.parseInt(parts[1]);
        }

        String[] winnerPlayerNames = new String[allPlayersSpeeds.length - numberOfLosers(allPlayersSpeeds)]; //Создание массива для имён победителй
        //по принципу: [все имена] - [имена проигравших]
        for (int i = 0; i < allPlayersSpeeds.length; i++) {
            if (isPlayerWin(allPlayersSpeeds[i])) {                                         //проверка на выйгрыш
                winnerPlayerNames[winnerPlayerNamesArrayPosition] = allPlayersNames[i];
                winnerPlayerNamesArrayPosition++;
            }
        }

        return winnerPlayerNames;
    }
}
