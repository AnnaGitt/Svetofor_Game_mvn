public class FastPlayer implements Movable {
    private int startSpeed;
    private int speedStep;

    public FastPlayer(int startSpeed, int speedStep) {
        if (startSpeed < 0) {
            startSpeed = 0;
        }
        this.startSpeed = startSpeed;
        this.speedStep = speedStep;
    }

    @Override
    public int getSpeed() {
        startSpeed += speedStep;
        return startSpeed;
    }
}
