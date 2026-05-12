package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class TournamentResultsFH implements Filehandler  {

    private static String FILE_NAME = "src/main/java/file/CSVFile/TournamentResults.csv";

    @Override
    public ArrayList readFile() {
        ArrayList TournamentResults = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        try {



        } catch (IOException e)
    }
    @Override
    public void saveToFile() {

    }
}
