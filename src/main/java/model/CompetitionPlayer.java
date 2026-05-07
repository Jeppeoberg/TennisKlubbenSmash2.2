package model;

import java.util.Set;

public class CompetitionPlayer {
    private Coach coach;
    private Set<Discipline> disciplines;

    public CompetitionPlayer(Coach coach, Set<Discipline> disciplines) {
        this.coach = coach;
        this.disciplines = disciplines;
    }

    public void addDiscipline(Set<Discipline> d, Discipline discipline) {
        d.add(discipline);
    }

    public void removeDiscipline(Set<Discipline> d, Discipline discipline) {
        d.remove(discipline);
    }

    public Set<Discipline> getDiscipline() {
        return this.disciplines;
    }

    public Coach getCoach() {
        return this.coach;
    }

    public void setCoach(Coach c) {
        this.coach = c;
    }
}
