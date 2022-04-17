public class ConstantPlayer implements Movable{
    private int playerSpeed;

    public ConstantPlayer(int playerSpeed) {
        if(playerSpeed<0){
            this.playerSpeed=0;
        }
        this.playerSpeed = playerSpeed;
    }

    @Override
    public int getSpeed() {
        return playerSpeed;
    }
}
