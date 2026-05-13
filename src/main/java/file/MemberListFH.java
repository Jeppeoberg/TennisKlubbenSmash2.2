package file;

import model.*;
import model.enums.*;

import java.io.*;
import java.util.ArrayList;

public class MemberListFH implements FileReader {
    private static String FILE_NAME = "src/main/java/file/CSVFile/Memberlist.csv";

    @Override
    public ArrayList readFile() { //
        ArrayList<Member> members = new ArrayList<Member>();
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String memberId = data[0];
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                MembershipType membershipType = MembershipType.valueOf(data[3]);
                AgeType ageType = AgeType.valueOf(data[4]);
                PlayerType playerType = PlayerType.valueOf(data[5]);


                members.add(new Member(memberId, name, age, membershipType, playerType, ageType));
            }
        } catch (IOException e) {
            System.out.println("readFile Fejl");
        }
        return members;
    }


    public void saveToFile(Member member) {

        try
                (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {


                writer.write(member.getMemberId() + "," + member.getName() + "," + member.getAge() + "," + member.getMembershipType() + "," + member.getAgeType() + "," + member.getPlayerType());

            writer.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
