package file;

import java.io.BufferedReader;
import java.util.ArrayList;

public class TournamentResultsFH implements FileReader {

    private static String FILE_NAME = "src/main/java/file/CSVFile/TournamentResults.csv";

    @Override
    public ArrayList readFile() {
        ArrayList TournamentResults = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new java.io.FileReader(FILE_NAME));
        try {



        } catch (IOException e)
    }
    @Override
    public void saveToFile() {

    }
}
