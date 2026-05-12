package file;

import model.Member;
import model.TrainingResult;
import model.enums.AgeType;
import model.enums.Discipline;
import model.enums.MembershipType;
import model.enums.PlayerType;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class TrainingResultsFH implements FileReader {
    private static String FILE_NAME = "src/main/java/file/CSVFile/TrainingResults.csv";

    @Override
    public ArrayList readFile() {
        ArrayList<TrainingResult> trainingResults = new ArrayList<TrainingResult>();
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                Discipline discipline = Discipline.valueOf(data[1]);
                int bestResult = Integer.parseInt(data[2]);
                LocalDate date = LocalDate.parse(data[3]);


                trainingResults.add(new TrainingResult(id, discipline, bestResult, date));
            }
        } catch (IOException e) {
            System.out.println("readFile Fejl");
        }
        return trainingResults;
    }

    public void saveToFile() {

    }
}

