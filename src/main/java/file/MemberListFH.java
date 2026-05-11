package file;

import model.Member;
import model.enums.AgeType;
import model.enums.MembershipType;
import model.enums.PlayerType;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MemberListFH implements Filehandler {
    private static String FILE_NAME = "src/main/java/file/CSVFile/Memberlist.csv";

    @Override
    public ArrayList readFile() {
        ArrayList members= new ArrayList();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                MembershipType membershipType = MembershipType.valueOf(data[3]);
                AgeType ageType = AgeType.valueOf(data[4]);
                PlayerType playerType=PlayerType.valueOf(data[5]);


                members.add(new Member (id,name,age,membershipType,playerType,ageType));
            }
        } catch (IOException e) {
            System.out.println("Fejl");
        }
        return members;
    }

    @Override
    public void saveToFile() {

    }
}
