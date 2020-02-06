package ObserverPattern.Publishers;

public class Cricket extends Publishers {
    String cricketScore;

    public String getCricketScore() {
        return cricketScore;
    }

    public void setCricketScore(String cricketScore) {
        this.cricketScore = cricketScore;
        notifyClient();
    }
    @Override
    protected String notifyInfo() {
        return "Current Score is " + cricketScore;
    }
}
