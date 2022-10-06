package example_1006.file;

import java.io.File;
import java.io.IOException;

public class ReadFile {
    public void printDirectoryFiles() {
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

        // 현재 디렉토리 파일 목록
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