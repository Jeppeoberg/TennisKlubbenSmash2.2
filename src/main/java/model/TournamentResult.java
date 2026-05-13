package model;

import java.time.LocalDate;

public class TournamentResult {
    private String memberId;
    private String tournamentName;
    private int ranking;
    private String matchResult;


    public TournamentResult(String memberId, String tournamentName, int ranking, String matchResult){
        this.memberId=memberId;
        this.tournamentName=tournamentName;
        this.ranking=ranking;
        this.matchResult=matchResult;
    }

    public String getTournamentName() {
        return this.tournamentName;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public String getMatchResult() {
        return this.matchResult;
    }

    public int getRanking() {
        return this.ranking;
    }



    @Override
    public String toString() {
        return memberId + " | " + tournamentName + " | " + ranking + " | " + matchResult;
    }
}
