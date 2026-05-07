package model;

import model.enums.MembershipType;
import model.enums.PlayerType;

public class Member {
    private int id;
    private String name;
    private int age;
    private MembershipType memberShipType;
    private PlayerType playerType;

    public Member(int id, String name; int age, MembershipType membershipType, PlayerType playerType) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
        this.playerType = playerType;
    }

    //Getters
    public int getId() {
        return id;
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

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMembershipType(MembershipType membershipType){
        this.membershipType = membershipType;
    }

    public void setPlayerType(PlayerType playerType){
        this.playerType = playerType;
    }

    @Override
    public String toString() {
        return "Member(" + "id=" + id + ", name=" + name +" " + "";
    }
}
