public class GameManager {
   private Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int numOfCompletedRounds(int[] speedsOfPlayer){
        int numOfCompletedRounds = 0;
        for (int i = 0; i < speedsOfPlayer.length; i++) { //Проверяет массив на допустимую скорости
            if(game.isPlayerWin(speedsOfPlayer[i])){
                numOfCompletedRounds++;                   //Если скорость подходит, увеличивает переменную
            }
            else {
                return numOfCompletedRounds;              //Если скорость не подходит, то завершает цикл с набранным кол-вом раундов
            }
        }
        return numOfCompletedRounds;
    }

    public int looser(Movable p1, Movable p2, Game game,int rounds){
        for (int i = 0; i < rounds; i++) {
            if (!game.isPlayerWin(p1.getSpeed())){
                return -1;
            }
            else if (!game.isPlayerWin(p2.getSpeed())){
               return 1;
            }
        }
        return 0;
    }

}
