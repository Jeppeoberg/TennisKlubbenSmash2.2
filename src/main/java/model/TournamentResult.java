package model;

import java.time.LocalDate;

public class TournamentResult {
    private String tournamentName;
    private int memberId;
    private String matchResult;
    private int ranking;
    private LocalDate date;

    public String getTournamentName() {
        return this.tournamentName;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public String getMatchResult() {
        return this.matchResult;
    }

    public int getRanking() {
        return this.ranking;
    }

    public LocalDate getDate() {
        return this.date;
    }
}
