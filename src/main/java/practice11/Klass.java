package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentList = new ArrayList<>();
    private List<Listener> listeners = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Listener> getListeners() {
        return listeners;
    }

    public void setListeners(List<Listener> listeners) {
        this.listeners = listeners;
    }

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

    public void assignLeader(Student student) {
        if (!studentList.contains(student)) {
            System.out.print("It is not one of us.\n");
        } else {
            this.setLeader(student);
            student.setKlass(this);
        }
//        if (studentList.size() > 0) {
//            for (Student stu: this.studentList) {
//                if (stu.getId() != leader.getId()) {
//
//                } else {
//                    this.leader = leader;
//                }
//            }
//        } else {
//            System.out.print("It is not one of us.\n");
//        }
        notify(student);
    }

    public void appendMember(Student student) {
        if (student != null) {
            student.setKlass(this);
            this.studentList.add(student);
        }

        notify(student);
    }

    public void addListener(Teacher teacher) {
        listeners.add(teacher);
    }

    public void notify(Student student) {
        listeners.forEach( listener -> {
            listener.update(student);
                }
        );
    }

    public String getDisplayName() {
        return String.format("Class %s", this.number);
    }

//    public int isIn(Student student) {
//
//    }
}
