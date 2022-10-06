package example_1006.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {

    private String filename;

    public FileExercise(String filename) {
        this.filename = filename;
    }

    //한 글자
    public char readChar() throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    //두 글자
    public String read2Chars() throws IOException {
        FileReader fileReader = new FileReader(filename);

        String str = "";
        str += (char)fileReader.read();
        str += (char)fileReader.read();
        return str;
    }

    //n글자
    public String readNchar(int N) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        for (int i = 0; i < N; i++) {
            // -가 나올 경우 break
            int asciiCd = fileReader.read();
            if (asciiCd == -1) {
                return str;
            }
            str += (char) asciiCd;
        }
        return str;
    }

    //한 줄
    public String readLine() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String str = reader.readLine();
        return str;
    }

    public static void main(String[] args) throws IOException {

        FileExercise fileExercise = new FileExercise("C:\\Users\\user\\IdeaProjects\\java_1004\\a_file.txt");
        // 디렉토리 출력하는 코드
        //ReadFile readFile = new ReadFile();
        //readFile.printDirectoryFiles();

        char c = fileExercise.readChar();
        System.out.println(c);

        String s1 = fileExercise.read2Chars();
        System.out.println(s1);

        String s2 = fileExercise.readNchar(5);
        System.out.println(s2);

        String s3 = fileExercise.readLine();
        System.out.println(s3);

    }
}
