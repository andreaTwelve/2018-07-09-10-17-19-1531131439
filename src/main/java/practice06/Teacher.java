package practice06;

public class Teacher extends Person {
    private Integer klass;

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String str = super.introduce().concat(" I am a Teacher. I teach ");
        if (this.klass != null) {
            return  str.concat(String.format("Class %s.", this.klass));
        } else {
            return str.concat("No Class.");
        }
    }
}
