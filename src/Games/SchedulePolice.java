package Games;
import TeamOwner.Team;
import UnionRep.League;
import UnionRep.Match;
import java.util.ArrayList;
import java.util.List;
public interface SchedulePolice {

    List<Match> addMatches(Team newTeam, League league);


}
