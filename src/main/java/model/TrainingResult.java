package model;

import model.enums.Discipline;

public class TrainingResult {

    private int memberId;
    private Discipline discipline;
    private double result;

    public TrainingResult(int memberId, Discipline discipline, double result) {
        this.memberId = memberId;
        this.discipline = discipline;
        this.result = result;
    }

    public int getMemberId() {
        return memberId;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString() {
        return memberId + " " + discipline + " " + result;
    }
}
