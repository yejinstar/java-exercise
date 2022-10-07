package example_1007;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

    public void readByCharacter(String filename) throws IOException {

        FileReader fileReader = new FileReader(filename);

        String fileContents = "";
        while (fileContents.length() < 1_00_000) {
            char c = (char) fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);
//        char c1 = (char)fileReader.read();
//        System.out.println(c1);
    }

    public void readByLine(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();

    }

    public void readByLine2(String filename) throws IOException {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename),StandardCharsets.UTF_8
        )){
            String line;

        }
    }

    public PopulationMove parse(String data){
        String[] code = data.split(",");
        int formSido = Integer.parseInt(code[0]);
        int toSido = Integer.parseInt(code[6]);
        return new PopulationMove(formSido,toSido);
    }

    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\user\\Downloads\\2021_인구관련연간자료_20221006_29261.csv";

        PopulationStatistics populationStatistics = new PopulationStatistics();
        populationStatistics.readByLine(address);
    }
}
