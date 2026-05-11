package repository.interfaces;

import model.TrainingResult;
import java.util.List;

public interface TrainingRepository {

    void addTrainingResult(TrainingResult trainingResult);

    List<TrainingResult> getAllTrainingResults();
}
