package practice08;

public class Klass {
    private int number;
    private Student leader;

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

    public String getDisplayName() {
        return String.format("Class %s", this.number);
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
