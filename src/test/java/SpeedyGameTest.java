import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedyGameTest {
    @Test
    public void mustFindNumOfLosersWithMaxSpeed10() {
        SpeedyGame speedyGame = new SpeedyGame(false, 10);
        speedyGame.setMAX_SPEED(-10);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int expectedNum = 2;
        int actualNum = speedyGame.numberOfLosers(playersSpeeds);
        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void mustFindSpeedsOfLosersWithMaxSpeed10() {
        SpeedyGame speedyGame = new SpeedyGame(false, 10);
        speedyGame.setMAX_SPEED(-10);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{10, 11};
        int[] actualSpeeds = speedyGame.speedsOfLoserPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindSpeedsOfWinnersWithMaxSpeed10() {
        SpeedyGame speedyGame = new SpeedyGame(false, 10);
        speedyGame.setMAX_SPEED(-10);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{9, 0, 0};
        int[] actualSpeeds = speedyGame.speedsOfWinnerPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindNamesOfWinnersWithMaxSpeed10() {
        SpeedyGame speedyGame = new SpeedyGame(false, 10);
        speedyGame.setMAX_SPEED(-10);
        String[] playersNamesWithSpeed = new String[]{"James 10", "Mya 9", "Maks 0", "Daniel 11", "Finn 0"};
        String[] expectedNames = new String[]{"Mya", "Maks", "Finn"};
        String[] actualNames = speedyGame.winnerPlayerNames(playersNamesWithSpeed);
        Assertions.assertArrayEquals(expectedNames, actualNames);
    }

    @Test
    public void mustFindNumOfLosersWithMaxSpeedMinus10() {
        SpeedyGame speedyGame = new SpeedyGame(false, -10);
        speedyGame.setMAX_SPEED(-10);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int expectedNum = 3;
        int actualNum = speedyGame.numberOfLosers(playersSpeeds);
        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void mustFindSpeedsOfLosersWithMaxSpeedMinus10() {
        SpeedyGame speedyGame = new SpeedyGame(false, -10);
        speedyGame.setMAX_SPEED(-10);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{10, 9, 11};
        int[] actualSpeeds = speedyGame.speedsOfLoserPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindSpeedsOfWinnersWithMaxSpeedMinus10() {
        SpeedyGame speedyGame = new SpeedyGame(false, -10);
        speedyGame.setMAX_SPEED(-10);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{0, 0};
        int[] actualSpeeds = speedyGame.speedsOfWinnerPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindNamesOfWinnersWithMaxSpeedMinus10() {
        SpeedyGame speedyGame = new SpeedyGame(false, -10);
        speedyGame.setMAX_SPEED(-10);
        String[] playersNamesWithSpeed = new String[]{"James 10", "Mya 9", "Maks 0", "Daniel 11", "Finn 0"};
        String[] expectedNames = new String[]{"Maks", "Finn"};
        String[] actualNames = speedyGame.winnerPlayerNames(playersNamesWithSpeed);
        Assertions.assertArrayEquals(expectedNames, actualNames);
    }
}
