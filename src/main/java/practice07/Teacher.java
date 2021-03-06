package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.klass != null) {
            return super.introduce().concat(String.format(" I am a Teacher. I teach Class %s.", this.klass.getNumber()));
        } else {
            return super.introduce().concat(String.format(" I am a Teacher. I teach No Class."));
        }
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == this.klass.getNumber()) {
            return super.introduce().concat(String.format(" I am a Teacher. I teach %s.", student.getName()));
        } else {
            return super.introduce().concat(String.format(" I am a Teacher. I don't teach %s.", student.getName()));
        }
    }
}
