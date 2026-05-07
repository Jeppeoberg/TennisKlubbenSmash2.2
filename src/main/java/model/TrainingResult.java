package model;

import java.time.LocalDate;

public class TrainingResult {
    private int memberId;
    private Discipline discipline;
    private double result;
    private LocalDate date;


    public int getMemberId() {
        return this.memberId;
    }

    public Discipline getDiscipline() {
        return this.discipline;
    }

    public double getResult() {
        return this.result;
    }

    public LocalDate getDate() {
        return this.date;
    }
}
