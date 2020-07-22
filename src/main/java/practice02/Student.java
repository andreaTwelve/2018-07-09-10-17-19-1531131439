package practice02;

public class Student extends Person{
    protected int classNum;
//    public Student(String name, int age) {
//        super(name, age);
//    }


    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public Student(String name, int age, int classNum) {
        super(name, age);
        this.classNum = classNum;
    }

    public String introduce() {
        return "I am a Student. I am at Class " + this.classNum;
    }
}
