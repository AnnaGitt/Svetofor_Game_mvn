public class SpeedyGame extends Game {
    private int MAX_SPEED;

    public SpeedyGame(boolean isGreenLight, int MAX_SPEED) {
        super(isGreenLight);
        if (MAX_SPEED <= 0) {
            this.MAX_SPEED = 1;
        } else {
            this.MAX_SPEED = MAX_SPEED;
        }
    }

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    public void setMAX_SPEED(int MAX_SPEED) {
        if (MAX_SPEED <= 0) {
            return;
        }
        this.MAX_SPEED = MAX_SPEED;
    }

    //Функция для опеределения того, что игрок выбыл или нет с учётом максимальной скрости и светофора
    @Override
    public boolean isPlayerWin(int speedOfPlayer) {
        boolean winOrNot;
        if (getIsGreenLight()) winOrNot = true;
        else if (speedOfPlayer >= MAX_SPEED) winOrNot = false;
        else winOrNot = true;
        return winOrNot;
    }

}
