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
}
