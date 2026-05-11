package repository;

import model.TournamentResult;
import repository.interfaces.TournamentRepository;

import java.util.ArrayList;
import java.util.List;

public class TournamentResultImp implements TournamentRepository {

    private List<TournamentResult> tournamentResults = new ArrayList<>();

    @Override
    public void addTournamentResult(TournamentResult tournamentResult) {
        tournamentResults.add(tournamentResult);
    }

    @Override
    public List<TournamentResult> getAllTournamentResults() {
        return tournamentResults;
    }
}
