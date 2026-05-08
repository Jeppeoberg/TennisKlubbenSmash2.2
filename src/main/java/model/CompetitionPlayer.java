package model;

import java.util.Set;

public class CompetitionPlayer {
    private Set<Discipline> disciplines;

    public CompetitionPlayer(Set<Discipline> disciplines) {
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

}
