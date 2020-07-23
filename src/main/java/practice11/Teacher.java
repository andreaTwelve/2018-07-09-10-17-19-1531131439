package practice11;
import java.util.LinkedList;

public class Teacher extends Person implements Listener {
    private LinkedList<Klass> classes = new LinkedList<>();

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(klass -> {
            klass.addListener(this);
                }
        );
    }

    public String introduce() {
        String str = super.introduce().concat(" I am a Teacher. I teach ");
        if (this.classes.size() > 0) {
            str += "Class";
            for (Klass klass: this.classes) {
                //System.out.println(klass.getNumber());
                if (klass.equals(this.classes.getLast())) {
                    str += " " + klass.getNumber() + ".";
                } else {
                    str += " " + klass.getNumber() + ",";
                }
                //str.concat(String.format("%s", klass.getNumber()));
            }
        } else {
            str += "No Class.";
        }
        return str;
    }

    public String introduceWith(practice11.Student student){
        if (this.classes.size() > 0) {
            for (Klass klass: this.classes) {
                if (student.getKlass().getNumber() == klass.getNumber()) {
                    return super.introduce().concat(String.format(" I am a Teacher. I teach %s.", student.getName()));
                } else {
                    return super.introduce().concat(String.format(" I am a Teacher. I don't teach %s.", student.getName()));
                }
            }
        }
        return null;
    }

    public boolean isTeaching(practice11.Student student) {
        if (this.classes.size() > 0) {
            for (Klass klass: this.classes) {
                if (student.getKlass().getNumber() == klass.getNumber()) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public void update(Student student) {
        if (student.getKlass() != null && student.getKlass().getLeader() != null) {
            System.out.printf(String.format("I am %s. I know %s become Leader of Class %s.\n", this.getName(), student.getName(), student.getKlass().getNumber()));
        } else {
            System.out.printf(String.format("I am %s. I know %s has joined Class %s.\n", this.getName(), student.getName(), student.getKlass().getNumber()));
        }
    }
}
