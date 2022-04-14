import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SvetoforTest {
    @Test
    public void mustFindNumOfLosers() {
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int expectedNum = 2;
        int actualNum = Svetofor.numberOfLosers(playersSpeeds);
        Assertions.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void mustFindSpeedsOfLosers() {
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{10, 11};
        int[] actualSpeeds = Svetofor.speedsOfLoserPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }

    @Test
    public void mustFindSpeedsOfWinners() {
        int[] playersSpeeds = new int[]{10, 9, 0, 11, 0};
        int[] expectedSpeeds = new int[]{9, 0, 0};
        int[] actualSpeeds = Svetofor.speedsOfWinnerPlayers(playersSpeeds);
        Assertions.assertArrayEquals(expectedSpeeds, actualSpeeds);
    }
}
