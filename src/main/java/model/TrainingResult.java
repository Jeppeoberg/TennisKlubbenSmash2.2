package model;

import model.enums.Discipline;

import java.time.LocalDate;

public class TrainingResult {

    private String memberId;
    private Discipline discipline;
    private double result;
    private LocalDate localDate;

    public TrainingResult(String memberId, Discipline discipline, double result, LocalDate localDate) {
        this.memberId = memberId;
        this.discipline = discipline;
        this.result = result;
        this.localDate = localDate;
    }

    public String getMemberId() {
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
