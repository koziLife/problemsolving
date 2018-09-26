package FootballTeamPremierLeague;

import java.util.List;

public class MatchDay {

    private String name;

    private List<Match> matches;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }



    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(final List<Match> matches) {
        this.matches = matches;
    }
}
