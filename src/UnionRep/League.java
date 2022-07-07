package UnionRep;
import Games.SchedulePolice;
import Games.PointsPolicy;
import TeamOwner.Team;
import RefereePac.Referee;
import java.util.ArrayList;
import java.util.List;


public class League {
    SchedulePolice schedulePolice;
    PointsPolicy pointsPolicy;
    List<Match> matches;
    List<Team> teams;
    List<Referee> referees;


    League(SchedulePolice schdule, PointsPolicy p){
        schedulePolice = schdule;
        pointsPolicy = p;
        matches = new ArrayList<>();
        teams = new ArrayList<>();
        referees = new ArrayList<>();
    }

    private void addTeam(Team newTeam){
        teams.add(newTeam);

    }

//    boolean void addGame(Team home, Team away){
//
//
//    }
}
