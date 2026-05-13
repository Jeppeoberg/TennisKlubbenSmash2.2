package util;

import model.TournamentResult;
import java.util.Comparator;

public class TournamentResultComparator implements Comparator<TournamentResult> {

    @Override
    public int compare(TournamentResult t1, TournamentResult t2) {

        return Integer.compare(t1.getRanking(), t2.getRanking());
    }
}
