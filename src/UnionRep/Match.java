package UnionRep;

import TeamOwner.Team;
import java.util.Date;

public class Match {
    int homeGoals;
    int awayGoals;
    Team homeTeam;
    Team awayTeam;
    Date date;

    public Match(int homeGoals, int awayGoals, TeamOwner.Team homeTeam, TeamOwner.Team awayTeam, Date date) {
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals; // how to insert goals
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.date = date;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }


    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }
}

