package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentList = new ArrayList<>();

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public void assignLeader(Student leader) {
        if (studentList.size() > 0) {
            for (Student stu: this.studentList) {
                if (stu.getId() != leader.getId()) {
                    System.out.print("It is not one of us.\n");
                } else {
                    this.leader = leader;
                }
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        if (student != null) {
            this.studentList.add(student);
        }

    }

    public String getDisplayName() {
        return String.format("Class %s", this.number);
    }

//    public int isIn(Student student) {
//
//    }
}
