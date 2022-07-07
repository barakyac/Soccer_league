package Games;
import TeamOwner.Team;
public interface PointsPolicy {

    Team[] UpdateScore(Team home, Team away, int[] goals);

}
