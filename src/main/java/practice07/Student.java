package practice07;

public class Student extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(String name, int age , Klass klass) {
        super(name, age);
        this.klass = klass;
    }



    @Override
    public String introduce() {
        return super.introduce().concat(String.format(" I am a Student. I am at Class %s.", this.klass.getNumber()));
    }
}
