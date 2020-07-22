package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.klass == null) {
            return super.introduce().concat(" I am a Teacher. I teach No Class.");
        } else {
            return super.introduce().concat(String.format(" I am a Teacher. I teach Class %s.", this.klass.getNumber()));
        }
    }

    public String introduceWith(Student student){
        if (this.klass != null && student.getKlass().getNumber() == this.getKlass().getNumber()) {
            return super.introduce().concat(String.format(" I am a Teacher. I teach %s.", student.getName()));

        } else {
            return super.introduce().concat(String.format(" I am a Teacher. I don't teach %s.", student.getName()));
        }
    }
}
