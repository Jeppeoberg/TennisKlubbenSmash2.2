package file;

import model.Member;
import model.TournamentResult;
import model.enums.AgeType;
import model.enums.MembershipType;
import model.enums.PlayerType;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class TournamentResultsFH implements FileReader {

    private static String FILE_NAME = "src/main/java/file/CSVFile/TournamentResults.csv";

    @Override
    public ArrayList readFile() {
        ArrayList<TournamentResult> tournamentResults = new ArrayList<TournamentResult>();

        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String memberId = data[0];
                String tournamentName = data[1];
                int ranking = Integer.parseInt(data[2]);
                String matchResult = data[3];


                tournamentResults.add(new TournamentResult(memberId, tournamentName, ranking, matchResult));
            }

        } catch (IOException e) {
            System.out.println("readFile Fejl");
        }

        return tournamentResults;
    }

    public void saveToFile() {

    }
}
