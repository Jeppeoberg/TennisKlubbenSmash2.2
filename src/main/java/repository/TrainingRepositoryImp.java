package repository;

import model.TrainingResult;
import repository.interfaces.TrainingRepository;

import java.util.ArrayList;
import java.util.List;

public class TrainingRepositoryImp implements TrainingRepository {

    private List<TrainingResult> trainingResults = new ArrayList<>();

    @Override
    public void addTrainingResult(TrainingResult trainingResult) {
        trainingResults.add(trainingResult);
    }

    @Override
    public List<TrainingResult> getAllTrainingResults() {
        return trainingResults;
    }

}
