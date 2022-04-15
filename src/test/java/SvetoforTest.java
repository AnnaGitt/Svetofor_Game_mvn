import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SvetoforTest {
    @Test
    public void mustFindNumOfLosersWithMaxSpeed10() {
        Svetofor svetofor = new Svetofor(false);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int expectedNum = 2;
        int actualNum = svetofor.numberOfLosers(playersSpeeds);
        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void mustFindSpeedsOfLosersWithMaxSpeed10() {
        Svetofor svetofor = new Svetofor(false);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{10, 11};
        int[] actualSpeeds = svetofor.speedsOfLoserPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindSpeedsOfWinnersWithMaxSpeed10() {
        Svetofor svetofor = new Svetofor(false);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{9, 0, 0};
        int[] actualSpeeds = svetofor.speedsOfWinnerPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindNamesOfWinnersWithMaxSpeed10() {
        Svetofor svetofor = new Svetofor(false);
        String[] playersNamesWithSpeed = new String[]{"James 10", "Mya 9", "Maks 0", "Daniel 11", "Finn 4"};
        String[] expectedNames = new String[]{"Mya", "Maks", "Finn"};
        String[] actualNames = svetofor.winnerPlayerNames(playersNamesWithSpeed);
        Assertions.assertArrayEquals(expectedNames, actualNames);
    }

    @Test
    public void mustFindNumOfLosersWithMaxSpeedMinus10() {
        Svetofor svetofor = new Svetofor(false, -10);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int expectedNum = 3;
        int actualNum = svetofor.numberOfLosers(playersSpeeds);
        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void mustFindSpeedsOfLosersWithMaxSpeedMinus10() {
        Svetofor svetofor = new Svetofor(false, -10);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{10, 9, 11};
        int[] actualSpeeds = svetofor.speedsOfLoserPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindSpeedsOfWinnersWithMaxSpeedMinus10() {
        Svetofor svetofor = new Svetofor(false, -10);
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{0, 0};
        int[] actualSpeeds = svetofor.speedsOfWinnerPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindNamesOfWinnersWithMaxSpeedMinus10() {
        Svetofor svetofor = new Svetofor(false, -10);
        String[] playersNamesWithSpeed = new String[]{"James 10", "Mya 9", "Maks 0", "Daniel 11", "Finn 4"};
        String[] expectedNames = new String[]{"Maks"};
        String[] actualNames = svetofor.winnerPlayerNames(playersNamesWithSpeed);
        Assertions.assertArrayEquals(expectedNames, actualNames);
    }
}
