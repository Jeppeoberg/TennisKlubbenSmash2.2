package ui;

import file.MemberListFH;
import model.Member;
import model.enums.AgeType;
import model.enums.MembershipType;
import model.enums.PlayerType;
import model.enums.Discipline;
import repository.MemberRepositoryImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ui {

    private Scanner scanner = new Scanner(System.in);
    private MemberListFH memberListFH = new MemberListFH();
    private MemberRepositoryImp memberRepository = new MemberRepositoryImp();

    public void start() {

        boolean running = true;

        while (running) {

            System.out.println("\n....SMASH TENNISKLUB....");
            System.out.println("1. Create member");
            System.out.println("2. Show Members");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    createMember();
                    break;

                case 2:
                    showMembers();
                    break;

                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void createMember() {

        System.out.println("Name:");
        String name = scanner.nextLine();

        System.out.println("Age:");
        int age = scanner.nextInt();

        AgeType ageType;
        if (age <19){
            ageType=AgeType.JUNIOR;
        } else if (age<66){
            ageType=AgeType.SENIOR;
        } else {
            ageType=AgeType.OVER65;
        }

        System.out.println("1. Active");
        System.out.println("2. Passive");

        int membershipChoice = scanner.nextInt();

        MembershipType membershipType;

        if (membershipChoice == 1) {
            membershipType = MembershipType.ACTIVE;
        } else {
            membershipType = MembershipType.PASSIVE;
        }

        System.out.println("1. Motionist");
        System.out.println("2. Competition");


        int playerChoice = scanner.nextInt();

        PlayerType playerType = null;

        switch (playerChoice) {

            case 1:
                playerType = PlayerType.MOTIONIST;
                break;

            case 2:
                playerType = PlayerType.COMPETITION;
                break;

            default:
                System.out.println("Invalid Choice");
        }



        List<Discipline> discipline = new ArrayList<>();

        if (playerType == PlayerType.COMPETITION) {

            boolean addingDisciplines = true;

            while (addingDisciplines) {

                System.out.println("\nChose discipline:");
                System.out.println("1. SINGLE");
                System.out.println("2. DOUBLE");
                System.out.println("3. MIXED DOUBLE");
                System.out.println("4. Done");

                int disciplineChoice = scanner.nextInt();

                switch (disciplineChoice) {

                    case 1:
                        discipline.add(Discipline.SINGLE);
                        break;

                    case 2:
                        discipline.add(Discipline.DOUBLE);
                        break;

                    case 3:
                        discipline.add(Discipline.MIXED_DOUBLE);
                        break;

                    case 4:
                        addingDisciplines = false;
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            }
        }

        Member member = new Member(0001,name, age, membershipType, playerType, ageType);

        memberRepository.addMember(member);

        System.out.println("\nMember created!");
    }

    public void showMembers() {
        ArrayList members = memberListFH.readFile();
        System.out.println("\n....Members....");

        for (Member member : memberRepository.getAllMembers()) {
            System.out.println(member);
        }
        for (Object member : members){
            System.out.println(member);
        }
    }
}

