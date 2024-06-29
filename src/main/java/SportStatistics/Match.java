package SportStatistics;
public class Match {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamsPoints;

    public Match(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingIntPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamsPoints = visitingIntPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }
    public String getVisitingTeam() {
        return visitingTeam;
    }

    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }

    public int getVisitingTeamsPoints() {
        return visitingTeamsPoints;
    }
    @Override
    public String toString() {
        return homeTeam + ", " + visitingTeam + ", " + homeTeamPoints + ", " + visitingTeamsPoints;
    }
}

