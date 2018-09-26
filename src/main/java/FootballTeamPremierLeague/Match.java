package FootballTeamPremierLeague;

import java.time.LocalDate;

public class Match {

    private LocalDate date;
    private Team team1;
    private Team team2;
    private short score1;
    private short score2;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(final LocalDate date) {
        this.date = date;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(final Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(final Team team2) {
        this.team2 = team2;
    }

    public short getScore1() {
        return score1;
    }

    public void setScore1(final short score1) {
        this.score1 = score1;
    }

    public short getScore2() {
        return score2;
    }

    public void setScore2(final short score2) {
        this.score2 = score2;
    }
}
