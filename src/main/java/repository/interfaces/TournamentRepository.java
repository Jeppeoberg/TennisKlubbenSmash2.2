package repository.interfaces;

import model.TournamentResult;

import java.util.List;

public interface TournamentRepository {

    void addTournamentResult(TournamentResult tournamentResult);

    List<TournamentResult> getAllTournamentResults();
}
