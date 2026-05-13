package model;

import model.enums.AgeType;
import model.enums.Discipline;
import model.enums.MembershipType;
import model.enums.PlayerType;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String memberId;
    private static int nextId = 1;
    private String name;
    private int age;
    private MembershipType membershipType;
    private PlayerType playerType;
    private AgeType ageType;
    private ArrayList<Discipline> disciplines;

    public Member(String memberId, String name, int age, MembershipType membershipType, PlayerType playerType, AgeType ageType) {

        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
        this.playerType = playerType;
        this.ageType = ageType;
        this.disciplines = new ArrayList<>();
    }

    public void addDisciplines(Discipline discipline){
        this.disciplines.add(discipline);
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public List<Discipline> getDiscipline() {
        return disciplines;
    }

    @Override
    public String toString() {
        return memberId + " " + name + " " + age + " " + membershipType + " " + playerType + " " + ageType + " " + disciplines;
    }

}

