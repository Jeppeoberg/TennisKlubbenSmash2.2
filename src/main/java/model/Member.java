package model;

public class Member {
    private int id;
    private String name;
    private int age;
    private MembershipType membershipType;
    private PlayerType playerType;

    public Member(int id, String name, int age, MembershipType membershipType, PlayerType playerType) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
        this.playerType = playerType;
    }

    //Getters
    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public MembershipType getMembershipType() {
        return this.membershipType;
    }

    public PlayerType getPlayerType() {
        return this.playerType;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    @Override
    public String toString() {
        return "Member: ID = " + id + "\nName=" + name + "\nAge= " + age + "\nMembership Type = " + membershipType + "\nPlayer Type = " + playerType;
    }
}
