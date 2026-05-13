package ui;

import file.MemberListFH;
import file.PaymentListFH;
import file.TournamentResultsFH;
import file.TrainingResultsFH;
import model.Member;
import model.Payment;
import model.TournamentResult;
import model.TrainingResult;
import model.enums.AgeType;
import model.enums.MembershipType;
import model.enums.PlayerType;
import model.enums.Discipline;
import repository.MemberRepositoryImp;
import repository.PaymentRepositoryImp;
import repository.TournamentRepositoryImp;
import repository.TrainingRepositoryImp;
import util.Validation.InvalidAgeValidator;
import util.TrainingResultComparator;
import util.TournamentResultComparator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ui {

    private Scanner scanner = new Scanner(System.in);
    private MemberListFH memberListFH = new MemberListFH();
    private PaymentListFH paymentListFH = new PaymentListFH();
    private TournamentResultsFH tournamentResultsFH = new TournamentResultsFH();
    private TrainingResultsFH trainingResultsFH = new TrainingResultsFH();
    private MemberRepositoryImp memberRepository = new MemberRepositoryImp();
    private PaymentRepositoryImp paymentRepository = new PaymentRepositoryImp();
    private TournamentRepositoryImp tournamentRepository = new TournamentRepositoryImp();
    private TrainingRepositoryImp trainingRepository = new TrainingRepositoryImp();

    private int memberID = 1;

    public void start() {
        addDataFromFile();
        boolean running = true;

        while (running) {

            System.out.println("\n....SMASH TENNISKLUB....");
            System.out.println("1. Create member");
            System.out.println("2. Show Members");
            System.out.println("3. Show Payments");
            System.out.println("4. Show Tournament Results");
            System.out.println("5. Show Training Results");
            System.out.println("6. Show Top 5 Training Results");
            System.out.println("7. Show Top 5 Tournament Results");
            System.out.println("8. Exit");

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
                    showPayments();
                    break;
                case 4:
                    showTournamentResults();
                    break;
                case 5:
                    showTrainingResults();
                    break;
                case 6:
                    showTop5TrainingResults();
                    break;
                case 7:
                    showTop5TournamentResults();
                    break;
                case 8:
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
        if (age < 19) {
            ageType = AgeType.JUNIOR;
        } else if (age < 66) {
            ageType = AgeType.SENIOR;
        } else {
            ageType = AgeType.OVER65;
        }
        InvalidAgeValidator.validate(age);

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


        Member member = new Member(String.format("%04d", memberID++), name, age, membershipType, playerType, ageType);

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
                        member.addDisciplines(Discipline.SINGLE);
                        break;

                    case 2:
                        member.addDisciplines(Discipline.DOUBLE);
                        break;

                    case 3:
                        member.addDisciplines(Discipline.MIXED_DOUBLE);
                        break;

                    case 4:
                        addingDisciplines = false;
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            }
        }


        memberRepository.addMember(member);
        //memberID++;
        memberListFH.saveToFile(member);

        System.out.println("\nMember created!");
    }

    public void addDataFromFile() {
        ArrayList<Payment> payments = paymentListFH.readFile();
        for (Payment payment : payments) {
            paymentRepository.addPayment(payment);
        }
        ArrayList<TournamentResult> tournamentResults = tournamentResultsFH.readFile();
        for (TournamentResult tournamentResult : tournamentResults) {
            tournamentRepository.addTournamentResult(tournamentResult);
        }
        ArrayList<TrainingResult> trainingResults = trainingResultsFH.readFile();
        for (TrainingResult trainingResult : trainingResults) {
            trainingRepository.addTrainingResult(trainingResult);
        }
        ArrayList<Member> members = memberListFH.readFile();
        for (Member member : members) {
            if (member.getPlayerType() == PlayerType.COMPETITION) {
                for (TournamentResult tournament : tournamentRepository.getAllTournamentResults())
                    if (tournament.getMemberId() == member.getMemberId()) {
                        member.setTournamentResult(tournament);
                    }
                for (TrainingResult training : trainingRepository.getAllTrainingResults())
                    if (training.getMemberId() == member.getMemberId()) {
                        member.setTrainingResult(training);
                    }
            }
            memberRepository.addMember(member);
            memberID++;

        }
    }

    public void showMembers() {
        System.out.println("\n....Members....");

        for (Member member : memberRepository.getAllMembers()) {
            System.out.println(member);
        }

    }

    public void showPayments() {
        System.out.println("\n....Payments....");

        for (Payment payment : paymentRepository.getAllPayments()) {
            System.out.println(payment);
        }

    }

    public void showTournamentResults() {
        System.out.println("\n....Tournament Results....");

        for (TournamentResult tournamentResult : tournamentRepository.getAllTournamentResults()) {
            System.out.println(tournamentResult);
        }

    }

    public void showTrainingResults() {
        System.out.println("\n....Training Results....");

        for (TrainingResult trainingResult : trainingRepository.getAllTrainingResults()) {
            System.out.println(trainingResult);
        }

    }

    public void showTop5TrainingResults() {

        ArrayList<TrainingResult> results = new ArrayList<>(trainingRepository.getAllTrainingResults());

        results.sort(new TrainingResultComparator());

        System.out.println("\n...TOP 5 TRAINING RESULTS...");

        for (int i = 0; i < 5 && i < results.size(); i++) {

            TrainingResult result = results.get(i);

            Member member = memberRepository.findMemberById(result.getMemberId());

            if (member != null) {
                System.out.println(member.getName() + " " + result.getDiscipline() + " " + result.getResult());
            }
        }
    }

    public void showTop5TournamentResults() {

        ArrayList<TournamentResult> results = new ArrayList<>(tournamentRepository.getAllTournamentResults());

        results.sort(new TournamentResultComparator());

        System.out.println("\n...TOP 5 TOURNAMENT RESULTS...");

        for (int i = 0; i < 5 && i < results.size(); i++) {

            TournamentResult result = results.get(i);

            Member member = memberRepository.findMemberById(result.getMemberId());

            if (member != null) {
                System.out.println(member.getName() + " " + result.getTournamentName() + " " + result.getRanking() + " " + result.getMatchResult());
            }
        }
    }
}

