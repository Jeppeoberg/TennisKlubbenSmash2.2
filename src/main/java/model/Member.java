package model;

import model.enums.Discipline;
import model.enums.MembershipType;
import model.enums.PlayerType;

import java.util.List;

public class Member {

    private String memberId;
    private static int nextId = 1;
    private String name;
    private int age;
    private MembershipType membershipType;
    private PlayerType playerType;
    private List<Discipline> disciplines;

    public Member(String name, int age, MembershipType membershipType, PlayerType playerType, List<Discipline> disciplines) {

        this.memberId = String.format("%04d", nextId++);
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
        this.playerType = playerType;
        this.disciplines = disciplines;
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

    public List<Discipline> getDiscipline(){
        return disciplines;
    }

    @Override
    public String toString() {
        return memberId + " " + name + " " + age + " " + membershipType + " " + playerType + " " + disciplines;
    }

}

