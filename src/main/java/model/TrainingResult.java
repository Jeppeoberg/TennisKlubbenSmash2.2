package model;

import model.enums.Discipline;

import java.time.LocalDate;

public class TrainingResult {

    private int memberId;
    private Discipline discipline;
    private double result;
    private LocalDate localDate;

    public TrainingResult(int memberId, Discipline discipline, double result, LocalDate localDate) {
        this.memberId = memberId;
        this.discipline = discipline;
        this.result = result;
        this.localDate = localDate;
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
        return memberId + " " + discipline + " " + result+" "+localDate;
    }
}
