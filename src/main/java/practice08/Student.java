package practice08;

public class Student extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.klass != null && this.klass.getLeader() != null && this.klass.getLeader().getId() == this.getId()){
            return super.introduce().concat(String.format(" I am a Student. I am Leader of Class %s.", this.klass.getNumber()));
        } else {
            return super.introduce().concat(String.format(" I am a Student. I am at Class %s.", this.klass.getNumber()));
        }
    }
}
