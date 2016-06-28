import demo.tennis.TennisScoreAnnouncer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisScoreAnnouncerTest {

    @Test public void
    first_player_win_first_score() {
        TennisScoreAnnouncer tennisScoreAnnouncer =
                new TennisScoreAnnouncer();
        tennisScoreAnnouncer.firstPlayerWin();
        String result = tennisScoreAnnouncer.getAnnouncement();
        checkResult(result, "Fifteen Love");
    }

    @Test public void
    start_game() {
        TennisScoreAnnouncer tennisScoreAnnouncer =
                new TennisScoreAnnouncer();
        String result = tennisScoreAnnouncer.getAnnouncement();
        checkResult( result, "Love Love" );
    }

    private void checkResult(String result, String expected) {
        assertEquals(expected, result);
    }

}
