package example_1006;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        students.add("김예진");
        students.add("김경록");
        students.add("김미지");
        students.add("김민지");
        students.add("김민경");
    }
    public List<String> getStudents(){
        return this.students;
    }
}
