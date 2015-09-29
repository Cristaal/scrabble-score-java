import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScoreTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    Integer score = 1;
    assertEquals(score, testScrabbleScore.scrabbleScore("a"));
  }
}
