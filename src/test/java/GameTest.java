import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void mustFindNumOfLosersLightRed() {
        Game game = new Game(false);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int expectedNum = 3;
        int actualNum = game.numberOfLosers(playersSpeeds);
        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void mustFindSpeedsOfLosersLightRed() {
        Game game = new Game(false);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{10, 9, 11};
        int[] actualSpeeds = game.speedsOfLoserPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindSpeedsOfWinnersLightRed() {
        Game game = new Game(false);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{0, 0};
        int[] actualSpeeds = game.speedsOfWinnerPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindNamesOfWinnersLightRed() {
        Game game = new Game(false);
        String[] playersNamesWithSpeed = new String[]{"James 10", "Mya 9", "Maks 0", "Daniel 11", "Finn 0"};
        String[] expectedNames = new String[]{"Maks", "Finn"};
        String[] actualNames = game.winnerPlayerNames(playersNamesWithSpeed);
        Assertions.assertArrayEquals(expectedNames, actualNames);
    }

    @Test
    public void mustFindNumOfLosersLightGreen() {
        Game game = new Game(true);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int expectedNum = 0;
        int actualNum = game.numberOfLosers(playersSpeeds);
        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void mustFindSpeedsOfLosersLightGreen() {
        Game game = new Game(true);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{};
        int[] actualSpeeds = game.speedsOfLoserPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindSpeedsOfWinnersLightGreen() {
        Game game = new Game(true);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{10,9,0,11, 0};
        int[] actualSpeeds = game.speedsOfWinnerPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindNamesOfWinnersLightGreen() {
        Game game = new Game(true);
        String[] playersNamesWithSpeed = new String[]{"James 10", "Mya 9", "Maks 0", "Daniel 11", "Finn 0"};
        String[] expectedNames = new String[]{"James", "Mya", "Maks", "Daniel", "Finn"};
        String[] actualNames = game.winnerPlayerNames(playersNamesWithSpeed);
        Assertions.assertArrayEquals(expectedNames, actualNames);
    }
}
