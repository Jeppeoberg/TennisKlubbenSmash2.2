package util;

import model.TrainingResult;
import java.util.Comparator;

public class TrainingResultComparator implements Comparator<TrainingResult> {

    @Override
    public int compare(TrainingResult t1, TrainingResult t2) {
        return Double.compare(t2.getResult(), t1.getResult());
    }
}
