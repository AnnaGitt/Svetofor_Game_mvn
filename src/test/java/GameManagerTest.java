import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerTest {
    @Test
    public void mustFindNumOfCompletedRounds() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        int[] playersSpeeds = new int[]{0, 0, 9, 11, 0};
        int expectedNum = 2;
        int actualNum = gameManager.numOfCompletedRounds(playersSpeeds);
        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void mustFindNumOfCompletedRoundsWithMaxSpeed10() {
        Game game = new SpeedyGame(false,10);
        GameManager gameManager = new GameManager(game);
        int[] playersSpeeds = new int[]{0, 0, 9, 8, 20};
        int expectedNum = 4;
        int actualNum = gameManager.numOfCompletedRounds(playersSpeeds);
        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void mustLoseP1WithMaxSpeed(){
        Game game = new SpeedyGame(false, 20);
        Movable p1 = new FastPlayer(0,2);
        Movable p2 = new FastPlayer(0,5);
        GameManager gameManager = new GameManager(game);
        int expectedResult = 1;
        int actualResult = gameManager.looser(p1,p2,game,6);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void mustLoseP2WithMaxSpeed(){
        Game game = new SpeedyGame(false, 20);
        Movable p1 = new FastPlayer(0,5);
        Movable p2 = new FastPlayer(0,2);
        GameManager gameManager = new GameManager(game);
        int expectedResult = -1;
        int actualResult = gameManager.looser(p1,p2,game,6);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void mustDraw(){
        Game game = new SpeedyGame(false, 20);
        Movable p1 = new FastPlayer(0,2);
        Movable p2 = new FastPlayer(0,2);
        GameManager gameManager = new GameManager(game);
        int expectedResult = 0;
        int actualResult = gameManager.looser(p1,p2,game,5);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void mustLoseP1WithMaxSpeedAndDecrementSpeed(){
        Game game = new SpeedyGame(false, 20);
        Movable p1 = new FastPlayer(0,5);
        Movable p2 = new FastPlayer(11,-2);
        GameManager gameManager = new GameManager(game);
        int expectedResult = -1;
        int actualResult = gameManager.looser(p1,p2,game,5);
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void mustLoseP1WithMaxSpeedAndIncrementSpeedAndConstantSpeed(){
        Game game = new SpeedyGame(false, 20);
        Movable p1 = new FastPlayer(0,6);
        Movable p2 = new ConstantPlayer(5);
        GameManager gameManager = new GameManager(game);
        int expectedResult = -1;
        int actualResult = gameManager.looser(p1,p2,game,5);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
