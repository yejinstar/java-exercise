package example_1005.List0;


import java.util.ArrayList;
import java.util.List;

public class Names {
    List<String> students = new ArrayList<>();

    Names() {
        this.students.add("권하준");
        this.students.add("조성윤");
        this.students.add("안예은");
        this.students.add("남우빈");
        this.students.add("최경민");

    }

    public List<String> getList() {
        return this.students;
    }
}

