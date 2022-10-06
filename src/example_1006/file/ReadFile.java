package example_1006.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./a_file.txt");
        char c = (char) reader.read();
        System.out.println(c);

        // 현재 디렉토리 파일 목록
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

        /* .\.git
           .\.gitignore
           .\.idea
           .\a_file.txt
           .\java_1004.iml
           .\out
           .\README.md
           .\src
        */
    }
}