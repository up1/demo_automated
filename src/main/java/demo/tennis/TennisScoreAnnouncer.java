package demo.tennis;

public class TennisScoreAnnouncer {
    private int firstPlayerScore;

    public String getAnnouncement() {
        if(firstPlayerScore == 1) {
            return "Fifteen Love";
        }

        if(firstPlayerScore == 2) {
            System.out.println("XXX");
        }

        return "Love Love";
    }

    public void firstPlayerWin() {
        firstPlayerScore = 1;
    }
}
